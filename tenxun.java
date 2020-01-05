package zzy;

import java.util.ArrayList;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class tenxun {
   
	public static void main(String[] args) {
		
		try {
			throw new RuntimeErrorException(null);
		} finally {
			// TODO: handle finally clause
			System.out.println("fianlly");
		}	 
	}
}


