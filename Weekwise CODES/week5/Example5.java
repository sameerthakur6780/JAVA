package week5;
import java.util.*;
class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList<T> implements Iterable<T> {
    private Node<T> head;
    public LinkedList() {
        this.head = null;
    }
    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    private class LinkedListIterator implements Iterator {
        private Node<T> current;
        public LinkedListIterator() {
            current = head;
        }
        public boolean hasNext() {
            return current != null;
        }
        public T next() {
            T data = current.data;
            current = current.next;
            return data;
        }
    }
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }
    public  static <T> void printList(LinkedList<T> list) {
    	Iterator<T> iterator = list.iterator();
    	while (iterator.hasNext()) {
    	    T item = iterator.next();
    	    System.out.println(item + " ");
    	}  
    }
    
}
public class Example5 {
	public static void main(String[] args) {
    	LinkedList<Integer> intList = new LinkedList();
        intList.insert(1);
        intList.insert(2);
        intList.insert(3);
        System.out.println("Integer list: ");
        LinkedList.printList(intList);

        LinkedList<String> stringList = new LinkedList<>();
        stringList.insert("a");
        stringList.insert("b");
        stringList.insert("c");
        System.out.println("String list: ");
        LinkedList.printList(stringList);
    }
}
