package executavel;

import javax.swing.JOptionPane;

public class TreadTres {

	public static void main(String[] args) throws InterruptedException {
		
		//new Thread(thread1).start();
		//new Thread(thread2).start();
		
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		Thread threadNota = new Thread(thread2);
		threadNota.start();
		Thread threadNotificacao = new Thread(thread3);
		threadNotificacao.start();
		
		//Thread.sleep(5000);
		
		//threadNotificacao.stop();
			
			System.out.println("FIM DO CÓDIGO!!");
			JOptionPane.showMessageDialog(null, "Sistema Continua....");

	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			for(int i = 1 ; i <= 10 ; i++) {
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Enviou e-mail "+i);
				
			}
			
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			for(int i = 1 ; i <= 10 ; i++) {
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Enviou nota "+i);
				
			}
			
		}
	};
	
	private static Runnable thread3 = new Runnable() {
		
		@Override
		public void run() {
			for(int i = 1 ; i <= 10 ; i++) {
				
				try {
					Thread.sleep(2500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Enviou notificação "+i);
				
			}
			
		}
	};

}
