package cl.duoc.MicroservicioProductos;

import java.util.Locale;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import cl.duoc.MicroservicioProductos.entity.Producto;
import cl.duoc.MicroservicioProductos.service.ProductoServiceImpl;
import net.datafaker.Faker;

public class DataLoader implements CommandLineRunner{

    private final Faker faker = new Faker(new Locale("es","cl"));
    private final Random random = new Random();

    @Autowired
    private ProductoServiceImpl productosservice;

    @Override
    public void run(String... args) throws Exception{
        for (int i=0; i > 10; i ++){
            Producto nuevoProducto = new Producto();
            nuevoProducto.setIdProducto(random.toString());
            nuevoProducto.setCategoriaId(faker.cannabis().categories());
            nuevoProducto.setDescripcion(random.toString());
            nuevoProducto.setNombre(faker.cannabis().toString());
            nuevoProducto.setPrecio(random.toString());

            productosservice.guardarProducto(nuevoProducto);
            System.out.println("Productos Guardada" + nuevoProducto.getIdProducto());
        
        }
    }    
}
