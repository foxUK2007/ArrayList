import Transport.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("Lada ", " Granta ", 1.7, Car.BodyType.SEDAN);
        Car car2 = new Car("Audi ", " A8 ", 3.0, Car.BodyType.COUPE);
        Car car3 = new Car("BMW ", " Z8 ", 3.0, Car.BodyType.COUPE);
        Car car4 = new Car("KIA ", " Sportage ", 2.4, Car.BodyType.CROSSOVER);

        Truck truck1 = new Truck("Scania", " G 440 A6x4NA", 13.0,
                Truck.LoadCapacity.N3);
        Truck truck2 = new Truck("DAF", " XF 460 4X2", 12.9,
                Truck.LoadCapacity.N2_DOWN_BOUND, Truck.LoadCapacity.N2_UPPER_BOUND);
        Truck truck3 = new Truck("VOLVO", " FH", 12.1,
                Truck.LoadCapacity.N1);
        Truck truck4 = new Truck("FORD", " F-MAX", 12.7,
                Truck.LoadCapacity.N3);

        Bus bus1 = new Bus("ПАЗ", "3237", 3.9,
                Bus.CapacityType.EXTRA_SMALL);
        Bus bus2 = new Bus("ЛиАЗ", "6213", 5.9,
                Bus.CapacityType.MEDIUM_DOWN_BOUND, Bus.CapacityType.MEDIUM_UPPER_BOUND);
        Bus bus3 = new Bus("КАвЗ", "4270", 5.9,
                Bus.CapacityType.LARGE_DOWN_BOUND, Bus.CapacityType.LARGE_UPPER_BOUND);
        Bus bus4 = new Bus("НЕФАЗ", "5299", 6.7,
                Bus.CapacityType.ESPECIALLY_LARGE_DOWN_BOUND, Bus.CapacityType.ESPECIALLY_LARGE_UPPER_BOUND);

        DriverB carDriverB = new DriverB("Сурков Олег Витальевич", 5, car2);
        DriverD busDriverD = new DriverD("Соколов Сергей Иванович", 20, bus4);
        DriverC truckDriverC = new DriverC("Гусев Богдан Яковлевич", 2, truck3);


        car1.setTransportType(TransportType.CAR);
        bus2.setTransportType(TransportType.BUS);
        truck2.setTransportType(TransportType.TRUCK);
        car3.printType();
        bus1.printType();
        truck1.printType();
        truck4.printType();


        ArrayList<Transport> allTransports = new ArrayList<>();
        allTransports.add(car2);
        allTransports.add(car1);
        allTransports.add(car3);
        allTransports.add(car4);
        allTransports.add(truck3);
        allTransports.add(truck1);
        allTransports.add(bus1);
        allTransports.add(bus3);
        allTransports.add(bus2);
        allTransports.add(bus4);

        Mechanic mechanic1 = new Mechanic("Семен Ключников", "ГСК №1", TransportType.CAR);
        Mechanic mechanic2 = new Mechanic("Федос Гаечкин", "Шараш-монтаж", TransportType.BUS);
        Mechanic mechanic3 = new Mechanic("Пантелей Балонников", "ГСК №2", TransportType.TRUCK);
        Mechanic mechanic4 = new Mechanic("Петр Непомнящий", "Гараж Виталика", TransportType.CAR);
        Mechanic mechanic5 = new Mechanic("Валера", "БОВИД", TransportType.TRUCK);
        Mechanic mechanic6 = new Mechanic("Кардан", "БОВИД", TransportType.BUS);
        Mechanic mechanic7 = new Mechanic("Леша Поворотников", "Газпром", TransportType.CAR);
        Mechanic mechanic8 = new Mechanic("Кирил Некурящий", "Газпром", TransportType.BUS);

        car1.getMechanicArrayList().add(mechanic1);
        car1.getMechanicArrayList().add(mechanic2);
        car1.getMechanicArrayList().add(mechanic3);
        car3.getMechanicArrayList().add(mechanic3);
        car3.getMechanicArrayList().add(mechanic4);
        car3.getMechanicArrayList().add(mechanic5);
        car3.getMechanicArrayList().add(mechanic6);
        truck1.getMechanicArrayList().add(mechanic7);
        truck3.getMechanicArrayList().add(mechanic8);

        Sponsor sponsor1 = new Sponsor("ГСК №1", 50_000);
        Sponsor sponsor2 = new Sponsor("Шараш-монтаж", 82_000);
        Sponsor sponsor3 = new Sponsor("ГСК №2", 48_000);
        Sponsor sponsor4 = new Sponsor("Гараж Виталика", 100_000);
        Sponsor sponsor5 = new Sponsor("Газпром", 10_000);
        Sponsor sponsor6 = new Sponsor("БОВИД", 10_000_000);

        car1.getSponsorArrayList().add(sponsor1);
        car1.getSponsorArrayList().add(sponsor2);
        car3.getSponsorArrayList().add(sponsor3);
       truck2.getSponsorArrayList().add(sponsor4);
        car4.getSponsorArrayList().add(sponsor5);
        truck2.getSponsorArrayList().add(sponsor6);

        for (Transport car : allTransports) {
            if (car.getMechanicArrayList().size() != 0) {
                System.out.println(car.getMechanicArrayList());
            }
            if (car.getSponsorArrayList().size() != 0) {
                System.out.println(car.getSponsorArrayList());
            }
        }

        ServiceStation<Transport> transportServiceStation = new ServiceStation<Transport>();
        transportServiceStation.addTransport(car2);
        transportServiceStation.addTransport(truck1);
        transportServiceStation.addTransport(truck3);
        transportServiceStation.addTransport(bus1);
        transportServiceStation.addTransport(car3);

        transportServiceStation.maintenance();

    }
}