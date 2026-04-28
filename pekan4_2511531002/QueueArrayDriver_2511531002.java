package pekan4_2511531002;

public class QueueArrayDriver_2511531002 {
	public static void main(String[] args) {
		QueueArray_2511531002 queue_1002 = new QueueArray_2511531002(1000);
		queue_1002.enqueue_1002(10);
		queue_1002.enqueue_1002(20);
		queue_1002.enqueue_1002(30);
		queue_1002.enqueue_1002(40);
		System.out.println("Item di depan: " + queue_1002.front_1002());
		System.out.println("Item paling belakang: " + queue_1002.rear_1002());
		System.out.println("Tampilan Queue");
		queue_1002.display_1002();
		System.out.println();
		System.out.println(queue_1002.dequeue_1002() + " dihapus dari queue");
		System.out.println("Item di depan: " + queue_1002.front_1002());
		System.out.println("Item di belakang: " + queue_1002.rear_1002());
		System.out.println("Tampilan queue setelah satu data dihapus");
		queue_1002.display_1002();
	}
}
