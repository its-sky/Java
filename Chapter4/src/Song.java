public class Song {
    private String title;
    private String artist;
    private String country;
    private int year;

    public Song() {}

    public Song(String title, String artist, String country, int year) {
        this.title = title;
        this.artist = artist;
        this.country = country;
        this.year = year;
    }

    public void show() {
        System.out.println(this.year + "년 " + this.country + "국적의 " + this.artist + "가 부른 " + this.title);
    }

    public static void main(String args[]) {
        Song me = new Song("Dancing Queen", "ABBA", "스웨덴", 1978);
        me.show();
    }
}
