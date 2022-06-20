package controller;

import java.util.List;
import controller.iface.IProdutor;
import controller.iface._IObservavel;

public class CriadorConteudo implements IProdutor, _IObservavel {

	private List<Inscrito> inscritos;

	public CriadorConteudo(List<Inscrito> inscritos) {
		this.inscritos = inscritos;
	}

	@Override
	public void notificacao(String str) {
		for (Inscrito i: inscritos) {
			i.update(str);
		}
	}

	@Override
	public void criarConteudo(String tituloVideo) {
		System.out.println("Novo video postado: " + tituloVideo);
		notificacao(tituloVideo);
	}	
}
