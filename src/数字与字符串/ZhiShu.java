package 数字与字符串;

public class ZhiShu {
    public static void main(String[] args){
        int num=0;
        for(int i=2;i<=1000*10000;i++){
            boolean flag=false;
            for(int j=2;j<=Math.sqrt(i);j++ ){
                if(i%j==0){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                num++;
            }
        }
        System.out.print(num);
    }
}
