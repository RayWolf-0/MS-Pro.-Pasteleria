package cl.duoc.MicroservicioProductos.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "INVENTARIO")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Entidad que representa un producto")

public class Producto {

    @Id
    @Column(name = "ID_PRODUCTO")
    @Schema(description = "id producto")

    private int idItem;


    @Column(name = "NOMBRE", nullable = false)
    @Schema(description = "nombre del producto")

    private String nombreProducto;

    @Column(name = "DESCRIPCION")
    @Schema(description = "descripcion producto")

    private String descripcion;

    @Column(name = "CATEGORIA_ID_CATEGORIA")
    @Schema(description = "categoria producto")

    private String categoria;


    @Column(name = "PRECIO")
    @Schema(description = "precio del producto")

    private int precioUnitario;

}
