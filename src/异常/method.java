package 异常;


public class method {
    public static  int Method(){
        try {
            return 1;
        }
        catch (Exception e){
            return 2;
        }
        finally {
            return 3;
        }
    }
    public static void main(String[]args){
        System.out.println(Method());
    }
}
