package mx.desarrollo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "detalleTicket")
public class DetalleTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_ticket", nullable = false)
    private TicketCompra ticket;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_vinilo", nullable = false)
    private Vinilo vinilo;

    @NotNull
    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    @NotNull
    @Column(name = "precioUnitario", nullable = false)
    private Decimal precioUnitario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TicketCompra getTicket() {
        return ticket;
    }

    public void setTicket(TicketCompra ticket) {
        this.ticket = ticket;
    }

    public Vinilo getVinilo() {
        return vinilo;
    }

    public void setVinilo(Vinilo vinilo) {
        this.vinilo = vinilo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
}