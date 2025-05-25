package academy.devdojo.maratonajava.Gassociacao.Exercicio;

/*
Crie um sistema que gerencie seminários
O sitema deverá cadastrar seminários, estudantes, professores e local onder será realizado
Um aluno poderá estar em apenas um seminário
Um seminário poderá ter nenhum ou vários alunos
Um professor poderá vários seminários
Um seminário deve ter um local
Campos básicos (excluindo relacionamento) seminário: título
aluno: nome e idade
professor: nome, especialidade
local: endereço
 */

public class Seminario {
    private String nome;
    private String local;
    private Aluno[] alunos;
}
