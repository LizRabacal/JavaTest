import java.time.YearMonth;
import java.util.ArrayList;

import Funcionarios.FuncionarioGerente;
import Funcionarios.FuncionarioSecretario;
import Funcionarios.FuncionarioVendedor;
import Funcionarios.Funcionario;
import Funcionarios.FuncionariosBeneficios;
import java.time.temporal.ChronoUnit;

public class Empresa {
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Registro> registrodeVendas;
    private ArrayList<FuncionarioVendedor> vendedores;
    private  ArrayList<FuncionariosBeneficios> beneficiarios;

    public Empresa() {

        // lista que armazena todos os funcionarios
        funcionarios = new ArrayList<>();

        // lista que armazena todos os registros de vendedores
        registrodeVendas = new ArrayList<>();

        // arraylist para testar os metodos q aceitam apenas lista de funcionarios que
        // sao vendedores
        vendedores = new ArrayList<>();

        // arraylist para testar os metodos q aceitam apenas lista de funcionarios que
        // recebem beneficios
        beneficiarios = new ArrayList<>();

        // Declarando funcionarios:

        FuncionarioSecretario secretario1 = new FuncionarioSecretario("Jorge Carvalho", YearMonth.of(2018, 1));
        FuncionarioSecretario secretario2 = new FuncionarioSecretario("Maria Souza", YearMonth.of(2015, 12));
        FuncionarioVendedor vendedor1 = new FuncionarioVendedor("Ana Silva", YearMonth.of(2021, 12));
        FuncionarioVendedor vendedor2 = new FuncionarioVendedor("Joao Mendes", YearMonth.of(2021, 12));
        FuncionarioGerente gerente1 = new FuncionarioGerente("Juliana Alves", YearMonth.of(2017, 7));
        FuncionarioGerente gerente2 = new FuncionarioGerente("Bento albino", YearMonth.of(2014, 3));

        // adicionando na lista geral:

        funcionarios.add(secretario1);
        funcionarios.add(secretario2);
        funcionarios.add(vendedor1);
        funcionarios.add(vendedor2);
        funcionarios.add(gerente1);
        funcionarios.add(gerente2);

        // adicionando na lista de beneficiarios:

        beneficiarios.add(secretario1);
        beneficiarios.add(secretario2);
        beneficiarios.add(vendedor1);
        beneficiarios.add(vendedor2);

        // adicionando na lista de vendedores:

        vendedores.add(vendedor1);
        vendedores.add(vendedor2);

        //adicionando registros de vendas na lista 
        registrodeVendas.add(new Registro(vendedor1, 5200, YearMonth.of(2021, 12)));
        registrodeVendas.add(new Registro(vendedor2, 3400, YearMonth.of(2021, 12)));

        registrodeVendas.add(new Registro(vendedor1, 4000, YearMonth.of(2022, 1)));
        registrodeVendas.add(new Registro(vendedor2, 7700, YearMonth.of(2022, 1)));

        registrodeVendas.add(new Registro(vendedor1, 4200, YearMonth.of(2022, 2)));
        registrodeVendas.add(new Registro(vendedor2, 5000, YearMonth.of(2022, 2)));

        registrodeVendas.add(new Registro(vendedor1, 5850, YearMonth.of(2022, 3)));
        registrodeVendas.add(new Registro(vendedor2, 5900, YearMonth.of(2022, 3)));

        registrodeVendas.add(new Registro(vendedor1, 7000, YearMonth.of(2022, 4)));
        registrodeVendas.add(new Registro(vendedor2, 6500, YearMonth.of(2022, 4)));

        // testando metodos do teste para a data de 03/2022:

        System.out.println(valorTotal(funcionarios, 3, 2022));
        System.out.println(salarios(funcionarios, 3, 2022));
        System.out.println(beneficios(beneficiarios, 3, 2022));
        System.out.println(maiorValorTotal(funcionarios, 3, 2022).getNome());
        System.out.println(maiorBeneficios(beneficiarios, 3, 2022));
        System.out.println(maisVendeu(vendedores, 3, 2022).getNome());

    }

    /*
     * Um método que receba uma lista de funcionários, mês e ano e retorne o valor
     * total pago (salário e benefício) a esses funcionários no mês.
     */

    public float valorTotal(ArrayList<Funcionario> ListaFunc, int mes, int ano) {

        ArrayList<Float> salarios = new ArrayList<>();
        float salarioFinal = 0;
        float total = 0;

        for (Funcionario func : ListaFunc) {
            salarioFinal = valorTotal(func, ano, mes);
            total += salarioFinal;
            salarios.add(salarioFinal);
        }
        System.out.println("Valores totais recebidos pelos funcionarios: " + salarios);

        return total;

    }

    /*
     * Um método que receba uma lista de funcionários, mês e ano e retorne o total
     * pago somente em salários no mês.
     */

    public float salarios(ArrayList<Funcionario> ListaFunc, int mes, int ano) {
        ArrayList<Float> salarios = new ArrayList<>();
        float salarioFinal = 0;
        float total = 0;

        for (Funcionario func : ListaFunc) {
            salarioFinal = somenteSalario(func, ano, mes);
            total += salarioFinal;
            salarios.add(salarioFinal);
        }
        System.out.println("Salarios recebidos pelos funcionarios: " + salarios);

        return total;

    }

    /*
     * Um método que receba uma lista somente com os funcionários que recebem
     * benefícios,
     * mês e ano e retorne o total pago em benefícios no mês.
     */

    public float beneficios(ArrayList<FuncionariosBeneficios> ListaFunc, int mes, int ano) {
        ArrayList<Float> beneficios = new ArrayList<>();
        float beneficio = 0;
        float total = 0;

        for (Funcionario func : ListaFunc) {
            beneficio = beneficio(func, ano, mes);
            beneficios.add(beneficio);
            total += beneficio;

        }
        System.out.println("Beneficios recebidos pelos funcionarios: " + beneficios);

        return total;

    }

    /*
     * Um método que receba uma lista de funcionários, mês e ano e retorne o que
     * recebeu o valor mais alto no mês.
     */

    public Funcionario maiorValorTotal(ArrayList<Funcionario> ListaFunc, int mes, int ano) {
        float maior = valorTotal(ListaFunc.get(0), ano, mes);
        Funcionario funcionario = ListaFunc.get(0);
        for (Funcionario func : ListaFunc) {
            float valorAtual = valorTotal(func, ano, mes);
            if (valorAtual > maior)
                maior = valorAtual;
            funcionario = func;

        }
        return funcionario;
    }

    /*
     * Um método que receba uma lista somente com os funcionários que recebem
     * benefícios, mês e ano e retorne o nome do funcionário que recebeu o valor
     * mais
     * alto em benefícios no mês.
     */

    public String maiorBeneficios(ArrayList<FuncionariosBeneficios> ListaFunc, int mes, int ano) {
        float maior = beneficio(ListaFunc.get(0), ano, mes);
        String nome = ListaFunc.get(0).getNome();

        for (Funcionario func : ListaFunc) {
            float valorAtual = beneficio(func, ano, mes);
            if (valorAtual > maior)
                maior = valorAtual;
            nome = func.getNome();

        }
        return nome;
    }

    /*
     * Um método que receba uma lista de vendedores, mês e ano e retorne o que mais
     * vendeu no mês.
     */

    public Funcionario maisVendeu(ArrayList<FuncionarioVendedor> ListaFunc, int mes, int ano) {
        float maior = valorVendido(ListaFunc.get(0), ano, mes);
        Funcionario funcionario = ListaFunc.get(0);
        for (Funcionario func : ListaFunc) {
            float valorAtual = valorVendido(func, ano, mes);
            if (valorAtual > maior) {
                maior = valorAtual;
                funcionario = func;
            }
        }
        return funcionario;
    }

    // Metodos para auxiliar os outros:

    // Retorna o beneficio do vendedor (30% do valor vendido em determinado mes/ano)
    public Float beneficioVendedor(Funcionario func, int ano, int mes) {
        return valorVendido(func, ano, mes) * 30 / 100;
    }

    // beneficio de qualquer tipo de cargo do funcionario

    public float beneficio(Funcionario func, int ano, int mes) {

        if (func.getCargo().getTipoBeneficio() == 1) {
            return beneficioSecretario(func, ano, mes);
        } else if (func.getCargo().getTipoBeneficio() == 2) {
            return beneficioVendedor(func, ano, mes);
        }
        return 0;

    }

    // retorna o valor vendido em determinado mes/ano por um funcionario
    public float valorVendido(Funcionario func, int ano, int mes) {
        float valorVenda = 0;
        for (Registro registro : registrodeVendas) {
            if ((registro.getData().equals(YearMonth.of(ano, mes))) && (registro.getVendedor() == func)) {
                valorVenda = registro.getValorVenda();
            }
        }
        return valorVenda;
    }

    // retorna somente o salario semos beneficios
    public float somenteSalario(Funcionario func, int ano, int mes) {
        return func.getCargo().getvalorFixo() + func.getCargo().getValorPorAnodeServico()
                * ChronoUnit.YEARS.between(func.getDataContratacao(), YearMonth.of(ano, mes));

    }

    // retorna o beneficio do secretario (20% do salario)
    public float beneficioSecretario(Funcionario func, int ano, int mes) {
        return somenteSalario(func, ano, mes) * 20 / 100;
    }

    // retorna o valor total de 1 funcionario
    public float valorTotal(Funcionario func, int ano, int mes) {
        return somenteSalario(func, ano, mes) + beneficio(func, ano, mes);
    }

}
