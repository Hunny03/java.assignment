// Q028
package functions;
public class Q028 {
    // FV = P * (1 + r/1200)^(12*saal)
    static double futureVal(double p, double r, int saal){
        double m = r/1200;
        return p*Math.pow(1+m, saal*12);
    }
    public static void main(String[] args) {
        System.out.println("Years   Future Value");
        for(int i=1;i<=5;i++)
            System.out.println(i+"       "+futureVal(10000,6.5,i));
    }
}
