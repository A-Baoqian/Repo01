package Test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input =new Scanner(System.in);
        System.out.println("请输入老师名字");    
        String name=input.next();
        System.out.println("请输入老师年龄");    
        int age=input.nextInt();
        System.out.println("请输入老师爱好");    
        String like=input.next();
        System.out.println("你输入的信息为:\n名字："+name+"\n"+"年龄:"+age+"\n"+"爱好:"+like);
        
	}

}
