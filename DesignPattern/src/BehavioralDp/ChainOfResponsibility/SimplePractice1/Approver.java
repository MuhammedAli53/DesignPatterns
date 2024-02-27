package BehavioralDp.ChainOfResponsibility.SimplePractice1;

public abstract class Approver {

    Approver approver;

    public Approver(Approver approver) {
        this.approver = approver;
    }
    abstract boolean approveLoan(int amount);
}
