package balajiconstruction;

import java.util.Scanner;

public class BalajiConstruction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sector(Only From A, B, C) = ");
        String sector = sc.next();
        if (sector.equalsIgnoreCase("A") || sector.equalsIgnoreCase("B") || sector.equalsIgnoreCase("C")) {
            Invoice.printInvoice(sector);
        } else {
            System.out.println("Enter Valid Input");
        }

    }

}
