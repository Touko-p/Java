package 字符;

public class SeP {
    public static void main(String[]args){
        String p="peter piper picked a peck of pickled peppers";
        String words[]=p.split(" ");
        int a=0;
        for(int i=0;i<words.length;i++){
            String word=words[i];
            char f=word.charAt(0);
            if(f=='p'){
                a++;
            }
        }
        System.out.println(a);

    }
}
