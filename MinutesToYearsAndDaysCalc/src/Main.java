public class Main {
    public static void main(String[] args) {
        printYearsAndDays(525600);
    }
    public static void printYearsAndDays (long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hour =  minutes / 60;
            long day = minutes / (24 * 60);
            long remainingDays = day % 365;
            long year = day / 365;

            System.out.println(minutes + " min = "+ year + " y " + "and " + remainingDays + " d" );
        }

    }
}
