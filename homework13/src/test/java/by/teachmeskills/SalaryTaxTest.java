package by.teachmeskills;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalaryTaxTest {

    @DataProvider
    public static Object[][] salariesAndTaxes() {
        return new Double[][]{
                {1000.0, 1000 * SalaryTax.TAX_13_PERCENT_INDEX},
                {-5.0, 0.0},
                {10000.0, 10000.0 * SalaryTax.TAX_20_PERCENT_INDEX},
                {12000.0, 12000.0 * SalaryTax.TAX_20_PERCENT_INDEX},
                {50000.0, 50000.0 * SalaryTax.TAX_20_PERCENT_INDEX},
                {100000.0, 100000.0 * SalaryTax.TAX_30_PERCENT_INDEX}};
    }

    @Test(dataProvider = "salariesAndTaxes")
    public static void testSalaryMoreThan50000(double salary, double tax) {
        Assert.assertEquals(SalaryTax.countTax(salary), tax, "Wrong tax value");
    }
}
