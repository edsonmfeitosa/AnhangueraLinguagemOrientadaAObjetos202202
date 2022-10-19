package poo.Lista01;

public class Aluno {
    private String ra;
    private String nome;
    private float AC1;
    private float AC2;
    private float AG;
    private float AF;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAC1() {
        return AC1;
    }

    public void setAC1(float AC1) {
        this.AC1 = AC1;
    }

    public float getAC2() {
        return AC2;
    }

    public void setAC2(float AC2) {
        this.AC2 = AC2;
    }

    public float getAG() {
        return AG;
    }

    public void setAG(float AG) {
        this.AG = AG;
    }

    public float getAF() {
        return AF;
    }

    public void setAF(float AF) {
        this.AF = AF;
    }
    public float calcularMedia(){
        return (AC1 * (float)0.15) + (AC2 *0.30f) + 
                (AG * 0.10f) + (AF * 0.45f);
    }
    public String verificarAprovacao(){
        if (calcularMedia() >= 5) {
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }

}
