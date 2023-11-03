package computer;

class Monitor {
    private String model;
    private int screenSizeInches;

    public Monitor(String model, int screenSizeInches) {
        this.model = model;
        this.screenSizeInches = screenSizeInches;
    }

    public String getModel() {
        return model;
    }

    public int getScreenSizeInches() {
        return screenSizeInches;
    }

    // Дополнительные методы и свойства, если необходимо
}