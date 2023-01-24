import org.testng.Assert;
import org.testng.annotations.Test;

public class SalaryTaxTest {
    private double salary;

    @Test
    public void testSalaryPositiveLess10000() {
        salary = 1000;
        Assert.assertEquals(SalaryTax.countTax(salary), salary * SalaryTax.TAX_13_PERCENT_INDEX, "Wrong tax value");
    }

    @Test
    public void testSalaryNegativeValue() {
        salary = -5;
        Assert.assertEquals(SalaryTax.countTax(salary), 0, "Wrong tax value");
    }

    @Test
    public void testSalary10000() {
        salary = 10000;
        Assert.assertEquals(SalaryTax.countTax(salary), salary * SalaryTax.TAX_20_PERCENT_INDEX, "Wrong tax value");
    }

    @Test
    public void testSalaryFrom10000To50000() {
        salary = 12000;
        Assert.assertEquals(SalaryTax.countTax(salary), salary * SalaryTax.TAX_20_PERCENT_INDEX, "Wrong tax value");
    }

    @Test
    public void testSalary50000() {
        salary = 50000;
        Assert.assertEquals(SalaryTax.countTax(salary), salary * SalaryTax.TAX_20_PERCENT_INDEX, "Wrong tax value");
    }

    @Test
    public void testSalaryMoreThan50000() {
        salary = 100000;
        Assert.assertEquals(SalaryTax.countTax(salary), salary * SalaryTax.TAX_30_PERCENT_INDEX, "Wrong tax value");
    }
}
