public class AppTest {
    public static void main(String[] args) throws Exception {
        addTodo();
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

    public static void addTodo() {
        for (int i = 0; i < 25; i++) {
            App.add("Todo ke-" + i);
        }
    }
}
