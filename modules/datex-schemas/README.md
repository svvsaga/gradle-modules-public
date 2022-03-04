# Datex II schemas

These schemas have been downloaded from:

- [Datex II v2.0 with some extensions](https://www.vegvesen.no/globalassets/om-oss/om-organisasjonen/data-og-api/schema-and-wsdl.zip)
- [Datex II V3.1 Situation with VMS and Trafficdata DATEX II model with the “Common”, “Location”, “Situation”, “RoadTrafficdata” and “VMS” namespaces present](https://docs.datex2.eu/downloads/modelv31.html)

They have been modified to replace all `minOccurs="2"` to `minOccurs="1"`, since SVV Datex sometimes sends only 1 of the
respective elements.

Some customizations are necessary after generating, see `datex-serializer` for details.
