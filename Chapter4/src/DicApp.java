import java.util.Scanner;

class Dictionary {
    private static String kor[] = { "사랑", "아기", "돈", "미래", "희망" };
    private static String eng[] = { "love", "baby", "money", "future", "hope" };
    public static String kor2Eng(String word) {
        int i, idx = 0;
        for (i = 0; i < kor.length; i++) {
            if (kor[i].equals(word)) {
                idx = i;
                break;
            }
        }
        if (i == kor.length) {
            System.out.println(word+ "(은)는 저의 사전에 없습니다.");
            return word;
        }
        return eng[idx];
    }
}

public class DicApp {
    public static void main(String args[]) {
        Dictionary dic = new Dictionary();
        Scanner sc = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");
        String name, engName;
        while (true) {
            System.out.print("한글 단어?");
            name = sc.next();
            if (name.equals("그만"))  break;
            engName = dic.kor2Eng(name);
            if (!name.equals(engName))
                System.out.println(name + "(은)는 " + engName);
        }
        sc.close();
    }
}
