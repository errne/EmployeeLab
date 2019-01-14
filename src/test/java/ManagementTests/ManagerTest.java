package ManagementTests;

import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;
    @Before
    public void before(){
        manager = new Manager("Pablo", "JH65629N", 25.000, "IT");
    }

    @Test
    public void hasName(){
        assertEquals("Pablo", manager.getName());
    }
    @Test
    public void hasNI(){
        assertEquals("JH65629N", manager.getNI());
    }
    @Test
    public void hasSalary(){
        assertEquals(25.000, manager.getSalary(),0.001);
    }
    @Test
    public void hasDeptName(){
        assertEquals("IT", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(2.50);
        assertEquals(27.500, manager.getSalary(), 0.001);
    }

    @Test
    public void canNotRaiseSalary(){
        manager.raiseSalary(-1.0);
        assertEquals(25.000, manager.getSalary() , 0.01);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(0.25, manager.payBonus(), 0.001);
    }
}
