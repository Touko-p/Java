package 测试代码;

import java.util.Arrays;

public class StrTest {
    public static void main(String[]args){
        String str="1 亚索 8.4 7.6 8.9 7.3 2.1 5.4 6.7 4.3 7.7 8.5";
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
        String[] newstring=string.split("");
    }
}
