package 数组;

import java.util.Arrays;
import java.util.Random;

public class ErweiSz {
    public static void main(String[]args){
        Random rand=new Random();
        int a[][]=new int[5][5];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=rand.nextInt(100);
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        int Max=0;
        int x=0;
        int y=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]>Max){
                    Max=a[i][j];
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println("最大数是"+Max+"最大数的坐标是["+x+"],["+y+"]");
    }
}
