package pekan3_2511531002;

public class StackArray_2511531002 {
	static final int MAX = 1000;
	int top_2511531002;
	int a[] = new int[MAX];
	boolean isEmpty()
	{
		return (top_2511531002< 0);
	}
	StackArray_2511531002()
	{
		top_2511531002 = -1;
	}
	boolean push_2511531002(int x)
	{
		if (top_2511531002 >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top_2511531002] = x;
			System.out.println(x + " dimasukkan dalam stack");
			return true;
		}
	}
	int pop_2511531002()
	{
		if (top_2511531002 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top_2511531002--];
			return x;
		}
	}
	int peek_2511531002()
	{
		if (top_2511531002 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top_2511531002];
			return x;
		}
	}
	void print() {
		for(int i = top_2511531002; i > -1; i--) {
			System.out.print(" " + a[i]);
		}
	}
}
