public class main {

    public static void main(String[] args) {

<<<<<<< HEAD
        double CentimeterAmount = calcFeetAndInchesToCentimeters(12, 12);
        System.out.println("The amount of Centimeters is " + CentimeterAmount);
        calcFeetAndInchesToCentimeters(100);

    }


    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        int feetToInches =  (feet * 12) + inches;
        double feetToCentimeters = feetToInches * 2.54;
        if(feet >= 0 && inches >=0 && inches <= 12) {
            System.out.println(feetToCentimeters);
            return feetToCentimeters;
        } else  {
            System.out.println("invalid number");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {

        double feetToCentimeters = inches * 2.54;
        if(inches >=0) {
            System.out.println(feetToCentimeters);
            return feetToCentimeters;
        } else  {
            System.out.println("invalid number");
            return -1;
        }
    }



=======
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
>>>>>>> e1a7654ab52b28a4a15d530ec1b35ca0329e2d70
}

