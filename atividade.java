import java.util.Scanner;
public class atividade {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Digite o primeiro numero: ");
int num1 = input.nextInt();
System.out.print("Digite o segundo numero: ");
int num2 = input.nextInt();

if (num1 > num2) {
    System.out.println("O número (" + num1 + ")é maior");
} else if (num2 > num1) {
    System.out.println("O numero (" + num2 + ")é maior");
} else {
    System.out.println("Os dois são iguais.");
}
}
}
