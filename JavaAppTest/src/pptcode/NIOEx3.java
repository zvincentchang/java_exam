package pptcode;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;

public class NIOEx3 {

    public static void main(String... args) throws IOException  {
        Path file = Paths.get("C:\\sample\\newFile.txt");
        BasicFileAttributeView basicView = Files.getFileAttributeView(file, BasicFileAttributeView.class);
        BasicFileAttributes basicAttrs = basicView.readAttributes();
        FileTime newTime = FileTime.fromMillis(basicAttrs.lastModifiedTime().toMillis() + 60000);
        basicView.setTimes(newTime, null, null);

        UserDefinedFileAttributeView userView = Files.getFileAttributeView(file, UserDefinedFileAttributeView.class);

        String attribName  = "ª©Åv";
        String attribValue = "´ú¸Õª©¥»";
        userView.write(attribName, Charset.defaultCharset().encode(attribValue));

        List<String> attribList = userView.list();
        for (String s : attribList) {
            System.out.print(String.format("User defined attribute: %s", s));
            ByteBuffer buf = ByteBuffer.allocate(userView.size(s));
            userView.read(s, buf);
            buf.flip();
            String value = Charset.defaultCharset().decode(buf).toString();
            System.out.println(String.format("; value: %s", value));
        }
    }
}
