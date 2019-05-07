import java.awt.EventQueue;

import javax.swing.JFrame;

public class Program{
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Primer11 frame = new Primer11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		
		});
	}
}
