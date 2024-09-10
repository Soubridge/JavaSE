package org.reflect.class_m;


import org.reflect.class_m.method.Cate;

/**
 *  获取类的字节码文件(.class)有三种方式
 *  ①类名.class
 *  ②实例对象.getClass()
 *  ③Class.forName("包中路径")
 *  获取后加载到内存会被Class类描述(赋值给Class对象)，不管哪种获取方式，字节码对象仅有一个，是JVM加载类时自动生成的
 *
 *  Class类的常用方法 .getName()获取完整路径,和③中填写的相同，.getSimple()仅获得类名
 *  .newInstance() 为这个类new一个新的实例，要求这个类必须有无参构造函数
 * */
public class GetClassObject {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class<Cate> cateClass = Cate.class;

        Cate cate = new Cate();
        Class<? extends Cate> cateClass1 = cate.getClass();

//        try {
//            Class<?> cateClass2 = Class.forName("org.reflect.class_m.method.Cate");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        Class cateClass2 = Class.forName("org.reflect.class_m.method.Cate");
//        System.out.println((cateClass1 == cateClass) && (cateClass1 == cateClass2));

        System.out.println(cateClass.getSimpleName());
        System.out.println(cateClass.getName());
        Cate cate1 = cateClass.newInstance();
    }
}
