import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("David", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("David", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessage(){
        assertEquals("This is David your flight attendant speaking. Please fasten your seatbelts!", cabinCrewMember.relayMessage("Please fasten your seatbelts!"));
    }
}
