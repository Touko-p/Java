package Test;

import java.util.Scanner;

public class Char {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();
        System.out.println(chars);
        for (char cs:chars){
            if (Character.isUpperCase(cs)||Character.isDigit(cs)){
                System.out.print(cs);
                continue;
            }
        }
    }
}
