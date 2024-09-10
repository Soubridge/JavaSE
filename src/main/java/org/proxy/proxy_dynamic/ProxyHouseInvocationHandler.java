package org.proxy.proxy_dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHouseInvocationHandler implements InvocationHandler {
    private FangDong fangDong;

    public ProxyHouseInvocationHandler(FangDong fangDong){
        this.fangDong = fangDong;
    }
    /**
     * @param proxy : 代理的对象(原始)
     * @param method : 代理对象执行的那个方法 (这个方法可能用到对象的成员)
     * @param args  : 代理对象执行那个方法时传递的对象
     * @return : 代理对象调用方法的返回值
     * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = method.getName();
        Object result;
        if(name.equals("GongYu")){
            System.out.println("中介多收100");
            result = method.invoke(fangDong);
        }else if(name.equals("JiangJingFang")){
            System.out.println("中介多收200");
            result = method.invoke(fangDong);
        }else{
            System.out.println("中介多收300");
            result = method.invoke(fangDong);
        }
        return result;
    }
}
