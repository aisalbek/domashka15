import java.util.Scanner;

public class Circle {
    public static void area (){
       double  PI = 3.14;
    Scanner scanner =new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("узунун жазыныз >");
            int sk1 = scanner.nextInt();
            System.out.print("турасын жазыныз >");
            int sk2 = scanner.nextInt();
            double suma =  PI * (sk1*sk2);
            System.out.println("сума"+suma);
        }

    }
    public static void circumference(){
        Scanner scanner =new Scanner(System.in);
        double  PI = 3.14;
        System.out.print("диоганаль >");
        double suma = PI *2* scanner.nextInt();
        System.out.println("сума"+suma);


    }
}
