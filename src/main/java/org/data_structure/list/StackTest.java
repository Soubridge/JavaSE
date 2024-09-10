package org.data_structure.list;

import java.util.Stack;
/**
 * Stack继承了Vector类(底层也是数组)，所以Stack也是线程安全的数据结构，没有重写Vector的方法，只是多了压栈和出栈的方法
 * Stack本质还是一个Vector数组，可以拿来当Vector数组用，因为有压出栈的方法，所以对外界说是“栈”
 * */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("山东");stack.push("山西");stack.push("河南");stack.push("河北");
        //stack.add("北京");stack.remove("北京"); //从Vector继承来的方法都可以用，但是对外界还是不要用了
        System.out.println("栈顶元素是"+stack.peek());
        System.out.println("栈顶元素"+stack.pop()+"被删除了");
        System.out.println(stack);
    }
}
