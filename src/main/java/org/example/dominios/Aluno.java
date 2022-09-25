package org.example.dominios;

import java.util.Objects;

public class Aluno extends Pessoa {
    private String registroAcademico;
    private String emailResponsavel;
    private String celularResponsavel;

    public Aluno(String nome, String registroAcademico, String emailResponsavel, String celularResponsavel) {
        super(nome);
        this.registroAcademico = registroAcademico;
        this.emailResponsavel = emailResponsavel;
        this.celularResponsavel = celularResponsavel;
    }


    public String getEmailResponsavel() {
        return emailResponsavel;
    }

    public void setEmailResponsavel(String emailResponsavel) {
        this.emailResponsavel = emailResponsavel;
    }

    public String getCelularResponsavel() {
        return celularResponsavel;
    }

    public void setCelularResponsavel(String celularResponsavel) {
        this.celularResponsavel = celularResponsavel;
    }

    public String getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(String registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public boolean equals(Object o) {
        Aluno aluno = (Aluno) o;
        return aluno.getRegistroAcademico().equals(this.getRegistroAcademico());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getRegistroAcademico());
    }

}
