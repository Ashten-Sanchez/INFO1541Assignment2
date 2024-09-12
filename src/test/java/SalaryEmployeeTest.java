import EmployeeObjects.SalaryEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryEmployeeTest {

    private SalaryEmployee emp;

    @BeforeEach
    void setUp() {

        emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
    }

//  Added test for calculateWeeklyPay method in SalaryEmployeeTest

    @Test
    void testCalculateWeeklyPay() {

        assertEquals(1237.02, emp.calculateWeeklyPay(), 0.01);
    }

//  Added test for holidayBonus method in SalaryEmployeeTest
    @Test
    void testHolidayBonus() {

        assertEquals(2164.54, emp.holidayBonus(), 0.01);
    }
}
