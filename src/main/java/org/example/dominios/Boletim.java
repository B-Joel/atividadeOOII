package org.example.dominios;

public class Boletim {
    private String id;
    private Aluno aluno;
    private Nota nota;

    public Boletim(String id, Aluno aluno, Nota nota) {
        this.id = id;
        this.aluno = aluno;
        this.nota = nota;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    public int compareTo(Boletim boletim) {
        return this.getAluno().getNome().compareTo(boletim.getAluno().getNome());
    }

    @Override
    public String toString() {
        return ("Aluno = " + aluno.getNome() + "\n" +
                " | Disciplina  = " + nota.getDisciplina() + "\n" + " | Nota = " + nota.getNota() + "\n");
    }
}
