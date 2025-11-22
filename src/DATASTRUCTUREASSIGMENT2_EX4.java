public class DATASTRUCTUREASSIGMENT2_EX4 {

    private int C, F, R;
    private int[] queue;

    //this is for the queue
    public DATASTRUCTUREASSIGMENT2_EX4(int C) {
        this.C = C;
        this.F = -1;
        this.R = -1;
        this.queue = new int[C];
    }

    public void enqueue(int value) {
        if ((R + 1) % C == F) {
            System.out.println("queue is full" + value);
            return;
        }
        if (F == -1) { // first insertion
            F = 0;
        }
        R = (R + 1) % C;
        queue[R] = value;
        System.out.println("enqueued: " + value);
        display();
    }

    public int dequeue() {
        if (F == -1) {
            System.out.println("queue is empty");
            return Integer.MIN_VALUE;
        }
        int value = queue[F];
        if (F == R) {
            F = R = -1;
        } else {
            F = (F + 1) % C;
        }
        System.out.println("dequeued: " + value);
        display();
        return value;
    }

    public void display() {
        if (F == -1) {
            System.out.println("queue: [empty]\n");
            return;
        }
        System.out.print("queue: ");
        int i = F;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == R) break;
            i = (i + 1) % C;
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        DATASTRUCTUREASSIGMENT2_EX4 q = new DATASTRUCTUREASSIGMENT2_EX4(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(50);
        q.dequeue();
        q.enqueue(40);
        q.enqueue(60);
        q.dequeue();
    }
}
