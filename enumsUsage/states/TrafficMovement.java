package enumsUsage.states;

import enumsUsage.enums.TrafficLightsColor;

public class TrafficMovement {
    public static void main(String[] args) {
        TrafficLightsColor light = TrafficLightsColor.RED;

        for (int i = 0; i < 6; i++) {
            System.out.println("Current Light: " + light + ", Action: " + light.action());
            light = light.next();
        }
    }
}
