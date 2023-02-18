// ใครจะลอก ไปอ่าน README.md

public class Work4 {

    int SIZE = 5, front = 0, rear = 4;
    String items[] = { "Name1", "Name2", "Name3", "Name4", "Name5" };

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

    String deQueue() {
        String name;
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return "";
        } else {
            name = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % SIZE;
            }

            System.out.println("Delete: " + name);
            return (name);
        }

    }

    void display() {

        System.out.println("------------------------------------------");

        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Queue");
            for (int i = front; i != rear; i = (i + 1) % SIZE) {
                System.out.print(items[i] + " ");
            }
        }

        System.out.println("\n------------------------------------------");
    }

    public static void main(String[] args) {

        Work2 q = new Work2();

        q.display();

        q.deQueue();
        q.deQueue();
        q.deQueue();

        q.display();

    }
}