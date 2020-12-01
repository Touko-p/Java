package 数字与字符串;


public class StringZH {
    public static void main(String[]args){
        double a=3.14;
        Double A=a;
        String Str=A.toString();
        System.out.println(Str instanceof String);
        double Aa=Double.parseDouble(Str);
        System.out.println(Aa);
        String str="3.1a4";
        double AA=Double.parseDouble(str);
        System.out.println(AA);
    }
}
