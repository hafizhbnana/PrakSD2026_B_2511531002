package pekan4_2511531002;

public class Queue_2511531002 {
	int front_1002, rear_1002;
	int max_1002;
	String queue_1002[];
	
	public Queue_2511531002(int size_1002) {
		max_1002 = size_1002;
		queue_1002 = new String[max_1002];
		front_1002 = 0;
		rear_1002 = 0;
	}
	
	boolean isFull_1002() {
		return rear_1002 == max_1002;
	}
	
	boolean isEmpty_1002() {
		return front_1002 == rear_1002;
	}
	
	void enqueue_1002(String name_1002) {
		if (isFull_1002()) {
			System.out.println("Antrian penuh");
		} else {
			queue_1002[rear_1002] = name_1002;
			rear_1002++;
			System.out.println("Data berhasil ditambahkan ke antrian");
		}
	}
	
	void dequeue_1002() {
		if (isEmpty_1002()) {
			System.out.println("Antrian kosong");
		} else {
			System.out.println(queue_1002[front_1002] + " telah dilayani");
			front_1002++;
		}
	}
	
	void display_1002() {
		if (isEmpty_1002()) {
			System.out.println("Antrian kosong");
		} else {
			System.out.println("Isi antrian:");
			int no_1002 = 1;
			for (int i_1002 = front_1002; i_1002 < rear_1002; i_1002++) {
				System.out.println(no_1002 + ". " + queue_1002[i_1002]);
				no_1002++;
			}
		}
	}
	
	void reverse_1002() {
		if (isEmpty_1002()) {
			System.out.println("Antrian kosong");
		} else {
			int start_1002 = front_1002;
			int end_1002 = rear_1002 - 1;
			
			while (start_1002 < end_1002) {
				String temp_1002 = queue_1002[start_1002];
				queue_1002[start_1002] = queue_1002[end_1002];
				queue_1002[end_1002] = temp_1002;
				
				start_1002++;
				end_1002--;
			}
			System.out.println("Antrian berhasil dibalik");
		}
	}
	
}
