package lesson4;

public class MFU {
    static Object printLock = new Object();
    static Object scanLock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread copyMan = new Thread(new Runnable() {
            @Override
            public void run() {
                copy("doc3", 5);
            }
        });
        Thread printMan = new Thread(new Runnable() {
            @Override
            public void run() {
                print("doc", 5);

            }
        });
        Thread scanMan = new Thread(new Runnable() {
            @Override
            public void run() {
                scan("docscan",5);
            }
        });
        copyMan.start();
        copyMan.join();
        printMan.start();
        printMan.join();
        scanMan.start();
        scanMan.join();
    }

    private static void scan(String doc, int b) {
        System.out.println("scanMan sent the document to scan");
        synchronized (scanLock){
            System.out.println("Document"+ doc + "scanning");
            for (int i = 0; i<b; i++){
                System.out.println(i +" "+ doc);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Scan finished");
    }

    private static void print(String doc, int n) {
        System.out.println("printMan sent the document to print");
        synchronized (printLock){
            System.out.println("Document printing");
            for (int i = 0; i<n; i++){
                System.out.println(i +" "+doc);

            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Print finished");
    }

    private static void copy(String doc, int c){
        System.out.println("copyMan sent the document to copy");
        synchronized (scanLock){
            System.out.println("copy run");
            for (int i = 0; i<c; i++){
                String copyDoc = doc;
                System.out.println(i+" "+ copyDoc);

            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
