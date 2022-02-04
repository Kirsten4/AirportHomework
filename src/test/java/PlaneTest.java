import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING_787);
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.BOEING_787, plane.getPlaneType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(248, plane.getPlaneType().getCapacity());
    }

    @Test
    public void hasWeight(){
        assertEquals(119959, plane.getPlaneType().getWeight());
    }
}
