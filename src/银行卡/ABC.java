package 银行卡;

public interface ABC extends UnionPay {
    boolean payTelBill(String phoneNum,double sum);	//支付电话费
}
