package lesson8.util;

public final class StringUtil {
    private StringUtil() {
    }

    public static String multiplyString(String s, int n) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append(s);
        }
        return stringBuffer.toString();
    }
}
