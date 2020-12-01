package 字符;

public class Benglishi {
    public static void main(String[] args) {
//      给出一句英文句子： "let there be light"
//      得到一个新的字符串，每个单词的首字母都转换为大写
        String s = "let there be light";
        System.out.println(s);
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char upperCaseFirstWord =Character.toUpperCase(word.charAt(0));
            String rest = word.substring(1);
            String capitalizedWord = upperCaseFirstWord + rest;
            words[i]  = capitalizedWord;
        }
        String result = "";
        for (String word : words) {
            result+= word + " ";
        }
        result= result.trim();
        System.out.println(result);
    }
}
