package DayTest;
import java.util.List;
import java.util.ArrayList;
public class List1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> l=new ArrayList<>();
        System.out.println("集合初始大小"+l.size());
        l.add("aaa");
        l.add("bbb");
        l.add("ccc");
        System.out.println("增加元素后的集合"+l.size());
        System.out.println("获取集合中的元素bbb"+l.get(1));
        System.out.println("将整个集合转换为字符串输出"+l.toString());
        l.set(2, "ddd");
        l.remove(1);
        System.out.println("集合的大小"+l.size()+",集合的内容"+l.toString());
        l.add("eee");
        l.add(1, "bc");
        System.out.println("修改后集合的大小"+l.size()+",集合的内容"+l.toString());
        l.clear();
        System.out.println("清空后集合的大小"+l.size()+",集合的内容"+l.toString());
        String arr[]={"abc","lmn","def","xyz"};
        for(String i:arr){
            l.add(i);
        }
        System.out.println("修改后集合的大小"+l.size()+",集合的内容"+l.toString());
        System.out.println("遍历输出数组：");
        for(String i:l){
            System.out.print(i+" ");
        }
    }

}