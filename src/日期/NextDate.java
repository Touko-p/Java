package 日期;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NextDate {
    private static SimpleDateFormat da=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static String format(Date time){
        return da.format(time);
    }
    public static void main(String[]args){
        Calendar a=Calendar.getInstance();
        Date b=a.getTime();
        System.out.println("当前日期：\t" + format(a.getTime()));
        a.setTime(b);
        a.add(Calendar.MONTH,2);
        a.set(Calendar.DATE,1);
        a.add(Calendar.DATE,-3);
        System.out.println("下个月的倒数第一天："+format(a.getTime()));
    }
}
