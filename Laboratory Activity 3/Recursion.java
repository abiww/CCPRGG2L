public class Recursion {
    public static void main(String[] args) {
        System.out.println(act1(126));
        System.out.println(act2("abigail"));
        System.out.println(act3(10));
        System.out.println(act4("hexxxllo"));
    }
    
    public static int act1 (int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + act1(n / 10);
        }
    }
    
    public static String act2 (String s) {
        if(s.length() <= 1) {
            return s;
        }
            return s.charAt(0) + "*" + act2(s.substring(1));
        }
    
    public static int act3 (int n) {
        if(n == 0) {
            return 0;
        } 
        else {
            return 2 + act3(n-1);
        }
    }
        
           
    public static String act4 (String x) {
        if (x.equals("")){
            return "";
        }
        if (x.charAt(0)=='x'){
            return "y" + act4(x.substring(1));
        }
        return x.charAt(0) + act4(x.substring(1));
    }
}
