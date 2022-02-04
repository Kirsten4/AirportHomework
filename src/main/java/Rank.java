public enum Rank {

    CAPTAIN("captain"),
    FIRST_OFFICER("first officer"),
    PURSER("purser"),
    FLIGHT_ATTENDANT("flight attendant");

    private final String rankName;

    Rank(String rankName){
        this.rankName = rankName;
    }

    public String getRankName(){
        return rankName;
    }

}
