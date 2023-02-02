package com.jiesenkai;

public class test {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println("修复bug");
        sayHello();
        service();
        ByJiesenkaiSendNode();
        System.out.println("master_bak 分支的代码");
    }
    public static void sayHello(){
        System.out.println("hello git");
    }
    public static void service(){
        System.out.println("业务处理代码");
    }
    public static void ByJiesenkaiSendNode(){
        System.out.println("来自jiesenkai提交的代码");
    }
}
