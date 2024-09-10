package org.data_structure.fanxing;

/**
 *定义泛型类的时候需要在类名后加<>，括弧里面的就是指代泛型的字符！
 */

public class GetClass<EE> {
    private EE e;

    public EE getE(){
        return e;
    }
    public void setE(EE e){
        this.e = e;
    }
}
