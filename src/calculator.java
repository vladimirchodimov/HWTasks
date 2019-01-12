import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        System.out.println("Калкулатор");
        System.out.println("Моля въведете знак за действие : + , - , * или / ");
        Scanner input = new Scanner(System.in);
        String symbol = input.nextLine();
        System.out.println("Моля въведето първото число :");
        double first = input.nextDouble();
        System.out.println("Моля въведето второто число :");
        double second = input.nextDouble();

        double resul = 0;

        switch (symbol) {
            case "+":
                resul = first + second;
                break;
            case "-":
                resul = first - second;
                break;
            case "*":
                resul = first * second;
                break;
            case "/":
                resul = first / second;
                break;
        }
        System.out.println("Резултатът е : " + resul);
    }
}
