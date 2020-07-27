import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;
    private Employee employee;

    @Before
    public void before() {
        manager = new Manager("Frank", 276519, 1700, "Marketing");
        employee = new Manager("Abraham", 897641, 1750, "Engineering");
    }

    @Test
    public void canSetName() {
        manager.setName("Harry");
        employee.setName("Jimbo");
        assertEquals("Harry", manager.getName());
        assertEquals("Jimbo", employee.getName());
        employee.setName(null);
        assertEquals("Jimbo", employee.getName());
    }

    @Test
    public void canPreventNegativeSalaryIncrease() {
        employee.raiseSalary(-1000000);
        assertEquals("Not today, Satan.", employee.raiseSalary(-1000000));
        assertEquals(1750, employee.getSalary(), 0.01);
    }

    @Test
    public void canGetName() {
        assertEquals("Frank", manager.getName());
        assertEquals("Abraham", employee.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals(276519, manager.getNiNumber());
        assertEquals(897641, employee.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(1700, manager.getSalary(), 0.01);
        assertEquals(1750, employee.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(100);
        employee.raiseSalary(50);
        assertEquals(1800, manager.getSalary(), 0.01);
        assertEquals(1800, employee.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus() {
        assertEquals(17, manager.payBonus(), 0.01);
        assertEquals(17.5, employee.payBonus(), 0.01);
    }

}
