public class AppTest {
    public static void main(String[] args) throws Exception {
        App.add("Belajar Java Dasar");
        App.add("Belajar Java OOP");
        App.add("Belajar Java Generic");
        
        removeTodoOutOfIndex();
        removeTodoOutOfLength();
        removeTodo();
    }

    /**
     * Service Layer
     */
    public static void showTodos() {
        App.show();
    }

    public static void addTodo() {
        for (int i = 0; i < 25; i++) {
            App.add("Todo ke-" + i);
        }

        App.show();
    }

    public static void removeTodo() {
        String result = App.remove(2) ? "berhasil" : "gagal";
        System.out.printf("Todo %s dihapus %n", result);
        
        App.show();
    }

    public static void removeTodoOutOfLength() {
        String result = App.remove(16) ? "berhasil" : "gagal";
        System.out.printf("Todo %s dihapus %n", result);
    }

    public static void removeTodoOutOfIndex() {
        String result = App.remove(0) ? "berhasil" : "gagal";
        System.out.printf("Todo %s dihapus %n", result);
    }
}
