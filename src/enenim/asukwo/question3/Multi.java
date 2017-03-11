package enenim.asukwo.question3;
class Multi extends Thread{  
	public void run(){  
		System.out.println("A way to create a thread...");  
	} 
	
	public static void main(String args[]){  
		Multi t1=new Multi();  
		t1.start();  
	 }  
}  