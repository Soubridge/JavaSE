package org.exception;
/**
 * ①编译时异常必须处理，不然编译器也不给过，运行时异常是指有些条件可能出现暴雷，如果给的数据不暴雷是可以正常运行的
 * ②如果出现了异常，可以直接在出现异常的地方用try...catch获取，或者直接在方法名上用throws Exception抛给上层（各有利弊）
 * ③如果方法throws的是编译时异常调用时必须处理try..catch，throws的是运行时异常可以继续往上抛
 * ④注意：如果在方法中用了throw new Exception(或则自动抛的异常),后面的语句就不会被执行，如果想让后面的语句执行，就只能在此处用try..catch
 * ⑤父类方法没有throws编译异常(Exception)那么子类重写的该方法也不能throws编译异常，如果是运行时异常则无限制
 * */
public class MyExceptionTest {
    public static void main(String[] args) {
//        show();
//        method();
        try {
            show1();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void show(){
        Boolean flag = true;
        if(flag){
            try{
                throw new MyException("抛出自定的编译异常");
            }catch (MyException e){
                e.printStackTrace();
            }
        }
        System.out.println("show...");
    }

    public static void method(){
        Boolean flag = true;

        if(flag){
            throw new MyRuntimeException("抛出自定的运行异常");
        }
        System.out.println("method...");
    }
    public static void show1() throws MyException{
        throw new MyException();
    }
}
