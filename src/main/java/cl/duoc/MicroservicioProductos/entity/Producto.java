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
@Table(name = "PRODUCTO")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Entidad que representa un producto")
public class Producto {

    @Id
    @Column(name = "ID_PRODUCTO")
    @Schema(description = "ID del producto")
    private String idProducto; 

    @Column(name = "NOMBRE", nullable = false)
    @Schema(description = "Nombre del producto")
    private String nombre;

    @Column(name = "DESCRIPCION")
    @Schema(description = "Descripción del producto")
    private String descripcion;

    @Column(name = "CATEGORIA_ID_CATEGORIA")
    @Schema(description = "ID de categoría")
    private String categoriaId;

    @Column(name = "PRECIO")
    @Schema(description = "Precio unitario del producto")
    private String precio; 
}
