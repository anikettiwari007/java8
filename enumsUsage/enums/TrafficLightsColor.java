package enumsUsage.enums;

public enum TrafficLightsColor {
    RED {
        @Override
        public TrafficLightsColor next() {
            return GREEN;
        }

        @Override
        public String action() {
            return "STOP";
        }
    },
    YELLOW {
        @Override
        public TrafficLightsColor next() {
            return RED;
        }

        @Override
        public String action() {
            return "CAUTION";
        }
    },
    GREEN {
        @Override
        public TrafficLightsColor next() {
            return YELLOW;
        }

        @Override
        public String action() {
            return "GO";
        }
    };

    public abstract TrafficLightsColor next();
    public abstract String action();
}
