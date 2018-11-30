package pptcode;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NIOEx2 {

    public static void main(String... args) throws IOException {
        Path file = Paths.get("C:\\sample\\newFile.txt");
        Path target = Paths.get("C:\\test\\test.txt");
        Files.copy(file, target, StandardCopyOption.REPLACE_EXISTING, LinkOption.NOFOLLOW_LINKS);

        Charset charset = Charset.forName("UTF-8");
        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (NoSuchFileException x) {
            System.err.format("No such file: %s", x.getFile());
        } catch (IOException x) {
            System.err.println(x);
        }
    }
}

class TmpTest {

    public static void main(String... args) {
        try {
            Path tempFile1 = Files.createTempFile(null, ".myapp");
            Path tempFile2 = Files.createTempFile("mz", ".myapp");

            System.out.format("The temporary file: %s%n", tempFile1);
            System.out.format("The temporary file: %s%n", tempFile2);
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}


