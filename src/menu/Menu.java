package menu;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 10;
        int opcao = 0, posicao;
        String alt;

        Aluno aluno[] = new Aluno[n];
        for (int j = 0; j < n; j++) {
            aluno[j] = new Aluno();
        }

        Pessoas pessoas[] = new Pessoas[n];
        for (int i = 0; i < n; i++) {
            pessoas[i] = new Pessoas();
        }

        do {

            System.out.println(" _____________________________________ ");
            System.out.println("|      SOFTWARE NA VERSAO BETA        |");
            System.out.println("|          MENU DE CADASTRO           |");
            System.out.println("|_____________________________________|");
            System.out.println("|SELECIONE UMA OPÇÃO                  |");
            System.out.println("|1- Criar um novo usuario.            |");
            System.out.println("|2- Listar todos os Professores.      |");
            System.out.println("|3- Listar todos os Alunos.           |");
            System.out.println("|4- Ver as notas dos Alunos.          |");
            System.out.println("|5- Modificar as notas dos alunos.    |");
            System.out.println("|6- Sair dos sistema.                 |");
            System.out.println("|_____________________________________|");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    for (posicao = 0; posicao <= n; posicao++) {
                        if (posicao < n) {
                            if (pessoas[posicao].getApagado() == true) {

                                System.out.print("Digite o nome do usuario(a):\n");
                                pessoas[posicao].setNome(input.next());
                                pessoas[posicao].setApagado(false);
                                
                                System.out.println("Digite o CPF do usuario:");
                                pessoas[posicao].setCpf(input.nextLong());
                                
                                System.out.println("Voce deseja cadastrar um aluno SIM ou NÃO?");
                                alt = input.next().toUpperCase();
                                
                                if (alt.equalsIgnoreCase("sim")) {
                                pessoas[posicao].seteUmAluno(true);
                                System.out.print("Voce deseja adicionar a nota do primeiro bimestre digite SIM ou NÃO!\n");
                                alt = input.next().toUpperCase();

                                if (alt.equalsIgnoreCase("sim")) {
                                    System.out.print("Digite a Primeira nota do usuario.\n");
                                    aluno[posicao].setNota1(input.nextDouble());
                                    pessoas[posicao].setAluno(true);
                                }
                                }else{
                                    pessoas[posicao].seteUmProfessor(true);
                                }
  
                                System.out.printf("Usuario cadastrado com sucesso!\n");
                                break;

                            }
                        }

                    }
                    break;
                case 2:
                    for (int cont = 0; cont < n; cont++) {
                        if (pessoas[cont].geteUmProfessor() == true) {
                            System.out.println("Professor: " + pessoas[cont].getNome());
                        }
                    }
                    break;

                case 3:
                    for (int cont = 0; cont < n; cont++) {
                        if (pessoas[cont].geteUmAluno() == true) {
                            System.out.println("Aluno: " + pessoas[cont].getNome());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Deseja ver a nota de qual aluno?");
                    String verNota = input.next();
                    System.out.println("Buscando " + verNota);
                    for (int cont = 0; cont < n; cont++) {
                        if (verNota.equals(pessoas[cont].getNome())) {
                            if(aluno[cont].getNota1()!= 0.0){
                            System.out.println("Nota do primeiro Bimestre do (a):" + pessoas[cont].getNome() + " " + aluno[cont].getNota1());
                            }
                            if(aluno[cont].getNota2()!= 0.0){
                            System.out.println("Nota do segundo  Bimestre do (a):" + pessoas[cont].getNome() + " " + aluno[cont].getNota2());
                            }else{
                                System.out.println("O aluno ainda não tem a nota do segundo bimestre");
                            }
                            
                            if(aluno[cont].getNota3()!= 0.0){
                            System.out.println("Nota do terceiro Bimestre do (a):" + pessoas[cont].getNome() + " " + aluno[cont].getNota3());
                            }else{
                                System.out.println("O aluno ainda não tem a nota do terceiro bimestre");
                            }
                            
                             if(aluno[cont].getNota4()!= 0.0){
                            System.out.println("Nota do quarto   Bimestre do (a):" + pessoas[cont].getNome() + " " + aluno[cont].getNota4());
                             }else{
                                System.out.println("O aluno ainda não tem a nota do quarto bimestre");
                            }

                        }
                    }

                    break;

                case 5:
                    System.out.println("Qual o nome do aluno que voce deseja adionar as notas? ");
                    String nomeAdicionarNota = input.next();
                    System.out.println("Buscando " + nomeAdicionarNota);

                    for (int cont = 0; cont < n; cont++) {
                        if (nomeAdicionarNota.equals(pessoas[cont].getNome())) {

                            System.out.println("Deseja adiconar ou modificar a nota do primeiro bimestre?");
                            alt = input.next().toUpperCase();

                            if (alt.equalsIgnoreCase("sim")) {
                                System.out.println("Nota primeiro Bimestre:");
                                aluno[cont].setNota1(input.nextDouble());
                                pessoas[cont].setAluno(true);
                            }

                            System.out.println("Deseja adiconar a nota do segundo bimestre?");
                            alt = input.next().toUpperCase();

                            if (alt.equalsIgnoreCase("sim")) {
                                System.out.println("Nota primeiro Bimestre:");
                                aluno[cont].setNota2(input.nextDouble());
                                pessoas[cont].setAluno(true);
                            }

                            System.out.println("Deseja adiconar a nota do terceiro bimestre?");
                            alt = input.next().toUpperCase();

                            if (alt.equalsIgnoreCase("sim")) {
                                System.out.println("Nota primeiro Bimestre:");
                                aluno[cont].setNota3(input.nextDouble());
                            }

                            System.out.println("Deseja adiconar a nota do quarto bimestre?");
                            alt = input.next().toUpperCase();

                            if (alt.equalsIgnoreCase("sim")) {
                                System.out.println("Nota primeiro Bimestre:");
                                aluno[cont].setNota4(input.nextDouble());
                            }
                            System.out.println("NOTAS CADASTRADAS COM SUCESSO!");

                        }

                    }

                    break;
                case 6:
                        System.out.println("Voce Escolheu sair");
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;

            }

        } while (opcao != 6);
    }

}
