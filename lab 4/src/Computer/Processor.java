package Computer;

class Processor {
    private String model;
    private double clockSpeedGHz;

    public Processor(String model, double clockSpeedGHz) {
        this.model = model;
        this.clockSpeedGHz = clockSpeedGHz;
    }

    public String getModel() {
        return model;
    }

    public double getClockSpeedGHz() {
        return clockSpeedGHz;
    }


}