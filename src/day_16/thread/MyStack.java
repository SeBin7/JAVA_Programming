package day_16.thread;

public class MyStack{
	int[] st;
	int count = 0; 
	
	public MyStack() {
		//1.	MyStackŬ������ �⺻�����ڷ� �����ϸ� 
		//int Ÿ���� ������ 10���� �����ϴ� Stack Ŭ�����̴�
		st = new int[10];
	}
	public MyStack(int i) {
		//2.	��ü ���� �� ������ �Ű������� �迭�� ũ�⸦ ������ �� ������ 
		//������ �Ű������� ���� ���� �⺻������ 10���� ������ �����ϵ��� �Ѵ�. 
		st = new int[(i>0)? i : 10];
	}
	void push(int i){
		// Stack�� ���� ����
		if(isFull()){
			System.out.println("������ ���� ���� ���̻� ���� ���մϴ�.");
		}else{
			st[count++]=i;
		}
	}
	boolean isEmpty(){
		// Stack�� ����� Ȯ��
		return ((count == 0)? true : false);
	}
	boolean isFull(){
		// Stack�� ���� á�� Ȯ��
		return ((count == st.length)? true : false);
	}
	int top(){
		// Stack �ֻ��� ���ڰ� ���� Ȯ��
		// pop() �޼��带 ȣ���ߴٰ� �ؼ� ���ڰ� �����Ǵ� ���� �ƴϴ�. ���� ���ڰ� ���� ��� -1�� �����Ѵ�.
		return ((count == 0)? -1 : st[count-1]);
	}
	int pop(){
		int result = -1;
		// Stack �ֻ��� ���� ���ڸ� ���� �� �ִ�.
		// ������ �� ���ڴ� Stack���� ����. ���� ���ڰ� ���� ��� -1 �� �����Ѵ�.
		if(count != 0){
			result = st[count-1];
			st[count-1]=0;
			count--;
		}
		return result;
	}
}