package academy.devdojo.maratonajava.Gassociacao.Exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        //Lista de arrays para guardar nome de muitos objetos
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Local> locais = new ArrayList<>();
        ArrayList<Seminario> seminarios = new ArrayList<>();


        //Utilize while para entrar em loop de opçoes, até voce sair
        while(true){
            System.out.println("Escolha sua opção");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar professor");
            System.out.println("3 - Cadastrar local");
            System.out.println("4 - Cadastre o seminario");
            System.out.println("5 - Buscar seminario por nome");
            System.out.println("6- Sair");
            String opcao = teclado.nextLine();

            if (opcao.equals("1")) {
                Aluno aluno = new Aluno();
                System.out.println("Digite o nome do aluno");
                String nome = teclado.nextLine();
                aluno.setNome(nome);

                System.out.println("Digite a idade do aluno");
                int idade = teclado.nextInt();
                aluno.setIdade(idade);
                teclado.nextLine();

                System.out.println("Aluno cadastado com sucesso");
                alunos.add(aluno);

            }else if (opcao.equals("2")) {
                Professor professor = new Professor();
                System.out.println("Digite o nome do professor");
                String nomeProfessor = teclado.nextLine();
                professor.setNome(nomeProfessor);
                System.out.println("Digite a especialidade do professor");
                String especialidade = teclado.nextLine();
                professor.setEspecialidade(especialidade);
                System.out.println("Professor cadastado com sucesso");
                professores.add(professor);

            }else if (opcao.equals("3")) {
                Local local = new Local();
                System.out.println("Digite o nome do local");
                String nomeLocal = teclado.nextLine();
                local.setEndereco(nomeLocal);
                System.out.println("Local cadastrado com sucesso");
                locais.add(local);

            } else if (opcao.equals("4")) {
                Seminario seminario = new Seminario();
                System.out.println("Digite o nome do seminario");
                String nomeSeminario = teclado.nextLine();
                seminario.setNome(nomeSeminario);
                System.out.println("Quais alunos estudarão no seminario" + nomeSeminario + "?");
                for (int i = 0; i < alunos.size(); i++) {
                    System.out.println(i + " - " + alunos.get(i).getNome() + ", idade: " + alunos.get(i).getIdade());
                }

                System.out.println("Digite os números do aluno a ser adicionado (ex: 0,2,3)");
                // Lê a entrada do usuário e separa por vírgula
                String[] indicesTexto = teclado.nextLine().split(",");
                // Cria um array de Aluno com o mesmo tamanho dos índices selecionados
                Aluno[] alunoSelecionado = new Aluno[indicesTexto.length];

                // Percorre os índices digitados (em texto), converte pra int, pega os alunos
                for (int i = 0; i < indicesTexto.length; i++) {
                    int index = Integer.parseInt(indicesTexto[i]);
                    alunoSelecionado[i] = alunos.get(index);
                }
                seminario.setAlunos(alunoSelecionado);

                // Escolher professor
                System.out.println("Escolha o professor do seminário:");
                for (int i = 0; i < professores.size(); i++) {
                    System.out.println(i + " - " + professores.get(i).getNome() + ", especialidade: " + professores.get(i).getEspecialidade());
                }
                int indexProfessor = Integer.parseInt(teclado.nextLine());
                Professor professorSelecionado = professores.get(indexProfessor);
                seminario.setProfessor(professorSelecionado);

                // Escolher local
                System.out.println("Escolha o local do seminário:");
                for (int i = 0; i < locais.size(); i++) {
                    System.out.println(i + " - " + locais.get(i).getEndereco());
                }
                int indexLocal = Integer.parseInt(teclado.nextLine());
                Local localSelecionado = locais.get(indexLocal);
                seminario.setLocal(localSelecionado);

                seminarios.add(seminario);
                System.out.println("Seminario cadastrado com sucesso");

            }else if (opcao.equals("5")) {
                System.out.println("Digite o nome do seminario");
                String nomeBusca = teclado.nextLine();
                boolean encontrado  = false;
                for(Seminario seminario : seminarios) {
                  if(seminario.getNome().equals(nomeBusca)) {
                      seminario.imprime();
                      encontrado = true;
                  }
                        break;
                    }
                }
            }


        }


    }

