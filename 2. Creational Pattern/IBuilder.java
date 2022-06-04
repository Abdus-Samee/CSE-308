public interface IBuilder {
    void AddCommunicationChannel();
    void AddDisplay();
    void AddProcessor();
    void AddController();
    Product GetQueueSystem();
}

class Deluxe implements IBuilder {
    private String communication_channel;
    private int display_qty;
    private Product product;

    public Deluxe(String communication_channel, int display_qty){
        this.communication_channel = communication_channel;
        this.display_qty = display_qty;
        this.product = new Product(display_qty);
    }

    @Override
    public void AddCommunicationChannel() {
        Communication communication;
        if(this.communication_channel.equals("Broadband")) communication = new Broadband();
        else communication = new MobileData();
        product.Add(communication);
    }

    @Override
    public void AddDisplay() {
        Display display = new LCD();
        product.Add(display);
    }

    @Override
    public void AddProcessor() {
        Processor processor = new RaspberryPi();
        product.Add(processor);
    }

    @Override
    public void AddController() {
        Controller controller = new DefaultController();
        product.Add(controller);
    }

    @Override
    public Product GetQueueSystem() {
        return product;
    }
}

class Optimal implements IBuilder {
    private String communication_channel;
    private int display_qty;
    private Product product;

    public Optimal(String communication_channel, int display_qty){
        this.communication_channel = communication_channel;
        this.display_qty = display_qty;
        this.product = new Product(display_qty);
    }

    @Override
    public void AddCommunicationChannel() {
        Communication communication;
        if(this.communication_channel.equals("Broadband")) communication = new Broadband();
        else communication = new MobileData();
        product.Add(communication);
    }

    @Override
    public void AddDisplay() {
        Display display = new LED();
        product.Add(display);
    }

    @Override
    public void AddProcessor() {
        Processor processor = new ArduinoMega();
        product.Add(processor);
    }

    @Override
    public void AddController() {
        Controller controller = new DefaultController();
        product.Add(controller);
    }

    @Override
    public Product GetQueueSystem() {
        return product;
    }
}

class Poor implements IBuilder {
    private String communication_channel;
    private int display_qty;
    private Product product;

    public Poor(String communication_channel, int display_qty){
        this.communication_channel = communication_channel;
        this.display_qty = display_qty;
        this.product = new Product(display_qty);
    }

    @Override
    public void AddCommunicationChannel() {
        Communication communication;
        if(this.communication_channel.equals("Broadband")) communication = new Broadband();
        else communication = new MobileData();
        product.Add(communication);
    }

    @Override
    public void AddDisplay() {
        Display display = new LED();
        product.Add(display);
    }

    @Override
    public void AddProcessor() {
        Processor processor = new ATMega32();
        product.Add(processor);
    }

    @Override
    public void AddController() {
        Controller controller = new DefaultController();
        product.Add(controller);
    }

    @Override
    public Product GetQueueSystem() {
        return product;
    }
}
