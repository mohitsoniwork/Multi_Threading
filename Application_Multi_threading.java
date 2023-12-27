class Application_Multi_threading {
    public static void main (String args[]) {
        One o= new One();
        o.start();
        Two t = new Two();
        t.start();
        Three th = new Three();
        th.start();
        for(int i = 1; i<=10; i++) {
            System.out.println("I Am Main");
        }

    }
}