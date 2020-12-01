package 银行卡;

public class ICBCImpl implements ICBC{
    private double money;
    private String pwd;
    public ICBCImpl(double money, String pwd) {
        super();
        this.money = money;
        this.pwd = pwd;
    }
    public double getBalance() {
        // TODO Auto-generated method stub
        return money;
    }
    public boolean drawMoney(double number) {
        // TODO Auto-generated method stub
        if(number<=money){
            money-=number;
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
    public void payOnline(double number) {
        if(number < money)
            money-=number;
    }
}
