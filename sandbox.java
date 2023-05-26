
public class sandbox {
    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(s.substring(1));
    }

    public static String iterarEMacetar(String[] sAr) {
        String r="";
        for(String s: sAr){
            r += s + " ";
        }
        return r;
    }
}
