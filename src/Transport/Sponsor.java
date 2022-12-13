package Transport;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return supportSum == sponsor.supportSum && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, supportSum);
    }
}

