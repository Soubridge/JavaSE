package org.inner.nimingNeiBu;

public class Handler{
    private Task task; //what?你实例化了一个接口？？？【没有实例化只是给了地址而已，没开空间】
                        //把接口作为类的成员变量？？
    public void run(){
        if(task!=null) task.run();
    }
    public Handler(){}
    public Handler(Task task){
        this.task = task;
    }

    public void setTask(Task task){
        this.task = task;
    }
    public Task getTask(){
        return task;
    }
}
