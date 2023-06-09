
public class Temporario extends Funcionario {
	
	private int mesesContrato;
	
	public Temporario (String nome, int salario, int mesesContrato) {
		super(nome, salario);
		this.mesesContrato = mesesContrato;		
		
	}

	//public int getMesesContrato() {
		//return mesesContrato;
	//}
	
	

	public void setMesesContrato(int mesesContrato) {
		this.mesesContrato = mesesContrato;
	}

	@Override
	protected double getGratificacao() {
		// TODO Auto-generated method stub
		return mesesContrato * 100.0;
	}

	@Override
	protected int getTempoServico() {
		// TODO Auto-generated method stub
		return mesesContrato;
	}
	
	

	

}
