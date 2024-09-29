package Logica;

import javax.swing.JOptionPane;

public class Run {
	
	public static void main(String[] args) {
		
		
		System.out.println("Probando, mirando si funcionaa");
		
		Cuenta cuenta1 = new Cuenta();
		String cedula = JOptionPane.showInputDialog("Ingrese la cedula");
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo"));
		double interes = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el interes"));
		cuenta1.setCedula(cedula);
		cuenta1.setSaldo(saldo);
		cuenta1.setInteresAnual(interes);
		while(true) {
			int opcion = Integer.parseInt(JOptionPane.showInputDialog("1.Mostrar datos de la cuenta"
					+ "\n2.Actualizar saldo"
					+ "\n3.ingresar dinero"
					+ "\n4.retirar dinero"));
			switch (opcion) {
			case 1: 
				
				JOptionPane.showMessageDialog(null, cuenta1.mostrarDatos());
				break;
			
			case 2: 
				cuenta1.actualizarSaldo();
				break;
			
			case 3:
				double cantidadIngresar=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor que quiere agregar"));
				JOptionPane.showMessageDialog(null,cuenta1.ingresar(cantidadIngresar));
				break;
			case 4:
				double cantidadRetirar=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor que quiere retirar"));
				JOptionPane.showMessageDialog(null,cuenta1.retirar(cantidadRetirar));
				break;
			default:
				break;
			}
		}
		
		
	}

}
