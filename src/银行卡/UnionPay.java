package 银行卡;

public interface UnionPay {
    double getBalance();	//查看余额
    boolean drawMoney(double number);	//取钱
    boolean checkPwd(String input);		//检查密码
}
