package state;

import java.util.Random;

public class Package {
    private String name;
    private int quantity;
    private State state;

    // Possible states
    private State orderedState;
    private State inTransitState;
    private State deliveredState;

    public Package(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;

        // Initialize states
        orderedState = new OrderedState(this);
        inTransitState = new InTransitState(this);
        deliveredState = new DeliveredState(this);

        // Default state
        state = orderedState;
    }

    public String order() {
        setState(orderedState);
        return state.getStatus() + "\n" + state.getETA();
    }

    public String mail() {
        setState(inTransitState);
        return state.getStatus() + "\n" + state.getETA();
    }

    public String received() {
        setState(deliveredState);
        return state.getStatus() + "\n" + state.getETA();
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    // Handle singular/plural verbs
    public String getVerb(String singular, String plural) {
        return quantity == 1 ? singular : plural;
    }

    public State getOrderedState() { return orderedState; }
    public State getInTransitState() { return inTransitState; }
    public State getDeliveredState() { return deliveredState; }
}
