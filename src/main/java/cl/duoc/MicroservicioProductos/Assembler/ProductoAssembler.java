package cl.duoc.MicroservicioProductos.Assembler;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import cl.duoc.MicroservicioProductos.controller.ProductoController;
import cl.duoc.MicroservicioProductos.entity.Producto;

@Component
public class ProductoAssembler implements RepresentationModelAssembler<Producto, EntityModel<Producto>> {

    @Override
    public EntityModel<Producto> toModel(Producto pr) {

        // OJO: idItem es String (porque ID_PRODUCTO es VARCHAR2(15))
        String id = pr.getIdProducto();

        return EntityModel.of(
            pr,
            linkTo(methodOn(ProductoController.class).obtenerPorId(0)).withSelfRel(),

            linkTo(methodOn(ProductoController.class).obtenerProductos()).withRel("productos"),

            linkTo(methodOn(ProductoController.class).eliminarProducto(0)).withRel("eliminar"),

            linkTo(methodOn(ProductoController.class).actualizarProducto(0, pr)).withRel("actualizar")
        );
    }
}


