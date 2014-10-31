package fdas;

public class Shit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankingSystemMainWindow().setVisible(true);
            }
        });
		System.out.println("hello world");

	}

}
