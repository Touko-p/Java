package 字符;

public class TestString {
    public static void main(String[] args) {

        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号   ";
        String psw="aVVl";
        char a=sentence.charAt(4);//charAt(int index)获取指定位置的字符
        System.out.println(a);
        char[] cs = sentence.toCharArray(); //获取对应的字符数组
        System.out.println(sentence.length() == cs.length);
        String subString2 = sentence.substring(1,8);//截取子字符串
        System.out.println(subString2);
        String subSentences[] = sentence.split(",");//根据分隔符进行分隔
        for (String sub : subSentences) {
            System.out.println(sub);
        }
        System.out.println(sentence.trim());//去掉首尾空格
        //全部变成小写
        System.out.println(psw.toLowerCase());
        //全部变成大写
        System.out.println(psw.toUpperCase());
        //indexOf 判断字符或者子字符串出现的位置
        //contains 是否包含子字符串
        System.out.println(sentence.indexOf('8')); //字符第一次出现的位置
        System.out.println(sentence.indexOf("超神")); //字符串第一次出现的位置
        System.out.println(sentence.lastIndexOf("了")); //字符串最后出现的位置
        System.out.println(sentence.indexOf(',',5)); //从位置5开始，出现的第一次,的位置
        System.out.println(sentence.contains("击杀")); //是否包含字符串"击杀"
        //replaceAll 替换所有的
        //replaceFirst 只替换第一个
        String temp = sentence.replaceAll("击杀", "被击杀"); //替换所有的
        temp = temp.replaceAll("超神", "超鬼");
        System.out.println(temp);
        temp = sentence.replaceFirst(",","");//只替换第一个
        System.out.println(temp);
    }
}
