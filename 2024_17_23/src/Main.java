public class Main {
    public static void main(String[] args) {

        byte globalByte = 4;
        short globalShort = 14;
        int globalInt = 24;

        Computer computer = new Computer();
        computer.print(globalByte);
        computer.print(globalShort);
        computer.print(globalInt);

    }
}