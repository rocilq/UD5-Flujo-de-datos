import javax.swing.JOptionPane;

public class FlujoDatosApp {

	public static void main(String[] args) {
		ejercicio1();
		System.out.println();
		ejercicio2();
		System.out.println();
		ejercicio3();
		System.out.println();
		ejercicio4();
		System.out.println();
		ejercicio5();
		System.out.println();
		ejercicio6();
		System.out.println();
		ejercicio7();
		System.out.println();
		ejercicio8();
		System.out.println();
		ejercicio9();
		System.out.println();
		ejercicio10();
		System.out.println();
		ejercicio11();
		System.out.println();
		ejercicio12();
		System.out.println();
		ejercicio13();

	}
	
	public static void ejercicio1() {
		int a = 10;
		int b = 5;
		
		if (a>b) {
			System.out.println("El número mayor es " + a);
		}else if (a==b) {
			System.out.println("Los números son iguales");
		}else {
			System.out.println("El número mayor es " + b);	
		}
		
	}
	
	public static void ejercicio2() {
		String nombre = "Rocío";
		JOptionPane.showMessageDialog(null, "Bienvenido/a, "+nombre);
	}
	
	public static void ejercicio3() {
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		JOptionPane.showMessageDialog(null, "Bienvenido/a, "+nombre);
	}
	
	public static void ejercicio4() {
		final double PI = 3.14;
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Pon el radio del circulo"));
		double areaCirculo = PI * Math.pow(radio,2);
		System.out.println("El area del círculo es " + areaCirculo);
		
	}
	
	public static void ejercicio5() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Pon un número"));

		if (numero % 2 == 0) {
			System.out.println("Este número es divisible entre 2");
		}else {
			System.out.println("Este número no es divisible entre 2 :(");
		}

		
	}
	
	public static void ejercicio6() {	
		final double IVA = 1.21;
		double producto = Double.parseDouble(JOptionPane.showInputDialog("Pon el precio de un producto"));
		
		System.out.println("El precio final es: " + producto * IVA);
		
	}
	
	public static void ejercicio7() {
		final double IVA = 1.21;
		double producto = Double.parseDouble(JOptionPane.showInputDialog("Pon el precio de un producto"));

		System.out.println("El precio final es: " + producto * IVA);

	}
	
	public static void ejercicio8() {
		int num = 0;
		
		while (num <= 100) {
			
			System.out.println(num);
			num++;
		}

	}
	
	public static void ejercicio9() {
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0 && i % 2 == 0) {
				System.out.println(i);
			}
		}
		
	}
	
	public static void ejercicio10() {
		int precio = 0;
		int suma = 0;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Pon el número de ventas"));
		
		for (int i = 0; i < numero; i++) {
			precio = Integer.parseInt(JOptionPane.showInputDialog("Pon el precio"));
			
			suma = suma + precio;
		}
		

		System.out.println("Suma total: " + suma);
	}
	
	public static void ejercicio11() {
		String dia = JOptionPane.showInputDialog("Introduce el dia de la semana");
		switch (dia) {
		case "lunes":
			System.out.println("Dia laboral");
			break;
			
		case "martes":
			System.out.println("Dia laboral");
			break;
			
		case "miercoles":
			System.out.println("Dia laboral");
			break;
			
		case "jueves":
			System.out.println("Dia laboral");
			break;
			
		case "viernes":
			System.out.println("Dia laboral");
			break;
			
		case "sabado":
			System.out.println("Dia no laboral");
			break;
			
		case "domingo":
			System.out.println("Dia no laboral");
			break;

		default:
			break;
		}
		
	}
	
	public static void ejercicio12() {
		String contrasena = "holaquetal";
		String intento = JOptionPane.showInputDialog("Introduce la contraseña");
		int intentos = 1;
		while (!intento.equals(contrasena) && intentos < 3) {

			intento = JOptionPane.showInputDialog("Introduce la contraseña");
			intentos++;
			
		}
		JOptionPane.showMessageDialog(null, "enhorabuena");
		
	}
	
	public static void ejercicio13() {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Pon el primer número"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Pon el segundo número"));
		String signo = JOptionPane.showInputDialog("Introduce el signo");
		
		switch (signo) {
		case "+":
			JOptionPane.showMessageDialog(null, num1 + num2);
			break;
			
		case "-":
			JOptionPane.showMessageDialog(null, num1 - num2);
			break;

		case "*":
			JOptionPane.showMessageDialog(null, num1 * num2);
			break;
		
		case "/":
			JOptionPane.showMessageDialog(null, num1 / num2);
			break;
			
		case "^":
			JOptionPane.showMessageDialog(null, Math.pow(num1, num2));
			break;
		
		case "%":
			JOptionPane.showMessageDialog(null, num1 % num2);
			break;
			
		default:
			break;
		}
		
		
	}
	
	
	
	

}
