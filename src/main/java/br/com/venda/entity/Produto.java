package br.com.venda.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Double valor;
    private Double qtde;

    @OneToMany(mappedBy = "id.produto")
    private Set<ItemPedido> itemPedidos = new HashSet<>();

    public Produto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getQtde() {
        return qtde;
    }

    public void setQtde(Double qtde) {
        this.qtde = qtde;
    }
}
