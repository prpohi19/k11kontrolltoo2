package eu.j2rvaservud;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        getLineFromFile("joon.txt");
    }

    public static double[] getLineFromFile(String filename) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filename));
        String[] parts = lines.get(0).split(" ");

        double a = Double.parseDouble(parts[0]);
        double b = Double.parseDouble(parts[1]);

        LineInterface line;

        if (b == 0) {
            line = new LineMultiplied(a);
        } else {
            line = new LinearFunction(a, b);
        }
        System.out.println(line.toString() + "\n");

        int start = Integer.parseInt(parts[2]);
        int end = Integer.parseInt(parts[3]);

        double[] xs = IntStream.rangeClosed(start, end).asDoubleStream().toArray();
        double[] ys = findAllY(xs, line);

        for (int i = 0; i < xs.length; i++) {
            System.out.println("x = " + xs[i] + " | y = " + ys[i]);
        }
        return ys;
    }

    public static double[] findAllY(double[] xs, LineInterface line) {
        double[] ys = new double[xs.length];
        for (int i = 0; i < xs.length; i++) {
            ys[i] = line.findY(xs[i]);
        }
        return ys;
    }
}
