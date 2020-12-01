package 银行卡;

public class ABCImpl implements ABC{
    private double balance;	//卡内余额，可以透支2000
    private String pwd;
    public ABCImpl(double balance, String pwd) {
        super();
        this.balance=getBalance();
        this.pwd=pwd;
    }
    public double getBalance() {
        return balance;
    }
    public boolean drawMoney(double number) {
        if((balance-number)>=-2000){
            balance-=number;
            return true;
        }
        return false;
    }
    public boolean checkPwd(String input) {
        if(pwd.equals(input))
            return true;
        else
            return false;
    }
    public boolean payTelBill(String phoneNum, double sum) {
        if(phoneNum.length()==11&&(balance-sum)>=-2000){
            balance-=sum;
            return true;
        }
        return false;
    }

}
