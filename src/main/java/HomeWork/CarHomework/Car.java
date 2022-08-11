package HomeWork.CarHomework;

public class Car {

    private Producent producent;
    private boolean isAutomaticGear;
    private Market market;
    private String segment;
    Dimension dimension;

    public Car(Producent producent, boolean isAutomaticGear, Market market, String segment, Dimension dimension) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimension = dimension;
    }



}
