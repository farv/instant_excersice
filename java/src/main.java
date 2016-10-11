public class test{
    
    private static String toEncode = "Hola mundo";
    private static String toDecode = "⍢⍙⍙⍙⍙⍙⍙⍢⍢⍢⍢⍙⍢⍢⍢⍢⍙⍙⍢⍢⍙⍢⍢⍢⍢⍙⍢⍢⍢⍢⍢⍢⍙"
    +"⍙⍢⍙⍙⍙⍢⍙⍢⍢⍢⍢⍙⍢⍙⍢⍢⍙⍙⍢⍙⍙⍢⍢⍢⍢⍢⍢⍙⍙⍙⍢⍙⍙⍙⍢⍙⍢⍢⍢⍙⍢⍢⍢⍙⍢⍢⍢⍢⍙⍢";
    
    public static void main (String[] args){
        System.out.println("A test of a string we want to encode:");
        System.out.println(toEncode);
        System.out.println("It is code to:");
        System.out.println(cipher.encode(toEncode));
        System.out.println("====================================");
        System.out.println("A test of a code we want to decode:");
        System.out.println(toDecode);
        System.out.println("It means:");
        System.out.println(cipher.decode(toDecode));
        System.out.println("====================================");
    }
}