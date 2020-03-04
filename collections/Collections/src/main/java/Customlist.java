import java.util.*;
public class List<E> {
	    private int size = 0;
	    private static final int DEFAULT_CAPACITY = 10;
	    private Object elements[];
	    public Customlist() {
	        elements = new Object[DEFAULT_CAPACITY];
	        for(int i=0;i<10;i++)
	        {
	        	elements[size++] = i+1;
	        }
	    }
	    public void add(E e) {
	        if (size == elements.length) {
	            ensureCapacity();
	        }
	        elements[size++] = e;
	    }
	    public E  fetch(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        return (E) elements[i];
	    }
	    public E remove(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        Object item = elements[i];
	        int numElts = elements.length - ( i + 1 ) ;
	        System.arraycopy( elements, i + 1, elements, i, numElts ) ;
	        size--;
	        return (E) item;
	    }
	    
	    public int size() {
	        return size;
	    }
	    public String toString() 
	    {
	         StringBuilder sb = new StringBuilder();
	         for(int i = 0; i < size ;i++) {
	             sb.append(elements[i].toString());
	             if(i<size-1){
	                 sb.append(" ");
	             }
	         }
	         return sb.toString();
	    }
	     
	    private void ensureCapacity() {
	        int newSize = elements.length * 2;
	        elements = Arrays.copyOf(elements, newSize);
	    }
	

}
