public class main {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(12, 12);


    }


    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        double centimeters = inches / 2.54;
        double feetToInches = (double) feet / 12;
        if (feet < 0 || inches < 0 || inches > 12) {
            return -1;
        } else if (feet >= 0) {
            return feetToInches;
        }
        return feetToInches;
    }
+
}

