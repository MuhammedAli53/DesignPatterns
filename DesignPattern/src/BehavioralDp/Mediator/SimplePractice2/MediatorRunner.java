package BehavioralDp.Mediator.SimplePractice2;

public class MediatorRunner {
    public static void main(String[] args) {
        MediatorRunner mediatorRunner = new MediatorRunner();
        mediatorRunner.mediatorDemo();
    }
    void mediatorDemo(){
        MessageDispatcher messageDispatcher = new MessageDispatcher();

        Actor actor1= new MessageActor("Actor 1",messageDispatcher);
        Actor actor2= new MessageActor("Actor 2",messageDispatcher);
        Actor actor3= new MessageActor("Actor 3",messageDispatcher);
        Actor actor4= new MessageActor("Actor 4",messageDispatcher);

        messageDispatcher.register("Topic 1", actor1);
        messageDispatcher.register("Topic 2", actor2);
        messageDispatcher.register("Topic 3", actor3);
        messageDispatcher.register("Topic 4", actor4);

        actor1.sendMessage("Topic 2", "Message for Topic-2");
        actor1.sendMessage("Topic 3", "Message for Topic-3");
        actor1.sendMessage("Topic 4", "Message for Topic-4");
        actor2.sendMessage("Topic 1", "Message for Topic-1");
        actor2.sendMessage("Topic 5", "Message for Topic-5");
    }

}
