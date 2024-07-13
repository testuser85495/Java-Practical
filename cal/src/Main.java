import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        cal cal = new cal();


        cal.add();
//        cal.sub();

        evenOdd obj = new evenOdd();
//        System.out.println(cal.add());
//        System.out.println(cal.sub());

        String name ="Arkan";

        int Num;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter: ");
        Num = s.nextInt();
        obj.abc(Num);
        System.out.println(name.isEmpty() ? "the" : name);

    }
}

// calculator
class  cal{
    double add()
    {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter Num1: ");
        double Num1 =a.nextDouble();
        System.out.print("Enter operation");
        char ch = a.next().charAt(0);
        System.out.print("Enter num2: ");
        double Num2 =a.nextDouble();

        switch (ch)
        {
        case '+':
            System.out.println((int)(Num1 + Num2));
            break;
        case '-':
            System.out.println((int)(Num1 - Num2));
            break;
        case '*':
            return (int)(Num1 * Num2);
        case '/':
            return Num1 / Num2;


    }
        return Num1;
    }
}