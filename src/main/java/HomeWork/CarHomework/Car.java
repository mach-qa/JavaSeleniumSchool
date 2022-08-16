package HomeWork.CarHomework;

import java.util.ArrayList;

public class Car {

    private Producent producer;
    private boolean isAutomaticGear;
    private Market market;
    private String segment;
    private ArrayList<Dimension> dimension;

    public Car(Producent producer, boolean isAutomaticGear, Market market, String segment, ArrayList<Dimension> dimension) {
        this.producer = producer;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimension = dimension;
    }

    public Producent getProducer() {
        return producer;
    }

    public void setProducer(Producent producer) {
        this.producer = producer;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public void setAutomaticGear(boolean automaticGear) {
        isAutomaticGear = automaticGear;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public ArrayList<Dimension> getDimension() {
        return dimension;
    }

    public void setDimension(ArrayList<Dimension> dimension) {
        this.dimension = dimension;
    }
}
