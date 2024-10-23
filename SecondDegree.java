import javax.swing.JOptionPane;
import static java.lang.Math.sqrt;

public class SecondDegree {
    public static void main(String[] args){

        String strNotification="";

        String strA = JOptionPane.showInputDialog(null,"Please input a: ", "Equation a * x2 + b * x + c = 0", JOptionPane.INFORMATION_MESSAGE);
        String strB = JOptionPane.showInputDialog(null,"Please input b: ", "Equation a * x2 + b * x + c = 0", JOptionPane.INFORMATION_MESSAGE);
        String strC = JOptionPane.showInputDialog(null,"Please input c: ", "Equation a * x2 + b * x + c = 0", JOptionPane.INFORMATION_MESSAGE);

        double numA = Double.parseDouble(strA);
        double numB = Double.parseDouble(strB);
        double numC = Double.parseDouble(strC);

        double delta = numB * numB - 4 * numA * numC;
        String strPrint;
        if(delta < 0 ) strPrint = "There are no solution";
        else if (delta == 0){
            strPrint = "There is one solution" + String.valueOf(-numB/(2*numA));
        }else {
            strPrint = "There are two solutions" + String.valueOf((-numB+sqrt(delta))/(2*numA)) +" and "+ String.valueOf((-numB-sqrt(delta))/(2*numA));
        }
        strNotification +="Equation "+strA+" * x2 + "+strB+" * x + "+strC+" = 0";

        JOptionPane.showMessageDialog(null, strPrint, strNotification, JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
