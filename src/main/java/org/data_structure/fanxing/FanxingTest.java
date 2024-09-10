package org.data_structure.fanxing;

import org.data_structure.list.VectorTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

/**
 * 使用泛型可以避免一步强制类型转换的步骤，同时限制了写入的数据类型安全行提高
 * */
public class FanxingTest {
    public static void main(String[] args) {
//        Collection list = new ArrayList<>();
//
//        list.add(new Province("台湾", "台","华东"));
//        list.add(new Province("澳门", "澳","华南"));
//        list.add(new Province("香港", "港","华南"));
//        list.add(new Province("河北", "冀","华北"));
//
//        Iterator iterator = list.iterator();
//
//        while(iterator.hasNext()){
//            //没有写具体的泛型，集合Collection中的元素被提升为Object类型
//            Object obj = iterator.next();
//            //取出来后要将被提升的元素强制转换回具体的类型
//            Province province = (Province)obj;
//            province.intro();
//        }
        /*Collection<Province> list1 = new ArrayList<>();
        //Collection list1 = new ArrayList<Province>();
        list1.add(new Province("山东","鲁","华北"));
        list1.add(new Province("山西","晋","华北"));

        Iterator<Province> iterator1 = list1.iterator();
        while(iterator1.hasNext()){
            Province pro = iterator1.next();
            pro.intro();
        }*/

        /*GetClass<Province> getClass = new GetClass<>();
        getClass.setE(new Province("山东","鲁","华北"));
        Province p = getClass.getE();
        p.intro();*/

        FanXing_Zi zi = new FanXing_Zi();
        zi.show(new Province("山东","鲁","华北"));
        zi.superShow(new Province("山东","鲁","华北"));
    }
}
