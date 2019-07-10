package com.demo02;

import javafx.scene.AmbientLight;

public class Test {
    public static void main(String[] args) {
        //原始写法
        Dog obj1 = new Dog();
        obj1.eat();
        System.out.println("=========");
        //多态写法
        Animal obj2 = new Dog();
        obj2.eat();
        System.out.println("=========");
        //匿名内部类写法
        Animal obj3 = new Animal() {
            @Override
            public void eat() {
                System.out.println("猫吃屎");
            }
        };
        obj3.eat();
        System.out.println("=========");
        new Animal(){

            @Override
            public void eat() {
                System.out.println("猫吃屎");
            }
        }.eat();
    }
}
