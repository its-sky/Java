import java.util.Scanner;

public class WorldGameApp {
    class Player {
        private String name;
        public Player(String name) {
            this.name = name;
        }
        public String getWordFromUser(Scanner scanner) {
            System.out.print(this.name + ">>");
            String answer = scanner.next();
            return answer;
        }
        public boolean checkSuccess(String word, String answer) {
            int lastIndex = word.length() - 1;
            char lastChar = word.charAt(lastIndex);
            char firstChar = answer.charAt(0);
            if (lastChar == firstChar)
                return true;
            return false;
        }
    }

    public WorldGameApp() {
        System.out.println("끝말잇기 게임을 시작합니다...");
    }

    public void run(Scanner scanner) {
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        int n = scanner.nextInt();
        WorldGameApp.Player p[] = new Player[n];

        String name = "";
        for (int i = 0; i < n; i++) {
            System.out.print("참가자의 이름을 입력하세요>>");
            name = scanner.next();
            p[i] = new Player(name);
        }
        System.out.println("시작하는 단어는 아버지입니다");
        String word = "아버지";
        String answer = "";
        int turn = 0;
        while (true) {
            answer = p[turn].getWordFromUser(scanner);
            if (!p[turn].checkSuccess(word, answer)) {
                System.out.print(p[turn].name + "이 졌습니다.");
                return ;
            }
            word = answer;
            ++turn;
            turn %= n;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        WorldGameApp w = new WorldGameApp();
        w.run(scanner);
    }
}
