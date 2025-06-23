package utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SoftAssertCollector {
    private static final List<AssertionError> errors = new ArrayList<>();

    public static void addError(AssertionError e) {
        errors.add(e);
    }

    public static void assertAll() {
        if (!errors.isEmpty()) {
            AssertionError combined = new AssertionError("Multiple assertion failures:");
            errors.forEach(combined::addSuppressed);
            errors.clear();
            throw combined;
        }
    }
}