import java.util.Objects;

public class Passport {

    private String number;

    private String firstName;

    private String patronymicName;

    private String lastName;

    private String birthDay;

    public Passport(String number, String firstName, String patronymicName, String lastName, String birthDay) {
        this.number = number;
        this.firstName = firstName;
        this.patronymicName = patronymicName;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Паспорт № " + number +
                ", на имя " + firstName +
                patronymicName +
                lastName +
                ", родившегося " + birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return number.equals(passport.number) && Objects.equals(firstName, passport.firstName) && Objects.equals(patronymicName, passport.patronymicName) && Objects.equals(lastName, passport.lastName) && Objects.equals(birthDay, passport.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, firstName, patronymicName, lastName, birthDay);
    }
}
