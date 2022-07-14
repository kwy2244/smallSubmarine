package cn.heima.submarine;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.ImageIcon;

/**
 * 图片类 图片是一个数据
 * java提供了图片类型 image icon  ImageIcon BufferedImage
 */
public class Images {
    public static ImageIcon sea;           //海洋的图片
    public static ImageIcon torpesubm;     //的图片
    public static ImageIcon obsersubm;     //侦察船的图片
    public static ImageIcon minesubm;      //鱼雷船的图片
    public static ImageIcon mine;          //鱼雷的图片
    public static ImageIcon gameover;      //游戏结束的图片
    public static ImageIcon bomb;          //炸弹的图片
    public static ImageIcon battleship;    //战舰的图片

    static {
        //初始化静态图片
        sea = new ImageIcon("img/sea.png");
        torpesubm = new ImageIcon("img/torpesubm.png");
        obsersubm = new ImageIcon("img/obsersubm.png");
        minesubm = new ImageIcon("img/minesubm.png");
        mine = new ImageIcon("img/mine.png");
        gameover = new ImageIcon("img/gameover.png");
        bomb = new ImageIcon("img/bomb.png");
        battleship=new ImageIcon("img/battleship.png");
    }
//测试图片是否读取成功
    public static void main(String[] args) {
        System.out.println(bomb.getImageLoadStatus());
        System.out.println(battleship.getImageLoadStatus());
        System.out.println(sea.getImageLoadStatus());
        System.out.println(torpesubm.getImageLoadStatus());
        System.out.println(obsersubm.getImageLoadStatus());
        System.out.println(minesubm.getImageLoadStatus());
        System.out.println(mine.getImageLoadStatus());
        System.out.println(gameover.getImageLoadStatus());

    }

}
