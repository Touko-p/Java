package DayTest;

import java.util.ArrayList;
import java.util.List;


public class List2 {
    //柳依依、王圣友、李刚
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Student> rj1601=new ArrayList<>();
        rj1601.add(new Student("2016001", "柳依依"));
        rj1601.add(new Student("2016002", "王圣友"));
        rj1601.add(new Student("2016003", "李刚"));
        rj1601.remove(1);
        rj1601.add(new Student("2016004", "张华"));
        rj1601.add(new Student("2016005", "左语升"));
        System.out.println("软件1601人数："+"\n"+rj1601.size()+"\n"+"软件1601成员："+"\n"+rj1601.toString());
    }

}
