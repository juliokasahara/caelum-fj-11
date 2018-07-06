package View;

import Model.EmpregadoDaFaculdade;
import Model.ProfessorDaFaculdade;
import Model.ReitorDaFaculdade;
import Model.RelatorioFuncionarios;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpregadoDaFaculdade ana = new EmpregadoDaFaculdade("Ana", 500);
		ProfessorDaFaculdade carlos = new ProfessorDaFaculdade("carlos", 1000);
		carlos.getGastos(5);
		
		System.out.println(ana.getInfo());
		System.out.println(carlos.getInfo());
		
		RelatorioFuncionarios r = new RelatorioFuncionarios();
		
		r.Relatorio(ana);
		r.Relatorio(carlos);
		
		ReitorDaFaculdade joao = new ReitorDaFaculdade("joao", 3000);
		r.Relatorio(joao);

	}

}
