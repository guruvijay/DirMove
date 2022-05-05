package DirMove;

public class DeadlockThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resource1 = "Vijay";
		String resource2 = "Kumar";
		Runnable r1 =()->{ 
			synchronized(resource1){
				System.out.println( "Thread 1 locked Resource1 (Vijay)");
			try {
				Thread.sleep(100);
			}catch(Exception e) {e.printStackTrace();}
			synchronized(resource2){
				System.out.println(" Thread 2 locked (Kumar)");
				}
			}
		};
		Runnable r2 =()->{
			synchronized(resource2){
				System.out.println( " Thread 2 locked Resource2 (Kumar)");
			}
			try {
				Thread.sleep(100);
			}catch(Exception e) {e.printStackTrace();}
			synchronized(resource1) {
				System.out.println( " Thread 1 locked (Vijay)");
			}
		};
		Thread t1 = new Thread(r1);t1.start();
		Thread t2 = new Thread(r2);t2.start();
	}
}
