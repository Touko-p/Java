
package 集合框架;

import java.util.ArrayList;
import java.util.List;

public class DeletList {
    public static void main(String[]args){
        List<Hero> LH=new ArrayList<>();
        for(int i=0;i<100;i++){
            LH.add(new Hero("hero"+i));
    }
        System.out.println(LH);
        System.out.println();
        for(int i=0;i<LH.size();i++){
            int j = Integer.parseInt(LH.get(i).name.substring(4));
            if (j == 0) {
                continue;
            }
            if (j%8 == 0) {
                LH.remove(i);//移除符合要求的“索引位置”
            }
        }
        System.out.println(LH);

}
}

