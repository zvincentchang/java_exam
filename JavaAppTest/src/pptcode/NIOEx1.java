package pptcode;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOEx1 {

    public static void main(String... args) {
        Path path = Paths.get("C:\\home\\test\\example");
        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0, 2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());

        System.out.format("%n");
        Path p = Paths.get("C:\\home\\test\\.\\..\\foo1");
        System.out.println(p.normalize());
        System.out.format("p.getNameCount: %d%n", p.getNameCount());

        System.out.format("%n");

        Path p1 = Paths.get("home");
        Path p2 = Paths.get("home/test/example");
        Path p1_p2 = p1.relativize(p2);
        System.out.println(p1_p2);
        Path p2_p1 = p2.relativize(p1);
        System.out.println(p2_p1);

        System.out.format("%n");

        Path p3 = Paths.get("C:\\home\\test\\example");
        System.out.format("%s%n", p3.resolve("bar"));

        System.out.format("%n");
        Path p4 = Paths.get("bar");
        System.out.format("%s%n", p4.resolve("C:\\home\\test\\example"));

        System.out.format("%n");
        Path ps = Paths.get("C:\\home\\test\\example");
        System.out.format("%s%n", ps.resolveSibling("bar"));
    }
}
