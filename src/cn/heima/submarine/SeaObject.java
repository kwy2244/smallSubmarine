package cn.heima.submarine;

import java.util.Random;

public class SeaObject {

    protected int x;
    protected int y;
    protected int weight;
    protected int high;
    protected int speed;


    public SeaObject(int weight, int high) {
        this.weight = weight;
        this.high = high;
        Random rand = new Random();
        x = -weight;
        y = rand.nextInt(311) + 150;    //包含150 不包括461
        speed = rand.nextInt(3) + 1;
    }


    //战舰 水雷 炸弹
    public SeaObject(int weight, int high, int x, int y, int speed) {
        this.high = high;
        this.speed = speed;
        this.x = x;
        this.y = y;
        this.weight = weight;

    }


    public  void move() {
        System.out.println("对象移动哈");
//派生类权限大于父类权限 一大 默认的权限小于派生类权限
    }
}
