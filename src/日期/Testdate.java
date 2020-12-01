package 日期;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testdate {
    private static SimpleDateFormat a=new SimpleDateFormat("yyyy-MM-dd");
    private static String format(Date time){
        return format(time);
    }
    public static void main (String[]args)throws ParseException {
        Date b=new Date();
        String str=a.format(b);
        System.out.println(str);
        String Str="1999-08-12";
        Date c=a.parse(Str);
        System.out.println(c);
    }
}
