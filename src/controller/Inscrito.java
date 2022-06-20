package controller;

import controller.iface.IConsumidor;
import controller.iface._IObservador;

public class Inscrito implements IConsumidor, _IObservador {

	@Override
	public void inscrever(String nomeCanal) {
		System.out.println("(Inscrito em " + nomeCanal + ", ativando notificacoes)");
	}

	@Override
	public void update(String str) {
		if (str.contains("comida")) {
			assistir(str);
		}
		if (str.contains("filme")) {
			assistir(str);
		}
	}

	public void assistir(String str) {
		System.out.println("(Assistindo video: " + str + ")");
	}
}
