import EmployeeObjects.CommissionEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommissionEmployeeTest {

    private CommissionEmployee emp;

    @BeforeEach
    void setUp() {

        emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);
    }

//  Added test for increaseSales method in CommissionEmployeeTest
    @Test
    void testIncreaseSales() {

        emp.increaseSales(5000);
        assertEquals(5000, emp.getSales(), 0.01);

        emp.increaseSales(-1000);
        assertEquals(5000, emp.getSales(), 0.01);
    }

//  Added test for holidayBonus method in CommissionEmployeeTest
    @Test
    void testHolidayBonus() {

        assertEquals(0, emp.holidayBonus(), 0.01);
    }

//  Added test for annualRaise method in CommissionEmployeeTest
    @Test
    void testAnnualRaise() {

        emp.annualRaise();

        emp.annualRaise();
        assertEquals(0.0305, emp.getRate(), 0.0001);
    }
}
