package org.example.servicos;

import org.example.dominios.Aluno;
import org.example.dominios.Boletim;
import org.example.repository.BoletimRepository;

import java.util.Scanner;

public abstract class ExibirBoletim {

    public void executar(Aluno aluno) {
        System.out.println("Boletim do aluno " + aluno.getNome());
        for (Boletim boletim : BoletimRepository.getInstance().getBoletimPorAluno(aluno)) {
            System.out.printf("Nota: %.2f  -  Disciplina: %s %n", boletim.getNota().getNota(), boletim.getNota().getDisciplina().getNomeDisciplina());
        }
    }

}
