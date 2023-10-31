package app;

public class Main {
    static String productName;
    static int days;
    static double sales;
    static double totalSales;
    private final static String CURRENCY = "EUR";

    public static void main(String[] args) {
        productName = "smartphone";
        days = 5;
        totalSales = 12153.41;
        sales = totalSales / days;
        System.out.printf("Product No 1: %s," +
                        "%ntotal sales for %d days is %s %.2f," +
                        "%nsales by day is %s %.2f.%n",
                productName, days, CURRENCY, totalSales, CURRENCY, sales);

        productName = "laptop";
        days = 7;
        totalSales = 10486.85;
        sales = totalSales / days;
        System.out.printf("Product No 2: %s," +
                "%ntotal sales for %d days is %s %.2f," +
                "%nsales by day is %s %.2f.%n",
                productName, days, CURRENCY, totalSales, CURRENCY, sales);

    }
}
