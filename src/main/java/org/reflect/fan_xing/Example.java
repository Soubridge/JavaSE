package org.reflect.fan_xing;

public class Example<T extends Number>{
    private T param;
    public T getParam(){
        return param;
    }
    public void setParam(T param){
        this.param = param;
    }
}
