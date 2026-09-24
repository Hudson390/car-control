public class Car {

    private int speed = 0;
    private boolean running = false;
    private int march = 0;


    public int getSpeed() {
        return speed;
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
        if (!this.running) {
            System.out.println("O carro já esta desligado");
        } else {
            this.running = false;
            System.out.println("O carro foi desligado!");
        }
    }


}
