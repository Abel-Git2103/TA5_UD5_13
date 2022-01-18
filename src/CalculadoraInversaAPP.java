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
				JOptionPane.showMessageDialog(null, "resultado de A + B es = " + (valorEnteroA + valorEnteroB));
				break;
			case "-":
				JOptionPane.showMessageDialog(null, "El resultado de A - B es = " + (valorEnteroA - valorEnteroB));
				break;
			case "*":
				JOptionPane.showMessageDialog(null, "El resultado de A * B es = " + (valorEnteroA * valorEnteroB));
				break;
			case "/":
				JOptionPane.showMessageDialog(null, "El resultado de A / B es = " + (valorEnteroA / valorEnteroB));
				break;
			case "^":
				JOptionPane.showMessageDialog(null, "El resultado de A ^ B es = " + (Math.pow(valorEnteroA, valorEnteroB)));
				break;
			case "%":
				JOptionPane.showMessageDialog(null, "El resto de A / B es = " + (valorEnteroA % valorEnteroB));
				break;
			default:
				JOptionPane.showMessageDialog(null, "El valor introducido no es correcto");
				
		}
	}
}
