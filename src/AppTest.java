public class AppTest {
    public static void main(String[] args) throws Exception {
        showTodos();
    }

    /**
     * Service Layer
     */
    public static void showTodos() {
        App.todos[0] = "Belajar Java Dasar";
        App.todos[1] = "Belajar Java OOP";

        App.show();
    }
}
