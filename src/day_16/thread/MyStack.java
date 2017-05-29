package day_16.thread;

public class MyStack{
	int[] st;
	int count = 0; 
	
	public MyStack() {
		//1.	MyStack클래스는 기본생성자로 생성하면 
		//int 타입의 정수를 10개만 저장하는 Stack 클래스이다
		st = new int[10];
	}
	public MyStack(int i) {
		//2.	객체 생성 시 생성자 매개변수로 배열의 크기를 지정할 수 있으나 
		//음수가 매개변수로 들어올 경우는 기본적으로 10개의 정수를 저장하도록 한다. 
		st = new int[(i>0)? i : 10];
	}
	void push(int i){
		// Stack에 정수 저장
		if(isFull()){
			System.out.println("스텍이 가득 차서 더이상 넣지 못합니다.");
		}else{
			st[count++]=i;
		}
	}
	boolean isEmpty(){
		// Stack이 비었나 확인
		return ((count == 0)? true : false);
	}
	boolean isFull(){
		// Stack이 가득 찼나 확인
		return ((count == st.length)? true : false);
	}
	int top(){
		// Stack 최상위 숫자가 뭔지 확인
		// pop() 메서드를 호출했다고 해서 숫자가 삭제되는 것은 아니다. 꺼낼 숫자가 없는 경우 -1을 리턴한다.
		return ((count == 0)? -1 : st[count-1]);
	}
	int pop(){
		int result = -1;
		// Stack 최상위 저장 숫자를 꺼낼 수 있다.
		// 꺼내면 그 숫자는 Stack에서 삭제. 꺼낼 숫자가 없는 경우 -1 을 리턴한다.
		if(count != 0){
			result = st[count-1];
			st[count-1]=0;
			count--;
		}
		return result;
	}
}