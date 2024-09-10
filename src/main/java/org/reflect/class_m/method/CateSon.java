package org.reflect.class_m.method;

public class CateSon extends Cate{
    @Override
    public void eat(){
        System.out.println("儿子用嘴吃饭");
    }
    @Override
    public void wen(String left){
        System.out.println("儿子用" + left + "闻");
    }
}
