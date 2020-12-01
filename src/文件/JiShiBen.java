package 文件;

import java.io.*;

public class JiShiBen {
    public static void main(String[]ars) throws IOException {
        File f=new File("D:/Test.txt");
        InputStream in=System.in;
        InputStreamReader isr=new InputStreamReader(in,"gbk");
        BufferedReader br=new BufferedReader(isr);
        FileOutputStream fos=new FileOutputStream(f);
        OutputStreamWriter osw=new OutputStreamWriter(fos,"gbk");
        PrintWriter pw=new PrintWriter(osw,true);
        String str=null;
        while ((str=br.readLine())!=null){
            if(str.toUpperCase().equals("EXIT")){
                break;
            }
            pw.println(str);
        }

    }
}
