// Q314
package threads;
public class Q314 {
    // internet nahi hai isliye websites ke naam hi le rahe hai (nakli crawler)
    static class Crawler extends Thread {
        String site;
        int delay;
        Crawler(String site, int delay){
            this.site = site;
            this.delay = delay;
        }
        public void run(){
            try{ Thread.sleep(delay); }catch(Exception e){}
            System.out.println(getName()+" crawled "+site);
        }
    }
    public static void main(String[] args) throws Exception {
        String sites[] = {"site-a.com","site-b.com","site-c.com","site-d.com"};
        Crawler c[] = new Crawler[sites.length];
        for(int i=0;i<sites.length;i++){
            c[i] = new Crawler(sites[i], (i+1)*100);
            c[i].setName("Thread-"+(i+1));
            c[i].start();      // sab ek saath chalte hai
        }
        for(int i=0;i<c.length;i++)
            c[i].join();
        System.out.println("All websites have been crawled");
    }
}
