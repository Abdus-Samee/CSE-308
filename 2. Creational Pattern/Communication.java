public abstract class Communication {
    abstract public int getCommPrice();
}

class Broadband extends Communication{
    private int price = 1000;

    @Override
    public int getCommPrice() {
        return this.price;
    }

    @Override
    public String toString() { return "Communication channel: Broadband service"; }
}

class MobileData extends Communication{
    private int price = 1000;

    @Override
    public int getCommPrice() {
        return this.price;
    }

    @Override
    public String toString() { return "Communication channel: Mobile Data service"; }}
