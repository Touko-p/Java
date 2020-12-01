package 登录系统;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.List;
import java.util.Scanner;

public class TestUser {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        Show sh=new Show();
        while (true){
            System.out.println("请选择：1.注册\t2.登录\t3.退出");
            int a=scan.nextInt();
            String Username=null;
            String password=null;
            String name=null;
            switch (a){
                case 1:
                    System.out.println("请输入用户名：");
                    Username=scan.next().trim();
                    System.out.println("请输入密码：");
                    password=scan.next().trim();
                    System.out.println("请输入姓名：");
                    name=scan.next();
                    try {
                        sh.zc(Username,password,name);
                        System.out.println("注册成功");
                    }catch (UserNamePswExcepion e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("请输入用户名");
                    Username=scan.next().trim();
                    System.out.println("请输入密码：");
                    password=scan.next().trim();
                    try {
                        User u=sh.login(Username,password);
                        System.out.println("登陆成功，欢迎您"+u.getName()+"!");
                        menu(scan,sh,u);
                    }catch (UserNamePswExcepion e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.exit(0);
                    default:
                        break;
            }
        }
    }
    public static void menu(Scanner scan,Show sh,User user){
        while (user!=null){
            System.out.println("请选择功能1\t.查找用户\t2.查找所有用户\t3.修改用户密码\t4，删除用户\t5.退出登录");
            int a=scan.nextInt();
            String Username=null;
            String password=null;
            String name=null;
            switch (a){
                case 1:
                    System.out.println("请输入需要查找的用户名：");
                    Username=scan.next().trim();
                    try {
                        User u=sh.getUserByUsername(Username);
                        System.out.println("姓名\t用户名\t密码");
                        System.out.println(u);
                    }catch (UserNotFondExcepion e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    List<User> users=sh.getall();
                    System.out.println("姓名\t用户名\t密码");
                    for(User u:users){
                        System.out.println(u);
                    }
                    break;
                case 3:
                    System.out.println("请输入用户名");
                    Username=scan.next().trim();
                    System.out.println("请输入原密码");
                    password=scan.next().trim();
                    System.out.println("请输入新密码");
                    String newpsw=scan.next().trim();
                    try {
                        sh.removepsw(Username,password,newpsw);
                        System.out.println("密码修改成功");
                    }catch (UserNotFondExcepion e){
                        System.out.println(e.getMessage());
                    }catch (UserNamePswExcepion e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("请输入需要删除的用户名：");
                    Username=scan.next().trim();
                    try {
                        sh.deleteUser(Username);
                        System.out.println("修改成功");
                    }catch (UserNotFondExcepion e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    user=null;
                    break;
                    default:
                        break;
            }
        }
    }

}
