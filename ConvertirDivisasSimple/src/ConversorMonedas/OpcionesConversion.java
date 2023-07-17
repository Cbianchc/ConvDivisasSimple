package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
	
	String opcion = (String) JOptionPane.showInputDialog(null,
			"Elije la moneda que deseas convertir tu dinero ",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{
						"Pesos Arg 👉 Dólar", 
						"Pesos Arg 👉 Euro", 
						"Pesos Arg 👉 Libras", 
						"Pesos Arg 👉 Peso Mex", 
						"Pesos Arg 👉 Reales", 
						"Dólar 👉 Pesos Arg", 
						"Euro 👉 Pesos Arg", 
						"Libras 👉 Pesos Arg", 
						"Peso Mex 👉 Pesos Arg", 
						"Reales 👉 Pesos Arg"
						}, 
					"Seleccion");
	
	if (opcion == null) {
		JOptionPane.showMessageDialog(null, "Tenes que elejir un tipo de conversion");
		
	} else {
	
		switch (opcion) {
		case "Pesos Arg 👉 Dólar": 
			monedas.ConvertirArgDolares(valor);
			break;
		
		case "Pesos Arg 👉 Euro": 
			monedas.ConvertirArgEuros(valor);
			break;
			
		case "Pesos Arg 👉 Libras":
			monedas.ConvertirArgLibra(valor);
			break;
			
		case "Pesos Arg 👉 Peso Mex":
			monedas.ConvertirArgPesoMex(valor);
			break;
			
		case "Pesos Arg 👉 Reales":
			monedas.ConvertirArgReales(valor);
			break;
		
			
		//-------------------------de otras a pesos
		case "Dólar 👉 Pesos Arg":
			monedas.ConvertirDolaresAPesos(valor);
			break;
			
		case "Euro 👉 Pesos Arg":
			monedas.ConvertirEurosAPesos(valor);
			break;
			
		case "Libras 👉 Pesos Arg":
			monedas.ConvertirLibraAPesos(valor);
			break;
		 
		case "Peso Mex 👉 Pesos Arg":
			monedas.ConvertirMexAPesos(valor);
			break;
			
		case "Reales 👉 Pesos Arg":
			monedas.ConvertirRealesAPesos(valor);
			break;
		}
	}
	}

}
