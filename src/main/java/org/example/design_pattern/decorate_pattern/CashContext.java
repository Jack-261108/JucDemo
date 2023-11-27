package org.example.design_pattern.decorate_pattern;

/**
 * @author Jack
 * @Desc
 * @Date 2023/11/27/12:31:58
 **/
public class CashContext {
    private ISale cs;


    public CashContext(int cashType) {
        switch (cashType) {
            case 1:
                cs = new CashNormal();
                break;
            case 5:
                cs = new CashNormal();
                new CashReturn(cs);

                break;
            case 6:
                break;
        }
    }
}
