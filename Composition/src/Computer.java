public class Computer {
    private Monitor monitor;
    private MotherBoard motherBoard;

    public Computer(Monitor monitor, MotherBoard motherBoard) {
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public void computerDetails(){
        System.out.println("This computer has the following specification");
        System.out.println("Motherboard Name : "+motherBoard.getName());
        System.out.println("Motherboard Name : "+motherBoard.getModel());
        System.out.println("Monitor Name : "+monitor.getName());
        System.out.println("Monitor Resolution : "+monitor.getResolution());
        System.out.println("Monitor Size : "+monitor.getSize());
    }
}
