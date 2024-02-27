package BehavioralDp.ChainOfResponsibility.SimplePractice3;

public class App {
    public static void main(String[] args) {
        KargoSirketi sbmKargo = SbmKargo.getKargoSirketi();
        sbmKargo.kargola(Iller.ISTANBUL);
        System.out.println("----------------------");
        sbmKargo.kargola(Iller.ANKARA);
        System.out.println("----------------------");
        sbmKargo.kargola(Iller.ANTALYA);
        System.out.println("----------------------");
        sbmKargo.kargola(Iller.IZMIR);
        System.out.println("----------------------");

    }
}
