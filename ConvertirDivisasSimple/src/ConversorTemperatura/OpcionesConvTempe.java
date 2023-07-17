package ConversorTemperatura;

import javax.swing.JOptionPane;



public class OpcionesConvTempe {
	
	ConvertirTempe temperatura = new ConvertirTempe();
	
	
	public void ConvertirTemperaturas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elejí la Teperatura a convertir ",  "Tipo de Conversion",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{
						"Celsius a Fahrenheit", 
						"Celsius a Kelvin", 
						"Celsius a Rankine", 
						"Fahrenheit a Celsius", 
						"Fahrenheit a Kelvin", 
						"Fahrenheit a Rankine",
						"Kelvin a Celsius", 
						"Kelvin a Fahrenheit", 
						"Kelvin a Rankine", 
						"Rankine a Celsius", 
						"Rankine a Fahrenheit", 
						"Rankine a Kelvin"
						}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "Celsius a Fahrenheit":
		temperatura.ConvCelsiusFahrenheit(valor);
		break;
	
	case "Celsius a Kelvin": 
		temperatura.ConvCelisusKelvin(valor);
		break;
		
	case "Celsius a Rankine":
		temperatura.ConvCelsiusRankine(valor);
		break;
		
	case "Fahrenheit a Celsius":
		temperatura.ConvFahrenheitCelsius(valor);
		break;
		
	case "Fahrenheit a Kelvin":
		temperatura.ConvFahrenheitKelvin(valor);
		break;
	
	case "Fahrenheit a Rankine":
		temperatura.ConvFahrenheitRankine(valor);
		break;
		
	case "Kelvin a Celsius":
		temperatura.ConvKelvinCelsius(valor);
		break;
		
	case "Kelvin a Fahrenheit":
		temperatura.ConvKelvinFahrenheit(valor);
		break;
	 
	case "Kelvin a Rankine":
		temperatura.ConvKelvinRankine(valor);
		break;
		
	case "Rankine a Celsius":
		temperatura.ConvRankineCelsius(valor);
		break;
		
	case "Rankine a Fahrenheit":
		temperatura.ConvRankineFahrenheit(valor);
		break;
		
	case "Rankine a Kelvin":
		temperatura.ConvRankineKelvin(valor);
		break;
	}
	}
	}



