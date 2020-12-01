package 集合框架;

import java.util.ArrayList;
import java.util.List;

public class Node {
    //插入基本逻辑是，小、相同的放左边，大的放右边
    public Node leftNode;//左子节点
    public Node rightNote;//右子节点
    public Object value;//值
    public void add(Object o){
        // 如果当前节点没有值，就把数据放在当前节点上
        if(null==value)
            value=o;
        // 如果当前节点有值，就进行判断，新增的值与当前值的大小关系
        else {
            // 新增的值，比当前值小或者相同
            if((Integer)o-((Integer)value)<=0){
                if(null==leftNode)
                    leftNode=new Node();
                leftNode.add(o);
            }
            // 新增的值，比当前值大
            else {
                if(null==rightNote)
                    rightNote=new Node();
                rightNote.add(o);
            }
        }
    }
    // 中序遍历所有的节点
    public List<Object> values(){
        List<Object> ls=new ArrayList<>();
        // 左节点的遍历结果
        if(null!=leftNode)
            ls.addAll(leftNode.values());
        // 当前节点
        ls.add(value);
        // 右节点的遍历结果
        if(null!=rightNote)
            ls.addAll(rightNote.values());
        return ls;
    }
    public static void main(String[]args){
        int a[]=new int[]{67, 7, 30, 73, 10, 0, 78, 81, 10, 74};
        Node nd=new Node();
        for(int i:a){
            nd.add(i);
        }
        System.out.println(nd.values());
    }
}
