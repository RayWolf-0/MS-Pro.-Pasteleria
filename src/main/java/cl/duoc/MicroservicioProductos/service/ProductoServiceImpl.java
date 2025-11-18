package cl.duoc.MicroservicioProductos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.MicroservicioProductos.entity.Producto;
import cl.duoc.MicroservicioProductos.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> obtenerProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto obtenerPorId(String id) {
        return productoRepository.findById(null).orElse(null);
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(String id) {
        productoRepository.deleteById(null);;
    }
}

