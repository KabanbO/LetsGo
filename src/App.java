import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите арифметическое выражение");
        String input = console.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) throws Exception {
        int num1;
        int num2;
        String znak;
        String result;
        String[] operands = input.split("[+\\-*/]");
        if (operands.length !=2) throw new Exception("Должно быть два операнда");
        znak = scanZnak(input);
        num1=Integer.parseInt(operands[0]);
        num2=Integer.parseInt(operands[1]);
        if(num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10)
            throw new Exception("Числа должны быть от 1 до 10");
        int result2 = calc(num1,num2,znak);
        result = String.valueOf(result2);
        return result;
    }
    static String scanZnak(String input){
        if(input.contains("+"))
            return "+";
        else if(input.contains("-"))
            return "-";
        else if (input.contains("/"))
            return "/";
        else if(input.contains("*"))
            return "*";
        else
            return null;
    }

    static int calc(int a, int b, String znak) {

        if (znak.equals("+"))
            return a + b;
        else if (znak.equals("-"))
            return a - b;
        else if (znak.equals("/"))
            return a / b;
        else
            return a * b;
    }

}
