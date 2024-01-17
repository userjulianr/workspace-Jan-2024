import javax.swing.JOptionPane;
// Julian Rivas January 9th  Web Assist Assignment 1 Wk 1
public class RandomGuess {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "In your head think of a number 1 through 10");
		
		JOptionPane.showMessageDialog(null,"The number is "+
				(1 + (int)(Math.random() * 10)));

	}

}
