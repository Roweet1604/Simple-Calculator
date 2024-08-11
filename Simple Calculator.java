import java.util.Scanner;

class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value = ");
        int a = sc.nextInt();
        System.out.print("Enter the second value = ");
        int b = sc.nextInt(); hell
        int sum = a + b;
        int subtract = a - b;
        int multiply = a * b;
        int divide = a / b;
        int average = sum/2;
        int percentage = sum*100/200;
        
        
        System.out.println("1 - Sum");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.println("5 - Average");
        System.out.println("6 - Percentage");
        
        System.out.print("Choose the Option = ");

        int choose = sc.nextInt();
        switch(choose) {
            case 1 : System.out.print("sum = " + sum);
            break;
            case 2 : System.out.print("Subtract = " + subtract);
            break;
            case 3 : System.out.print("Multiply = " + multiply);
            break;
            case 4 : System.out.print("Divide = " + divide);
            break;
            case 5 : System.out.print("Average = " + average);
            break;
            case 6 : System.out.print("Percentage = " + percentage);
            break;
            default : System.out.print("Invalid Button");
        }

        }
    }
