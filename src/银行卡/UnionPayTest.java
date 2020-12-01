package 银行卡;

public class UnionPayTest {
    public static void main(String[] args) {
		/*
		//创建工行对象
		ICBCImpl icbc = new ICBCImpl();
		ICBC icbc1 = new ICBCImpl();
		UnionPay icbc2 = new ICBCImpl();
		*/

        ABCATM atm = new ABCATM(); //atm机对象
        UnionPay card = new ABCImpl(1000,"123456");//农行卡
        //UnionPay card = new ICBCImpl();//工行卡
        atm.insertCard(card); //插卡
        atm.allMenu();
    }
}
