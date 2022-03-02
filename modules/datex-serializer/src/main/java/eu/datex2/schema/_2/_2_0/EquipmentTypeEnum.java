
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EquipmentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EquipmentTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="toilet"/&gt;
 *     &lt;enumeration value="shower"/&gt;
 *     &lt;enumeration value="informationPoint"/&gt;
 *     &lt;enumeration value="informatonStele"/&gt;
 *     &lt;enumeration value="internetTerminal"/&gt;
 *     &lt;enumeration value="internetWireless"/&gt;
 *     &lt;enumeration value="payDesk"/&gt;
 *     &lt;enumeration value="paymentMachine"/&gt;
 *     &lt;enumeration value="cashMachine"/&gt;
 *     &lt;enumeration value="vendingMachine"/&gt;
 *     &lt;enumeration value="faxMachineOrService"/&gt;
 *     &lt;enumeration value="copyMachineOrService"/&gt;
 *     &lt;enumeration value="safeDeposit"/&gt;
 *     &lt;enumeration value="luggageLocker"/&gt;
 *     &lt;enumeration value="publicPhone"/&gt;
 *     &lt;enumeration value="publicCoinPhone"/&gt;
 *     &lt;enumeration value="publicCardPhone"/&gt;
 *     &lt;enumeration value="elevator"/&gt;
 *     &lt;enumeration value="picnicFacilities"/&gt;
 *     &lt;enumeration value="dumpingStation"/&gt;
 *     &lt;enumeration value="freshWater"/&gt;
 *     &lt;enumeration value="wasteDisposal"/&gt;
 *     &lt;enumeration value="refuseBin"/&gt;
 *     &lt;enumeration value="iceFreeScaffold"/&gt;
 *     &lt;enumeration value="playground"/&gt;
 *     &lt;enumeration value="electricChargingStation"/&gt;
 *     &lt;enumeration value="bikeParking"/&gt;
 *     &lt;enumeration value="tollTerminal"/&gt;
 *     &lt;enumeration value="defibrillator"/&gt;
 *     &lt;enumeration value="firstAidEquipment"/&gt;
 *     &lt;enumeration value="fireHose"/&gt;
 *     &lt;enumeration value="fireExtingiusher"/&gt;
 *     &lt;enumeration value="fireHydrant"/&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EquipmentTypeEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum EquipmentTypeEnum {

    @XmlEnumValue("toilet")
    TOILET("toilet"),
    @XmlEnumValue("shower")
    SHOWER("shower"),
    @XmlEnumValue("informationPoint")
    INFORMATION_POINT("informationPoint"),
    @XmlEnumValue("informatonStele")
    INFORMATON_STELE("informatonStele"),
    @XmlEnumValue("internetTerminal")
    INTERNET_TERMINAL("internetTerminal"),
    @XmlEnumValue("internetWireless")
    INTERNET_WIRELESS("internetWireless"),
    @XmlEnumValue("payDesk")
    PAY_DESK("payDesk"),
    @XmlEnumValue("paymentMachine")
    PAYMENT_MACHINE("paymentMachine"),
    @XmlEnumValue("cashMachine")
    CASH_MACHINE("cashMachine"),
    @XmlEnumValue("vendingMachine")
    VENDING_MACHINE("vendingMachine"),
    @XmlEnumValue("faxMachineOrService")
    FAX_MACHINE_OR_SERVICE("faxMachineOrService"),
    @XmlEnumValue("copyMachineOrService")
    COPY_MACHINE_OR_SERVICE("copyMachineOrService"),
    @XmlEnumValue("safeDeposit")
    SAFE_DEPOSIT("safeDeposit"),
    @XmlEnumValue("luggageLocker")
    LUGGAGE_LOCKER("luggageLocker"),
    @XmlEnumValue("publicPhone")
    PUBLIC_PHONE("publicPhone"),
    @XmlEnumValue("publicCoinPhone")
    PUBLIC_COIN_PHONE("publicCoinPhone"),
    @XmlEnumValue("publicCardPhone")
    PUBLIC_CARD_PHONE("publicCardPhone"),
    @XmlEnumValue("elevator")
    ELEVATOR("elevator"),
    @XmlEnumValue("picnicFacilities")
    PICNIC_FACILITIES("picnicFacilities"),
    @XmlEnumValue("dumpingStation")
    DUMPING_STATION("dumpingStation"),
    @XmlEnumValue("freshWater")
    FRESH_WATER("freshWater"),
    @XmlEnumValue("wasteDisposal")
    WASTE_DISPOSAL("wasteDisposal"),
    @XmlEnumValue("refuseBin")
    REFUSE_BIN("refuseBin"),
    @XmlEnumValue("iceFreeScaffold")
    ICE_FREE_SCAFFOLD("iceFreeScaffold"),
    @XmlEnumValue("playground")
    PLAYGROUND("playground"),
    @XmlEnumValue("electricChargingStation")
    ELECTRIC_CHARGING_STATION("electricChargingStation"),
    @XmlEnumValue("bikeParking")
    BIKE_PARKING("bikeParking"),
    @XmlEnumValue("tollTerminal")
    TOLL_TERMINAL("tollTerminal"),
    @XmlEnumValue("defibrillator")
    DEFIBRILLATOR("defibrillator"),
    @XmlEnumValue("firstAidEquipment")
    FIRST_AID_EQUIPMENT("firstAidEquipment"),
    @XmlEnumValue("fireHose")
    FIRE_HOSE("fireHose"),
    @XmlEnumValue("fireExtingiusher")
    FIRE_EXTINGIUSHER("fireExtingiusher"),
    @XmlEnumValue("fireHydrant")
    FIRE_HYDRANT("fireHydrant"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    EquipmentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EquipmentTypeEnum fromValue(String v) {
        for (EquipmentTypeEnum c: EquipmentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
