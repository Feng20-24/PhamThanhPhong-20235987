import javax.swing.JOptionPane;
public class FirstDegree {
    public static void main(String[] args){

        String strNotification = "You've just entered: ";

        String strA = JOptionPane.showInputDialog(null,"Please input a: ", "Equation a x + b = 0", JOptionPane.INFORMATION_MESSAGE);

        String strB = JOptionPane.showInputDialog(null,"Please input b: ", "Equation a x + b = 0", JOptionPane.INFORMATION_MESSAGE);

        strNotification +=strA + " x" + " + " + strB + " = 0" + "\n";

        double numA = Double.parseDouble(strA);
        double numB = Double.parseDouble(strB);
        double result = -(numA / numB);

        String strPrint;
        if(numA==0) strPrint = "There are infinity solution";
        else if(numB==0) strPrint = "There are no solution";
        else strPrint = "The solution is: "+ String.valueOf(result) + "\n";
        JOptionPane.showMessageDialog(null, strPrint, strNotification, JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
