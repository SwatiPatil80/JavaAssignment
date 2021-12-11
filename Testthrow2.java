package practice;

import java.io.IOException;

class Testthrow2 {
	 
		void m()throws IOException
	{  
	throw new IOException("device error");//checked exception  
	  }  
	void n() throws IOException{  
	m();  
	  }  
	void p(){  
	try{
	n();  
	   }
	catch(Exception e)
	{
	System.out.println("exception handled");
	}  
	}  
	public static void main(String args[]){  
	   Testthrow2 obj=new Testthrow2();  
	obj.p();  
	System.out.println("normal flow...");  
	  }  
	}




