package com.example.myapplication;

public class aluno {
    String nome, RG, matricula, curso;

    public aluno(String nome, String RG, String matricula, String curso) {
        setNome(nome);
        setRg(RG);
        setMatricula(matricula);
        setCurso(curso);
    }

    private void setNome(String nome) {
        this.nome = nome;
    }
    private void setRg(String RG) { this.RG = RG; }
    private void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    private void setCurso(String curso) {
        this.curso = curso;
    }
    public String getNome() {
        return this.nome;
    }
    public String getRg() {
        return this.RG;
    }
    public String getMatricula() {
        return this.matricula;
    }
    public String getCurso() {
        return this.curso;
    }
}