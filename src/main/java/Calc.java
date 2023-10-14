public class Calc {
    public String sum(String a, String b) {
        String result = "";
        Integer c = Integer.valueOf(a);
        Integer d = Integer.valueOf(b);
        result = Integer.toString(c + d);
        return result;
    }
}
