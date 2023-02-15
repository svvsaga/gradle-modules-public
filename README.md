# Gradle modules

Common Gradle modules for SVV Saga projects.

## Publications

All plugins and modules will be published both to GitHub Packages and to Google Artifact Registry. The list of packages
can be found
at [GCP Artifact Registry](https://console.cloud.google.com/artifacts/maven/saga-artifacts/europe/maven-public?project=saga-artifacts) (
requires login with any Google account).

## Publishing new versions

This is done through the "Publish packages" GitHub action found in `.github/workflows/publish-packages.yml`.

We follow semantic versioning when publishing new versions.

A new version will automatically be published when a push or PR merge is done with a commit msg tag.

1. If any commit in the push has a commit message containing `#major`, a major version will be published.
1. If any commit in the push has a commit message containing `#minor`, a minor version will be published.
1. If any commit in the push has a commit message containing `#patch`, a patch version will be published.
1. Otherwise, no new tag is created.

## Use packages with `saga-build`-plugin

The `saga-build`-plugin will add repositories for the shared modules and dependencies.

In `settings.gradle.kts`:

```kotlin
pluginManagement {
  repositories {
    mavenCentral()
    gradlePluginPortal()
    maven {
      url = uri("https://europe-maven.pkg.dev/saga-artifacts/maven-public")
    }
  }
}
```

In `build.gradle.kts`:

```kotlin
plugins {
  id("saga-build") version "28.0.0"
}

dependencies {
  implementation("no.vegvesen.saga.modules:shared:27.0.0")
}
```

### Use packages without `saga-build`-plugin

In `build.gradle.kts`:

```kotlin
repositories {
  mavenCentral()
  maven("https://oss.sonatype.org/content/repositories/snapshots")
  maven("https://packages.confluent.io/maven") // Needed by beam-runners-google-cloud-dataflow-java
  maven("https://jitpack.io")
  maven {
    url = uri("https://europe-maven.pkg.dev/saga-artifacts/maven-public")
  }
}

dependencies {
  implementation("no.vegvesen.saga.modules:shared:27.0.0")
}
```

## Version catalog

To use our [version catalog](https://docs.gradle.org/current/userguide/platforms.html), add this to
your `settings.gradle.kts`:

```kotlin
dependencyResolutionManagement {
  repositories {
    maven {
      url = uri("https://europe-maven.pkg.dev/saga-artifacts/maven-public")
    }
  }
  versionCatalogs {
    create("saga") {
      from("no.vegvesen.saga.modules:modules:27.0.0")
    }
  }
}
```

Then you can add dependencies using the strongly typed `saga` extension:

```kotlin
dependencies {
  implementation(kotlin("stdlib-jdk8"))
  implementation(saga.shared)
}
```

When updating, you only have to update the single version of the version catalog, not every dependency.

### Usage in `subprojects` and `allprojects`

To refer to catalogs in the `subprojects` and `allprojects` block, you must prefix the usage with `rootProject`:

```kotlin
subprojects {
  dependencies {
    implementation(rootProject.saga.shared)
    testImplementation(rootProject.saga.testing)
  }
}
```

See https://github.com/gradle/gradle/issues/16634 for more info.

## Development

### Setup

- Run `setup.sh` to install precommit hooks for ensuring secrets are not checked in, and other checks.
- After opening a folder or subfolder in IntelliJ IDEA, run `setup-ktlint.sh` to configure IntelliJ with
  the [ktlint](https://ktlint.github.io/) code style.

### Use modules in development from branches:

- Run `publishToMavenLocal` Gradle target in `modules` or `plugins/saga-build/` (for plugins) directory. This will build snapshot versions of modules to local maven repository given by `version` line in build.gradle.kts (e.g. `1.3.0-SNAPSHOT`)

- From another projects `build.gradle.kts`, where code is to be tested, add temporary  `mavenLocal()` to `repositories` section and set version to the snapshot version:

    ```kotlin
    // build.gradle.kts

    repositories {
      // NOTE: Temporary to test new snapshot releases
      mavenLocal()
    }
    ```

- From another project's `settings.gradle.kts`, where code is to be tested, add temporary `mavenLocal()` to the gradle version catalog setup:

    ```kotlin
    // settings.gradle.kts

    val modulesVersion = "1.3.0-SNAPSHOT" // Temporary while testing
    
    dependencyResolutionManagement {
      repositories {

        // NOTE: Temporary to test new snapshot releases
        mavenLocal()

        maven {
          url = uri("https://europe-maven.pkg.dev/saga-artifacts/maven-public")
        }
      }
      versionCatalogs {
        create("saga") {
          from("no.vegvesen.saga.modules:modules:$modulesVersion")
        }
      }
    }
    ```

This is useful when wanting to test modules before merging and releasing a new version.

It looks like it is currently not possible to combine includeBuild (composite build) with snapshot version of version
catalog.

### Integration tests

To run integration tests, you must set the `SAGA_INT_TEST_PROJECT_ID` environment variable to a GCP project ID used for
integration testing.

