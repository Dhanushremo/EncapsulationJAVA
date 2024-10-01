public class MultiThreadingMethods {

    public static void main(String[] args) {
        Thread mainThread=Thread.currentThread();
        System.out.println(mainThread);
        mainThread.setName("Hai");
        System.out.println(mainThread.getName());
        Thread t=Thread.currentThread();
          t.setName("Remo");
          t.setPriority(9);
          System.out.println(t);
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t.getThreadGroup());
        System.out.println(t.getId());
    }
}
