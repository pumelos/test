package com.demo03;

public class Test {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("寒冰射手");
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("万箭齐发");
            }
        });
        hero.attack();
    }
}
