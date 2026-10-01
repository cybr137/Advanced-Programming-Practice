public class OnlineExaminationSystem {

    static class ExamTask implements Runnable {
        private String activity;
        private int delay;

        ExamTask(String activity, int delay) {
            this.activity = activity;
            this.delay = delay;
        }

        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName()
                        + " - " + activity);
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread time = new Thread(new ExamTask("Displaying remaining time", 1000));
        Thread save = new Thread(new ExamTask("Auto-saving student answers", 1500));
        Thread network = new Thread(new ExamTask("Checking network connection", 2000));

        time.setName("Time Thread");
        save.setName("Auto-Save Thread");
        network.setName("Network Thread");

        time.start();
        save.start();
        network.start();
    }
}
