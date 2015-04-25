package talagakrol;

public class FibonaciLuncher {

	public static void main(String[] args) {
		
		for (int i = 1;; i++) {
			
			if (Fibonacci.getElemntLoop(i).toString().length() == 1000) {
				System.out.println(i);
				System.out.println(Fibonacci.getElemntLoop(i));
				return;
			}
		}
	}
}
