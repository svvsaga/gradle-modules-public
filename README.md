# Gradle modules

Common Gradle modules for SVV Saga projects.

## Publications

All plugins and modules will be published both to GitHub Packages and to Google Artifact Registry. The list of packages can be found either at [GitHub Packages](https://github.com/orgs/svvsaga/packages?repo_name=gradle-modules-public) or at [GCP Artifact Registry](https://console.cloud.google.com/artifacts/maven/saga-artifacts/europe/maven-public?project=saga-artifacts) (requires login with any Google account).

## Development

- Run `setup.sh` to install precommit hooks for ensuring secrets are not checked in, and other checks.
- After opening a folder or subfolder in IntelliJ IDEA, run `setup-ktlint.sh` to configure IntelliJ with
  the [ktlint](https://ktlint.github.io/) code style.

### Integration tests

To run integration tests, you must set the `SAGA_INT_TEST_PROJECT_ID` environment variable to a GCP project ID used for integration testing.

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
    id("saga-build") version "1.3.10"
}

dependencies {
    implementation("no.vegvesen.saga.modules:shared:1.3.9")
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
    implementation("no.vegvesen.saga.modules:shared:1.3.9")
}
```

## Version catalog

To use our [version catalog](https://docs.gradle.org/current/userguide/platforms.html), add this to
your `settings.gradle.kts`:

```kotlin

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    repositories {
        maven {
            url = uri("https://europe-maven.pkg.dev/saga-artifacts/maven-public")
        }
    }
    versionCatalogs {
        create("saga") {
            from("no.vegvesen.saga.modules:modules:1.3.9")
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
