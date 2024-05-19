package Funcionarios;

import java.time.YearMonth;
import Cargos.Gerente;

public class FuncionarioGerente extends Funcionario {

    public FuncionarioGerente(String nome, YearMonth dataContratacao) {

        super(nome, new Gerente(), dataContratacao);

    }

}
