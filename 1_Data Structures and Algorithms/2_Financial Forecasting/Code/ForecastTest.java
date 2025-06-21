public class ForecastTest {
    public static void main(String[] args) {
        double presentValue = 10000;
        double growthRate = 0.10;
        int years = 5;

        double result = Forecast.futureValue(presentValue, growthRate, years);
        System.out.printf("Recursive Future Value after %d years: Rs.%.2f\n", years, result);

        double optimized = Forecast.optimizedFutureValue(presentValue, growthRate, years);
        System.out.printf("Optimized Future Value after %d years: Rs.%.2f\n", years, optimized);
    }
}
