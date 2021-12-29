import java.util.Scanner;

class A {
    static int s, w, v;
    Scanner sc = new Scanner(System.in);
}

class B extends A {

    void input() {
        System.out.print("Enter two numbers:");
        s = sc.nextInt();
        w = sc.nextInt();
    }
}

class Main extends A {

    void add() {
        v = s + w;
    }

    void result() {
        System.out.println("Sum is:" + v);
    }

    public static void main(String args[]) {
        B obj1 = new B();
        obj1.input();

        Main obj2 = new Main();
        obj2.add();
        obj2.result();
    }
}
