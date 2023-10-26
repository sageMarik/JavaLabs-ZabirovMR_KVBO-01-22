package Computer;

class Memory {
    private int capacityGB;
    private String type;

    public Memory(int capacityGB, String type) {
        this.capacityGB = capacityGB;
        this.type = type;
    }

    public int getCapacityGB() {
        return capacityGB;
    }

    public String getType() {
        return type;
    }

    // Дополнительные методы и свойства, если необходимо
}