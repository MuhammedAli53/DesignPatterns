package BehavioralDp.ChainOfResponsibility.SimplePractice1;

public class Mudur extends Approver{

    public Mudur(Approver approver) {
        super(approver);
    }

    @Override
    boolean approveLoan(int amount) {
        if (amount<500){
            System.out.println("Müdür tarafından onaylandı.");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            return true;
        }else if (approver!=null){
            System.out.println("Miktar müdürün onay dışında kalıyor. Bir üst yetkiliye yönlendiriliyorsunuz.");
            return approver.approveLoan(amount);
        }
        return false;

    }
}
