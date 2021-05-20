public class Main {

    public static void main(String[] args) {
        int size = 5;

        int first = 0;
        int second = size - 1;

        for (int i = 0; i < size; i++)
            printLine(first++, second--, size);

        int limit = 100;

        int previous = 0;
        int current = 1;
        int next;
        
        while (current < limit) {
            next = current + previous;
            System.out.println(next);
            previous = current;
            current = next;
        }
    }

    public static void printLine(int first, int second, int size) {
        if (first - second == 1) return;
        for (int i = 0; i < size; i++) {
            if (i == first || i == second) {
                System.out.print('*');
                continue;
            }
            System.out.print(' ');
        }
        System.out.println();
    }
}
