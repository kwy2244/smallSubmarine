package cn.heima.submarine;

/**
 * 战舰
 * 属性 ：xy控制位置 （整数int），速度（int），剩余命数（整数int），大小（一般是整数int），
 * 行为：移动  发射鱼雷
 */
public class Battleship extends SeaObject {

    private int life;


    Battleship() {
        super(1, 1, 1, 1, 1);
        life = 5;

    }


   public void move() {
        //  x += speed;
    }


}
