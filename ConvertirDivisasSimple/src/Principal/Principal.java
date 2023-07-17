package Principal;

import javax.swing.*;
//import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

import ConversorMonedas.OpcionesConversion;
import ConversorTemperatura.OpcionesConvTempe;


public class Principal {

	public static void main(String[] args) {
		
		OpcionesConversion conversion = new OpcionesConversion();
		OpcionesConvTempe conversionT = new OpcionesConvTempe();
		
		while(true) {
			String opciones = (String) JOptionPane.showInputDialog(null, "Seleccioná una opción", "Menú principal", JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"Conversor de Monedas", "Conversor de Temperatura"},null);
			
			String Chau = "Click OK para cerrar.";
			if (opciones == null) {
				JOptionPane.showMessageDialog(null, Chau);
				break;
			} else {		
				String otraVez = "¿Querés hacer otra convercion?";
				String finalizado = "Programa finalizado";
					
				switch(opciones) {
					case "Conversor de Monedas":
	//------------------------------------------------------------------INICIO MONEDAS---------------
					while (true) {
						String inputMonto = "";
						double montoRecibido = 0.0;
						boolean valido = false;
							
						while (!valido) {
							inputMonto = JOptionPane.showInputDialog(null, "Ingresá el monto a convertir");
							
							if (inputMonto == null) {
								JOptionPane.showMessageDialog(null, "Operación cancelada");
								System.exit(0);
							} else if (inputMonto.trim().isEmpty()) {
							    JOptionPane.showMessageDialog(null, "El monto no puede estar en blanco. Por favor, ingresaá un monto.");
							} else {
								try {
								   montoRecibido = Double.parseDouble(inputMonto);
								   valido = true;
								} catch (NumberFormatException e) {
								    JOptionPane.showMessageDialog(null, "Valor inválido. Ejemplo: numero (punto) decimales");
							    }
							}
					    } //ciera el while valido
						//Si todo esta bien te deja entrar a la conversion		
						conversion.ConvertirMonedas(montoRecibido);					
								
						int respuesta = JOptionPane.showConfirmDialog(null, otraVez);
						if(JOptionPane.OK_OPTION == respuesta) {
							continue;
						} else if (respuesta == JOptionPane.NO_OPTION){
							JOptionPane.showMessageDialog(null, Chau);
							break;
						} else {
							JOptionPane.showMessageDialog(null, finalizado);
							break;
						}
					} 
					break;	
//------------------------------------------------------FIN MONEDAS---------------
//------------------------------------------------------INICIO TEMPRARUTA---------------						
					
					case "Conversor de Temperatura":
						while (true) {
							String inputTemp = "";
							double TempRecibido = 0.0;
							boolean validoTempe = false;
							
							while (!validoTempe) {
							inputTemp = JOptionPane.showInputDialog(null, "Ingresa la teperatura a convertir");

							   if (inputTemp == null) {
							        JOptionPane.showMessageDialog(null, "Operación cancelada");
							        System.exit(0); 
							    } else if (inputTemp.trim().isEmpty()) {
							        JOptionPane.showMessageDialog(null, "El campo temperatura no puede estar en blanco, por favor escribí un numero o cerra el programa.");
							    } else {
							        try {
							        	TempRecibido = Double.parseDouble(inputTemp);
							        	validoTempe = true; 
							        } catch (NumberFormatException e) {
							            JOptionPane.showMessageDialog(null, "Valor inválido. Ejemplo: numero (punto) decimales");
							        }
							    }
							}
							
							conversionT.ConvertirTemperaturas(TempRecibido);
								
							int tempRespuesta = JOptionPane.showConfirmDialog(null, otraVez);
							if(JOptionPane.OK_OPTION == tempRespuesta) {
								continue;
							} else if (tempRespuesta == JOptionPane.NO_OPTION){
								JOptionPane.showMessageDialog(null, Chau);
								break;
							} else {
								JOptionPane.showMessageDialog(null, finalizado);
								break;
							}
						} 
						break; //Termina caso de Temp
				} 
				break; //Termina swtchi case del todo.
	
			} //Cierra el else

		} //Cierra el while de arriba
					
	}
}
	

