public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = Math.PI;
        double volumeKm = (4.0 / 3) * pi * Math.pow(radiusKm, 3);
        double volumeMiles = volumeKm * 0.2399;
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
                " and cubic miles is " + volumeMiles);
    }
}
