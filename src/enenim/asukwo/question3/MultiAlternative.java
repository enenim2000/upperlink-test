package enenim.asukwo.question3;

class MultiAlternative implements Runnable{  
	public void run(){  
	System.out.println("Alternate way to create thread...");  
	}  

	public static void main(String args[]){  
		MultiAlternative m1=new MultiAlternative();  
		Thread t1 =new Thread(m1);  
		t1.start();  
	 }  
	}  