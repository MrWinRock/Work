// ใครจะลอก ไปอ่าน README.md

public class Work3 {

    int SIZE = 5, front = -1, rear = -1;
    String item[] = new String[SIZE];

    boolean isFull() {
        if (front == 0 && rear == SIZE - 1)
            return true;
        if (front == rear + 1)
            return true;
        return false;
    }

    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    void enQueue(String name) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % SIZE;
            item[rear] = name;
            System.out.println(name);
        }
    }

    void display() {

        System.out.println("------------------------------------------");

        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Queue");
            for (int i = front; i != rear; i = (i + 1) % SIZE) {
                System.out.print(item[i] + " ");
            }
        }

        System.out.println("\n------------------------------------------");
    }

    public static void main(String[] args) {

        Work1 q = new Work1();

        q.enQueue("Name1");
        q.enQueue("Name2");
        q.enQueue("Name3");
        q.enQueue("Name4");
        q.enQueue("Name5");
        q.enQueue("Name6");

        q.display();

    }
}