package org.lzssl.FatherAndSon;
/**
 * 向上兼容(以丢失数据的方式兼容)
 * */
public class FsTest {
    public static void main(String[] args) {
        //Father f <- new Son
        /*Teacher teacher = new Teacher("zs", 26, "讲师", 8000);
        teacher.preShow();
        Person person = new Teacher("lsl", 26, "讲师", 8000);
        person.show();*/

        //Son s <- new Father
        //Person zs = new Person("zs", 26);
        //Teacher tea = (Teacher) zs; //编译器不识别错误，运行报错，父类的实例缺少某些变量，直接赋到子类引用规则上也不能给过啊

        Person p = new Teacher("zs", 26, "教授", 9000);
        Teacher teacher1 = (Teacher) p;
        teacher1.show();
        teacher1.preShow();
    }
}
