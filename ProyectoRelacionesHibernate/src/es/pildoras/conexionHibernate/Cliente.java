/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.pildoras.conexionHibernate;

import com.mysql.cj.x.protobuf.MysqlxCursor;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author julio
 */
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "direccion")
    private String direccion;

    @OneToOne(cascade = CascadeType.ALL)//relación 1 a 1
    @JoinColumn(name = "id")
    private DetallesCliente detallesCliente;

    @OneToMany(fetch=FetchType.EAGER, mappedBy = "cliente", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})// el Fetch marca como y cuantas llamadas va a hacer a la bbdd
    private List<Pedido> pedidos;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String direccion) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public DetallesCliente getDetallesCliente() {
        return detallesCliente;
    }

    public void setDetallesCliente(DetallesCliente detallesCliente) {
        this.detallesCliente = detallesCliente;
    }

    public void agregarPedidos(Pedido elPedido) {

        if (pedidos == null) {

            pedidos = new ArrayList<>();

        }

        pedidos.add(elPedido);

        elPedido.setCliente(this);

    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + '}';
    }

}
