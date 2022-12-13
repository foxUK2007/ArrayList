import java.util.HashSet;
import java.util.Set;

public class RunPassport {
    public static void main(String[] args) {
        Set<Passport> passports = new HashSet<>();
        passports.add(new Passport("3709 854789", "Арсений", "Николаевич", "Быков", "25.10.1974"));
        passports.add(new Passport("3079 547962", "Петр", "Семенович", "Иванов", "31.12.1980"));
        passports.add(new Passport("3789 214782", "Иван", "Константинович", "Банщиков", "01.02.1985"));

        PassportList passportList = new PassportList(passports);
        System.out.println(passportList);
    }

}
