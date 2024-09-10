package org.reflect.class_m.field;

import org.reflect.class_m.field.Cate;

public class CateSon extends Cate {
    public String sonName;
    private String sonSon;

    @Override
    public void eat(){
        System.out.println("儿子用嘴吃饭");
    }
    @Override
    public void wen(String left){
        System.out.println("儿子用" + left + "闻");
    }
}
