package com.demo01;

public class Test {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer().new Inner();
        obj.methodInner();
		
		sout(111);
		sout(2222);
		sout(333333);
		sout(555555555);
		111;
    }
}
