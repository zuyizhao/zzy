package zzy;

import java.util.Scanner;

public class t {
    
	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
         String[] Stringarray = in.next().split(",");
         int intarrary[] = new int[Stringarray.length];
         for (int i = 0; i < Stringarray.length; i++) {
			intarrary[i] = Integer.parseInt(Stringarray[i]);
			if(i == Stringarray.length-1) {
				System.out.print(intarrary[i]);
			}else {
				System.out.print(intarrary[i]+",");
			}	
			
		}
		}		
	     
	}

//本题为考试单行多行输入输出规范示例，无需提交，不计分。
