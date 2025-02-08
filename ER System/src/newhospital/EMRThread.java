package newhospital;

public class EMRThread extends Thread {
    private Runnable task;

    public EMRThread(Runnable task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.run();
    }
}
