package 数字与字符串;

public class Psw {

    // 作业-穷举法破解密码
    // 1.生成一个长度是3的随机字符串，把这个字符串作为当做密码
    // 2.使用穷举法生成长度是3个字符串，匹配上述生成的密码

    public static void main(String[] args) {

        String password = random(3); // 将随机的字符串传入字符串数组中
        System.out.println("由电脑随机生成的密码是:" + password);

        password.toCharArray(); // 将字符串转换为字符数组

        char[] guessPassword = new char[3]; // 创建空的字符数组用来接收破译的密码

        for (int i = '0'; i < 'z'; i++) {
            for (int j = '0'; j < 'z'; j++) {
                for (int k = '0'; k < 'z'; k++) {

                    // 通过if语句破译正确的密码
                    if (password.charAt(2) == k && password.charAt(1) == j && password.charAt(0) == i) {
                        guessPassword[2] = (char) k;
                        guessPassword[1] = (char) j;
                        guessPassword[0] = (char) i;
                    }
                }
            }
        }
        String truePassword = new String(guessPassword);

        System.out.println("破译后得到的正确密码是:" + truePassword);
    }

    public static String random(int length) {
        char[] array = new char[length];
        int min = '0';
        int max = 'z' + 1;
        for (int i = 0; i < array.length; i++) {
            while (true) {
                char mark = (char) ((Math.random() * (max - min) + min));
                if (Character.isDigit(mark) || Character.isLetter(mark)) {
                    array[i] = mark;
                    break;
                }
            }
        }
        String possword = new String(array);
        return possword;
    }
}
