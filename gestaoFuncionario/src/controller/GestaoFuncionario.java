package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GestaoFuncionario {
	
	private int indice = 0;
	private Funcionario[] funcionarios = new Funcionario[50];
    Scanner scan = new Scanner(System.in);
	
	
	void criar() {
		Funcionario fun = new Funcionario();
		
		System.out.println("Informe os dados do funcionario: ");
	    fun.setId(0);	 
	    
	    System.out.println("Digite sua matricula: ");
	    fun.setMatricula(scan.nextLine());
	    
	    System.out.println("Informe seu nome: ");
	    fun.setNome(scan.nextLine());
	    
	    //System.out.println("Informe sua data de admissao: ");
		//fun.setAdmissao(scan.nextLine());
	    
	    try {
	    	System.out.println("Informe sua data de admissao: ");
	    	 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = formatter.parse(scan.next());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	 
	    try {
	    	System.out.println("Informe sua data de demissao: ");
	    	 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = formatter.parse(scan.next());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	    //System.out.println("Informe sua data de demissao: ");
	    //fun.setDemissao(scan.nextLine());
	    
	    System.out.println("Informe seu salario: ");
	    fun.setSalario(scan.nextFloat());
	    
	    System.out.println("Informe seu horario: ");
	    fun.setHorario(scan.next());
	    
	    this.funcionarios[this.indice] = fun;
	    this.indice += 1;
	    
	    System.out.println("Funcionario criado com sucesso!");
	    System.out.println("Aperte ENTER para continuar!");
	    scan.nextLine();
	}
	
	void exibir() {
		System.out.println("Informe a MATRICULA do funcionario(a): ");
		String matricula = scan.nextLine();
		
		int i = 0;
		
		while( i < funcionarios.length ) {
			Funcionario objFun = funcionarios[i];
			if(objFun != null && objFun.getMatricula().contains(matricula)) {
				objFun.exibir();
			}
			i += 1;
		}
		System.out.println("Funcionario exibido com sucesso!");
	    System.out.println("Aperte ENTER para continuar!");
	    scan.nextLine();
			
	}
	
	void excluir() {
		System.out.println("Informe a MATRICULA do funcionario(a): ");
		String matricula = scan.nextLine();
		
		for(int i = 0; i < this.funcionarios.length; i++ ) {
			Funcionario obj = this.funcionarios[i];
			if(obj != null && obj.getMatricula().equals(matricula)) {
				this.funcionarios[i] = null;
				System.out.println("Funcionario excluido com sucesso!");
			}
			
		}
	    System.out.println("Aperte ENTER para continuar!");
	    scan.nextLine();
	}
	
	void atualizar() {
		System.out.println("Informe a MATRICULA do(a) Funcionario(a): ");
		String matricula = scan.nextLine();
		for (Funcionario fun : this.funcionarios) { 
			if (fun != null && fun.getMatricula().equals(matricula)) {
				System.out.println("Dados atuais do Funcionario(a)");
				fun.exibir();
				System.out.println("Digite o nova MATRICULA deste funcionario(a): ");
				fun.setMatricula(scan.nextLine());
				System.out.println("Digite o novo NOME deste funcionario(a): ");
				fun.setNome(scan.nextLine());
				System.out.println("Funcionario(a) atualizado com sucesso");
				break;
			}
		}
		System.out.println("Tecler <ENTER> para continuar");
		scan.nextLine();
	}
	
	public void menu() {
		while(true) {
			for (int i = 0; i < 30; ++i) System.out.println();
			
			System.out.println("M E N U  P R I N C I P A L");
			System.out.println("**** GESTAO DE FUNCIONARIOS ****");
			System.out.println("Escolha uma opcao: ");
			System.out.println("(C)riar\t\t(E)xibir\t(R)emover");
			System.out.println("(A)tualizar\t(S)air");
			String textoMaiusculo = scan.nextLine().toUpperCase();
            char letra = textoMaiusculo.charAt(0);
			
			if (letra == 'C') { 
				criar();
			} else if (letra == 'E') { 
				exibir();
			} else if (letra == 'R') { 
				excluir();
			} else if (letra == 'A') { 
				atualizar();
			} else if (letra == 'S') { 
				System.out.println("Bye Bye!!!");
				System.exit(0);
			}
		} 
	}
}

