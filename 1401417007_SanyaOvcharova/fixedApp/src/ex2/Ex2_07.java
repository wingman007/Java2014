package ex2;

public class Ex2_07 {

	public static String[] menu;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		menu = new String[6];
		menu[1] = "Теглене на сума";
		menu[2] = "Промяна на ПИН";
		menu[3] = "Проверка на наличнаст";
		menu[4] = "Настройки";
		menu[5] = "Изход";
		
		drawMenu(menu);
		
		
		
	

	}

	public static void drawMenu(String[] menu) {
		
		
		for (int i = 1; i < menu.length; i++) {

			System.out.println(i + ". " + menu[i]);

		}

		while (true) {
			System.out.println("Изберете номер на меню!");
			int input = Ex2_05.listener.nextInt();
			
			if (numEval(input)) {
				System.out.println("Избрахте " + menu[input]);

			} else {
				System.out.println("Невалиден идентификатор");

			}
			
			if(input == 5){
				System.out.println("Излязохте от системата!");
				break;
			}
		}

		

	

	}

	
	public static boolean numEval(int input) {
		if (input > 0 && input <= 5)
			return true;
		else
			return false;

	}

}
