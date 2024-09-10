package org.lombok;

public class LombokTest {
    public static void main(String[] args) {
        Student lzssl = new Student("lzssl", 18);
        Student student = new Student();
        student.setAge(18);
        student.setName("lzssl");
        System.out.println("姓名：" + student.getName() + "年龄：" +student.getAge());
        System.out.println("equals方法验证：" + lzssl.equals(student));
        System.out.println("hashCode方法验证：" + (lzssl.hashCode() == student.hashCode()));
        System.out.println(lzssl);
        lzssl.eat("香芋地瓜丸");
        lzssl.eat(null);
    }
}
