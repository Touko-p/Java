package DayTest;

public class Find {
    public static void main(String[]args){
        int a=0;
        for(int i=1;i<10000;i++){
            if(i*i*i%10==i||i*i*i%100==i||i*i*i%1000==i||i*i*i%10000==i){
                System.out.print(i+" ");
                a++;
            }
        }
        System.out.println(a);
    }
}
