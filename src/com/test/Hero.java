package com.test;

public class Hero {
    private String name;//名字
    private float hp;//血量
    private float armor;//护甲
    private int moveSpeed;//移动速度

    public Hero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public float getArmor() {
        return armor;
    }

    public void setArmor(float armor) {
        this.armor = armor;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.setName("盖伦");
        garen.setHp(616f);
        garen.setArmor(27f);
        garen.setMoveSpeed(350);

        Hero teemo = new Hero();
        teemo.setName("提莫");
        teemo.setHp(383f);
        teemo.setArmor(14f);
        teemo.setMoveSpeed(330);
    }
}
