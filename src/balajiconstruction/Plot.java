package balajiconstruction;

public class Plot {

    private double length;
    private double breadth;
    private String sectorName;

    public Plot(double length, double breadth, String sectorName) {
        this.length = length;
        this.breadth = breadth;
        this.sectorName = sectorName;
    }

//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public void setBreadth(double breadth) {
//        this.breadth = breadth;
//    }
//
//    public String getSectorName() {
//        return sectorName;
//    }
//
//    public void setSectorName(String sectorName) {
//        this.sectorName = sectorName;
//    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    @Override
    public String toString() {
        return "Plot{" + "length=" + length + ", breadth=" + breadth + ", sectorName=" + sectorName + '}';
    }

//    public Plot() {
//        length = 50;
//        breadth = 20;
//        sectorName = "A";
//    }
//
//    public Plot(double length) {
//        this.length = length;
//        breadth = 50;
//        sectorName = "B";
//    }
//
//    public Plot(double length, double breadth) {
//        this.length = length;
//        this.breadth = breadth;
//        sectorName = "C";
//    }
    public double getPlotArea(double length, double breadth) {
        return length * breadth;
    }

}
