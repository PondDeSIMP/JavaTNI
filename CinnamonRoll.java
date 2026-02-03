public class CinnamonRoll extends Bakery {
    private int quantity;
    private boolean isHeated;

    public CinnamonRoll(String flavor, double unitPrice, int quantity) {
        super(flavor, unitPrice);
        this.quantity = quantity;
        this.isHeated = false;
    }

    public void heatUp() {
        this.isHeated = true;
        System.out.println("...Warming up the Cinnaroll...");
    }

    public boolean getIsHeated() {
        return this.isHeated;
    }
    @Override
    public int getPackingCost() {
        if (this.isHeated) {
            return 15;
        } else {
            return super.getPackingCost();
        }
    }
    @Override
    public double calculateTotalPrice() {
        return (getUnitPrice() * quantity) + getPackingCost();
    }
    @Override
    public String toString() {
        String status = isHeated ? "Hot" : "Regular";
        return super.toString() + "\n" +
                getFlavor() + " Cinnaroll (" + status + ")\n" +
                "Quantity: " + quantity + " pieces\n" +
                "Total price of Cinnaroll = " + calculateTotalPrice();
    }
}