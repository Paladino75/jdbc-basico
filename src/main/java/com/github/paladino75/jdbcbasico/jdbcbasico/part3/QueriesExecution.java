package com.github.paladino75.jdbcbasico.jdbcbasico.part3;

import java.util.List;

public class QueriesExecution {
    public static void main(String[] args) {

        AlunoDAO alunoDAO = new AlunoDAO();

        //============================== 1 - Consulta =====================================
       /* List<Aluno> alunos = alunoDAO.list();
        alunos.stream().forEach(System.out::println);*/

        // ============================= 1.1 - Consulta com filtro ========================
       /* Aluno alunoParaConsulta = alunoDAO.getByid(3);

         System.out.println(alunoParaConsulta);*/

        // ============================= 2 - Inserção =====================================

        /*Aluno alunoParaInsercao = new Aluno(
                "Ninja Gang",
                18,
                "MS"
        );

        alunoDAO.create(alunoParaInsercao);*/

        // ============================ 3 - Delete ==================================

/*        alunoDAO.list().stream().forEach(System.out::println);
        alunoDAO.delete(8);
        alunoDAO.list().stream().forEach(System.out::println);*/


        // ================================= 4 - Atualizar =================================
       /* alunoDAO.list().stream().forEach(System.out::println);

        Aluno alunoParaAtualizar = alunoDAO.getByid(4);
        alunoParaAtualizar.setNome("Joaquim");
        alunoParaAtualizar.setIdade(18);
        alunoParaAtualizar.setEstado("RS");

        alunoDAO.update(alunoParaAtualizar);

        alunoDAO.list().stream().forEach(System.out::println);*/
    }
}
