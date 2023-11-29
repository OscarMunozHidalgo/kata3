package software.ulpgc.kata3;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private HistogramDisplay histogramDisplay;

    public MainFrame() throws HeadlessException {
        this.setTitle("Histogram Viewer");
        this.setSize(1000,800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(createHistogramDisplay());
    }

    private Component createHistogramDisplay() {
        JFreeCharthistogramDisplay display = new JFreeCharthistogramDisplay();
        this.histogramDisplay = display;
        return display;
    }

    public HistogramDisplay getHistogramDisplay(){
        return this.histogramDisplay;
    }
}
