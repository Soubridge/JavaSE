package org.enmu.enum_m;
/**
 * 如果枚举类有抽象方法，必须要的写枚举项的时候写出来，就像实例化一个抽象类，必须要补全(重写)抽象方法一样，非抽象的方法也可以重写
 * 此时，Spring、Summer相当于Abstract_enum的内部类
 * */
public enum Abstract_enum {
    Spring(){
        @Override
        public void season(){
            System.out.println("春天");
        }
        @Override
        public void show(){
            System.out.println("我知道我是啥季节了");
        }
    }
    , Summer(){
        @Override
        public void season(){
            System.out.println("夏天");
        }
    };

    public void show(){
        System.out.println("我是什么季节");
    }
    public abstract void season();
}
