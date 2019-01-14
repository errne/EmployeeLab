package techStaffTests;

import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Pablito", "JH56788T", 15.000);
    }

    @Test
    public void hasName(){
        assertEquals("Pablito", developer.getName());
    }
    @Test
    public void hasNI(){
        assertEquals("JH56788T", developer.getNI());
    }
    @Test
    public void hasSalary(){
        assertEquals(15.000, developer.getSalary(),0.001);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(2.50);
        assertEquals(17.500, developer.getSalary(), 0.001);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(0.15, developer.payBonus(), 0.001);
    }
}
