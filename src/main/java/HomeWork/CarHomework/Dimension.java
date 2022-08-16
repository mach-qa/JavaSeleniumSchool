package HomeWork.CarHomework;

public class Dimension {

    private int high;
    private int width;
    private int trunkCapacity;

    public Dimension(int high, int width, int tankCapacity) {
        this.high = high;
        this.width = width;
        this.trunkCapacity = tankCapacity;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }
}
