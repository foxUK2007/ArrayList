package Transport;

public class Car extends Transport implements Competing {

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        WAGON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        final String title;

        BodyType(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return "BodyType{" + title + '}';
        }
    }

    BodyType bodyType;

    private TransportType transportType;

    @Override
    public void startMoving() {
        System.out.println("Легковый автомобиль начал движение");
    }

    @Override
    public void endMoving() {
        System.out.println("Легковый автомобиль закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Легковый автомобиль на пит-стопе");
    }

    @Override
    public void bestTimeLap() {
        System.out.println("Лучшее время круга легкового автомобиля:...");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость легкового автомобиля:...");
    }


    public Car(String brand, String model, double engineVolume, BodyType bodyType) {

        super(brand, model, engineVolume);
        this.bodyType = bodyType;

    }

    @Override
    public String toString() {
        return " Автомобиль "
                + getBrand() +
                getModel() +
                bodyType
                ;
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
