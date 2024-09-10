package org.api_test.runtime;
/**
 * 获取JVM运行的内存信息
 * */
public class RunTimeTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();

        System.out.println("最大内存为："+maxMemory/1024/1024);
        System.out.println("总内存为："+totalMemory/1024/1024);
        System.out.println("空闲内存为："+freeMemory/1024/1024);
    }
}
