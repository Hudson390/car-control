public class Car {

    private int speed = 0;
    private boolean running = false;
    private int march = 0;


    public void getSpeed() {
        System.out.println("Velocidade: " + speed + " KM/H");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void isRunning() {
        if (this.running) {
            System.out.println("O carro já esta ligado");
        } else {
            this.running = true;
            System.out.println("O carro esta ligado!");
        }
    }

    public void isNotRunning() {
        if (this.running) {
            if (march == 0 && this.speed == 0) {
                this.running = false;
                System.out.println("O carro foi desligado!");
            } else {
                System.out.println("O carro não pode ser desligado no momento!");
            }

        } else {
            System.out.println("O carro já esta desligado");
        }
    }

    public void accelerate() {
        if (running){
            if (this.speed < 120){
                this.speed += 10;
                System.out.println("O Carro esta acelerando!");
            } else {
                System.out.println("O Carro esta na velocidade máxima!");
            }
        } else {
            System.out.println("O Carro está desligado no momento!");
        }


    }
    public void decelerate() {
        if (running){
            if (this.speed > 0){
                this.speed -= 10;
                System.out.println("O Carro esta desacelerando!");
            } else {
                System.out.println("O Carro esta parado!");
            }

        } else {
            System.out.println("O Carro está desligado no momento!");
        }

    }



}
