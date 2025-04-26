package Level1;

public class RegularExpression {
    public static void main(String[] args) {
        String s = "$#@%GSDFG$%$#@342543fgsfdgdf";
        System.out.println(s.replaceAll("[^a-zA-Z0-9]",""));
    }
}
