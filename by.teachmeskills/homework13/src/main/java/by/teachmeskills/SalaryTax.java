
//        Вычислить сумму налога по прогрессивной шкале в зависимости от полученного заработка:
//        13% на доход до 10 000, 20% на доход от 10 000 до 50 000, 30% на доход выше 50 000.
//        Метод должен принимать сумму оплаты труда, а возвращать сумму налога.

class SalaryTax {
    static final double TAX_13_PERCENT_INDEX = 0.13;
    static final double TAX_20_PERCENT_INDEX = 0.2;
    static final double TAX_30_PERCENT_INDEX = 0.3;
    private static final int LIMIT_10_000 = 10_000;
    private static final int LIMIT_50_000 = 50_000;

    static double countTax(double salary) {
        if (salary <= 0) {
            return 0;
        } else if (salary < LIMIT_10_000) {
            return salary * TAX_13_PERCENT_INDEX;
        } else if (salary <= LIMIT_50_000) {
            return salary * TAX_20_PERCENT_INDEX;
        } else return salary * TAX_30_PERCENT_INDEX;
    }
}
