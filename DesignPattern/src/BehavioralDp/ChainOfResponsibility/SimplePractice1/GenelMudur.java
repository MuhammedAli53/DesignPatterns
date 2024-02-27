package BehavioralDp.ChainOfResponsibility.SimplePractice1;

public class GenelMudur extends Approver{

  public GenelMudur(){
      super(null);
  }

    @Override
    boolean approveLoan(int amount) {
      System.out.println("Genel müdür tarafından onaylandı");
      return true;
    }
}
