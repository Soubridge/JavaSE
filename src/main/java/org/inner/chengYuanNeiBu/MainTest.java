package org.inner.chengYuanNeiBu;

public class MainTest {
    public static void main(String[] args) {
//        Computer computer = new Computer();
//        computer.price = 5000;
//        //通过外部类创建内部类
//        Computer.Cpu cpu = computer.new Cpu();
//        cpu.run();
//
//        //下面这种创建方法实际上也创建了外部类Computer，只是没有赋给具体的变量而已，就像long endTime = new Date().getTime;
//        Computer.Cpu cpu1 = new Computer().new Cpu();
//        cpu1.run();

        /*Computer computer = new Computer();
        computer.price = 5000;
        Computer.Cpu cpu = computer.new Cpu();
        cpu.run();

        Computer.Cpu cpu1 = new Computer().new Cpu();
        cpu1.run();*/

//        System.out.println(Outer.province);
//        //静态内部类其实不能像静态内部成员一样可以直接用，是需要new的，静态内部类的好处就是不需要预先创建外部类
//        //也就是说这个静态内部类不属于任何一个外部类对象，是属于外部类本身，其实是和静态成员差不多的
//        Outer.Inner inner = new Outer.Inner();
//        inner.shouInner();

        LordTest lordTest = new LordTest();

        LordTest.Inner inner = new LordTest.Inner();

    }
}
