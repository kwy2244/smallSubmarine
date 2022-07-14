package cn.heima.submarine;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class World extends JPanel{
    public static void main(String[] args) {
        for (int i=0 ;i<2;i++ ) {
            JFrame frame=new JFrame();
            World world=new World();
            world.setFocusable(true);
            frame.add(world);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500,579);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

        }







   /*    Bomb[] bo = new Bomb[3];


        Mine[] mi = new Mine[3];

        SeaObject[] seaa = new SeaObject[3];
        seaa[0] = new ObserveSubmarine(1, 12, 214, 1235, 13);
        seaa[1] = new ObserveSubmarine(1, 13, 12, 31, 13);
        seaa[2] = new ObserveSubmarine(1245, 1245, 12, 13, 13);

        for (int i = 0; i < seaa.length; i++) {
            SeaObject s = seaa[i];
            System.out.println(seaa[i].x + "," + seaa[i].y + "," + seaa[i].speed + seaa[i].speed);

        }



        ObserveSubmarine o1 = new ObserveSubmarine(12, 12, 12, 12, 12);

        System.out.println(o1.x);
        System.out.println(o1.x + ".." + o1.y + ".." + o1.speed + ".." + o1.high + ".." + o1.weight);
        o1.move();
        System.out.println(o1.x + ".." + o1.y + ".." + o1.speed + ".." + o1.high + ".." + o1.weight);

        Mine m1 = new Mine(10, 12);
        for (int i = 0; i <100 ; i++) {
            System.out.println(m1.x + ".." + m1.y + ".." + m1.speed + ".." + m1.high + ".." + m1.weight);

            m1.move();
            System.out.println(m1.x + ".." + m1.y + ".." + m1.speed + ".." + m1.high + ".." + m1.weight);

        }
*/
    }
}
