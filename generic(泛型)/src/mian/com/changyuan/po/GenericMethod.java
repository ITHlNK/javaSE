package mian.com.changyuan.po;

/**
 * 泛型方法
 */
public class GenericMethod <T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    /**
     * 泛型方法
     * @param e
     * @param m
     * @param <E>
     * @param <M>
     */
    public <E,M> void printerInfo(E e,M m){
        System.out.println(e+":"+m);
    }
}
