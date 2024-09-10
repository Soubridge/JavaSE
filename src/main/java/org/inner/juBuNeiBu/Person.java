package org.inner.juBuNeiBu;

public class Person {
    public String name = "lls";

    public void eat(){
        //在方法中定义一个类
        class Chopsticks{
            private int length;
            public void use(){
                System.out.println(name+"再用长度为"+length+"的筷子吃饭");
            }

            public int getLength() {
                return length;
            }

            public void setLength(int length) {
                this.length = length;
            }
        }
        /**
         * 只在局部的领域内用比较方便，而且不会污染命名空间,类的具体操作也全在这个方法体中
         * */
        Chopsticks chopsticks = new Chopsticks();
        chopsticks.setLength(20);
        chopsticks.use();
    }
}
