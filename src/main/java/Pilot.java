public class Pilot extends Person{

    private Rank rank;
    private String licenceNumber;

    public Pilot(String name, Rank rank, String licenceNumber){
        super(name);
        this.rank = rank;
        this.licenceNumber = licenceNumber;
    }

    public Rank getRank(){
        return rank;
    }

    public String getLicenceNumber(){
        return licenceNumber;
    }

    public String flyPlane() {
        return "Take-off in 3-2-1 woooosh!";
    }
}
