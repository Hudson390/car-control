import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();

    do {

        System.out.println("======= Painel =======");
        car.getSpeed();
        System.out.println("Marcha: " + car.getMarch());
        car.getRunningCar();

        System.out.println("======================");
        System.out.println("Digite a opção: ");
        System.out.println("1 - Ligar Carro");
        System.out.println("2 - Desligar Carro");
        System.out.println("3 - Acelerar");
        System.out.println("4 - Diminuir velocidade");
        System.out.println("5 - Virar para Esquerda");
        System.out.println("6 - Virar para Direita");
        System.out.println("7 - Verificar velocidade");
        System.out.println("8 - Trocar de marcha");
        System.out.println("9 - Reduzir marcha");
        System.out.println("0 - Sair do Carro");
        var option = scanner.nextInt();
        Clearscreen.clearScreen();

        switch (option){
            case 1 -> car.isRunning();
            case 2 -> car.isNotRunning();
            case 3 -> car.accelerate();
            case 4 -> car.decelerate();
            case 5 -> car.turnLeft();
            case 6 -> car.turnRight();
            case 7 -> car.getSpeed();
            case 8 -> car.shiftGears();
            case 9 -> car.downShift();
            case 0 -> System.exit(0);
        }
    } while (true);

    }
}
