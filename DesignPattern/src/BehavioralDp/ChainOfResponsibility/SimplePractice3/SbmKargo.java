package BehavioralDp.ChainOfResponsibility.SimplePractice3;

public class SbmKargo {
    public static KargoSirketi getKargoSirketi(){
        AntalyaSube antalyaSube = new AntalyaSube(Iller.ANTALYA);
        AnkaraSube ankaraSube = new AnkaraSube(Iller.ANKARA);
        IstanbulSube istanbulSube = new IstanbulSube();
        IzmirSube izmirSube = new IzmirSube(Iller.IZMIR);

        KargoSirketi sbmKargo = antalyaSube.setSonrakiKargosirketi(
                ankaraSube.setSonrakiKargosirketi(
                        istanbulSube.setSonrakiKargosirketi(
                                izmirSube.setSonrakiKargosirketi(antalyaSube))));
        return sbmKargo;
    }
}
