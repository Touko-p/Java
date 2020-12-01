package 数组;

public class ChoosePx {
    public static void main(String[]args){
        int a[]=new int[]{2,34,32,45,6,66,7};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    int t=a[j];
                    a[j]=a[i];
                    a[i]=t;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
