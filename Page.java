public class Page implements Comparable<Page> {
	
	// упорядочивания объектов одного типа, хранящихся в массиве или коллекции, 
	//класс Страница
	//private Биты
    private final int ID;
    private boolean isInPhysicalMemory;
   private int R = 0;
    private int M = 0;
    private int physicalPageID;
   private final int processID;

    Page(int ID, int processID){
        this.ID = ID;
        this.processID = processID;
    }

    public int getID() {
        return ID;
    }

    public int getM(){
        return M;
    }
   public int getR(){
        return R;
    }
  
    
    
    @Override
    public int compareTo(Page p) {
        if(R*2+M >p.getR()*2+p.getM()){
            return 1;
        }
        else if (R*2+M < p.getR()*2+p.getM()){
            return -1;
        }
        return 0;
    }

    public int getProcessID() {
        return processID;
    }

	public void setInPhysicalMemory(boolean inPhysicalMemory) {
        isInPhysicalMemory = inPhysicalMemory;
    }

	public void setPhysicalPageID(int physicalPageID) {
        this.physicalPageID = physicalPageID;
    }

	public void setR(int r) {
		R=r;
		
	}

	public void setM(int m) {
		M=m;
	}

	 public boolean isInPhysicalMemory() {
        return isInPhysicalMemory;
    }

	 public int getPhysicalPageID() {
        return physicalPageID;
    }
	
}

