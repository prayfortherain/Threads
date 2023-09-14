public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Главный поток запущен");

        for (int i = 0; i <= 10; i++){
            new NewThread( "Поток " + i);
        }

         // Создание анонимного объекта класса NewThread
        for (int i = 100; i > 90; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Главный поток прерван");
            }
        }
        System.out.println("Главный поток завершен");
    }
}
