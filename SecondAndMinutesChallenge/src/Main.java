public class Main {
    private static final String INVALID_VALID_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        System.out.println(getDuration(61, 2));
        System.out.println(getDurationSeconds(3600));
    }
    private static String getDuration(long minutes, long seconds){
        if(minutes < 0 || seconds < 0 || seconds >59){
            return INVALID_VALID_MESSAGE;
        }
        long hours = minutes / 60;
        minutes = minutes % 60;

        //bonus challenge
       String hoursString = hours + " h ";
       if(hours < 10){
           hoursString = "0" + hoursString;
       }
        String minutesString = minutes + " m ";
        if(minutes < 10){
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + " s ";
        if(seconds < 10){
            secondsString = "0" + secondsString;
        }

        return hoursString + minutesString + secondsString;
    }

    private static String getDurationSeconds(long seconds){
        if(seconds < 0){
            return INVALID_VALID_MESSAGE;
        }
        long minutes = seconds / 60;
        seconds = seconds % 60;
        return getDuration(minutes, seconds);
    }
}