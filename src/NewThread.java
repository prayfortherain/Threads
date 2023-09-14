import javax.lang.model.element.Name;

public class NewThread implements Runnable {
    //Ссылка на объект потока
    Thread thread;
    public NewThread(String threadName) {
        // Создание объекта потока
        thread = new Thread(this, threadName);
        System.out.println(thread);
        // Запуск потока
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Дочерний поток запущен" + thread.getName());
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Дочерний поток прерван");
            }
        }
        System.out.println("Дочерний поток завершен");
    }
}
