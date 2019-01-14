package techStaffTests;

import Staff.techStaff.DBA;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DBATest {

    private DBA dba;

    @Before
    public void before(){
        dba = new DBA("Pabla", "BH6547M", 19.000);
    }

    @Test
    public void hasName(){
        assertEquals("Pabla", dba.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("BH6547M", dba.getNI());
    }
    @Test
    public void hasSalary(){
        assertEquals(19.000, dba.getSalary(),0.001);
    }

    @Test
    public void canRaiseSalary(){
        dba.raiseSalary(1.50);
        assertEquals(20.500, dba.getSalary(), 0.001);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(0.19, dba.payBonus(), 0.001);
    }
}
