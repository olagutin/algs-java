package algs;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write initial value");
        double data = scanner.nextDouble();
        Algs algs = new Algs(data);
        AlgsTester tester = new AlgsTester(algs);
        tester.showOptions();
        System.out.println("Write option number");
        int userChoice = scanner.nextInt();
        tester.showOptionResult(userChoice);
    }


}
