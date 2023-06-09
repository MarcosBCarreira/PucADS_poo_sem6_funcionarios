import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		var funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(new Concursado("João", 4000, 5 ));   // João
		funcionarios.add(new Temporario("José", 2000, 12 ));  // José
		funcionarios.add(new Concursado("Maria", 2400, 34)); // Maria
		funcionarios.add(new Temporario("Pedro", 1200, 10)); // Pedro

		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario.nome + "," + (funcionario instanceof Temporario ? " Temporario, " : " Concursado, ") +
					"com salário-base de: " + funcionario.getSalario() + " e " +
					(funcionario instanceof Temporario ? (funcionario.getTempoServico() + " meses de contrato.") : (funcionario.getTempoServico() 
							+ " anos de serviço.")));
		}
	
	}

}