

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
		return;
	}
	
	//IMPLEMENT -- removes a book and returns it, or 
	//	returns null if book is not present
	public Book remove(Book b){
		return null;
	}

	//IMPLEMENT -- removes a book at a specific index and returns it, 
	//	or returns null if index is not present
	public Book remove(int index){
		
		return null;
	}
	
	//IMPLEMENT -- returns the total number of pages in the linked list
	public int totalPages(){

		return 0;
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




