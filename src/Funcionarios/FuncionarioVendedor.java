package Funcionarios;

import java.time.YearMonth;
import Cargos.Vendedor;

public class FuncionarioVendedor extends FuncionariosBeneficios {

 public FuncionarioVendedor(String nome, YearMonth dataContratacao){

    super( nome, new Vendedor(),  dataContratacao);
        
 }


}
