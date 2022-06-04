public abstract class Display {
    abstract public int getDisplayPrice();
}

class LCD extends Display{
    private int price = 300;

    @Override
    public int getDisplayPrice() {
        return this.price;
    }

    @Override
    public String toString(){
        return "Display system consists of LCD panel";
    }
}

class LED extends Display{
    private int price = 200;

    @Override
    public int getDisplayPrice() {
        return this.price;
    }

    @Override
    public String toString(){
        return "Display system consists of LED matrix";
    }
}
