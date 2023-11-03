package computer;

public class Main {
    public static void main(String[] args) {

        Processor processor = new Processor("Intel Core i7", 3.2);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("Dell Ultrasharp", 27);


        Computer computer = new Computer(ComputerBrand.HP, processor, memory, monitor);

        System.out.println("Марка компьютера: " + computer.getBrand());
        System.out.println("Процессор: " + computer.getProcessor().getModel() + ", Частота: " + computer.getProcessor().getClockSpeedGHz() + " GHz");
        System.out.println("Оперативная память: " + computer.getMemory().getCapacityGB() + " GB, Тип: " + computer.getMemory().getType());
        System.out.println("Монитор: " + computer.getMonitor().getModel() + ", Размер экрана: " + computer.getMonitor().getScreenSizeInches() + " дюймов");

        Computer computer1 = new Computer(ComputerBrand.Apple, processor, memory, monitor);
        System.out.println("Марка компьютера: " + computer1.getBrand());
    }
}





