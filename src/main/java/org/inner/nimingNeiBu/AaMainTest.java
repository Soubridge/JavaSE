package org.inner.nimingNeiBu;

public class AaMainTest {
    public static void main(String[] args) {
        /**
         *省去了写DownloadTask类的步骤，注意分析传值传的是啥
         * */

        Task cleanTask = new Task() {
            @Override
            public void run() {
                System.out.println("清理磁盘...");
            }
        };
        Task downloadTask = new Task() {
            @Override
            public void run() {
                System.out.println("下载文件...");
            }
        };

        Handler handler = new Handler(downloadTask);//哈哈 这里传的就真没啥问题了，因为它真的是接口的实例QWQ
                                                    //我们normal都是传实现类的实例
        handler.run();
        /**这里才是嘎嘎体现匿名内部类的地方啊*/
        handler.setTask(new Task() {
            @Override
            public void run() {
                System.out.println("这里终于只为为啥叫匿名内部类了，这个类完善了接口的抽象方法，作为setTask的参数，且没名字");
            }
        });

        handler.setTask(
                ()->{System.out.println("lambda表达式格式的下载文件");}
        );
        handler.run();
    }
}
