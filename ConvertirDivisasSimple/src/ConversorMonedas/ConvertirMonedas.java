package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	String tenes = "Tenes: $";
	String en$ = " en pesos";
	//Cotizaciones fijas
	Double valorDolar = 500.90; 
	Double valorEuro = 550.20;
	Double valorLibra = 360.30;
	Double valorMex = 15.80;
	Double valorReales = 55.09;
	
	
	//De pesos Arg a otras
	public void ConvertirArgDolares(double valor) {
		
		double monedaDolar = valor / valorDolar;
		monedaDolar = (double)Math.round(monedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, tenes + monedaDolar + " Dolares");
	}
	public void ConvertirArgEuros(double valor) {
		double monedaEuro = valor / valorEuro;
		monedaEuro = (double)Math.round(monedaEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, tenes + monedaEuro + " Euros");
	}
	public void ConvertirArgLibra(double valor) {
		double monedaLibra = valor / valorLibra;
		monedaLibra = (double)Math.round(monedaLibra * 100d) /100 ;
		JOptionPane.showMessageDialog(null, tenes + monedaLibra + " Libras Esterlinas");
	}
	public void ConvertirArgPesoMex(double valor) {
		double monedaMex = valor / valorMex;
		monedaMex = (double)Math.round(monedaMex * 100d) /100 ;
		JOptionPane.showMessageDialog(null, tenes + monedaMex + " Pesos Mexicanos");
	}
	public void ConvertirArgReales(double valor) {
		double monedaReales = valor / valorReales;
		monedaReales = (double)Math.round(monedaReales * 100d) /100 ;
		JOptionPane.showMessageDialog(null, tenes + monedaReales + " Reales");
	}
	
	//De otra a Pesos Arg
	public void ConvertirDolaresAPesos(double valor) {
		double desdeDolar = valor * valorDolar;
		desdeDolar = (double)Math.round(desdeDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tus Dolares son: " + desdeDolar + en$);
	}
	public void ConvertirEurosAPesos(double valor) {
		double desdeEuro = valor * valorEuro;
		desdeEuro = (double)Math.round(desdeEuro * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tus Euros son: " + desdeEuro + en$);
	}
	public void ConvertirLibraAPesos(double valor) {
		double desdeLibras = valor * valorLibra;
		desdeLibras = (double)Math.round(desdeLibras * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tus Libras son " + desdeLibras + en$);
	}
	public void ConvertirMexAPesos(double valor) {
		double desdeMex = valor * valorMex;
		desdeMex = (double)Math.round(desdeMex * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tus pesos Mexicanos son: " + desdeMex + en$);
	}
	public void ConvertirRealesAPesos(double valor) {
		double desdeReales = valor * valorReales;
		desdeReales = (double)Math.round(desdeReales * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Tus Reales son: " + desdeReales + en$);
	}

}
