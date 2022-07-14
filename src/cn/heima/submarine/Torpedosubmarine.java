package cn.heima.submarine;

import java.util.Random;

/**
 * 鱼雷艇哈
 */
public class Torpedosubmarine extends SeaObject {


    Torpedosubmarine(int weight, int high, int speed, int x, int y) {
        super(64, 20);

    }

    public void move() {
        x += speed;
    }

}
