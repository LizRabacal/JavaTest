package Funcionarios;
import java.time.YearMonth;

import Cargos.Cargo;

public class Funcionario {
    private String nome;
    private Cargo cargo;
    private YearMonth dataContratacao;
    

    public Funcionario(String nome, Cargo cargo, YearMonth dataContratacao) {
        this.nome = nome;
        this.cargo = cargo;
        this.dataContratacao = dataContratacao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }




    public Cargo getCargo() {
        return cargo;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    public YearMonth getDataContratacao() {
        return dataContratacao;
    }
    public void setDataContratacao(YearMonth dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

}


