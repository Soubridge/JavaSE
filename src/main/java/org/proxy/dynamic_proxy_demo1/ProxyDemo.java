package org.proxy.dynamic_proxy_demo1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ProxyDemo {
    @Test
    public void testDynamicProxy(){
        List<String> dynamicProxyList = (List) new DynamicProxy().getInstance(new ArrayList<String>());
        dynamicProxyList.add("hello world");
        System.out.println(dynamicProxyList);
    }
}
