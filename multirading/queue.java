public class queue {
    public static void main(String[] args) {
        SimpleQueue queue = new SimpleQueue(5);
        queue.enque(5);
        queue.dequeue();
        System.out.println("Dequeued: " + queue.dequeue()); // Should remove 10
        System.out.println("Front item: " + queue.peek());
    }
}
class SimpleQueue
{
    private int front;
    private int rear;
    private int size;
    private int[] value;
    private int niewm;

    public SimpleQueue(int i)
    {
        size = i;
        value = new int[size];
        front = 0;
        rear = -1;
        niewm = 0;
    }
    public void enque(int value1)
    {
        if(isFull())
        {
            System.out.println("que empty");
        }
        else{
            if(rear == size -1)
            {
                rear = -1;
            }
            value[++rear] = value1;
            niewm++;
            System.out.println("enqueue"+value);
        }
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue full");
            return -1;
        }
        else{
            int temp = value[front++];
            if(front == size)
            {
                front =0;
            }
            niewm--;
            return temp;
        }

    }
    public boolean isEmpty() {
        return (niewm == 0);
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return (niewm == size);
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return value[front];
    }
 }
