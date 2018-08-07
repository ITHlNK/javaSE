package test.com.changyuan.test;

import mian.com.changyuan.po.GenericClass;
import mian.com.changyuan.po.GenericMethod;
import org.junit.Test;

public class GenericClassTest {
    /**
     * 测试泛型类
     */
    @Test
    public void testGenericClass(){
        GenericClass genericClass = new GenericClass();
        genericClass.setT("我是字符串");
        genericClass.setM(100);
        genericClass.setN(100);
        System.out.println(genericClass.getALL());
    }/**
     * 测试泛型方法
     */
    @Test
    public void testGenericMethod(){
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.setT("我是字符串");
        genericMethod.printerInfo(genericMethod.getT(),1000L);
    }

}
