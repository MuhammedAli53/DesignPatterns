package BehavioralDp.ChainOfResponsibility.SimplePractice1;

public class Memur extends Approver{
    public Memur(Approver approver) {
        super(approver);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount<100){
            System.out.println("Memur tarafından onaylandı.");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            return true;
        }else if (approver!=null){
            System.out.println("Miktar memurun onay dışında kalıyor. Bir üst yetkiliye yönlendiriliyorsunuz.");
            return approver.approveLoan(amount);
        }
        return false;

    }
}
