package RPG属性生成器;

import java.util.Arrays;
import java.util.Random;

public class RPGtest {
    public static void main(String[] args) {
        Adventure a = new Adventure();
        Adventure b = new Adventure();
        Adventure c = new Adventure();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
class Adventure{
    private int STR ;//力量
    private int DEX ;//敏捷
    private int CON ;//体格
    private int MAG ;//智力
    private int LER ;//学识
    private int CHR ;//魅力
    private int SUM ;//合计
    private static int count;//标记几个属性大于等于15

    public Adventure(){

        while (true) {
            STR = this.getAttribute();
            DEX = this.getAttribute();
            CON = this.getAttribute();
            MAG = this.getAttribute();
            LER = this.getAttribute();
            CHR = this.getAttribute();
            SUM = STR + DEX + CON + MAG + LER + CHR;
            if(SUM>=75&&count>=2) break;
        }

    }

    public int getAttribute(){
        int[] a = new int[4];
        //生成四个随机1-6的数
        for(int i = 0; i<4; i++){
            a[i] = new Random().nextInt(6)+1;
        }
        Arrays.sort(a);
        //返回三个最大值的和
        if(a[1]+a[2]+a[3]>=15){
            count++;
        }
        return a[1]+a[2]+a[3];
    }

    @Override
    public String toString() {
        return "Adventure{" +
                "STR=" + STR +
                ", DEX=" + DEX +
                ", CON=" + CON +
                ", MAG=" + MAG +
                ", LER=" + LER +
                ", CHR=" + CHR +
                ", 合计="+ SUM +
                '}';
    }
}
