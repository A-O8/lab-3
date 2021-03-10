import java.util.ArrayList;

public class Process {
    private final ArrayList<Page> virtualMemory;
    private final int ID;

    Process(int ID) {
        this.ID = ID;
        //ذاكرة افتراضية
        virtualMemory = new ArrayList<>();
        int pagesCount = Main.getRandomNumber(2, 5);
        for (int i = 0; i <= pagesCount; i++) {
          virtualMemory.add(new Page(i, ID));
        }
        System.out.println("Процесс " + ID + " содержит " + pagesCount + " страниц");
    }

   
   public int getID() {
       return ID;
    }


   public ArrayList<Page> getVirtualMemory() {
       return virtualMemory;
    }
}
