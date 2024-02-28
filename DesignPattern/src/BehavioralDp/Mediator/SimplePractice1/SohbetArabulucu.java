package BehavioralDp.Mediator.SimplePractice1;

import java.util.ArrayList;
import java.util.List;

public class SohbetArabulucu {

    private List<Kullanici> kullanicilar = new ArrayList<>();

    public void kaydet(Kullanici kullanici) {
        kullanicilar.add(kullanici);
    }

    public void mesajGonder(Kullanici gonderen, String mesaj) {
        for (Kullanici alici : kullanicilar) {
            if (alici != gonderen) {
                alici.mesajAl(gonderen.getIsim(), mesaj);
            }
        }
    }

}
