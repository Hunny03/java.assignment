// Q248
package interfaces;
public class Q248 {
    interface Encryptable {
        String encrypt(String data);
        String decrypt(String data);
    }
    // asli AES/RSA bahut bade hote hai, yaha naam wahi hai par chhota sa logic hai
    static class AES implements Encryptable {
        public String encrypt(String data){
            String n = "";
            for(int i=0;i<data.length();i++)
                n = n + (char)(data.charAt(i)+5);
            return n;
        }
        public String decrypt(String data){
            String n = "";
            for(int i=0;i<data.length();i++)
                n = n + (char)(data.charAt(i)-5);
            return n;
        }
    }
    static class RSA implements Encryptable {
        // chhota RSA: n=3233, e=17, d=2753
        long power(long b, long e){
            long r = 1;
            for(long i=0;i<e;i++)
                r = (r*b)%3233;
            return r;
        }
        public String encrypt(String data){
            String n = "";
            for(int i=0;i<data.length();i++)
                n = n + power(data.charAt(i),17) + " ";
            return n.trim();
        }
        public String decrypt(String data){
            String p[] = data.split(" ");
            String n = "";
            for(int i=0;i<p.length;i++)
                n = n + (char)power(Long.parseLong(p[i]),2753);
            return n;
        }
    }
    public static void main(String[] args) {
        Encryptable e[] = {new AES(), new RSA()};
        String s = "Hello Java";
        for(int i=0;i<e.length;i++){
            String en = e[i].encrypt(s);
            System.out.println("Encrypted: "+en);
            System.out.println("Decrypted: "+e[i].decrypt(en));
        }
    }
}
