package 文件;
//数字转中文
import java.io.IOException;

public class MathToCn {
    public static void main(String[]args){
        byte a[]=new byte[]{(byte)0xE5,(byte)0xB1,(byte)0x8C};
        try {
            String str=new String(a,"UTF-8");
            System.out.println(str);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
