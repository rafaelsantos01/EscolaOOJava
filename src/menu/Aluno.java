package menu;

import java.util.Scanner;

public class Aluno extends Pessoas {
    
    private double nota1,nota2,nota3,nota4;
    
    
    @Override
  public void Status(){
       System.out.println("Nome "+getNome()+" portador do CPF:"+getCpf()+" sexo "+getSexo());
        System.out.println("O "+getNome()+" é um aluno.");
        System.out.println("A medio do "+getNome()+" ate o momento é");
        notaFinal();
        
   }
    
    
    
    public void notaFinal(){
        double media = (this.nota1+this.nota2+this.nota3+this.nota4) / 4;
        System.out.println(media);
        
        if(media >= 7){
            System.out.println("Aluno esta aprovado");
            
        }else if(media < 7 && media > 5){
            System.out.println("Aluno esta de recuperação");
        }else{
            System.out.println("Aluno reprovado");
        }        
    }
    
    
    public void recuperacao(double nota5){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Aplicando prova ");
        System.out.println("Qual foi a nota do aluno?");
        nota5 = entrada.nextDouble();
        
        if(nota5>= 7){
            System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno reprovado");
        }
    }
    
    

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }
    
    
}
