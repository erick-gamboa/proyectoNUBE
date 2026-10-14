package mx.desarrollo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "vinilo")
public class Vinilo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idVinilo", nullable = false)
    private Integer idUnidad;

    @Size(max = 50)
    @NotNull
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Size(max = 50)
    @NotNull
    @Column(name = "genero", nullable = false)
    private String genero;

    @Size(max = 50)
    @NotNull
    @Column(name = "artista", nullable = false)
    private String artista;

    @NotNull
    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    @NotNull
    @Column(name = "precio", nullable = false)
    private Double precio;

    @NotNull
    @Column(name = "imagen", nullable = false)
    private Double precio;

    @Size(max = 50)
    @NotNull
    @Column(name = "imagen", nullable = false)
    private String imagen;
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}