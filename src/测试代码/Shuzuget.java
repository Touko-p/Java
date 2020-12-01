package 测试代码;

public class Shuzuget {
    public static void main(String[]args){
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int i=2;i<a.length-2;i++){
            sum+=a[i];
        }
        System.out.println(sum);
        float sumScore=0;
        for(int i=2;i<a.length-2;i++){
            sumScore+=a[i];
        }
        float finalScore=sumScore/(a.length-4);
    }
}
