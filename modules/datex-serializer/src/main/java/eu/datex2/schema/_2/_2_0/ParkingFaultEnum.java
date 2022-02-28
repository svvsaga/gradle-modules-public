
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingFaultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ParkingFaultEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="communicationsFailure"/&gt;
 *     &lt;enumeration value="barrierMalfunction"/&gt;
 *     &lt;enumeration value="entranceExitObstructed"/&gt;
 *     &lt;enumeration value="erroneousOccupancyInformation"/&gt;
 *     &lt;enumeration value="erroneousOccupancyDisplayed"/&gt;
 *     &lt;enumeration value="paymentMachinesInoperative"/&gt;
 *     &lt;enumeration value="reservationServiceOutOfOrder"/&gt;
 *     &lt;enumeration value="noParkingInformationAvailable"/&gt;
 *     &lt;enumeration value="unspecified"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingFaultEnum")
@XmlEnum
public enum ParkingFaultEnum {

    @XmlEnumValue("communicationsFailure")
    COMMUNICATIONS_FAILURE("communicationsFailure"),
    @XmlEnumValue("barrierMalfunction")
    BARRIER_MALFUNCTION("barrierMalfunction"),
    @XmlEnumValue("entranceExitObstructed")
    ENTRANCE_EXIT_OBSTRUCTED("entranceExitObstructed"),
    @XmlEnumValue("erroneousOccupancyInformation")
    ERRONEOUS_OCCUPANCY_INFORMATION("erroneousOccupancyInformation"),
    @XmlEnumValue("erroneousOccupancyDisplayed")
    ERRONEOUS_OCCUPANCY_DISPLAYED("erroneousOccupancyDisplayed"),
    @XmlEnumValue("paymentMachinesInoperative")
    PAYMENT_MACHINES_INOPERATIVE("paymentMachinesInoperative"),
    @XmlEnumValue("reservationServiceOutOfOrder")
    RESERVATION_SERVICE_OUT_OF_ORDER("reservationServiceOutOfOrder"),
    @XmlEnumValue("noParkingInformationAvailable")
    NO_PARKING_INFORMATION_AVAILABLE("noParkingInformationAvailable"),
    @XmlEnumValue("unspecified")
    UNSPECIFIED("unspecified"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingFaultEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingFaultEnum fromValue(String v) {
        for (ParkingFaultEnum c: ParkingFaultEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
