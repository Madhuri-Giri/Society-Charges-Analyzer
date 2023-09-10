package balajiconstruction;

public class Operations {

    public static double totalPlotPrice(double area, String sectorName) {
        if (sectorName.equalsIgnoreCase("A")) {
            return area * Rate.sectorARate;
        } else if (sectorName.equalsIgnoreCase("B")) {
            return area * Rate.sectorBRate;
        } else if (sectorName.equalsIgnoreCase("C")) {
            return area * Rate.sectorCRate;
        } else {
            return 0;
        }
    }

    public static double getRegistryCharges(String gender, double area, String sectorName) {
        double totalPrice;
        if (gender.equalsIgnoreCase("Male")) {
            totalPrice = totalPlotPrice(area, sectorName);
            double temp = totalPrice * Rate.registryChargesMalePercentage;
            double registryCharges = temp / 100;
            return registryCharges;
        } else if (gender.equalsIgnoreCase("Female")) {
            totalPrice = totalPlotPrice(area, sectorName);
            double temp = totalPrice * Rate.registryChargesFemalePercentage;
            double registryCharges = temp / 100;
            return registryCharges;
        } else if (gender.equalsIgnoreCase("Others")) {
            totalPrice = totalPlotPrice(area, sectorName);
            double temp = totalPrice * Rate.registryChargesFemalePercentage;
            double registryCharges = temp / 100;
            return registryCharges;
        } else {
            return 0;
        }
    }

    public static double getTotalGreenTax(double totalPlotPrice) {
        double greenTax = (totalPlotPrice * Rate.greenTaxPercentage) / 100;
        return greenTax;
    }

    public static double getTotalSafaiTax() {
        return Rate.safaiTaxYearlyAmount * 3;
    }

    public static double totalSocietyCharges(String sectorName) {
        if (sectorName.equalsIgnoreCase("A")) {
            return Rate.societyDevelopmentAmountA;
        } else if (sectorName.equalsIgnoreCase("B")) {
            return Rate.societyDevelopmentAmountB;
        } else if (sectorName.equalsIgnoreCase("C")) {
            return Rate.societyDevelopmentAmountC;
        } else {
            return 0;
        }
    }

    public static double totalParkingCharges(String sectorName) {
        if (sectorName.equalsIgnoreCase("A")) {
            return Rate.parkingDevelopmentA;
        } else if (sectorName.equalsIgnoreCase("B")) {
            return Rate.parkingDevelopmentB;
        } else if (sectorName.equalsIgnoreCase("C")) {
            return Rate.parkingDevelopmentC;
        } else {
            return 0;
        }
    }
}
