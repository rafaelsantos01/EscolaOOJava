package menu;

public class Pessoas {
    private String nome  ;
    private long cpf ;
    private String sexo;
    private boolean apagado =true;
    private boolean aluno = false;
    private boolean eUmAluno = false;
    private boolean eUmProfessor = false;
    
    
    public void alunoOuProfessor(){
        
    }
    

   public void Status(){
       System.out.println("Nome "+this.nome+" portador do CPF:"+this.cpf+" sexo "+this.sexo);
       
   }
   
    public boolean isApagado() {
              apagado = false;
            return apagado;
	}
    
    

    public String getNome() {
        
        return nome;
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        
        return cpf;
    }

    public void setCpf(long cpf) {
        if(this.cpf != this.cpf){
        this.cpf = cpf;
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setApagado(boolean apagado) {
        this.apagado = apagado;
    }
    
    public boolean getApagado(){
        return apagado;
    }

    public boolean getAluno() {
        return aluno;
    }

    public void setAluno(boolean aluno) {
        this.aluno = aluno;
    }

    public boolean geteUmAluno() {
        return eUmAluno;
    }

    public void seteUmAluno(boolean eUmAluno) {
        this.eUmAluno = eUmAluno;
    }

    public boolean geteUmProfessor() {
        return eUmProfessor;
    }

    public void seteUmProfessor(boolean eUmProfessor) {
        this.eUmProfessor = eUmProfessor;
    }
    
    
    
    
}
