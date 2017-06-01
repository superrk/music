package com.rking.a3;
/**
*@author Kai Rong
*@date 创建时间：May 9, 2017 1:05:38 PM 
*@version 1.0  
*/
public class Encode {
public int q=1,p=1;
Integer b;
	int DuanLuo(int a)   
	{   
	    int m=1024;
	    int c= Math.abs(a);
	    int n=64;   	   
	    for(int i=8;i>1;i--)   
	    {   
	        if(c>=m)   
	        { 
	        	q=m;p=n;
	        return i;   
	        }   
	        m=m/2;   
	        n=n/2;   
	    }   
	    p=1;q=0;
	    return 1;	    
	}
	void DuanNei(int a)   
	{   
    switch((a-q)/p) 
    {
    case 0:b=0;break;
    case 1:b=1;break;
    case 2:b=2;break;
    case 3:b=3;break;
    case 4:b=4;break;
    case 5:b=5;break;
    case 6:b=6;break;
    case 7:b=7;break;
    case 8:b=8;break;
    case 9:b=9;break;
    case 10:b=10;break;
    case 11:b=11;break;
    case 12:b=12;break;
    case 13:b=13;break;
    case 14:b=14;break;
    default:b=15;break;
    }
	}   
    int bianma(int a){			
	int n=DuanLuo(a);
	DuanNei(Math.abs(a));	
	switch(n)
	{case 1:break;
	 case 2:b+=16;break;
	 case 3:b+=32;break;
	 case 4:b+=48;break;
	 case 5:b+=64;break;
	 case 6:b+=80;break;
	 case 7:b+=96;break;
	 case 8:b+=112;break;	
	}
	if(a<0)
		b=b-128;
	if(a==-2017)
		b=-128;
	return b;	
	}
    public static void main(String[] args){
    	Encode d=new Encode();
    	System.out.print(d.bianma(-124));  	
    }
}
