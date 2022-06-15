package J03040;

public class test {
    public static void main(String[] args) {
        System.out.println(checktangdan("12345"));
        System.out.println(checkbangnhau("3333"));
        System.out.println(checklocphat("8066"));
    }
    static boolean checktangdan(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) - '0' >= s.charAt(i + 1) - '0')
                return false;
        }
        return true;
    }
    static boolean checkbangnhau(String s) {
        int n = s.charAt(0) - '0';
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) - '0' != n)
                return false;
        }
        return true;
    }
    static boolean checklocphat(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '6' && s.charAt(i) != '8')
                return false;
        }
        return true;
    }
}
