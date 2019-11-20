package br.com.venda.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "cliente")
    private Set<Pedido> pedidos = new HashSet<>();

    public Cliente() {
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
}
