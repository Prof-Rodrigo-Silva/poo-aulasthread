package executavel;

public class ExecutavelThread {

	public static void main(String[] args) throws InterruptedException {
		
		
		for(int i = 1 ; i <= 10 ; i++) {
			
			Thread.sleep(2000);
			
			System.out.println("Tempo..."+i);
			
		}

	}

}
