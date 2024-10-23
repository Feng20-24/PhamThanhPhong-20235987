import javax.swing.JOptionPane;
public class DisplayBasicCal{
	public static void main(String[] args){
		String strNum1, strNum2;
		String strNotification = "You've just entered: ";
		
		strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		
		strNum2 = JOptionPane.showInputDialog(null,"Please input the second numnber:  ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		
		strNotification+=strNum1 + " and "+ strNum2 + "\n";
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		double sum = num1 + num2;
		String strSum = "The sum is "+ String.valueOf(sum)+"\n";
		
		double difference = num1 - num2;
		String strDif = "The difference is " + String.valueOf(difference) + "\n";
	
		double product = num1*num2;
		String strProduct = "The product is " + String.valueOf(product) + "\n";
		
		String strQuotient;	
		if( num2!=0 ){
			double quotient = num1/num2;
			strQuotient = "The quotient is " + String.valueOf(quotient) + "\n";
		} else strQuotient ="Can't compute division\n";
		strNotification += strSum + strDif + strProduct + strQuotient; 
		JOptionPane.showMessageDialog(null, strNotification, "The result", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
