package org.inner.lambda;

public class Main {
    public static void main(String[] args) {
        /**
         * 这里是做了一个比较器，方便切换各种比较方法，但是各种比较方法实现类的实例还是需要new出来
         * 只不过可以用比较器来统一管理，相较于匿名内部类的方法还是复杂
         * */
//        Comparator_Imp imp = new Comparator_Imp();
//        BiJiao biJiao = new BiJiao(imp);
//        System.out.println(biJiao.comparator(1,2));
//        Comparator_Imp1 imp1 = new Comparator_Imp1();
//        biJiao.setCom(imp1);
//        System.out.println(biJiao.comparator(1,1));

        /**这里是直接用实现类的实例来作比较，也是最常用的*/
//        Comparator_Imp imp = new Comparator_Imp();
//        System.out.println(imp.comparator(1,1));
        /**这里是采用匿名内部类的方法，这样不必去做接口的实现类，直接用一个匿名内部类来实现接口的方法*/
//        Comparator comparator = new Comparator(){
//            @Override
//            public String comparator(int num1, int num2){
//                if(num1==num2) return "0";
//                else return num1>num2 ? "1" : "-1";
//            }
//        };
//        System.out.println(comparator.comparator(1,2));
//        //用匿名内部类整出来的可以直接用，也可以像下面一样，用比较器控制
//        BiJiao biJiao = new BiJiao(comparator);
//        System.out.println(biJiao.comparator(2,1));

        /**如果接口中只有一个抽象函数，也可以用lambda表达式去写具体实现*/
        //看看下面的就知道为啥叫匿名内部类了吧，根本不需要这个类干啥，就只让它做个函数
        BiJiao biJiao = new BiJiao();
        biJiao.setCom(new Comparator() {  //你看像不像在给这个比较类设置属性啊？？？？？
            @Override
            public String comparator(int num1, int num2) {
                if(num1 == num2) return "终于知道为啥叫匿名内部类了，作为函数的形参";
                else return "不等于";
            }
        });
        System.out.println(biJiao.comparator(1,1));
        //中间重写部分可以用lambda表达式代替,需要注意的是使用lambda表达式时，接口只能有一个函数，因为写法决定了不能通过名字定位！！
        biJiao.setCom(
                (num1,num2)->{
                    if(num1 == num2) return "哦豁，这俩相等";
                    else return num1>num2 ? "第一个大" : "第二个大";
                }
        );
        System.out.println(biJiao.comparator(1,1));


    }
}
