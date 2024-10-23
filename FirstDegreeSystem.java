import javax.swing.JOptionPane;
public class FirstDegreeSystem {
    public static void main(String[] args){

        String strNotification = "You've just entered: ";

        String strA11 = JOptionPane.showInputDialog(null,"Please input a: ", "Equation a11 * x1 + a12 * x2 = b1", JOptionPane.INFORMATION_MESSAGE);
        String strA12 = JOptionPane.showInputDialog(null,"Please input a: ", "Equation a11 * x1 + a12 * x2 = b1", JOptionPane.INFORMATION_MESSAGE);
        String strB1  = JOptionPane.showInputDialog(null,"Please input a: ", "Equation a11 * x1 + a12 * x2 = b1", JOptionPane.INFORMATION_MESSAGE);
        String strA21 = JOptionPane.showInputDialog(null,"Please input a: ", "Equation a21 * x1 + a22 * x2 = b2", JOptionPane.INFORMATION_MESSAGE);
        String strA22 = JOptionPane.showInputDialog(null,"Please input a: ", "Equation a21 * x1 + a22 * x2 = b2", JOptionPane.INFORMATION_MESSAGE);
        String strB2  = JOptionPane.showInputDialog(null,"Please input b: ", "Equation a21 * x1 + a22 * x2 = b2", JOptionPane.INFORMATION_MESSAGE);

        double numA11 = Double.parseDouble(strA11);
        double numA12 = Double.parseDouble(strA12);
        double numA21 = Double.parseDouble(strA21);
        double numA22 = Double.parseDouble(strA22);
        double numB1 = Double.parseDouble(strB1);
        double numB2 = Double.parseDouble(strB2);

        double D = numA11 * numA22 - numA21 * numA12;
        double D1 = numB1 * numA22 - numB2 * numA12;
        double D2 = numA11 * numB2 - numA21 * numB1;
        String strPrint;

        strNotification += strA11 +',' + strA12 +','+ strB1 + ','+ strA21+','+ strA22+','+ strB2;

        if(D==0){
            if((numA11/numA21 == numA12/numA22) && (numA12/numA22==numB1/numB2)) strPrint="There are infinity solutions";
            else strPrint="There are no solutions";
        }else {
            strPrint = "The solution is: x1 = "+ String.valueOf(D1/D) + "\n" + "and x2 = "+ String.valueOf(D2/D);
        }

        JOptionPane.showMessageDialog(null, strPrint, strNotification, JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
