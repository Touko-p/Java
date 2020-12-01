package DayTest;

public class Copy2 {
    private static String Randomchar(int length){
        char a[]=new char[length];
        int i=0;
        while (i<length){
            char b=(char)(Math.random()*123);
            if(b>='a'&&b<='z'||b>='A'&&b<='Z'||b>='0'&&b<='9'){
                a[i]=b;
                i++;
            }
        }
        String c=new String(a);
        return c;
    }
    public static void main(String[]args){
        String l=Randomchar(10);
        System.out.println(l);
        int num=10000;
        String str="";
        long star=System.currentTimeMillis();
        for(int i=0;i<num;i++){
            str+=l;
        }
        long end=System.currentTimeMillis();
        System.out.println(end-star);
        // StringBuffer连接
        StringBuffer sb = new StringBuffer(l);
        star = System.currentTimeMillis();     //计时开始
        for (int i = 0; i < num; i++) {
            sb.append(l);                       //连接
        }
        end = System.currentTimeMillis();       //计时结束
        System.out.printf("使用StringBuffer的+,连接%d个随机字符串,消耗了%d毫秒%n",num,end-star);
    }
    }

