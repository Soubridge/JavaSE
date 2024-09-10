package org.proxy.dynamic_proxy_demo1;

import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProxySelector;

public class DynamicProxy implements InvocationHandler {
    private Object targetObject;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        System.out.println("开始执行");
        //返回的是method方法的执行结果，一个接口可能有好多方法，具体是哪个？
        Object invoke = method.invoke(targetObject, args);
        System.out.println("执行结束");
        return invoke;
    }

    public Object getInstance(Object targetObject){
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }
}
