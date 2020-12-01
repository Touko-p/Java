package 字符;

import java.util.Scanner;

public class ZiFu {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        char a[]=str.toCharArray();
        for(char i:a){
            if(Character.isDigit(i)||Character.isUpperCase(i))
                System.out.print(i);
        }
    }
}
