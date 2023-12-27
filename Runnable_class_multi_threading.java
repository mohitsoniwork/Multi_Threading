class One1 implements Runnable {
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.println("I am first");
        }

    }
}
class Two2 implements Runnable {
    public void run() {
        for( int i=1;i<=10;i++) {
            System.out.println("I am Second");
        }
    }
}
class Three3 implements Runnable {
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.println("I am Third");
        }
    }
}
