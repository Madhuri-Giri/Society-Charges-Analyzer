package balajiconstruction;

import java.util.Scanner;

public class Invoice {

    public static void printInvoice(String sector) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length = ");
        double userLength = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Breadth = ");
        double userBeradth = sc.nextDouble();
        sc.nextLine();

        Plot plot = new Plot(userLength, userBeradth, sector);

        System.out.println("Sector Name " + plot.getSectorName());
        System.out.println("Area " + plot.getPlotArea(userLength, userBeradth));
        System.out.println("Total Price " + Operations.totalPlotPrice(plot.getPlotArea(userLength, userBeradth), plot.getSectorName()));
        System.out.println("Total Registry Price " + Operations.getRegistryCharges("Female", plot.getPlotArea(userLength, userBeradth), plot.getSectorName()));
        System.out.println("Total GreenTax " + Operations.getTotalGreenTax(Operations.totalPlotPrice(plot.getPlotArea(userLength, userBeradth), plot.getSectorName())));
        System.out.println("Society Development " + Operations.totalSocietyCharges(plot.getSectorName()));
        System.out.println("Parking Development " + Operations.totalParkingCharges(plot.getSectorName()));
        System.out.println("Safai Tax " + Operations.getTotalSafaiTax());
        double GTotal = Operations.totalPlotPrice(plot.getPlotArea(userLength, userBeradth), plot.getSectorName()) + Operations.getRegistryCharges("Female", userBeradth, plot.getSectorName()) + Operations.getTotalGreenTax(Operations.totalPlotPrice(plot.getPlotArea(userLength, userBeradth), plot.getSectorName())) + Operations.totalSocietyCharges(plot.getSectorName()) + Operations.totalParkingCharges(plot.getSectorName()) + Operations.getTotalSafaiTax();
        System.out.println("Total Price " + GTotal);
    }
}
