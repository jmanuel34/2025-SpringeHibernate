package main;

import vista.BancoVistaImpl;
import vista.BancoVista;

public class Main {
	public static void main(String[] args) {
		BancoVista bancoVista = new BancoVistaImpl();
		bancoVista.iniciarAplicacion();
	}
}
