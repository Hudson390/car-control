import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();

    do {
        System.out.println("Digite a opção: ");
        System.out.println("1 - Ligar Carro");
        System.out.println("2 - Desligar Carro");
        System.out.println("3 - Acelerar");
        System.out.println("4 - Diminuir velocidade");
        System.out.println("5 - ");
        System.out.println("6 - Verificar velocidade");
        System.out.println("0 - Sair do Carro");
        var option = scanner.nextInt();
        Clearscreen.clearScreen();

        switch (option){
            case 1 -> car.isRunning();
            case 2 -> car.isNotRunning();
            case 3 -> car.accelerate();
            case 4 -> car.decelerate();
            case 6 -> car.getSpeed();
            case 0 -> System.exit(0);
        }
    } while (true);

    }
}
