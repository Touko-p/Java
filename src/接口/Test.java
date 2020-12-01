package 接口;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        UseICBC f1=new UseICBC(10000,"275321");
        System.out.println("正在登陆中国工商银行---");
        System.out.println("请输入你的密码:");
        if(f1.checkPwd(scan.next())) {
            System.out.println("密码正确");
            System.out.println("---请选择宁所需要使用的功能---");
            System.out.print("选择1进入查询余额" + "\t");
            System.out.print("选择2进入付款" + "\t");
            System.out.print("选择3进入取钞票" + "\t");
            System.out.println("输入其他数字结束程序");
            boolean flag = true;
            while (flag) {
                int choose = scan.nextInt();
                switch (choose) {
                    case 1:
                        f1.getBalance();
                        break;
                    case 2:
                        System.out.println("请输入宁需要付款的现金");
                        f1.paymoney(scan.nextDouble());
                        break;
                    case 3:
                        System.out.println("请输入宁所需要取的钞票金额");
                        f1.drewMoney(scan.nextDouble());
                        break;
                    default:
                        System.out.println("程序即将退出");
                        flag = false;
                }
            }
        }
        else
            System.out.println("密码错误，请重新登录");
        UseABC f2=new UseABC(10000,"123");
        System.out.println("正在登陆中国农业银行---");
        System.out.println("请输入你的密码:");
        if(f2.checkPwd(scan.next())) {
            System.out.println("密码正确");
            System.out.println("---请选择宁所需要使用的功能---");
            System.out.print("选择1进入查询余额" + "\t");
            System.out.print("选择2进入充话费" + "\t");
            System.out.print("选择3进入取钞票" + "\t");
            System.out.println("输入其他数字结束程序");
            boolean flag = true;
            while (flag) {
                int choose = scan.nextInt();
                switch (choose) {
                    case 1:
                        f2.getBalance();
                        break;
                    case 2:
                        System.out.println("请输入宁的手机号");
                        String phonenum=scan.next();
                        System.out.println("请输入宁需要充值话费的金额");
                        double money=scan.nextDouble();
                        if(phonenum.length()==11){
                        f2.payTelBill(money,phonenum);}
                        else
                            System.out.println("手机格式输入错误");
                        break;
                    case 3:
                        System.out.println("请输入宁所需要取的钞票金额");
                        f2.drewMoney(scan.nextDouble());
                        break;
                    default:
                        System.out.println("程序即将退出");
                        flag = false;
                }
            }
        }
        else
            System.out.println("密码错误，请重新登录");
    }

}
