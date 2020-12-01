package Test;

import java.util.Scanner;

public class Test1 {
    String a = "a123";


    public boolean check(String psw) {
        if (a.equals(psw))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Test1 f = new Test1();
        System.out.println(f.check(scan.next()));
    }
}
