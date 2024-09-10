package org.data_structure.shuangliejihe;

import java.util.*;

/**
 * HashMap存取是无序的，键K不可重复参照HashSet，值V可以重复，所以.Values()返回Collection，而.keySet()返回Set
 * HashMap底层
 * */
public class MapInterface {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap();
        map.put("江西", "南昌");
        map.put("湖南", "长沙");
        map.put("湖北", "武汉");
//        System.out.println(map);
//        System.out.println(map.get("江西"));
//        System.out.println(map.remove("湖北")+"被删除了");
//
//        Set<String> key = map.keySet();   //这里只是用的Set并不知道它具体的存储结构是啥hash？tree？
//        System.out.println(key);
//        Collection<String> collection = map.values();
//        System.out.println(collection);
//
//        for (String str : map.keySet()) {
//            System.out.println(map.get(str));
//        }

        for(Map.Entry<String,String> node : map.entrySet()){    //注意：在写循环元素的数据类型时，用了接口Map.Entry,其底层实现类是Node类
            System.out.println(node.getKey()+":"+node.getValue());
        }
    }
}
