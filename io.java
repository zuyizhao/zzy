package zzy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class io {
	
	private static FileChannel in;
	private static FileChannel out;
	private static ByteBuffer buffer;
	private static File infile;

	public static void main(String[] args) throws IOException{
		
	boolean mkdir = new File("Personal").mkdir();
//	FileOutputStream out = new FileOutputStream(new File("Personal//info.txt"));
//	out.write("20121472 ÕÔ×æÒå ÄÐ".getBytes());
//	out.close();
	FileInputStream in = new FileInputStream(new File("Personal//info.txt"));
	Scanner sc = new Scanner(in);
	while (sc.hasNext()) {
        System.out.println(sc.nextLine());
	}
	System.out.println(mkdir);

		
		
		//// TODO Auto-generated method stub
//		if(args.length != 2) {
//			System.out.println("arguments: sorcefilesrc destfilesrc");
//			System.exit(1);
//		}
////		file = new File(args[1]);
//		infile = new File(args[0]); 
//		System.out.println(infile.getAbsolutePath()+"\n"
//				+infile.getCanonicalPath()+"\n"
//						+ 
//			infile.getFreeSpace()+"\n"
//			+
//			infile.getParent()+"\n"
//			+
//			infile.getPath()+"\n"
//			+
//			infile.getUsableSpace()+"\n"
//			+
//			infile.getClass()+"\n"
//			+
//			infile.getParentFile());
//		in = new FileInputStream(infile).getChannel();
//		out = new FileOutputStream(new File(args[1]+infile.getName())).getChannel();
//		buffer = ByteBuffer.allocate(1024);
//		while ((in.read(buffer)) != -1) {
//			buffer.flip();
//			out.write(buffer);
//			buffer.clear();
//			
//		}
////		in.transferTo(0, in.size(), out);
//		in.close();
//		out.close();
     
	}
}


