package cn.heima.submarine;

/**
 * 水雷潜水艇
 */
public class Minesubmarine extends SeaObject {


    Minesubmarine(int weight, int high, int speed, int x, int y) {
        super(12, 12);
    }

   public void move() {
        x += speed;
    }
}
