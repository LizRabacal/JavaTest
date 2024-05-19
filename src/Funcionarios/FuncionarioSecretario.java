package Funcionarios;

import java.time.YearMonth;
import Cargos.Secretario;

public class FuncionarioSecretario extends FuncionariosBeneficios {

    public FuncionarioSecretario(String nome, YearMonth dataContratacao) {

        super(nome, new Secretario(), dataContratacao);

    }

}
