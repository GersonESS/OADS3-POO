package ods3_poo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		
	
		int op=0;
		
		while (op != 99) {
			
			JOptionPane.showMessageDialog(null, "Bem-Vindo nosso programa em JAVA da Turma OADS3 \n");
			JOptionPane.showMessageDialog(null, "Vamos cadastrar suas informações\n");
			
			op = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha um opção do menu abaixo: \n 1 - Cadastrar Aluno \n 2 - Cadastrar Notas "
					+ "\n 3 - Listar as informações \n 4 - Sair: \n"));
			
			switch (op) {
			
			case 1:{
					
				JOptionPane.showMessageDialog(null, "Cadastro de Aluno: \n");
				aluno1.cadastra_aluno();
				break;
			}
			
			case 2:{
				
				JOptionPane.showMessageDialog(null, "Cadastro de Notas: \n");
				aluno1.cadastra_notas();
				break;
			}
			
			case 3:{
				
				JOptionPane.showMessageDialog(null, "Alunos Cadastrados: \n");
				aluno1.mostrar_dados();
				aluno2.mostrar_dados();
				break;
			}
			
			case 4:{
				
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
				op=99;
				
			}
			
			}
			
			
		}
		
		
		
	}

}
