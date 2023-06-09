
public class Concursado extends Funcionario {
	
	private int anosTrabalho;
	
	
	public Concursado(String nome, double salarioBase, int anosTrabalho) {
		super(nome, salarioBase);
		this.anosTrabalho = anosTrabalho;
	}

	public int getAnosTrabalho() {
		return anosTrabalho;
	}

	public void setAnosTrabalho(int anosTrabalho) {
		this.anosTrabalho = anosTrabalho;
	}
	
	@Override
	public double getGratificacao () {
		int anosTrab = anosTrabalho/5;		
		return anosTrab * (super.salarioBase * 0.2); 
	}

	@Override
	protected int getTempoServico() {
		// TODO Auto-generated method stub
		return anosTrabalho;
	}
	
	

}
