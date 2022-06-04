public class Director {
    IBuilder myBuilder;

    public void Construct(IBuilder builder){
        myBuilder = builder;
        myBuilder.AddCommunicationChannel();
        myBuilder.AddDisplay();
        myBuilder.AddProcessor();
        myBuilder.AddController();
    }
}
