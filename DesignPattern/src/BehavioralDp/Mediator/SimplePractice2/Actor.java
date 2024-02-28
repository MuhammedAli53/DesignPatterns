package BehavioralDp.Mediator.SimplePractice2;

public interface Actor {

    void receiveMessage(String message);
    void sendMessage(String topic, String message);
}
