public class App {
    /**
     * Repository Layer
     */
    public static String[] todos = new String[10];
    public static boolean isRunning = true;

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) throws Exception {
        viewShow();
    }

    public static String input(String word) {
        System.out.printf("%s: ", word);
        String data = scanner.nextLine();
        return data;
    }

    /**
     * Service Layer
     */
    public static void show() {
        for (int i = 0; i < todos.length; i++) {
            String todo = todos[i];

            if (i == 0 && todo == null) {
                System.out.println("[Data Masih Kosong]");
                break;
            }

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

    public static boolean remove(int order) {
        int index = order - 1;

        if ((index < 0) || (index >= todos.length)) {
            return false;
        } else if (todos[index] == null) {
            return false;
        } else {
            for (int i = index; i < todos.length; i++) {
                if (i == (todos.length -1)) {
                    todos[i] = null;
                } else {
                    todos[i] = todos[i+1];
                }
            }

            return true;
        }
    }

    /**
     * Presentation Layer
     */
    public static void viewShow() {
        while (isRunning) {
            System.out.println("Aplikasi Todo List Sederhana");

            show();

            System.out.println("Menu:");
            System.out.println("1. Tambah Todo");
            System.out.println("2. Hapus Todo");
            System.out.println("99. Selesai");

            String input = input("Masukkan Pilihan");
            switch (input) {
                case "1":
                    viewAdd();
                    break;
                case "2":
                    viewRemove();
                    break;
                case "99":
                    isRunning = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("Pilihan tidak ditemukan");
                    System.out.println();
                    break;
            }
        }
    }

    public static void viewAdd() {
        System.out.println();
        System.out.println("Menambah Todo");
        String todo = input("Masukkan (x jika batal)");

        if (!todo.equals("x")) {
            add(todo);
        }
    }

    public static void viewRemove() {
        System.out.println();
        System.out.println("Menghapus Todo");
        String order = input("Nomor Todo yang ingin dihapus (x jika batal)");

        if (!order.equals("x")) {
            String response = remove(Integer.valueOf(order)) ? "berhasil" : "gagal";

            System.out.println();
            System.out.printf("[INFO: Todo ke-%s %s dihapus] %n", order, response);
            System.out.println();
        }
    }
}
