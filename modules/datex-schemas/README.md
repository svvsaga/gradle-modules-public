# Datex II schemas

These schemas have been downloaded from:

- [Datex II v2.0 with some extensions](https://www.vegvesen.no/globalassets/om-oss/om-organisasjonen/data-og-api/schema-and-wsdl.zip)
  - Schema has been modified to replace all `minOccurs="2"` to `minOccurs="1"`, since SVV Datex sometimes sends only 1
    of the respective elements.
- Datex II V3.1 provided directly from Paal Aaserud (Will be provided from SVV webpages soon)

## Customization

- We have to specify that underscores should be included as part of class names, via `binding.xjb`-files.
- `IsoNamedArea` did not include correct properties and needed an additional binding.
  See `src/main/resources/DatexII_3/binding.xjb` for details.
- Some customizations are necessary after generating, to specify `MessageContainer` as XmlRootElement;
  see `datex-serializer` for details.
