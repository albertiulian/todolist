
public class TodoListItem {
	String description;
	int priority;
	boolean isDone;
	
	
	
	public TodoListItem(String description, int priority) {
		// TODO Auto-generated constructor stub
		this.description = description;
		this.priority = priority;
		this.isDone = false;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

	public int getPriority() {
		// TODO Auto-generated method stub
		return this.priority;
	}

	public boolean isDone() {
		// TODO Auto-generated method stub
		return  this.isDone;
	}

	public void markDone() {
		// TODO Auto-generated method stub
		this.isDone = true;
		
	}

}
