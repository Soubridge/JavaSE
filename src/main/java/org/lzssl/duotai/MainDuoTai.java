package org.lzssl.duotai;

public class MainDuoTai {
    public static void main(String[] args) {
//        PetStore petStore = new PetStore();
//        Dog dog = new Dog();
//        petStore.storeDog(dog);

        PetStore petStore = new PetStore();
        Dog dog = new Dog();
        petStore.storeAnimal(dog);  //这里storeAnimal函数本来形参应该时Animal类的，这里用了dog类，相当于把Dog向上转成Animal
                                    //这样每加一种宠物就没必要去单独再在宠物店修改具体动物的代码，直接继承Animal就可以
        //虽然在PetStore类的storeAnimal方法体中是animal.eat，但是传过去的是animal的子类Dog类型的值，相当于中间有个
        //Animal animal = Dog dog();的转换，使用的具体方法还是Dog子类重写过的方法，这样解决了PetStore频繁加某种动物行为的问题

        //测试子类多方法
        Animal animal = new Cat();
    }
}
