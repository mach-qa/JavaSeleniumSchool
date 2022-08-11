package HomeWork.CarHomework;

import java.util.ArrayList;

public class Car {

    public Producent producent;
    public boolean isAutomaticGear;
    public Market market;
    public String segment;
    public ArrayList<Dimension> dimension;

    public Car(Producent producent, boolean isAutomaticGear, Market market, String segment, ArrayList<Dimension> dimension) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimension = dimension;
    }

}
