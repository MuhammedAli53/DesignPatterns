package BehavioralDp.ChainOfResponsibility.SimplePractice3;

public enum Iller {
    ISTANBUL("Istanbul"),
    ANKARA("Ankara"),
    ANTALYA("Antalya"),
    IZMIR("Izmir");

    private String il;
    Iller(String il) {
        this.il = il;
    }

    public String getIl() {
        return il;
    }

    @Override
    public String toString() {
        return "Iller{" +
                "il='" + il + '\'' +
                '}';
    }
}
