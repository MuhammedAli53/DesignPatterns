package BehavioralDp.ChainOfResponsibility.SimplePractice3;

public abstract class KargoSirketi {

    private Iller il;

    private KargoSirketi sonrakiKargosirketi;

    public KargoSirketi(Iller il) {
        this.il = il;
    }

    public Iller getIl() {
        return il;
    }

    public KargoSirketi getSonrakiKargosirketi() {
        return sonrakiKargosirketi;
    }

    public KargoSirketi setSonrakiKargosirketi(KargoSirketi sonrakiKargosirketi) {
        this.sonrakiKargosirketi = sonrakiKargosirketi;
        return this;
    }

    public void kargola(Iller il){
        {
            gelenKargoBilgileriYazdır(il);

            if (getIl().equals(il)){
                kargoTeslimBilgileriYazdir();
            } else if (getSonrakiKargosirketi() != null) {
                getSonrakiKargosirketi().kargola(il);
            } else {
                hizmetAlaniDisiYazdir(il);
            }
        }
    };

    private static void hizmetAlaniDisiYazdir(Iller il) {
        System.out.println(il.getIl() + " hizmet alanının dışındadır.");
    }

    private void kargoTeslimBilgileriYazdir() {
        System.out.println(getIl().getIl() + " şube teslim aldı.");
    }

    private void gelenKargoBilgileriYazdır(Iller il) {
        System.out.println(il.getIl() + " iline gidecek kargo" + getIl().getIl() + " şubesine geldi.");
    }
}
