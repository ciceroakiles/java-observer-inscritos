package view;

import java.util.ArrayList;
import java.util.List;
import controller.CriadorConteudo;
import controller.Inscrito;

public class Main {

	public static void main(String[] args) {
		Inscrito i1 = new Inscrito();
		Inscrito i2 = new Inscrito();
		Inscrito i3 = new Inscrito();
		
		List<Inscrito> inscritos = new ArrayList<Inscrito>();
		inscritos.add(i1);
		inscritos.add(i2);
		inscritos.add(i3);
		CriadorConteudo cc = new CriadorConteudo("Canal Legal", inscritos);
		
		cc.criarConteudo("Preparando comida caseira, parte 1");
		cc.criarConteudo("Compilado de memes sem graca");
		cc.criarConteudo("Analise do novo filme de superheroi");
	}
}
