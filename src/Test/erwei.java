package Test;

import java.util.Arrays;
import java.util.HashMap;

public class erwei {
    public static void main(String[]args){
        HashMap<String,String> hs=new HashMap<>();
        String a[]=new String[]{"1.2","3.2","2.3","6.5","4.3"};
        String p[]=new String[]{"1.2","3.2","2.3","6.5","4.3"};
        String h[][]=new String[5][2];
        Arrays.toString(a);
        Arrays.sort(a);
        int b=1;
        for(int i=0;i<a.length;i++){
            hs.put(a[i],String.valueOf(b));
            b++;
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<2;j++){
                if(j==0)
                    h[i][j]=a[i];
                else
                    h[i][j]=hs.get(a[i]);

            }
        }
        System.out.println("HashMap:");
        for(int i=0;i<5;i++){
            for(int j=0;j<2;j++){
                System.out.print(h[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<2;j++){
                if(j==0)
                    h[i][j]=p[i];
                else
                    h[i][j]=hs.get(h[i][0]);
            }
        }
        System.out.println("二维数组：");
        for(int i=0;i<5;i++){
            for(int j=0;j<2;j++){
                System.out.print(h[i][j]+" ");
            }
            System.out.println();
        }
    }
}
