public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public double reservedBaggageWeight() {
        return flight.getPlane().getPlaneType().getWeight() * 0.5;
    }

    public double bookedBaggageWeight() {
        return reservedBaggageWeight() / flight.getPlane().getPlaneType().getCapacity();
    }


    public double remainingBaggageWeight() {
        return reservedBaggageWeight() - bookedBaggageWeight();
    }
}
