package Assignment1;

import javax.swing.*;

public class MathematicalFun10b
{
    public static void main(String[] args)
    {
        String aa=JOptionPane.showInputDialog("Enter the value of a");
        double a=Double.parseDouble(aa);
        String bb=JOptionPane.showInputDialog("Enter the value of b");
        double b=Double.parseDouble(bb);
        String cc=JOptionPane.showInputDialog("Enter the value of c");
        double c=Double.parseDouble(cc);

        double s=a+b+c;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

        JOptionPane.showMessageDialog(null,"Area is "+area);

    }
}
