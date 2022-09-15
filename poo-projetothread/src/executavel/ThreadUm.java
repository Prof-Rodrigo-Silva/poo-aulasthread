package executavel;

import javax.swing.JOptionPane;

public class ThreadUm {
	
public static void main(String[] args) throws InterruptedException {
		
	
	new Thread() {
		
		public void run() {
			for(int i = 1 ; i <= 10 ; i++) {
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Tempo..."+i);
				
			}
		}
		
	}.start();
		
		
		
		System.out.println("FIM DO CÓDIGO!!");
		JOptionPane.showMessageDialog(null, "Sistema Continua....");
		
	}

}
