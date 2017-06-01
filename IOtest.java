package com.rking.a3;
import java.io.*;
/**
*@author Kai Rong
*@date 创建时间：May 9, 2017 9:41:43 AM 
*@version 1.0  
*/
public class IOtest {


	public static void main(String[] args) throws Exception {
		 Decode d=new Decode();
		 InputStream streamReader = null;
		 File f=new File("E:\\input.txt");
		 streamReader=new FileInputStream(f);
		 byte[] b=new byte[(int) f.length()];		 
		 streamReader.read(b);
		 
//         OutputStream out=new FileOutputStream(new File("E:\\output.txt"));
//         out.write(b);
//         out.flush();
//         out.close();
//         streamReader.close();
//         System.out.print(f.length());
		 
//		 FileOutputStream out=new FileOutputStream(new File("E:\\decode.txt"));		 
//		 for(int i=0;i<b.length;i++)
//		 {			  
//			  b[i]=(byte) d.decode(b[i]);
//		 }
//		 out.write(b);
//		 out.flush();
//		 out.close();
		 
		 byte[] c=new byte[(int) f.length()];int k=0;
		 for(int i=0;i<b.length;i++)
		 {
			 int j=new Encode().bianma(d.decode(b[i]));

			 c[k]=(byte)j;
			 k++;			 
		 }
		 OutputStream out=new FileOutputStream(new File("E:\\out.txt"));
		 out.write(c);
		 out.flush();
		 out.close();
		 streamReader.close();
	}        
}
