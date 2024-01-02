import java.util.*;

public class Alimplementation {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            Arraylist list = new Arraylist();

            System.out.println("enter number of elements to add:");
            int a = scn.nextInt();

            for (int i = 0; i < a; i++) {
                int b = scn.nextInt();
                list.add(b);
            }
            list.display();
            list.remove(2);
            list.display();
            list.removeBegining();
            list.display();
        }

    }
}

class Arraylist {
    int s = 0;
    int arr[] = new int[100];;

    void add(int n) {
        arr[s] = n;
        s++;
    }

    int size() {
        return s;
    }

    int get(int q) {
        return arr[q];
    }

    void remove(int n) {
        for (int i = 0; i < size(); i++) {
            if (arr[i] == n) {
                for (int j = i; j < size(); j++) {
                    arr[i] = arr[i + 1];
                }
                s--;
            }
        }
    }

    int removeBegining() {
        int v = arr[0];
        ;
        for (int i = 0; i < s - 1; i++) {
            arr[i] = arr[i + 1];

        }
        s--;
        return v;
    }

    void display() {
        System.out.print("[");
        for (int j = 0; j < size(); j++) {
            System.out.print(get(j) + " ");
        }

        System.out.println("]");

    }
}
