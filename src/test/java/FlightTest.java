import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Pilot pilot1;
    private Pilot pilot2;
    private ArrayList<Pilot> pilots;
    private CabinCrewMember cabinCrewMember1;
    private CabinCrewMember cabinCrewMember2;
    private CabinCrewMember cabinCrewMember3;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;

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
    }

    @Test
    public void hasPilots(){
        assertEquals(2, flight.getPilots().size());
    }

    @Test
    public void hasCabinCrewMembers(){
        assertEquals(3, flight.getCabinCrewMembers().size());
    }

    @Test
    public void hasEmptyBookedPassengers(){
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void hasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("F1122", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals(Location.GLA, flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals(Location.SIN, flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("14:00", flight.getDepartureTime());
    }

    @Test
    public void canReturnNumberOfAvailableSeats(){
        assertEquals(248, flight.availableSeats());
    }

    @Test
    public void canBookPassenger(){
        passenger1 = new Passenger("Kirsten", 3);
        passenger2 = new Passenger("David", 1);
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(passenger1, flight.getPassengers().get(0));
        assertEquals(passenger2, flight.getPassengers().get(1));
        assertEquals(246, flight.availableSeats());
    }



}
