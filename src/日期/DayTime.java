package 日期;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DayTime {
    public static void main(String[]args) throws ParseException{
        String startime="1970.1.1 08:00:00";
        String startime1="1995.1.1 00:00:00";
        String endtime="1995.12.31 23:59:59";
        String endtime1="2000.12.31 23:59:59";
        SimpleDateFormat f1=new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date Startime=f1.parse(startime);
        Date Startime1=f1.parse(startime1);
        Date Endtime=f1.parse(endtime);
        Date Endtime1=f1.parse(endtime1);
        long time=(long)(Startime1.getTime()+Math.random()*(Endtime.getTime()-Startime1.getTime()));
        long a[]=new long[9];
        int k=0;
        System.out.println("得到的随机时间数组");
        for(int i=0;i<a.length;i++){
             long time1=(long)(Startime.getTime()+Math.random()*Endtime1.getTime()-Startime.getTime());
             a[i]=time1;
             Date f3=new Date(a[i]);
             System.out.print(f3 + "\t");
             if(i==2||i==5) {
                 System.out.println();
             }
        }
        System.out.println();
        Date f2=new Date(time);
        System.out.println("时间原点是："+"\n"+Startime);
        System.out.println("1995年开始的时间："+"\n"+Startime1);
        System.out.println("1995年结束的时间："+"\n"+Endtime);
        System.out.println("1995年这一年中的一个随机时间："+"\n"+f2);
    }
}
