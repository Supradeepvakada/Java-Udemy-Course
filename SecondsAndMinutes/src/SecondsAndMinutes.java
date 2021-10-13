public class SecondsAndMinutes {
    private static final String INVALID_VALUE_MESSAGE="Invalid Value";
    public static void main(String[] args) {
        System.out.println(getdurationString(65,45));
        System.out.println(getdurationstring(4000));
        System.out.println(getdurationstring(-40));
        System.out.println(getdurationString(65,9));
    }
    public static String getdurationString(long minutes, long seconds){
        if (minutes<0 || (seconds<0 || seconds>59)){
            return INVALID_VALUE_MESSAGE;
        }
        long hours= minutes/60;
        long remainingminutes= minutes%60;
        return hours + "hr " + remainingminutes + "min " + seconds + "s";
    }

    public static String getdurationstring(long seconds){
        if (seconds<0){
            return INVALID_VALUE_MESSAGE;
        }
        long minutes=seconds/60;
        long remainingseconds=seconds%60;
        return getdurationString(minutes,remainingseconds);
    }
}
