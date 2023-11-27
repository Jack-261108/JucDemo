package org.example.Jvm;

/**
 * @author Jack
 * @Desc
 * @Date 2023/11/25/13:17:10
 **/
public class Demo1 extends ClassLoader{
    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        return super.loadClass(name, resolve);
    }
}
