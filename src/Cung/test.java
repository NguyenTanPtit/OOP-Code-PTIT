package Cung;

public class test {

    // Driver method to test above methods
    public static void main(String[] args)
    {
        System.out.println(EvaluateString.
                evaluate("10 + 2 * 6"));
        System.out.println(EvaluateString.
                evaluate("100 * 2 + 12"));
        System.out.println(EvaluateString.
                evaluate("100 * ( 2 + 12 )"));
        System.out.println(EvaluateString.
                evaluate("100 * ( 2 + 12 ) / 14"));
        System.out.println(EvaluateString.
                evaluate("5 % 2"));
    }
}
