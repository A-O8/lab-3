import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MemoryManager memoryManager = new MemoryManager();
        memoryManager.work();
    }
    public static int getRandomNumber(int min, int max) {
        double x = (Math.random()*((max-min)+1))+min;
        return (int) x;
    }
}

