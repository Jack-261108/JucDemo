package org.example.design_pattern.decorate_pattern;

/**
 * @author Jack
 * @Desc
 * @Date 2023/11/27/11:56:06
 **/
public class CashSuper implements ISale {
    private ISale componet;

    public CashSuper(ISale componet) {
        this.componet = componet;
    }

    @Override
    public Double acceptCash(double price, int num) {
        double result = 0d;
        if (componet != null) {
            result = componet.acceptCash(price, num);
        }
        return result;
    }
}
