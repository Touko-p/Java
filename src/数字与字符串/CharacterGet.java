package 数字与字符串;

import java.text.ParseException;
import java.util.Scanner;

public class CharacterGet {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        char[]a=str.toCharArray();
        for(int i=0;i<a.length;i++){
            if(Character.isUpperCase(a[i])||Character.isDigit(a[i])){
                System.out.format(a[i]+" ");
            }
        }
    }
}
