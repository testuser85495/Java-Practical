import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter num"));
//        JOptionPane.showMessageDialog(null, "Hello "+name);

        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter num"));
//        JOptionPane.showMessageDialog(null, "You are "+age+" years old");
        int Add = num1 + num2;
        int mul = num1 * num2;
//        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "ADD is "+Add + "\n MULTIPLACTIO IS: "+ mul);
    }
}