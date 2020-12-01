package 银行卡;

import java.util.Scanner;
//实现农业银行卡业务
public class ABCATM{   //农行ATM
    private UnionPay card = null;   //银联卡
    public void insertCard(UnionPay card){ //插卡
        if(card == null)
            this.card = card;
    }
    private void outCard(){
        card = null;
    }
    private void showBalance(){
        System.out.println("当前余额是："+card.getBalance());
    }
    private void takeMoney(){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入取款数目：");
        double number =Double.parseDouble(input.next());
        if(card.drawMoney(number)){
            System.out.println("取款成功");
        }
        else{
            System.out.println("取款失败");
        }
    }
    private void payTelBill(){   //支付电话费
        Scanner input=new Scanner(System.in);
        if(card instanceof ABCImpl){ //判断是否是农行卡
            ABC abcCard = (ABC)card;
            System.out.println("请输入电话号码：");
            String telNum=input.next();
            System.out.println("请输入缴费额：");
            double sum=Double.parseDouble(input.next());
            if(abcCard.payTelBill(telNum, sum)){
                System.out.println("缴费成功");
            }
            else{
                System.out.println("缴费失败");
            }
        }else{
            System.out.println("您的卡不是农业银行卡，无法完成缴费");
        }
    }
    public void allMenu(){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入密码：");
        String Str=input.next();
        if("123456".equals(Str)){
            while(true){
                System.out.println("请选择功能：\n\t1. 查看余额\n\t2. 取款\n\t3. 缴电话费\n\t4. 退出");
                int choice=Integer.parseInt(input.next());
                switch(choice){
                    case 1:
                        showBalance();
                        break;
                    case 2:
                        takeMoney();
                        break;
                    case 3:
                        payTelBill();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("非法输入");
                }
            }
        }
        else
            System.out.println("密码错误");
        this.outCard();
    }
}