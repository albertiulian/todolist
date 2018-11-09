import java.util.ArrayList;
import java.util.List;

public class TodoList {
    /*
     * Add a new item to the list, given a description and priority.
     */
	public List<TodoListItem> items = new ArrayList<TodoListItem>();
		
	
	
    public void addItem(String description, int priority) {
        // TODO
    	items.add(null);
    }
    
    /*
     * Get the item at a given index.
     */
    
    public TodoListItem getItem(int i) {
		return items.get(0);
        // TODO
    	
        
    }
    
    /*
     * Get the number of items in the list.
     */
    public int size() {
    	items.add(2, "bake a cake");
    	
    	int sizeOfList = items.size();
    	//System.out.println("items in list is:" +sizeOfList);
		return sizeOfList;
    }
    
    /*
     * Find the first item in the list which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findFirstNotDone() {
        // TODO
        return null;
    }
    
    /*
     * Find the highest-priority item which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findHighestPriorityNotDone() {
        // TODO
        return null;
    }
    
    /*
     * Search for items whose description contains the given text.
     * The descriptions are returned in a list.
     */
    public List<String> search(String text) {
        // TODO
        return null;
    }
}
