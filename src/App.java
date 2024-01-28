public class App {
    /**
     * Repository Layer
     */
    public static String[] todos = new String[10];

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    /**
     * Service Layer
     */
    public static void show() {
        for (int i = 0; i < todos.length; i++) {
            String todo = todos[i];
            
            if (todo != null) {
                System.out.printf("%d. %s %n", i + 1, todo);
            }
        }
    }

    public static void add(String todo) {
        boolean isFull = true;
        for (String el : todos) {
            if (el == null) {
                isFull = false;
                break;
            }
        }

        if (isFull) {
            String[] temp = todos;
            todos = new String[todos.length * 2];

            for (int i = 0; i < temp.length; i++) {
                todos[i] = temp[i];
            }
        }


        for (int i = 0; i < todos.length; i++) {
            if (todos[i] == null) {
                todos[i] = todo;
                break;
            }
        }
    }

    public static void remove() {
        // implementation
    }

    /**
     * Presentation Layer
     */
    public static void viewShow() {
        // implementation
    }

    public static void viewAdd() {
        // implementation
    }

    public static void viewRemove() {
        // implementation
    }
}
