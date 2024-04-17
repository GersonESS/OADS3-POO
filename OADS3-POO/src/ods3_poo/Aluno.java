package ods3_poo;

import javax.swing.JOptionPane;

public class Aluno {
	String nome, cep, cidade, disciplina;
	int idade,cpf;
	float nota1, nota2, media;

	public void cadastra_aluno() {
		nome = JOptionPane.showInputDialog("Informe o seu nome:\n");
		cep  = JOptionPane.showInputDialog("Informe o seu CEP:\n");
		cidade = JOptionPane.showInputDialog("Informe o sua Cidade:\n");
		disciplina = JOptionPane.showInputDialog("Informe o sua Disciplina:\n");		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade " + nome + "\n"));
		cpf = Integer.parseInt(JOptionPane.showInputDialog("Informe a seu CPF: " + nome + "\n"));
	}
	
	public void cadastra_notas() {
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a sua primeira nota: \n"));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a sua segunda nota: \n"));
		
		media = (nota1 + nota2) / 2;
	}
	
	public void mostrar_dados() {
		
		JOptionPane.showMessageDialog(null ,"Aluno: " + nome + " Da Disciplina: " + disciplina + "\nTem sua media de notas das Provas 1 e 2 de resultado: " + media);
		
	}
	
}
