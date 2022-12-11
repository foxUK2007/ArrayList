package Transport;

public class Sponsor {
    private String name;
    private int supportSum;

    public Sponsor(String name, int supportSum) {
        this.name = name;
        this.supportSum = supportSum;
    }

    public String getName() {
        return name;
    }

    public int getSupportSum() {
        return supportSum;
    }

    public void setSupportSum(int supportSum) {
        this.supportSum = supportSum;
    }

    public void sponsorRace() {
        System.out.println("Спонсирует заезд");
    }

    @Override
    public String toString() {
        return "Спонсор "
                + name +
                " сумма поддержки " + supportSum
                ;
    }
}

