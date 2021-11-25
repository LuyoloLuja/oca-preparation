package methods_encapsulation_4.encapsulating_data;

public class Swan {
    private int numberEggs;

    public int getNumberEggs() {
        return numberEggs;
    }

    public void setNumberEggs(int numberEggs) {
        if (numberEggs >= 0) {
            this.numberEggs = numberEggs;
        }
    }
}
