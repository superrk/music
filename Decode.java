package com.rking.a3;
/**
*@author Kai Rong
*@date 创建时间：May 9, 2017 5:29:38 PM 
*@version 1.0  
*/
public class Decode {   
	int decode(byte a){
		int d=0,e=0,b=0,n=0;
        d=(a&0x7f)/16;
        e=(a&0x7f)%16;
		switch(d)
		{
		case 0:b+=0;n=1;break;
		case 1:b+=16;n=1;break;
		case 2:b+=32;n=2;break;
		case 3:b+=64;n=4;break;
		case 4:b+=128;n=8;break;
		case 5:b+=256;n=16;break;
		case 6:b+=512;n=32;break;
		case 7:b+=1024;n=64;break;
		}
        b+=e*n;
		if(a<0){
			b=-b;
		}
		if(a==-128){
			b=-2017;
		}
		return b;
	}
	public static void main(String[] args){
		Decode d = new Decode();
		Encode e=new Encode();
		byte a=-128;
		byte b=-128;
		System.out.println(d.decode(a)+"  "+e.bianma(d.decode(b)));
	}
}
