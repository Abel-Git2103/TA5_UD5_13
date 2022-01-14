import javax.swing.JOptionPane;

public class CalculadoraInversaAPP {

	public static void main(String[] args) {
		
		String valorA =JOptionPane.showInputDialog("Introduce el valor A");
		double valorEnteroA = Double.parseDouble(valorA);
		String valorB =JOptionPane.showInputDialog("Introduce el valor B");
		double valorEnteroB = Double.parseDouble(valorB);
		String signo = JOptionPane.showInputDialog("Introduce el signo aritmético");
		
		switch (signo) {
			case "+":
				System.out.println("El resultado de A + B es = " + (valorEnteroA + valorEnteroB));
				break;
			case "-":
				System.out.println("El resultado de A - B es = " + (valorEnteroA - valorEnteroB));
				break;
			case "*":
				System.out.println("El resultado de A * B es = " + (valorEnteroA * valorEnteroB));
				break;
			case "/":
				System.out.println("El resultado de A / B es = " + (valorEnteroA / valorEnteroB));
				break;
			case "^":
				System.out.println("El resultado de A ^ B es = " + (Math.pow(valorEnteroA, valorEnteroB)));
				break;
			case "%":
				System.out.println("El resto de A / B es = " + (valorEnteroA % valorEnteroB));
				break;
			default:
				System.out.println("El valor introducido no es correcto");
				
		}
	}
}
