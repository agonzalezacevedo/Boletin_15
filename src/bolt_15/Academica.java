package bolt_15;

import persoal.*;

/**
 *
 * @author agonzalezacevedo
 */
public class Academica {

    public static int numReferencia;
    private int referencia = 2020;
    private String nome;
    private float nota;
    private Persoal alum = new Persoal();

    public Academica(String nome, float nota, String correo, String telefono) {
        referencia = numReferencia;
        this.nome = nome;
        this.nota = nota;
        alum.setTelefono(telefono);
        alum.setCorreo(correo);
        numReferencia++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }

    @Override
    public String toString() {
        return "Academica{" + "referencia=" + referencia + ", nome=" + nome + ", nota=" + nota + ", alum=" + alum;
    }

}
