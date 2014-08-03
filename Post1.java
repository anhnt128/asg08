//Cau 1. Dung co so khi bat ngoai le ...

class ExceptionA extends Exception {
}

class ExceptionB extends ExceptionA {
}

class ExceptionC extends ExceptionB {
}

public class Post1 {
	public static void main(String[] args) {
		try {
			throw new ExceptionB();
		}
		catch(ExceptionA eA) {
			eA.printStackTrace();
		}
	
		try {
			throw new ExceptionC();
		}
		catch(ExceptionA eA) {
			eA.printStackTrace();
		}
	}
}
