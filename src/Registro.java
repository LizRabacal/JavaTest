import java.time.YearMonth;

import Funcionarios.FuncionarioVendedor;

public class Registro {
    private FuncionarioVendedor vendedor;
    private float valorVenda;
    private YearMonth data;

    public Registro(FuncionarioVendedor vendedor, float valorVenda, YearMonth data) {
        this.vendedor = vendedor;
        this.valorVenda = valorVenda;
        this.data = data;
    }

    public FuncionarioVendedor getVendedor() {
        return vendedor;
    }
    public void setVendedor(FuncionarioVendedor vendedor) {
        this.vendedor = vendedor;
    }
    public float getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }
    public YearMonth getData() {
        return data;
    }
    public void setData(YearMonth data) {
        this.data = data;
    }

}
