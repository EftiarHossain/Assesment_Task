package utils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileHelper {
    public static String generateScreenshotFilePath(String baseName) {
        // Create screenshot folder if it doesn't exist
        File screenshotDir = new File("./AssertionError");
        if (!screenshotDir.exists()) {
            screenshotDir.mkdirs();
        }

        // Create unique file name with timestamp
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        return "./AssertionError/" + baseName + "_" + timeStamp + ".png";
    }
}
