public class Zoo {
    public static void pause() {
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {}
        System.out.println("Thread finished!");
    }

    public static void main(String[] unused) {
        var job = new Thread(() -> pause());

        //for snippet 5

//        job.setDaemon(true);

        job.start();
        System.out.println("Main method finished!");
    }
}
