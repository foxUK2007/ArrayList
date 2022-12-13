package Transport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    Set<Sponsor> sponsorArrayList;

    Set<Mechanic> mechanicArrayList;

    public Transport(String brand, String model, double engine) {
        this.brand = ValidateUtil.validateString(brand);
        this.model = ValidateUtil.validateString(model);
        this.engineVolume = engine;
        this.mechanicArrayList = new HashSet<>();
        this.sponsorArrayList = new HashSet<>();

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngine() {
        return engineVolume;
    }

    public abstract void startMoving();

    public abstract void endMoving();

    public abstract void printType();

    public Set<Sponsor> getSponsorArrayList() {
        return sponsorArrayList;
    }

    public Set<Mechanic> getMechanicArrayList() {
        return mechanicArrayList;
    }
}

