package 数组;

import java.util.Random;

public class HebingSz {
    public static void main(String[]args){
        Random rand=new Random();
        int a[]=new int[5+rand.nextInt(5)];
        int b[]=new int[5+rand.nextInt(5)];
        int c[]=new int[a.length+b.length];
        System.out.print("数组a:");
        for(int i=0;i<a.length;i++){
            a[i]=rand.nextInt(100);
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        System.out.print("数组b:");
        for(int i=0;i<b.length;i++){
            b[i]=rand.nextInt(100);
            System.out.print(b[i]+" ");
        }
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        System.out.println(" ");
        System.out.print("数组c:");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}
