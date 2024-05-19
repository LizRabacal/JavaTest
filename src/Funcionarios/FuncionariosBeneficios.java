package Funcionarios;

import java.time.YearMonth;

import Cargos.CargoBeneficios;

public class FuncionariosBeneficios extends Funcionario{
    
    public FuncionariosBeneficios(String nome, CargoBeneficios cargo, YearMonth dataContratacao){
        super(nome, cargo, dataContratacao);

    }

}
