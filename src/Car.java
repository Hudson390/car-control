public class Car {

    private int speed = 0;
    private boolean running = false;
    private int march = 0;

    public int getMarch() {
        return march;
    }

    public void getRunningCar() {
        if (!running) {
            System.out.println("Status: Carro Desligado");
        } else {
            System.out.println("Status: Carro Ligado");
        }
    }

    public void getSpeed() {
        System.out.println("Velocidade: " + speed + " KM/H");
    }

    public boolean isRunning() {
        if (this.running) {
            System.out.println("O carro já esta ligado");
        } else {
            this.running = true;
            System.out.println("O carro esta ligado!");
        }

        return running;
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

    public void turnRight() {
        if (running){
            if (this.speed > 0 && this.speed < 40){
                System.out.println("O Carro esta virando para direita!");
            } else {
                System.out.println("O Carro esta parado!");
            }

        }else {
            System.out.println("O Carro está desligado no momento!");
        }
    }

    public void turnLeft() {
        if (running){
            if (this.speed > 0 && this.speed < 40){
                System.out.println("O Carro esta virando para esquerda!");
            } else {
                System.out.println("O Carro esta parado!");
            }

        }else {
            System.out.println("O Carro está desligado no momento!");
        }
    }

    public void shiftGears(){
        if (running ){
            this.march += 1;
            System.out.println("Trocando para " + this.march + " marcha");
        }else {
            System.out.println("O Carro está desligado no momento!");
        }

    }

    public void downShift(){
        if (running ){
            this.march -= 1;
            System.out.println("Trocando para " + this.march + " marcha");
        }else {
            System.out.println("O Carro está desligado no momento!");
        }

    }

    public void accelerate() {
        if (running){
            if (this.speed <= 19 && this.march == 1){
                this.speed += 10;
                System.out.println("O Carro esta acelerando!");
            } else if (this.speed <= 39 && this.march == 2) {
                this.speed += 10;
                System.out.println("O Carro esta acelerando!");
            } else if (this.speed <= 59 && this.march == 3) {
                this.speed += 10;
            } else if (this.speed <= 79 && this.march == 4) {
                this.speed += 10;
            } else if (this.speed <= 99 && this.march == 5) {
                this.speed += 10;
            } else if (this.speed <= 119 && this.march == 6) {
                this.speed += 10;
            } else if (this.speed > 120){
                System.out.println("O Carro esta na velocidade máxima!");
            } else {
                System.out.println("Necessario trocar de marcha!");
            }
        } else {
            System.out.println("O Carro está desligado no momento!");
        }


    }
    public void decelerate() {
        if (running){
            if (this.speed <= 19 && this.march == 1){
                this.speed -= 10;
                System.out.println("O Carro esta acelerando!");
            } else if (this.speed <= 39 && this.march == 2) {
                this.speed -= 10;
                System.out.println("O Carro esta acelerando!");
            } else if (this.speed <= 59 && this.march == 3) {
                this.speed -= 10;
            } else if (this.speed <= 79 && this.march == 4) {
                this.speed -= 10;
            } else if (this.speed <= 99 && this.march == 5) {
                this.speed -= 10;
            } else if (this.speed <= 119 && this.march == 6) {
                this.speed -= 10;
            } else if (this.speed < 0 ){
                System.out.println("O Carro esta parado!");
            } else {
                System.out.println("Necessario trocar de marcha!");
            }


        } else {
            System.out.println("O Carro está desligado no momento!");
        }

    }




}
