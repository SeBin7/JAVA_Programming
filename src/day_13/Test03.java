package day_13;

public class Test03 {

	public static void main(String[] args) {
		Command cmd1 = new UpdateCommand();
		cmd1.exec();
		
		Command delete = new Command() {

			@Override
			public void exec() {
				System.out.println("Delete 荐青");
				
			} 
			
		};
		delete.exec();
		
		Command update = new Command() {

			@Override
			public void exec() {
				System.out.println("Update 荐青");
				
			} 
			
		};
		update.exec();
		
		Command insert = new Command() {

			@Override
			public void exec() {
				System.out.println("Insert 荐青");
				
			} 
			
		};
		insert.exec();
	}

}

interface Command {
	void exec();
}

class UpdateCommand implements Command {

	@Override
	public void exec() {
		System.out.println("UpdateCommand 荐青");
	}

}

class DeleteCommand implements Command {

	@Override
	public void exec() {
		System.out.println("DeleteCommand 荐青");
	}

}