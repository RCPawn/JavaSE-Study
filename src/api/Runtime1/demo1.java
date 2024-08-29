package api.Runtime1;

import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        // 1.获取 runtime 对象
        Runtime r1 = Runtime.getRuntime();

        // 2.停止虚拟机
        // Runtime.getRuntime().exit(0);

        // 3.获取 CPU 线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        // 4.总内存大小
        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);

        // 5.已经获取的总内存大小
        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);

        // 6.剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);

        // 7.运行 cmd 命令
        // shutdown 关机
        // -s 默认在一分钟后关机
        // -s -t 指定时间关机（单位秒）
        // -a 取消关机操作
        // -r 关机并重启
        Runtime.getRuntime().exec("notepad"); // 打开记事本
        Runtime.getRuntime().exec("shutdown -a");

    }
}
