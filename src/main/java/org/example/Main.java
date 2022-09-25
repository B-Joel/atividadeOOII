package org.example;

import org.example.dominios.Aluno;
import org.example.dominios.Boletim;
import org.example.dominios.Disciplina;
import org.example.dominios.Nota;
import org.example.repository.BoletimRepository;
import org.example.servicos.EnviarBoletimPorEmail;
import org.example.servicos.EnviarBoletimPorSMS;
import org.example.servicos.ExibirBoletim;
import org.example.servicos.ImprimirBoletim;

public class Main {
    public static void main(String[] args) {


        Aluno aluno = new Aluno("Aluno", "a1b2" ,"aluno@email.com", "11976557656");

        Disciplina matematica = new Disciplina("MAT", "Matemática");
        Disciplina portugues = new Disciplina("POR", "Português");


        Nota nota1 = new Nota(matematica,10);
        Nota nota2 = new Nota(portugues,9);
        Boletim boletimLarissa1 = new Boletim("1",aluno,nota1);
        Boletim boletimLarissa2 = new Boletim("2",aluno,nota2);
        BoletimRepository.getInstance().save(boletimLarissa1);
        BoletimRepository.getInstance().save(boletimLarissa2);


        ExibirBoletim email = new EnviarBoletimPorEmail();
        email.executar(aluno);

        ExibirBoletim sms = new EnviarBoletimPorSMS();
        sms.executar(aluno);

        ExibirBoletim impresso = new ImprimirBoletim();
        impresso.executar(aluno);

    }
}

