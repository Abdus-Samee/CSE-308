public abstract class Processor {
    abstract int getProcessorPrice();
}

class RaspberryPi extends Processor{
    private int price = 1200;

    @Override
    int getProcessorPrice() {
        return this.price;
    }

    @Override
    public String toString(){
        return "Processor used: Raspberry Pi";
    }
}

class ArduinoMega extends Processor{
    private int price = 600;

    @Override
    int getProcessorPrice() {
        return this.price;
    }

    @Override
    public String toString(){
        return "Processor used: Arduino Mega";
    }
}

class ATMega32 extends Processor{
    private int price = 100;

    @Override
    int getProcessorPrice() {
        return this.price;
    }

    @Override
    public String toString(){
        return "Processor used: ATMega32";
    }}
