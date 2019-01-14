package ManagementTests;

import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director;

    @Before
    public void before(){
        director = new Director("Pablihno", "DR235252U", 55.000, "IT", 200.00);
    }
    @Test
    public void hasName(){
        assertEquals("Pablihno", director.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("DR235252U", director.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(55.000, director.getSalary(), 0.001);
    }

    @Test
    public void hasDepartment(){
        assertEquals("IT", director.getDeptName());
    }
    @Test
    public void hasBudget(){
        assertEquals(200.00, director.getBudget(), 0.001);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10.00);
        assertEquals(65.000, director.getSalary(), 0.001);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(1.100, director.payBonus(), 0.001);
    }
}
