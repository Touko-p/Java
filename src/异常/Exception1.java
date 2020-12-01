package 异常;

public class Exception1 {
    double balance;
    public class OverdraftException extends Exception{
        public OverdraftException(){

        }
        public OverdraftException(String msg){

            super(msg);
        }
    }
    public void getBalnce(){
        double money=balance;
        System.out.println("余额还剩"+money);
    }
    public void deposit(double amt){
        double b=amt;
        amt=balance+amt;
        balance=amt;
        System.out.println("存进去"+b+"元，"+"余额为"+balance+"元");
    }
    public void withdraw(double amt)throws OverdraftException {
        if(balance<amt){
            double c=amt-balance;
            throw new OverdraftException("您的余额为不足,您当前透支额为: "+c);
        }
        else {
        double b=amt;
        balance=balance-amt;
        System.out.println("取出"+b+"剩余"+balance);}
    }
    public static void main(String[]args){
        Exception1 e=new Exception1();
        e.balance=1000;
        e.getBalnce();
        e.deposit(2030);
        try {
            e.withdraw(4222);
        }
        catch (OverdraftException k){
            System.out.println(k.getMessage());
            k.printStackTrace();
        }
    }
}
