import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest{

    private Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Steven", Rank.CAPTAIN, "ABC12345");
    }

    @Test
    public void hasName(){
        assertEquals("Steven", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasLicenceNumber(){
        assertEquals("ABC12345", pilot.getLicenceNumber());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Take-off in 3-2-1 woooosh!", pilot.flyPlane());
    }
}
