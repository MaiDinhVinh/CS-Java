public class test {
//    public static void main(String[] args) throws Exception {
//        Thread t = new Thread(() -> {
//            while (true) { // không kiểm tra interrupt
//                System.out.println("hello world");
//            }
//        });
//
//        t.start();
//        Thread.sleep(100);
//        t.interrupt(); // gửi yêu cầu dừng
//
//        System.out.println("Interrupted sent, state = " + t.getState());
//        // Thread vẫn chạy mãi (vì không ai đọc interrupt flag)
//    }

//    public static void main(String[] args) throws Exception {
//        Thread t = new Thread(() -> {
//            while (!Thread.currentThread().isInterrupted()) {
//                // giả lập CPU work
//            }
//            System.out.println("I saw the interrupt flag -> exit loop");
//        });
//
//        t.start();
//        Thread.sleep(100);
//        t.interrupt(); // đặt interrupt flag
//
//        t.join();
//        System.out.println("Main done");
//    }
}
