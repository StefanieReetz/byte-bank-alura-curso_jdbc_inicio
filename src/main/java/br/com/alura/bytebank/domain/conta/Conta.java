package br.com.alura.bytebank.domain.conta;

import br.com.alura.bytebank.domain.cliente.Cliente;

import java.math.BigDecimal;
import java.util.Objects;

public class Conta {

    private Integer numero;
    private BigDecimal saldo;
    private Cliente titulo;

    public Conta(Integer numero,BigDecimal saldo, Cliente titular) {
        this.numero = numero;
        this.titulo = titular;
        this.saldo =saldo;
    }

    public boolean possuiSaldo() {
        return this.saldo.compareTo(BigDecimal.ZERO) != 0;
    }

    public void sacar(BigDecimal valor) {
        this.saldo = this.saldo.subtract(valor);
    }
    

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return numero.equals(conta.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                ", titular=" + titulo +
                '}';
    }

    public Integer getNumero() {
        return numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titulo;
    }
}
