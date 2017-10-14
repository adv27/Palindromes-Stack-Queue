package entity;

import java.util.NoSuchElementException;

/*
 * Implement a reference based stack
 */
public class Stack<E> {

    private Node<E> top;

    public Stack() {
        this.top = null;
    }

    /*
	o * places element on the top of the stack
     */
    public void push(E element) {

        //Fill in
        Node<E> oldTop = top;
        top = new Node<>(element);
        top.next = oldTop;
    }

    /*
	 * remove the top node and return its contents
     */
    public E pop() {
        //Fill in;
        // return null; //replace
        if (empty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        E item = top.item;
        top = top.next;
        return item;
    }

    /*
	 * Look at the top element of the Stack and return it, without removing
     */
    public E peek() {
        //Fill in;
//        return null; //replace
        if (empty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        return top.getElement();
    }

    public boolean empty() {
//        return false;  //replace
        return top == null;
    }

    /**
     * Returns a string representation of this stack.
     *
     * @return the sequence of items in this stack in LIFO order, separated by
     * spaces
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Node<E> n = top; n != null; n = n.next) {
            sb.append(n.item.toString());
            sb.append(" ");
        }
        return sb.toString();
    }

}
