package org.example.design_pattern.decorate_pattern;

/**
 * @author Jack
 * @Desc
 * @Date 2023/11/27/12:01:29
 **/
public class CashRebate extends CashSuper {
    private double moneyRebate = 1d;

    public CashRebate(ISale componet) {
        super(componet);
    }

    @Override
    public Double acceptCash(double price, int num) {
        double result = price * num * moneyRebate;
        return super.acceptCash(result, 1);
    }
}
