import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private Flight flight;
    private Pilot pilot1;
    private Pilot pilot2;
    private ArrayList<Pilot> pilots;
    private CabinCrewMember cabinCrewMember1;
    private CabinCrewMember cabinCrewMember2;
    private CabinCrewMember cabinCrewMember3;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;
    private FlightManager flightManager;

    @Before
    public void before(){
        pilot1 = new Pilot("Ayumi", Rank.CAPTAIN, "ABC12345");
        pilot2 = new Pilot("Steven", Rank.FIRST_OFFICER, "DEF12345");
        pilots = new ArrayList<Pilot>();
        pilots.add(pilot1);
        pilots.add(pilot2);
        cabinCrewMember1 = new CabinCrewMember("Nickola", Rank.PURSER);
        cabinCrewMember2 = new CabinCrewMember("Dan", Rank.FLIGHT_ATTENDANT);
        cabinCrewMember3 = new CabinCrewMember("Kaiden", Rank.FLIGHT_ATTENDANT);
        cabinCrewMembers = new ArrayList<CabinCrewMember>();
        cabinCrewMembers.add(cabinCrewMember1);
        cabinCrewMembers.add(cabinCrewMember2);
        cabinCrewMembers.add(cabinCrewMember3);
        plane = new Plane(PlaneType.BOEING_787);
        flight = new Flight(pilots,cabinCrewMembers,plane, "F1122", Location.GLA, Location.SIN, "14:00");
        passenger1 = new Passenger("Kirsten", 3);
        passenger2 = new Passenger("David", 1);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        flightManager = new FlightManager(flight);
    }

    @Test
    public void canCalculateReservedBaggageWeight(){
        assertEquals(59979.5, flightManager.reservedBaggageWeight(),0.01);
    }

    @Test
    public void canCalculateBookedBaggageWeight(){
        assertEquals(241.85, flightManager.bookedBaggageWeight(),0.01);
    }

    @Test
    public void canCalculateRemainingBaggageWeight(){
        assertEquals(59737.65, flightManager.remainingBaggageWeight(),0.01);
    }
}
