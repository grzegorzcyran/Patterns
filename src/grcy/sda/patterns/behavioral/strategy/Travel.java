package grcy.sda.patterns.behavioral.strategy;

import java.util.concurrent.TransferQueue;

public class Travel {
    private String startPoint;
    private String destination;

    public Travel(String startPoint, String destination) {
        this.startPoint = startPoint;
        this.destination = destination;
    }

    public void setTravelPlan(TravelStrategy travelPlan) {

        travelPlan.setTravelPlan(startPoint, destination);
    }
}
