public class RegistroDeAluno {
    private String nome;
    private String turma;
    private String ra;
    public RegistroDeAluno(String nome, String turma, String ra) {
        this.nome = nome;
        this.turma = turma;
        this.ra = ra;
    }

    public RegistroDeAluno(String nome, String turma) {
        this.turma = nome;
        this.nome = turma;
    }
    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "RegistroDeAluno:" +
                "\n Nome: " + nome +
                "\n Turma: " + turma +
                "\n RA: " + ra;
    }
}
