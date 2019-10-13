package ingresopersonas;

/**
 *
 * @author julian
 */
public class ColaPrioridad<T>
{
    private class Node<T> {
		
		//atributos
		private Object element;
		private Node next;
		
		//Constructores
		public Node() {
			this.element = null;
			this.next = null;
		}
		
		public Node(Object element) {
			this.element = element;
			this.next = null;
		}
		
		public Node(Object element, Node next) {
			this.element = element;
			this.next = next;
		}
		
		//metodos
		public Object getElement() {
			return this.element;
		}
		
		public void setElement(Object element) {
			this.element = element;
		}
		
		public Node getNext() {
			return this.next;
		}
		
		public void setNext(Node next) {
			this.next = next;	
		}
	}
	
    
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	public ColaPrioridad(){
		this.front = new Node<>();
		this.rear = this.front;
		this.size = 0;
	}
	
	public void enqueue(T element){
		this.rear.setNext(new Node<T>(element, null));
		this.rear = rear.getNext();
		this.size++;
	}
	
	public T dequeue(){
		if(this.size == 0){
			System.out.println("Queue is empty");
			return null;
		}
		T temp = (T) this.front.getNext().getElement();
		Node<T> nTemp = this.front.getNext();
		this.front.setNext(nTemp.getNext());
		if (this.rear == nTemp){
			this.rear = this.front;
		}
		this.size--;
		return temp;
	}
	
	public Object first(){
		if(this.size == 0){
			System.out.println("Queue is empty");
			return null;
		}
		return this.front.getNext().getElement();
	}
	
	public int size(){
		return this.size;
	}
	
	public void clear(){
		this.front = new Node<>();
		this.rear = this.front;
		this.size = 0;
	}
	
	public String toString(){
		String result = "*LQueue*\n";
		Node<T> tFront = this.front;
		int tSize = this.size;
		while(tSize != 0){
			result+= tFront.getNext().getElement() + " ";
			tFront = tFront.getNext();
			tSize--;
		}
		return result;
	}

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        
    }
        // TODO code application logic here
    }
    

