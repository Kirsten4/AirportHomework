public class FlightManager {

    private Flight flight;
    private double reservedBaggageWeight;
    private double weightPerBag = 20.00;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    private double reservedBaggageWeight(){
        return flight.getPlane().getPlaneType().getWeight() * 0.5;
    }

    public double reservedBaggageWeightPerPassenger() {
        return reservedBaggageWeight() / flight.getPlane().getPlaneType().getCapacity();
    }

    public double bookedBaggageWeight() {
        double totalWeight = 0;
        for (Passenger passenger : flight.getPassengers()){
            totalWeight += passenger.getNumberOfBags() * weightPerBag;
        }
        return totalWeight;
    }

    public double remainingBaggageWeight() {
        return reservedBaggageWeight() - bookedBaggageWeight();
    }
}
