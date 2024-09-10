package org.data_structure.fanxing;
/**
 * 子类继承父类的时候，可以直接把父类的类型明确出来,既然子类重写了方法，用的时候肯定是优先用子类的方法
 * 即，我如果用子类的实例去调用父类方法时，只能传我这个子类明确出来的泛型类型
 * 1、如果子类继承父类的时候没有加<...>，这样只有父类名，父类的泛型会自动提升成Object类型
 * 2、若子类也定义成泛型，但父类仅类名，此时子类变成泛型类，父类还是自动提升成Object类型
 * 3、若子类定义成泛型，父类可以仅类名（2），若未明确还是保持泛型的话，只能用和子类一致的泛型，因为子类实例话的时候只能传一个泛型类别
 * */
public class FanXing_Zi extends FanXing_Fu<Province>{
    @Override
    public void show(Province province){
        province.intro();
    }
    public void superShow(Province p){
        //根据super.show()方法接受的数据来看，在这个子类中用调用父类时，泛型默认使用在这个子类已经被明确的泛型
        super.show(p);
    }
}
