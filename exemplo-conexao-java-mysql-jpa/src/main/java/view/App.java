package view;

import javax.swing.JFrame;

import controller.AlunoJpaDAO;
import model.Alunos;


public class App 
{
    public static void main(String[] args ){
        Alunos alunos = new Alunos();
        alunos.setNome("Jeferson");
        alunos.setId_aluno(1);
        alunos.setEndereco("Av. Aguia de Haia");
        
        AlunoJpaDAO.getInstance().merge(alunos);
        System.out.println("Objetos salvo com sucesso!!!");
    }
}
