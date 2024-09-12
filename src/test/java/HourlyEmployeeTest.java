import EmployeeObjects.HourlyEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HourlyEmployeeTest {

    private HourlyEmployee emp;

    @BeforeEach
    void setUp() {

        emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
    }

//  Added test for increaseHours method in HourlyEmployeeTest
    @Test
    void testIncreaseHours() {

        emp.increaseHours(10);
        assertEquals(10, emp.getHoursWorked());

        emp.increaseHours(-5);
        assertEquals(10, emp.getHoursWorked());
    }

//  Added test for annualRaise method in HourlyEmployeeTest
    @Test
    void testAnnualRaise() {

        emp.annualRaise();
        assertEquals(34.49, emp.getWage(), 0.01);
    }

//  Added test for calculateWeeklyPay method (35 and 45 hours) in HourlyEmployeeTest
    @Test
    void testCalculateWeeklyPayWith35Hours() {

        emp.increaseHours(35);
        assertEquals(1149.75, emp.calculateWeeklyPay(), 0.01);
    }

    @Test
    void testCalculateWeeklyPayWith45Hours() {

        emp.increaseHours(45);
        assertEquals(1560.38, emp.calculateWeeklyPay(), 0.01);
    }
}

