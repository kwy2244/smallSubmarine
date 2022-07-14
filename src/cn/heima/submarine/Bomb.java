package cn.heima.submarine;

public class Bomb extends SeaObject {


    Bomb(int x, int y) {
        super(9, 12, x, y, 3);

    }

   public void move() {
        y += speed;
    }


}
