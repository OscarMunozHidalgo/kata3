package software.ulpgc.kata3;

import org.jfree.chart.ChartFactory;
import software.ulpgc.kata2.*;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        List<Water> data = new CsvFileWaterLoader(new File("water_potability.csv")).load();
        double[] finalData = data.stream().mapToDouble(Main::waterToDouble).toArray();
        mainFrame.getHistogramDisplay().show(
                "HistogramDisplay",
                "Hardness",
                "Frequency",
                finalData,
                50);
        mainFrame.setVisible(true);
    }

    private static double waterToDouble(Water water) {
        return (double) water.getHardness();
    }
}
