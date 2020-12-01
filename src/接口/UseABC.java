package 接口;

public class UseABC implements ABC{

    double Summoney;
    String k ;

    public UseABC(double Summony,String k) {
        super();
        this.Summoney=Summony;
        this.k=k;
    }

    public void payTelBill(double phoneNum, String money) {
            if (phoneNum <= Summoney + 2000) {
                System.out.println("宁一共充值了" + phoneNum + "元话费");
                double a = Summoney - phoneNum;
                if (a >= 0)
                    System.out.println("卡内剩余" + a + "元");
                else
                    System.out.println("卡内已透支" + a + "元，请于十个工作日内还请");
                Summoney = a;
            } else
                System.out.println("充值失败，卡内余额不足");
        }


    public boolean checkPwd(String psw) {
        if (k.equals(psw))
            return true;
        return false;
    }

    @Override
    public void drewMoney(double money) {//取钱
        if(money<=Summoney+2000) {
            System.out.println("宁取的" + money + "元钱正在取出");
            System.out.println("宁的" + money + "钞票已取出，请收好");
            double b = Summoney - money;
            if(b>=0)
                System.out.println("卡内剩余" + b + "元");
            else
                System.out.println("卡内已透支"+ b + "元，请于十个工作日内还请");
            Summoney = b;
        }
        else
            System.out.println("取钱失败，卡内余额不足");
    }

    @Override
    public void getBalance() {//查询余额
        double money=Summoney;
        if(money>=0)
            System.out.println("宁的余额为"+money+"元");
        else
            System.out.println("卡内已透支"+ money + "元，请于十个工作日内还请");
    }
}
