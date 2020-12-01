package 数字与字符串;

import java.util.Arrays;
import java.util.Random;

public class RandomChar {
    private static String RandomChar(int lenth) {
        char c[] = new char[lenth];
        int i=0;
        while (i<lenth){
            char a=(char)(Math.random()*123);
            if((a>='a'&&a<='z')||(a>='A'&&a<='Z')||(a>='0'&&a<='9')){
                c[i] = a;
                i++;
            }
        }
        String h=new String(c);
        return h;
    }
    public static void main(String[]args){
        String str=RandomChar(5);
        System.out.format(str);
        System.out.println();
        String s[]=new String[8];
        for(int i=0;i<s.length;i++){
            s[i]=RandomChar(5);
        }
        System.out.format(Arrays.toString(s));
        Arrays.sort(s);
        System.out.println();
        System.out.format(Arrays.toString(s));
    }
}
