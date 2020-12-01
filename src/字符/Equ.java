package 字符;

public class Equ {
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
    public static void main(String[]args){

        String b[]=new String[100];
        for(int i=0;i<b.length;i++){
            String  a=randomchar(2);
            b[i]=a;
        }
        for(int i=0;i<b.length;i++) {
            if(i%25==0) {
                System.out.println("\n");
            }
            else {
                System.out.print(b[i]+" ");
                if(i==100) {
                    System.out.println("\n");
                }
            }
        }
        int num=0;String same="";
        for(int i=0;i<b.length;i++) {
            for(int j=i+1;j<b.length;j++) {
                if(b[i].equals(b[j])) {
                    same+=b[i]+" ";
                    num++;
                }
            }
        }
        System.out.println("\n"+"总共有"+num+"种重复的字符串");
        System.out.println("分别是："+same);
    }
}
