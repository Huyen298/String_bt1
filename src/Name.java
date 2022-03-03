import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Name {
    private static final String Example_REGEX = "^[CAP][a-zA-z0-9]{4}([GHIKLM])$";

    public Name() {
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(Example_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
