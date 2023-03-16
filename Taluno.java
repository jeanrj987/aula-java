public class Taluno {
    String idade;
    String instituicao;
    String curso;
    String genero;
    boolean matricula;
    String periodo;
    String nomeCompleto;


    void cursando() {
        if (matricula) {
            return;
        } else {
            System.out.println("Voce esta matriculado em ads");
            matricula = true;
        }
    }

    void naoCursando() {
        if (matricula) {
            return;
        } else {
            System.out.println("Voce nao esta matriculado em ads");
            matricula = false;
        }
    }

    Entidade nome = new Entidade();
    
    

}
