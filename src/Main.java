import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LimitException {
        Scanner scan = new Scanner(System.in);
        BankAccount client = new BankAccount(20000);
        System.out.println("Здравствуйте\n");
        while (true) {
            System.out.println("\nВаш текущий счет: " + client.amount);
            System.out.println("Введите сумму которую хотите вывести: ");
            int sum = scan.nextInt();
            try {
                client.withDraw(sum);
                System.out.println("Вы сняли с счета: " + sum + "\n");
            }catch(LimitException e) {
                System.out.println("У вас недостаточно средств!\nОстаток счета: " + client.amount);
            }
        }
    }
}