package software.ulpgc.kata3;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.IntervalXYDataset;

import javax.swing.*;

public class JFreeCharthistogramDisplay extends JPanel implements HistogramDisplay{
    @Override
    public void show(String title, String xTitle, String yTitle, double[] originalData, int bins) {
        JFreeChart histogram = ChartFactory.createHistogram(
                title,
                xTitle,
                yTitle,
                dataSetFrom(originalData, bins),
                PlotOrientation.VERTICAL,
                false,false,false);
        add(new ChartPanel(histogram));
    }

    private HistogramDataset dataSetFrom(double[] originalData, int bins) {
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("s", originalData, bins);
        return dataset;
    }
}
