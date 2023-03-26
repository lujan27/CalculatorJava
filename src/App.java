import java.util.Scanner;

public class App {
    static int firstNumber, secondNumber, reload, operator;
    static double result;

    static Scanner myFirst = new Scanner(System.in);
    static Scanner mySecond = new Scanner(System.in);
    static Scanner myOperator = new Scanner(System.in);

    public static void getFirst(){
        System.out.println("Your first number: ");
        firstNumber = myFirst.nextInt();
    }

    public static void getSecond(){
        System.out.println("Your second number: ");
        secondNumber = mySecond.nextInt();
    }

    public static void getOperator(){
        System.out.println("1: For addition");
        System.out.println("2: For substraction");
        System.out.println("3: For multiply");
        System.out.println("4: For divide");
        System.out.println("Introduce your operation:");
        operator =  myOperator.nextInt();
    }

    public static void execOperation(){
        switch (operator){
            case 1:
                    result = firstNumber + secondNumber;
                break;
            case 2:
                    result = firstNumber - secondNumber;
                break;
            case 3:
                    result = firstNumber * secondNumber;
                break;
            case 4:
                    result = firstNumber / secondNumber;
                break;
            default:
                System.err.println("This operator has not found...");
                break;
        }
    }
    public static void main(String[] args) throws Exception {
        getFirst();
        getSecond();
        getOperator();
        execOperation();
        System.out.println("Your result is: " + result);
    }
}
