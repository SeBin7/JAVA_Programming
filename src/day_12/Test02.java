package day_12;

interface Command {
	void exec();
	default void go() {}		//default => body{}
}

class DeleteCommand implements Command {

	@Override
	public void exec() {
		System.out.println("Data Delete ����");		
	}
	
}

class InsertCommand implements Command {

	@Override
	public void exec() {
		System.out.println("Data Insert ����");		
	}
	
	public void go() {
		
	}
}

class UpdateCommand implements Command {

	@Override
	public void exec() {
		System.out.println("Data Update ����");		
	}
	
	public void go() {
		
	}
}

public class Test02 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName(args[0]);
		Command cmd = (Command) c.newInstance();
		//Command cmd = new InsertCommand();
		cmd.exec();
		
	}
}
