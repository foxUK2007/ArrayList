package Transport;

import java.util.Objects;

public class Mechanic {
    private String name;
    private String company;
    private TransportType typeTransport;

    public Mechanic(String name, String company, TransportType typeTransport) {
        this.name = name;
        this.company = company;
        this.typeTransport = typeTransport;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public TransportType getTypeTransport() {
        return typeTransport;
    }

    public void maintenance() {
        System.out.println("Проводит техобслуживание");
    }

    public void fixTransport() {
        System.out.println("Чинит машину");
    }

    @Override
    public String toString() {
        return "Механик "
                + name +
                " из компании " + company +
                ". Ремонтирует " + typeTransport
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(company, mechanic.company) && typeTransport == mechanic.typeTransport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, typeTransport);
    }
}
