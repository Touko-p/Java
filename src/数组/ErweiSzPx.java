package 数组;

import java.util.Arrays;
import java.util.Random;

public class ErweiSzPx {
    public static void main(String[]args){
        Random rand=new Random();
        int a[][]=new int[5][8];
        System.out.println("未排序的二维数组：");
        for(int i=0;i<5;i++){
            for(int j=0;j<8;j++){
                a[i][j]=rand.nextInt(100);
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        int b[]=new int[40];
        for(int i=0;i<5;i++){
            System.arraycopy(a[i],0,b,i*8,a[i].length);
        }
        String Str=Arrays.toString(b);
        System.out.println("转换的一维数组："+Str);
        Arrays.sort(b);
        String str=Arrays.toString(b);
        System.out.println("排序后的一维数组："+str);
        for(int i=0;i<5;i++){
            a[i]=Arrays.copyOfRange(b,i*8,i*8+8);//0-8;8-16;16-24;24-32;32-40;
        }
        System.out.println("排序后的二维数组：");
        for (int i=0;i<5;i++){
            for(int j=0;j<8;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
