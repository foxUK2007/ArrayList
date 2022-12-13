package Transport;

public class ValidateUtil {

    public static String validateString(String needsValidate) {
        if (needsValidate != null && !needsValidate.isEmpty() && !needsValidate.isBlank()) {
            return needsValidate;
        } else {
            return "default";
        }
    }
}
