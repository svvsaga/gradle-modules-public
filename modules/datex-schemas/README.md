# Datex II schemas

These schemas have been downloaded from:

- [Datex II v2.0 with some extensions](https://www.vegvesen.no/globalassets/om-oss/om-organisasjonen/data-og-api/schema-and-wsdl.zip)
  - Schema has been modified to replace all `minOccurs="2"` to `minOccurs="1"`, since SVV Datex sometimes sends only 1
    of the respective elements.
- Datex II V3.1 provided directly from Paal Aaserud (Will be provided from SVV webpages soon)
  - `DATEXII_3_LocationReferencing.xsd` customized to fix generation of `subdivisionCode` for county number:
  ```xml
  <xs:complexType name="NamedArea">
    <xs:complexContent>
      <xs:extension base="com:NamedArea">
        <xs:sequence>
          <xs:element name="areaName" type="com:MultilingualString" minOccurs="1" maxOccurs="1" />
          <xs:element name="namedAreaType" type="loc:_NamedAreaTypeEnum" minOccurs="0" maxOccurs="1" />
          <xs:element name="country" type="com:CountryCode" minOccurs="0" maxOccurs="1" />
          <xs:element name="_namedAreaExtension" type="loc:_NamedAreaExtensionType" minOccurs="0" />
        </xs:sequence>
      </xs:extension>
    </xs:complexContent>
  </xs:complexType>
  ```
  was replaced with
  ```xml
  <xs:complexType name="NamedArea">
    <xs:sequence>
      <xs:element name="areaName" type="com:MultilingualString" minOccurs="1" maxOccurs="1"/>
      <xs:element name="namedAreaType" type="loc:_NamedAreaTypeEnum" minOccurs="0" maxOccurs="1"/>
      <xs:element name="country" type="com:CountryCode" minOccurs="0" maxOccurs="1"/>
      <xs:element name="_namedAreaExtension" type="loc:_NamedAreaExtensionType" minOccurs="0"/>
    </xs:sequence>
  </xs:complexType>
  ```

Some customizations are necessary after generating, see `datex-serializer` for details.
