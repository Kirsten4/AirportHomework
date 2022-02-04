public enum PlaneType {

    BOEING_747(467, 183000),
    AIRBUS_A380(853, 562000),
    BOEING_787(248, 119959);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public int getWeight(){
        return this.weight;
    }
}
