package cn.heima.submarine;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;

/**
 * 侦察潜水艇哈
 * 属性    x y 高宽 宽度 速度
 * 行为   移动
 */
public class ObserveSubmarine extends SeaObject {


    ObserveSubmarine(int x, int y,int weight, int high, int speed) {
        super(12, 12);
    }

    @Override
   public void move() {
        x += speed;
    }
}