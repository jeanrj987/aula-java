public class Aluno {
    
    public static void main(String[] args) {

        System.out.println(" Bem Vindo ");
          
        Taluno aluno = new Taluno();
        
        aluno.nomeCompleto= "Jean Carlos";    
        aluno.idade = "19";
        aluno.curso = "ADS";
        aluno.periodo = "Noturno";
        aluno.instituicao = "Fasipe Aquarela";
        aluno.genero = "masculino";

        System.out.println("------------------------");
        System.out.println("Aluno: " + aluno.nomeCompleto);
        System.out.println("------------------------");
        System.out.println("Idade: " + aluno.idade);
        System.out.println("------------------------");
        System.out.println("Curso: " + aluno.curso);
        System.out.println("------------------------");
        System.out.println("Instituição: " + aluno.instituicao);
        System.out.println("------------------------");
        System.out.println("Periodo que estuda: " + aluno.periodo);
        System.out.println("------------------------");

        aluno.cursando();

    }
   
}