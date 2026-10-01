public class BankingApplication {

    static class BankTask implements Runnable {
        private String activity;
        private int delay;

        BankTask(String activity, int delay) {
            this.activity = activity;
            this.delay = delay;
        }

        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName()
                        + " - " + activity + " - Execution " + i);
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread transaction = new Thread(
                new BankTask("Transaction Processing", 1000));
        Thread balance = new Thread(
                new BankTask("Balance Updating", 1500));
        Thread sms = new Thread(
                new BankTask("SMS Notification", 2000));

        transaction.setName("Transaction Thread");
        balance.setName("Balance Thread");
        sms.setName("SMS Thread");

        transaction.start();
        balance.start();
        sms.start();
    }
}
