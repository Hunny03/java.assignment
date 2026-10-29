// Q307
package exceptions;
public class Q307 {
    public static void main(String[] args) {
        String a[] = {"25","abc","0","7"};
        int b[] = new int[3];
        for(int i=0;i<a.length;i++){
            try{
                int n = Integer.parseInt(a[i]);
                System.out.println("100/"+n+" = "+(100/n));
                b[n] = n;      // bada number hua to index error aayega
            }
            catch(NumberFormatException e){
                System.out.println("NumberFormatException: "+a[i]+" is not a number");
            }
            catch(ArithmeticException e){
                System.out.println("ArithmeticException: division by zero");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException: "+e.getMessage());
            }
        }
    }
}
