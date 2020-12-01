package 数组;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class px {
    public static void main(String[]args){
        Random rand=new Random();
        Scanner scna=new Scanner(System.in);
        int b=scna.nextInt();
        int a[]=new int[b];
        for(int i=0;i<a.length;i++){
            a[i]=rand.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
