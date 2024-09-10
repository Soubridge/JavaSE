package org.inner.nimingNeiBu;

public class MainTestNormal {
    public static void main(String[] args) {
        DownloadTask downloadTask = new DownloadTask();
        //downloadTask.run();
        CleanerTask cleanerTask = new CleanerTask();
        //cleanerTask.run();

        Handler handler = new Handler();
        handler.setTask(downloadTask); //如果Task是普通类，这里丢过去的应该是个task实例，但是Task是个接口，这里丢过去的是实现task接口的类
        handler.run();
        handler.setTask(cleanerTask);
        handler.run();
    }
}
