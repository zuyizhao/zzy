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

//����Ϊ���Ե��ж�����������淶ʾ���������ύ�����Ʒ֡�
