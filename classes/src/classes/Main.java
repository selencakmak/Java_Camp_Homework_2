package classes;

public class Main {

	public static void main(String[] args) {
		//classlar referans type
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
		
        customerManager.add();
		customerManager.remove();
		customerManager.update();
		

	}

}


