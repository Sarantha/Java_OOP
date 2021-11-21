public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Asus",24,"1024 * 900");
        MotherBoard motherBoard = new MotherBoard("Gigabite","Pro gameing");
        Computer computer = new Computer(monitor,motherBoard);
        computer.computerDetails();
    }
}
