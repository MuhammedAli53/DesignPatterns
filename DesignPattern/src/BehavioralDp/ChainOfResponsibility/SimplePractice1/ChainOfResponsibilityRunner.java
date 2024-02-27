package BehavioralDp.ChainOfResponsibility.SimplePractice1;

public class ChainOfResponsibilityRunner {
    public static void main(String[] args) {
        ChainOfResponsibilityRunner cor = new ChainOfResponsibilityRunner();
        cor.chainOfResponsibility();
    }

    void chainOfResponsibility(){
        Approver genelMudur = new GenelMudur();
        Approver mudur = new Mudur(genelMudur);
        Approver memur = new Memur(mudur);

        memur.approveLoan(1000000);
    }
}
