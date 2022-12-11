package Transport;

public class DriverD extends Driver<Bus> {

    public DriverD(String fullName, int drivingExperience, Bus car) {
        super(fullName, "D", drivingExperience, car);
    }

    @Override
    public void diagnostic() throws WrongTypeLicence {
        System.out.println("Водитель автобуса " + this.getFullName() + " в диагностике не требуется");;
    }
}
