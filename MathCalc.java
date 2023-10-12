public class MathCalc {
    public static void main(String[] args) {
        double earthDiameterMiles = 7600;
        double sunDiameterMiles = 865000;

        double earthRadiusMiles = earthDiameterMiles / 2.0;
        double sunRadiusMiles = sunDiameterMiles / 2.0;

        double earthVolumeCubicMiles = (4.0/3.0) * Math.PI * Math.pow(earthRadiusMiles, 3);
        double sunVolumeCubicMiles = (4.0/3.0) * Math.PI * Math.pow(sunRadiusMiles, 3);

        double volumeRatioSunToEarth = sunVolumeCubicMiles / earthVolumeCubicMiles;

        System.out.println("The volume of the Earth is " + earthVolumeCubicMiles + " cubic miles, the volume of the sun is " + sunVolumeCubicMiles + " cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is " + volumeRatioSunToEarth + ".");
    }
}