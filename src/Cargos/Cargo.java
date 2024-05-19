package Cargos;
public class Cargo {
    protected String nome;
    protected float valorFixo;
    protected float valorPorAnodeServico;
    //tipo 1 - sobre o salario ; tipo 2 - sobre o valor vendido ; tipo 0 - sem benefícios
    protected int tipoBeneficio;
    //percentual de benefício
    protected int percentualBenficio;




    public Cargo(String nome, float valorFixo, float valorPorAnodeServico) {
        this.nome = nome;
        this.valorFixo = valorFixo;
        this.valorPorAnodeServico = valorPorAnodeServico;
    }

    public Cargo(String nome, float valorFixo, float valorPorAnodeServico, int tipoBeneficio, int percentualBenficio) {
        this.nome = nome;
        this.valorFixo = valorFixo;
        this.valorPorAnodeServico = valorPorAnodeServico;
        this.tipoBeneficio = tipoBeneficio;
        this.percentualBenficio = percentualBenficio;
    }






    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getvalorFixo() {
        return valorFixo;
    }
    public void setvalorFixo(float valorFixo) {
        this.valorFixo = valorFixo;
    }
    public float getValorPorAnodeServico() {
        return valorPorAnodeServico;
    }
    public void setValorPorAnodeServico(float valorPorAnodeServico) {
        this.valorPorAnodeServico = valorPorAnodeServico;
    }
    public int getTipoBeneficio() {
        return tipoBeneficio;
    }
    public void setTipoBeneficio(int tipoBeneficio) {
        this.tipoBeneficio = tipoBeneficio;
    }
    public int getPercentualBenficio() {
        return percentualBenficio;
    }
    public void setPercentualBenficio(int percentualBenficio) {
        this.percentualBenficio = percentualBenficio;
    }



    



  
}
