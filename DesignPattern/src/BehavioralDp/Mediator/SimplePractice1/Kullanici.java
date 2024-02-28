package BehavioralDp.Mediator.SimplePractice1;

public class Kullanici {
    private String isim;
    private SohbetArabulucu arabulucu;

    public Kullanici(String isim, SohbetArabulucu arabulucu) {
        this.isim = isim;
        this.arabulucu = arabulucu;
        arabulucu.kaydet(this);
    }

    public void mesajGonder(String mesaj) {
        arabulucu.mesajGonder(this, mesaj);
    }

    public void mesajAl(String gonderen, String mesaj) {
        System.out.println(gonderen + ": " + mesaj);
    }

    public String getIsim() {
        return isim;
    }
}
