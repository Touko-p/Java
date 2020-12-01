package Test;

public class ZxCx {
    public static void main(String[]args){
        byte a=1;
        short b=2;
        float c=3;
        double d=4;
        Byte e=new Byte(a);//基本类型转换成封装类型
        byte Ee=e.byteValue();//封装类型转换成基本类型
        Byte E=a;//自动转换就叫装箱
        byte EE=e;//自动转换就叫拆箱
        Short f=new Short(b);//基本类型转换成封装类型
        short Ff=f.shortValue();//封装类型转换成基本类型
        Short F=b;//装箱
        short FF=f;//拆箱
        Float g=new Float(c);//基本类型转换成封装类型
        float Gg=g.floatValue();//封装类型转换成基本类型
        Float G=c;//装箱
        float GG=g;//拆箱
        Double h=new Double(d);//基本类型转换成封装类型
        double Hh=h.doubleValue();//封装类型转换成基本类型
        Double H=d;//装箱
        double HH=h;//拆箱
        //Integer k=a;byte与intergre不能自动装箱
        System.out.println(Byte.MAX_VALUE);

    }

}
