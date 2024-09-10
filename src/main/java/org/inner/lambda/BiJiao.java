package org.inner.lambda;

public class BiJiao {
    Comparator com;
    public BiJiao(){}
    public BiJiao(Comparator com){
        this.com = com;
        System.out.println("用接口实现类的实例创建的bijiao类");
    }

    public void setCom(Comparator com) {
        this.com = com;
    }

    public Comparator getCom() {
        return com;
    }

    public String comparator(int num1, int num2){
        if (this.com != null)
            return com.comparator(num1,num2);
        else return "我去，异常！";
    }

}
