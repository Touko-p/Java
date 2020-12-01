package 测试代码;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class shuju {
    public static void main(String[]args){
        String s[][]=new String[3][6];
        File f=new File("D:/程序设计/f1.txt");
        try (FileReader fr=new FileReader(f);BufferedReader br=new BufferedReader(fr)){
            for (int z=0;z<3;z++){
                String str=br.readLine();
                    for(int j=0;j<6;j++){
                        String[] newstr=str.split(" ");
                        float a[]=new float[10];
                        int b=0;
                        float sum=0;
                        for(int i=2;i<newstr.length;i++) {
                            a[b] =Float.valueOf(newstr[i]);
                            sum+=a[b];
                            b++;
                        }
                        Arrays.toString(a);
                        Arrays.sort(a);
                        float min=a[0];
                        float max=a[9];
                        float finalScore=(a[2]+a[3]+a[4]+a[5]+a[6]+a[7])/6;
                        String string=""+newstr[0]+" "+newstr[1]+" "+max+" "+min+" "+sum+" "+finalScore+"";
                        String[] newstring=string.split(" ");
                        s[z][j]=newstring[j];
                        System.out.print(s[z][j]+" ");
                    }
                    System.out.println("");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
