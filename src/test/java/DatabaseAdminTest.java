import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;
    private Employee employee;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Tom", 124395, 2100);
        employee = new DatabaseAdmin("Jim", 294219, 2050);
    }

    @Test
    public void canGetName() {
        assertEquals("Tom", databaseAdmin.getName());
        assertEquals("Jim", employee.getName());
    }

    @Test
    public void canGetSalary() {
        assertEquals(2100, databaseAdmin.getSalary(), 0.01);
        assertEquals(2050, employee.getSalary(), 0.01);
    }

    @Test
    public void canGetNiNumber() {
        assertEquals(124395, databaseAdmin.getNiNumber());
        assertEquals(294219, employee.getNiNumber());
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(400);
        employee.raiseSalary(450);
        assertEquals(2500, databaseAdmin.getSalary(), 0.01);
        assertEquals(2500, employee.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(21, databaseAdmin.payBonus(), 0.01);
        assertEquals(20.5, employee.payBonus(), 0.01);
    }

}
