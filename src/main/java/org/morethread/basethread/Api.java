package org.morethread.basethread;

public class Api {
    public String sendMessage(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "短信发送成功";
    }

    public String upload(){
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "文件上传成功";
    }
}
