

public class LinkedBookList {

	private BookNode head;
	private int size;
	
	public LinkedBookList(){
		head = null;
		size = 0;
	}
	
	//returns size of the list
	public int size(){
		return size;
	}
	
	//IMPLEMENT -- adds a book to the end of the linked list
	public void add(Book b){
		
		BookNode curr = head;
		
		if(size == 0)
		{
			head = new BookNode(b);
		}
		else
		{
			for(int i = 0; i < size-1; i++)
			{
				curr = curr.getNext();
			}
			curr.setNext(new BookNode(b));
		}
		size++;
	}
	
	//IMPLEMENT -- adds a book at the specific index, 
	//  or at the end if index is greater than size
	public void add(Book b, int index){
		
		BookNode curr = head;
		
		if(index < 0)
		{
			throw new IndexOutOfBoundsException();
		}
		else if(index >= size)
		{
			for(int i = 0; i < size-1; i++)
			{
				curr = curr.getNext();
			}
			
			curr.setNext(new BookNode(b));
		}
		else
		{

			for(int i = 0; i < index-1; i++)
			{
				curr = curr.getNext();
			}
			curr.setNext(new BookNode(b, curr.getNext()));
			
		}
		size++;
	}
	
	//IMPLEMENT -- removes a book and returns it, or 
	//	returns null if book is not present
	public Book remove(Book b){
		BookNode curr = head;
		int counter = 0;
		
		if(curr.getBook().equals(b))
		{
			return remove(0);
		}
		while (!curr.getNext().getBook().equals(b) && counter < size)
		{
		 curr = curr.getNext();
		 counter++;
		}
		
		if(counter == size)
		{
		 return null;
		}
		Book temp = curr.getNext().getBook();
		curr.setNext(curr.getNext().getNext());
		
		return temp;
		 
		 
	}

	//IMPLEMENT -- removes a book at a specific index and returns it, 
	//	or returns null if index is not present
	public Book remove(int index){
		BookNode curr = head;
		
		if(index < 0 || index >= size)
		{
			return null;
		}
		if (index == 0)
		{
			Book temp = curr.getBook();
			head = curr.getNext();
			
			
			return temp;
		}
		
		for(int i = 0; i < index-1; i++)
		{
			curr = curr.getNext();
			System.out.println("Moving to next");
		}
		Book temp = curr.getNext().getBook();
		curr.setNext(curr.getNext().getNext());
		return temp;
	}
	
	//IMPLEMENT -- returns the total number of pages in the linked list
	public int totalPages(){
		BookNode curr = head;
		int total = curr.getNumPages();
		
		
		for(int i = 0; i < size-1; i++)
		{
			curr = curr.getNext();
			total += curr.getBook().getNumPages();
			
		}
		
		return total;
	}
	

        public String toString()
        {
                String res = "";
                for (BookNode pos = head; pos != null; pos = pos.getNext()) {
                        if (pos.getBook() == null) {
                                res += "null";
                        } else {
                                res += pos.getBook();
                        }

                        if (pos.getNext() != null) res += "\n";
                }
                return res;
        }

}




