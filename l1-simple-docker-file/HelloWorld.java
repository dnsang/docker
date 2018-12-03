public class HelloWorld {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Hello World From Container");
	   	//wait don't exit 
		Object lock = new Object();	
		synchronized(lock){
			lock.wait();
		}
	}
}


