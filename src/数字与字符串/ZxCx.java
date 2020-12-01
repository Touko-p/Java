package 数字与字符串;

public class ZxCx {
    public static void main(String[]args){
        byte a=1;
        short b=2;
        float c=3;
        double d=4;
        int e=5;
        Byte A=a;//装箱  Byte B=new Byte(a);基本类型转封装类型
        byte Aa=A;//拆箱
        System.out.println("Byte的最大值："+Byte.MAX_VALUE);
        Short B=b;
        short Bb=B;
        Float C=c;
        float Cc=C;
        Double D=d;
        double Dd=D;
    }
}
