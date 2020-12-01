package 多线程;

import java.util.ArrayList;
import java.util.List;
public class passwordCracking {
    public static void main(String[]args){
        String randompsw=randomPassword(3);
        System.out.println("产生的随机密码是："+randompsw);
        List<String>word=new ArrayList<>();
        CrackThread t1=new CrackThread(randompsw,word);
        logThread t2=new logThread(word);
        t1.start();
        t2.start();
    }
    public static String randomPassword(int lenth){
        char []password=new char[lenth];
        int min='0';
        int max='z'+1;
        for(int i=0;i<password.length;i++){
            while (true){
                char a=(char)((Math.random()*(max-min)+min));
                if(Character.isDigit(a)||Character.isLetter(a)){
                    password[i]=a;
                    break;
                }
            }
        }
        String randomPassword=new String(password);
        return randomPassword;
    }
    public static class CrackThread extends Thread{
        private String password;
        private List<String>word;
        public CrackThread(String password,List<String>word){
            this.password=password;
            this.word=word;
        }
        public String psw(String password){
            password.toCharArray();
            char[]guessPassword=new char[password.length()];
            char[]getPassword=new char[password.length()];
            for (int i='0';i<'z';i++){
                for (int j='0';j<'z';j++){
                    for (int k='0';k<'z';k++){
                        getPassword[2]=(char)k;
                        getPassword[1]=(char)j;
                        getPassword[0]=(char)i;
                        String newPassword=new String(getPassword);
                        word.add(newPassword);
                        if(password.charAt(2)==k&&password.charAt(1)==j&&password.charAt(0)==i){
                            guessPassword[2]=(char)k;
                            guessPassword[1]=(char)j;
                            guessPassword[0]=(char)i;

                        }
                    }
                }
            }
            String truePassword=new String(guessPassword);
            System.out.println("正确的密码是"+truePassword);
            return truePassword;
        }
        public void run(){
            psw(password);
        }
    }
    public static class logThread extends Thread{
        private List<String>word=new ArrayList<>();
        public logThread(List<String>word){
            this.word=word;
            this.setDaemon(true);
        }
        public void run(){
            while (true){
                while (word.isEmpty()){
                    try {
                        System.out.println("我累了，让我休息一秒吧");
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                String password=word.remove(0);
                System.out.println("猜测密码为："+password);
            }
        }
    }
}
