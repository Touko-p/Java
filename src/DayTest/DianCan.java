package DayTest;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DianCan {
    private static Scanner sc;
    private static List<List<String>> food;
    public static void main(String[]args){
        menu();
        welcome();
    }
    public static void menu(){
        String[][] AllFood= {
                {"包子","馒头","油条"},
                {"红烧肉","宫保鸡丁","水煮鱼"},
                {"红烧茄子","干锅牛蛙","小炒肉"},
        };
        sc=new Scanner(System.in);
        food=new ArrayList<List<String>>();
        for(int i=0;i<3;i++){
            food.add(new ArrayList<String>());
            for(String s:AllFood[i]){
                food.get(i).add(s);
            }
        }
    }
    public static void showMenu(){
        System.out.println("早餐："+food.get(0));
        System.out.println("午餐："+food.get(1));
        System.out.println("晚餐："+food.get(2));
        welcome();
    }
    public static void addMenu(){
        System.out.println("1.早餐\t2.午餐\t3.晚餐\t4.返回");
        int x=sc.nextInt();
        switch (x){
            case 1:
                addFood(food.get(0));
                break;
            case 2:
                addFood(food.get(1));
                break;
            case 3:
                addFood(food.get(2));
                break;
                default:
                    welcome();
                    break;


        }
    }
    public static void addFood(List<String> l){
        System.out.println("请输入餐品名称：");
        String fname=sc.next();
        l.add(fname);
        System.out.println("食物："+l.toString());
        System.out.println("1.继续\t2.返回");
        int x=sc.nextInt();
        if(x==1)
            addFood(l);
        else
            addMenu();
    }
    public static void orderMenu(){
        Random rand=new Random();
        for(List<String> f:food){
            int x=rand.nextInt(f.size());
            String fname=f.get(x);
            System.out.print(fname+" ");
        }
        System.out.println();
        welcome();
    }
    public static void welcome(){

        System.out.println("1.添加食物\t2.查看菜单\t3.随机点菜\t4.退出程序");
        int x=sc.nextInt();
        switch (x){
            case 1:
                addMenu();
                break;
            case 2:
                showMenu();
                break;
            case 3:
                orderMenu();
                break;
            default:
                System.exit(0);
                break;
        }
    }
}
