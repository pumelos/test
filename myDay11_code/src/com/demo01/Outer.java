package com.demo01;

public class Outer {
    private String name = "外部类成员变量";

    public void methodOuter(){
        System.out.println("外部类成员方法");
        new Inner().methodInner();
    }
    public class Inner{
        private String name = "内部类成员变量";
        public void methodInner(){
            methodOuter();
            String name = "局部变量";
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Outer.this.name);
        }
    }
}
