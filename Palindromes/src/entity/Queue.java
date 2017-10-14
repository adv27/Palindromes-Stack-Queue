package entity;

import java.util.NoSuchElementException;

/*
 * Implement a reference based queue
 */
public class Queue<E> {

    private Node<E> front;
    private Node<E> back;

    public Queue() {
        this.front = null;
        this.back = null;
    }

    /*
	 * places element in the back of the Queue
     */
    public void enqueue(E element) {

        //Fill in
        Node<E> oldBack = back;
        back = new Node<>(element);
        back.next = null;
        if (empty()) {
            front = back;
        } else {
            oldBack.next = back;
        }
    }

    /*
	 * remove the front node of the queue and return it
     */
    public E dequeue() {
        //Fill in;
//        return null; //replace
        if (empty()) {
            throw new NoSuchElementException("Queue underflow");
        }
        E item = front.item;
        front = front.next;
        if (empty()) {
            back = null;    // to avoid loitering
        }
        return item;
    }

    /*
	 * Look at the front of the queue and return it, without removing
     */
    public E peek() {
        //Fill in;
//        return null; //replace
        return front.item;
    }

    public boolean empty() {
//        return false;  //replace
        return front == null;
    }

    /**
     * Returns a string representation of this queue.
     *
     * @return the sequence of items in FIFO order, seperate by space
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Node<E> n = front; n != null; n = n.next) {
            sb.append(n.item.toString());
            sb.append(" ");
        }
        return sb.toString();
    }

}
