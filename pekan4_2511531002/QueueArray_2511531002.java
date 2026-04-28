package pekan4_2511531002;

public class QueueArray_2511531002 {
	int front_1002, rear_1002, size_1002;
	int capacity_1002;
	int array_1002[];
	
	public QueueArray_2511531002(int capacity_1002) {
		this.capacity_1002 = capacity_1002;
		front_1002 = this.size_1002 = 0;
		rear_1002 = capacity_1002 - 1;
		array_1002 = new int[this.capacity_1002];
	}
	
	boolean isFull_1002(QueueArray_2511531002 queue) {
		return (queue.size_1002 == queue.capacity_1002);
	}
	
	boolean isEmpty_1002(QueueArray_2511531002 queue) {
		return (queue.size_1002 == 0);
	}
	
	void enqueue_1002(int item_1002) {
		if (isFull_1002(this))
			return;
		this.rear_1002 = (this.rear_1002 + 1) % this.capacity_1002;
		this.array_1002[this.rear_1002] = item_1002;
		this.size_1002 = this.size_1002 + 1;
		System.out.println(item_1002 + " enqueued to queue");
	}
	
	int dequeue_1002() {
		if (isEmpty_1002(this))
			return Integer.MIN_VALUE;
		int item_1002 = this.array_1002[this.front_1002];
		this.front_1002 = (this.front_1002 + 1) % this.capacity_1002;
		this.size_1002 = this.size_1002 - 1;
		return item_1002;
	}
	int front_1002() {
		if (isEmpty_1002(this))
			return Integer.MIN_VALUE;
		return this.array_1002[this.front_1002];
	}
	int rear_1002() {
		if (isEmpty_1002(this))
			return Integer.MIN_VALUE;
		return this.array_1002[this.rear_1002];
	}
	
	void display_1002() {
		int i;
		if (front_1002 == rear_1002) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		for (i = front_1002; i < rear_1002; i++) {
			System.out.printf(" %d <--", array_1002[i]);
		}
		return;
	}
} 
 