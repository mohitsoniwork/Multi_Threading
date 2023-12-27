class Demo_Runnable_Multi_Threading {
    public static void main (String args[]) {
        One1 o= new One1();
        Thread t1= new Thread(o);
        t1.start();
        Two2 t2= new Two2();
        Thread th2= new Thread(t2);
        th2.start();
        Three3 th3 = new Three3();
        Thread t3 = new Thread(th3);
        t3.start();
        for(int i=1; i<=10; i++) {
            System.out.println("I am Main");
        }
    }
}