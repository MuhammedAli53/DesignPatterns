package BehavioralDp.Mediator.SimplePractice1;

public class Runner {
    public static void main(String[] args) {
        SohbetArabulucu arabulucu = new SohbetArabulucu();

        Kullanici kullanici1 = new Kullanici("Ali", arabulucu);
        Kullanici kullanici2 = new Kullanici("Ayşe", arabulucu);

        kullanici1.mesajGonder("Merhaba Ayşe!");
        kullanici2.mesajGonder("Merhaba Ali!");
    }
}
