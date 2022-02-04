import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private Location destination;
    private Location departureAirport;
    private String departureTime;

    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrewMember> cabinCrewMembers, Plane plane, String flightNumber, Location destination, Location departureAirport, String departureTime) {
        this.pilots = pilots;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Location getDestination() {
        return destination;
    }

    public Location getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int availableSeats() {
        return plane.getPlaneType().getCapacity() - passengers.size();
    }

    public void bookPassenger(Passenger passenger) {
        if (availableSeats() > 0) {
            passengers.add(passenger);
        }
    }
}
