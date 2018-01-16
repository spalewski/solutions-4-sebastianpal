package pl.coderstrust.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class IsIpAddress {

    private static Matcher matcher;
    private static Pattern pattern;

    String ipValidRegex = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
            "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public IsIpAddress() {
        pattern = Pattern.compile(ipValidRegex);
    }

    public static boolean isIpAddress(String adress) {

        matcher = pattern.matcher(adress);
        return matcher.matches();
    }
}