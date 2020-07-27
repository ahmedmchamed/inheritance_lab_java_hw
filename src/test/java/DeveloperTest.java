import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;
    private Employee employee;


    @Before
    public void before() {
        developer = new Developer("Fred", 561980, 1800);
        employee = new Developer("Derek", 389562, 1900);
    }

    @Test
    public void canGetName() {
        assertEquals("Fred", developer.getName());
        assertEquals("Derek", employee.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(1800, developer.getSalary(), 0.01);
        assertEquals(1900, employee.getSalary(), 0.01);
    }

    @Test
    public void canGetNiNumber() {
        assertEquals(561980, developer.getNiNumber());
        assertEquals(389562, employee.getNiNumber());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(200);
        employee.raiseSalary(100);
        assertEquals(2000, developer.getSalary(), 0.01);
        assertEquals(2000, employee.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(18, developer.payBonus(), 0.01);
        assertEquals(19, employee.payBonus(), 0.01);
    }

}
