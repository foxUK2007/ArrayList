package Transport;

public class Bus extends Transport implements Competing {
    public enum CapacityType {
        EXTRA_SMALL(10),
        SMALL(25),
        MEDIUM_DOWN_BOUND(40),
        MEDIUM_UPPER_BOUND(50),
        LARGE_DOWN_BOUND(60),
        LARGE_UPPER_BOUND(80),
        ESPECIALLY_LARGE_DOWN_BOUND(100),
        ESPECIALLY_LARGE_UPPER_BOUND(120);

        int capacityType;

        CapacityType(int capacityType) {
            this.capacityType = capacityType;
        }

        @Override
        public String toString() {
            return " " + capacityType;
        }
    }

    CapacityType capacityType;
    CapacityType capacityTypeTwo;

    private TransportType transportType;

    public Bus(String brand, String model, double engineVolume, CapacityType downBoundCapacityType,
               CapacityType upperBoundCapacityType) {
        super(brand, model, engineVolume);
        this.capacityType = downBoundCapacityType;
        this.capacityTypeTwo = upperBoundCapacityType;

    }

    public Bus(String brand, String model, double engineVolume, CapacityType capacityType) {
        super(brand, model, engineVolume);
        this.capacityType = capacityType;
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начал движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Автобус закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус на пит-стопе");
    }

    @Override
    public void bestTimeLap() {
        System.out.println("Лучшее время круга автобуса:...");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость автобуса:...");
    }

    @Override
    public String toString() {
        if (capacityTypeTwo == null) {
            return "Автобус " +
                    getBrand() +
                    getModel() +
                    " Вместимость: " + capacityType + " мест "
                    ;
        } else {
            return "Автобус " +
                    getBrand() +
                    getModel() +
                    " Вместимость от " + capacityType + " до "
                    + capacityTypeTwo + " мест "
                    ;
        }
    }

    @Override
    public void printType() {
        if (transportType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(transportType);
        }
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }
}