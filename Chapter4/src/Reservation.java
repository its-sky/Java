import java.awt.*;
import java.util.Scanner;

class S {
    private String name[];

    S() {
        name = new String[10];
    }

    public void Reserve(Scanner sc) {
        this.Check();
        System.out.print("이름>>");
        String name = sc.next();
        System.out.print("번호>>");
        int seat = sc.nextInt();
        this.name[seat - 1] = name;
    }
    public void Check() {
        System.out.print("S>>");
        for (int i = 0; i < name.length; i++) {
            if (name[i] == null)
                System.out.print(" ---");
            else
                System.out.print(" " + name[i]);
        }
        System.out.println();
    }
    public void Cancel(String name) {
        for (int i = 0; i < this.name.length; i++) {
            if (this.name[i] != null && this.name[i].equals(name))  {
                this.name[i] = null;
                return;
            }
        }
        System.out.println("해당 예약자는 존재하지 않습니다.");
    }
}
class A {
    private String name[];

    A() {
        name = new String[10];
    }

    public void Reserve(Scanner sc) {
        this.Check();
        System.out.print("이름>>");
        String name = sc.next();
        System.out.print("번호>>");
        int seat = sc.nextInt();
        this.name[seat - 1] = name;
    }
    public void Check() {
        System.out.print("A>>");
        for (int i = 0; i < name.length; i++) {
            if (name[i] == null)
                System.out.print(" ---");
            else
                System.out.print(" " + name[i]);
        }
        System.out.println();
    }
    public void Cancel(String name) {
        for (int i = 0; i < this.name.length; i++) {
            if (this.name[i] != null && this.name[i].equals(name))  {
                this.name[i] = null;
                return;
            }
        }
        System.out.println("해당 예약자는 존재하지 않습니다.");
    }
}
class B {
    private String name[];

    B() {
        name = new String[10];
    }

    public void Reserve(Scanner sc) {
        this.Check();
        System.out.print("이름>>");
        String name = sc.next();
        System.out.print("번호>>");
        int seat = sc.nextInt();
        this.name[seat - 1] = name;
    }
    public void Check() {
        System.out.print("B>>");
        for (int i = 0; i < name.length; i++) {
            if (name[i] == null)
                System.out.print(" ---");
            else
                System.out.print(" " + name[i]);
        }
        System.out.println();
    }
    public void Cancel(String name) {
        for (int i = 0; i < this.name.length; i++) {
            if (this.name[i] != null && this.name[i].equals(name))  {
                this.name[i] = null;
                return;
            }
        }
        System.out.println("해당 예약자는 존재하지 않습니다.");
    }
}

public class Reservation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        S s = new S();
        A a = new A();
        B b = new B();
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        int work, seat;
        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            work = sc.nextInt();
            if (work == 1) {
                System.out.print("좌석구분 S(1), A(2), B(3)>>");
                seat = sc.nextInt();
                if (seat == 1) {
                    s.Reserve(sc);
                }
                else if (seat == 2) {
                    a.Reserve(sc);
                }
                else if (seat == 3) {
                    b.Reserve(sc);
                }
                else    System.out.println("해당 등급의 좌석은 존재하지 않습니다.");
            }
            else if (work == 2) {
                s.Check();
                a.Check();
                b.Check();
                System.out.println("<<<조회를 완료하였습니다.>>>");
            }
            else if (work == 3) {
                System.out.print("좌석 S:1, A:2, B:3>>");
                seat = sc.nextInt();
                if (seat == 1) {
                    s.Check();
                    System.out.print("이름>>");
                    String name = sc.next();
                    s.Cancel(name);
                }
                else if (seat == 2) {
                    a.Check();
                    System.out.print("이름>>");
                    String name = sc.next();
                    a.Cancel(name);
                }
                else if (seat == 3) {
                    b.Check();
                    System.out.print("이름>>");
                    String name = sc.next();
                    b.Cancel(name);
                }
                else    System.out.println("해당 등급의 좌석은 존재하지 않습니다.");
            }
            else if (work == 4) {
                sc.close();
                return;
            }
        }
    }
}
