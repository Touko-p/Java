package 字符;

public class Bs {
    public static void main(String[]args){
        String s="lengendary";
        char a[]=s.toCharArray();
        a[a.length-1]=Character.toUpperCase(a[a.length-1]);
        for(int i=0;i<a.length;i++){
            if(0==i%2)
                a[i]=Character.toUpperCase(a[i]);
        }
        String u=new String(a);
        System.out.println(u);
    }
}
