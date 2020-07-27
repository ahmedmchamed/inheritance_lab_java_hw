import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;
    private Manager manager;
    private Employee employee;

    @Before
    public void before() {
        director = new Director("DirectorMcGhee", 751204, 1000, "Management", 100000);
        manager = new Director("Jennifer", 328458, 1500, "Engineering", 200000);
        employee = new Director("Link", 439811, 1350, "Hyrule", 3000000);
    }

    @Test
    public void canGetName() {
        assertEquals("DirectorMcGhee", director.getName());
        assertEquals("Jennifer", manager.getName());
        assertEquals("Link", employee.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(1000, director.getSalary(), 0.01);
        assertEquals(1500, manager.getSalary(), 0.01);
        assertEquals(1350, employee.getSalary(), 0.01);
    }

    @Test
    public void canGetNiNumber() {
        assertEquals(751204, director.getNiNumber());
        assertEquals(328458, manager.getNiNumber());
        assertEquals(439811, employee.getNiNumber());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Management", director.getDeptName());
        assertEquals("Engineering", manager.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(100000, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1000);
        manager.raiseSalary(500);
        employee.raiseSalary(650);
        assertEquals(2000, director.getSalary(), 0.01);
        assertEquals(2000, manager.getSalary(), 0.01);
        assertEquals(2000, employee.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(20, director.payBonus(), 0.01);
        assertEquals(30, manager.payBonus(), 0.01);
        assertEquals(27, employee.payBonus(), 0.01);
    }
}
