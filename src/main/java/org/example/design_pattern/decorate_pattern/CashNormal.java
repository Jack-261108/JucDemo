package org.example.design_pattern.decorate_pattern;

/**
 * @author Jack
 * @Desc
 * @Date 2023/11/27/11:55:35
 **/
public class CashNormal implements ISale {
    @Override
    public Double acceptCash(double cash, int num) {
        return cash * num;
    }
}
