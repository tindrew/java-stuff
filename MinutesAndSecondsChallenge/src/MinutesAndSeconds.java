import org.w3c.dom.ls.LSOutput;

public class MinutesAndSeconds {

    public static String getDurationString (int minutes, int seconds) {

        int hours = minutes / 60;
        long totalMinutes = minutes % 60;

        if (minutes < 0 || seconds  < 0 || seconds > 59 ) {
            return "invalid Value";
        } else {
            String hoursString = hours + "h";
            if(hours < 10) {
                hoursString = "0" + hoursString;
            }

            String minutesString = hours + "h";
            if(hours < 10) {
                minutesString = "0" + hoursString;
            }
            return hours + "H " + totalMinutes + "M " + seconds + "S";
        }

    }


    public static String getDurationString ( int seconds) {

        int mins = seconds /60;
        int remainingSeconds = seconds % 60;

        if (seconds < 0) {
            System.out.println("invalidValue");
            return "invalid Value";
        } else {
            return getDurationString(mins, remainingSeconds);
        }
    }


}

