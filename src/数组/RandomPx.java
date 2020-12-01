package 数组;

import java.util.Random;

public class RandomPx{
    public static void main(String[] args) {
        Random rand=new Random();
        int a[] = new int[5];
        for(int i=0;i<a.length;i++){
            a[i] = rand.nextInt(100);
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        for(int j = 0;j < a.length-1;j++){
            for(int i = j + 1;i<a.length;i++){
                if(a[i]<a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " " );
        }
        System.out.println("");
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length-j-1; i++) {
                if(a[i]<a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int max=a[0];
        for(int i:a){
            if(i>max){
                max=a[i];
            }
        }
        System.out.println(" ");
        System.out.println(max);

    }
}