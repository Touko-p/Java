package 字符;

public class Utwo {
    public static void main(String[]args){
        String a="Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
        int b=a.lastIndexOf(" two");
        char c[]=a.toCharArray();
        c[b+1]=Character.toUpperCase(c[b+1]);
        String d=new String(c);
        System.out.println(d);
    }
}
