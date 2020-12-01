package Test;

import java.util.Scanner;

public class HuangHe {
    int a;
    String b,c,d,e,f,g;
    void push(){

    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        //使用格式化输出
        //%s表示字符串，%d表示数字,%n表示换行
        String b=scan.next();
        String c=scan.next();
        String d=scan.next();
        String e=scan.next();
        String f=scan.next();
        int a=scan.nextInt();
        String p="%s最大皮革厂%s皮革厂倒闭了，%s老板黄鹤吃喝嫖赌，欠下了3.5个亿，%n"+
                "带着他的%s跑了!我们没有办法，拿着钱包抵工资!原价都是%d多、%n两百多、三百多的钱包，" +
                "现在全部只卖二十块，统统只要二十块!%s王八蛋，你不是人!%n我们辛辛苦苦给你干了大半年，" +
                "你不发工资，你还我血汗钱，还我血汗钱!";
        System.out.format(p,b,c,d,e,a,f);

    }
}
