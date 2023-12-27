


class One extends Thread{
    public void run() {
        for (int i=1;i<=10;i++) {
            System.out.println("I Am First");
        }
    }
}
class Two extends Thread {
    public void run() {
        for( int i=1;i<=10;i++){
            System.out.println("I Am Second");
        }
    }
}
class Three extends Thread {
    public void run() {
        for(int i=1; i<=10; i++) {
            System.out.println("I Am Third");
        }
    }
}
