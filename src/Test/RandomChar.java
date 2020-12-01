package Test;

import java.util.Arrays;
import java.util.Random;
public class RandomChar {
    //ASCII码表0-9对应48-57
    //A-Z对应65-90
    //a-z对应97-122
    private static String randomchar(int length){
        //定义一个静态的方法，将方法与main()分离，减少耦合，方便修改
        char ch[] =new char[length];
        int i = 0;
        while(i<length){//while意外的很好用
            char c = (char)(Math.random()*123);//char c = (char)(48+Math.random()*75);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9')){
                ch[i] = c;
                i++;//这个很重要，条件成立才++
            }
        }
        String h=new String(ch);
        return h;
    }
    public static void main(String[] args) {
        String str = randomchar(3);//想生成多少字符串改一下就行，方便
        System.out.println(str);
        String p[]=new String[8];
        for(int i=0;i<p.length;i++){
            p[i]=randomchar(5);
        }
        System.out.println(Arrays.toString(p));
        Arrays.sort(p);
        System.out.println(Arrays.toString(p));

    }
}
