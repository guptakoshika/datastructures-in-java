package DataStuctures;

public class QueueUsingList {

    private int front ;
    private int rear; 
    private Linkedlsit l ;
    public QueueUsingList(){
           front = rear = -1;
        l = new Linkedlsit();
    }

    void enqueue(int data) {
        rear++;
        l.add_at_last(data);
        if (front == -1) {
            front++;
        }
    }

    void dequeue() {
        front++;
        l.deleteFromBegining();
    }

    int peek() {
        return l.peek();
    }

    int size() {
        return rear - front;
    }
