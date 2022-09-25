package org.example.repository;

import org.example.dominios.Aluno;
import org.example.dominios.Boletim;

import java.util.ArrayList;
import java.util.List;

public class BoletimRepository extends AbstractListRepository<Boletim> {
    private static BoletimRepository boletimRepository;
    private ArrayList<Boletim> boletinsCadastrados = super.list;

    private BoletimRepository() {
    }

    public static BoletimRepository getInstance() {
        if (boletimRepository == null) {
            boletimRepository = new BoletimRepository();
        }
        return boletimRepository;
    }

    @Override
    public boolean isSaved(Boletim boletimEntrada) {
        for (Boletim boletim : boletinsCadastrados) {
            int comparador = boletim.getId().compareTo(boletimEntrada.getId());
            if (comparador != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void save(Boletim boletim) {
        boletinsCadastrados.add(boletim);
    }

    @Override
    public Boletim read(String id) {
        for (Boletim boletimCadastrado : boletinsCadastrados) {
            if (boletimCadastrado.getId().equals(id)) {
                return boletimCadastrado;
            }
        }
        return null;
    }

    public List<Boletim> getBoletinsCadastrados() {
        return boletinsCadastrados;
    }

    @Override
    public int compare(Boletim boletim1, Boletim boletim2) {
        return 0;
    }


    public List<Boletim> getBoletimPorAluno(Aluno aluno){
        List<Boletim> boletimPorAluno = new ArrayList<>();
        for (Boletim boletimCadastrado : boletinsCadastrados) {
            if (boletimCadastrado.getAluno().equals(aluno)) {
                boletimPorAluno.add(boletimCadastrado);
            }
        }
        return boletimPorAluno;
    }


}
