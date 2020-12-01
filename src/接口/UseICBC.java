package 接口;


public class UseICBC implements ICBC {
    double Summoney;
    String lPsw;
    public UseICBC(double Summoney,String IPsw) {
        super();
        this.Summoney=Summoney;
        this.lPsw=IPsw;
    }

    public void paymoney(double money) {//在线支付
       if(money<=Summoney) {
            System.out.println("宁一共消费了" + money + "元");
            double a = Summoney - money;
            System.out.println("卡内剩余" + a + "元");
            Summoney = a;
        }
       else
            System.out.println("付款失败，卡内余额不足");
    }
    @Override
    public boolean checkPwd(String Psw) {//检测密码
        if(lPsw.equals(Psw))
            return true;
        return false;

    }

    @Override
    public void drewMoney(double money) {//取钱
        if(money<=Summoney) {
            System.out.println("宁取的" + money + "元钱正在取出");
            System.out.println("宁的" + money + "钞票已取出，请收好");
            double b = Summoney - money;
            System.out.println("卡内剩余" + b + "元");
            Summoney = b;
        }
        else
            System.out.println("取钱失败，卡内余额不足");
    }

    @Override
    public void getBalance() {//查询余额
        double money=Summoney;
        System.out.println("宁的余额为"+money);
    }
}
