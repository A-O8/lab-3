public class PageTable {
    private final Page[] pageTable;
    private final int maxPages;

    public PageTable(int maxPages) {
        this.maxPages = maxPages;
        pageTable = new Page[maxPages];
    }

	

	public int getMaxPages() {
		
	return maxPages;
	}

   
    
    
    
    
    
// pageTable:Таблица страниц - ключевой компонент трансляции виртуальных адресов, который необходим для доступа к данным в памяти.
   public Page[] getPageTable() {
        return pageTable;
    }
   
    public int isMemoryFullness() {
        double percent = pageTable.length * 0.9;
        if(pageTable[(int)percent] == null) {
            return 0;
        }
        return 1;
    }
}
    
    