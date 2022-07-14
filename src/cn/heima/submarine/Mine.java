package cn.heima.submarine;

/**
 * 水雷    属性    速度   xy宽和高
 * 行为    向上移动
 */
public class Mine extends SeaObject {


    Mine(int x, int y) {
        super(11, 11, x, y, 1);
    }


   public void move() {
        y -= speed;
    }
}
