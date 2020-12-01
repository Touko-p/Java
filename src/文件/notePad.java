package 文件;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class notePad {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入所需要保存的文件路径：");
		String path=scan.next();
		System.out.println("请输入文件名：");
		String filename=scan.next();
		System.out.println("请输入文件内容,换行输入exit即可退出保存：");
		write(path+filename);
	}
	public static void write(String path){
		try(FileWriter fw=new FileWriter(new File(path))){
			Scanner scan=new Scanner(System.in);
			String str=null;
			while (true){
				str=scan.next();
				if(str.toUpperCase().equals("EXIT")){
					System.out.println("保存成功");
					break;
				}
				char []cs=str.toCharArray();
				fw.write(cs);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}}


