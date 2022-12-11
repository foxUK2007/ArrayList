package Transport;

import java.util.ArrayList;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    ArrayList<Sponsor> sponsorArrayList;

    ArrayList<Mechanic> mechanicArrayList;

    public Transport(String brand, String model, double engine) {
        this.brand = ValidateUtil.validateString(brand);
        this.model = ValidateUtil.validateString(model);
        this.engineVolume = engine;
        this.mechanicArrayList = new ArrayList<>();
        this.sponsorArrayList = new ArrayList<>();

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

    public ArrayList<Sponsor> getSponsorArrayList() {
        return sponsorArrayList;
    }

    public ArrayList<Mechanic> getMechanicArrayList() {
        return mechanicArrayList;
    }
}

