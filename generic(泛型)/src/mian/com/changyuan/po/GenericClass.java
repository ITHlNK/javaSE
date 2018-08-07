package mian.com.changyuan.po;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型类
 * @param <T>
 * @param <N>
 * @param <M>
 */
public class GenericClass<T, N, M> {
    private T t;
    private N n;
    private M m;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public N getN() {
        return n;
    }

    public void setN(N n) {
        this.n = n;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public List getALL() {
        List list = new ArrayList();
        list.add(t);
        list.add(n);
        list.add(m);
        return list;
    }
}
