package ex2;

public class Ex2_07 {

	public static String[] menu;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("file.encoding" , "UTF-8");
		menu = new String[6];
		menu[1] = "Теглене на сума";
		menu[2] = "Промяна на PIN";
		menu[3] = "Проверка на наличност";
		menu[4] = "Настройки";
		menu[5] = "Изход";
		
		drawMenu(menu);
		
		
		
	

	}

	public static void drawMenu(String[] menu) {
		
		
		for (int i = 1; i < menu.length; i++) {

			System.out.println(i + ". " + menu[i]);

		}

		while (true) {
			System.out.println("Изберете меню от 1 до 5!");
			int input = Ex2_05.listener.nextInt();
			
			if (numEval(input)) {
				System.out.println("Вие избрахте " + menu[input]);

			} else {
				System.out.println("Невалиден код на операция");

			}
			
			if(input == 5){
				System.out.println("Вие излязохте от нашата система!");
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
