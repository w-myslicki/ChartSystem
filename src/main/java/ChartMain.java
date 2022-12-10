import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

import java.io.IOException;
import java.util.Random;

public class ChartMain {
    public static void main(String[] args) throws IOException {

        double[] xData = new double[5];
        double[] yData = new double[5];

        for (int i = 1; i < 5; i++) {
            initX(i, xData);
            initY(i, yData);
        }
        startDisplay(xData, yData);
    }

    private static void initX(int i, double[] xData) {
        Random randomX = new Random();
        xData[i] = (3 * (Math.pow(randomX.nextInt(5), 2))) + 3;
    }

    private static void initY(int i, double[] yData) {
        Random randomY = new Random();
        yData[i] = (double) ((1 / 4) * (Math.pow(randomY.nextInt(5), 4))) + (6 * (Math.pow(randomY.nextInt(5), 2))) + 2;
    }

    private static void startDisplay(double[] xData, double[] yData) {
        XYChart chart = QuickChart.getChart("Chart", "X", "Y", "Y(X)", xData, yData);
        new SwingWrapper(chart).displayChart();
    }
}
