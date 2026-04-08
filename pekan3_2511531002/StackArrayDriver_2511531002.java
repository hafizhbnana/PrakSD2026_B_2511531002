package pekan3_2511531002;

public class StackArrayDriver_2511531002 {
	public static void main(String[] args) {
		StackArray_2511531002 s = new StackArray_2511531002();
		s.push_2511531002(10);
		s.push_2511531002(20);
		s.push_2511531002(30);
		System.out.println(s.pop_2511531002() + " dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah : " + s.peek_2511531002());
		System.out.print("Elemen pada stack : ");
		s.print();
	}
}
