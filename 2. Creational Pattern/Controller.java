public abstract class Controller {
    abstract int getControllerPrice();
}

class DefaultController extends Controller{
    private int price = 800;

    @Override
    int getControllerPrice() {
        return this.price;
    }

    @Override
    public String toString() { return "Controller used: Default Controller"; }
}
