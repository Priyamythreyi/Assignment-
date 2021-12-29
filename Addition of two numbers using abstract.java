import java.util.Scanner;

abstract class First {

    int x, y, z;

    abstract void input();
    abstract void add();
    abstract void result();
    Scanner sc = new Scanner(System.in);
}

class Main extends First {

    void input() {
        System.out.print("Enter two numbers:");
        x = sc.nextInt();
        y = sc.nextInt();
    }

    void add() {
        z = x + y;
    }

    void result() {
        System.out.print("Sum of two numbers:" + z);
    }

    public static void main(String args[]) {
        Main st = new Main();
        st.input();
        st.add();
        st.result();
    }
}
