package org.example.design_pattern.decorate_pattern;

/**
 * @author Jack
 * @Desc
 * @Date 2023/11/27/12:10:55
 **/
public class CashReturn extends CashSuper {
    private double moneyCondition = 0d;
    private double moneyReturn = 0d;

    public CashReturn(ISale componet) {
        super(componet);
    }

    @Override
    public Double acceptCash(double price, int num) {
        double result = price * num;
        if (moneyCondition > 0 && result >= moneyReturn) {
            result = result - Math.floor(result / moneyCondition) * moneyReturn;
        }
        return super.acceptCash(result,1);
    }
}
