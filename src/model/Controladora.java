package model;

import model.Producto;
import model.Cliente;
import model.OrdenCompra;

public class Controladora {
    
    public Controladora() {

    }

    /**
     * Registra un nuevo producto en el inventario.
     * @param 
     * @throws PrecioInvalidoException si el precio del producto es negativo
     */
    public void registrarProducto() throws PrecioInvalidoException {
        // TODO: implementar registro de producto
    }

    /**
     * Busca un producto por su identificador.
     * @param id identificador del producto
     * @return el objeto Producto
     * @throws ProductoNoEncontradoException si no existe un producto con ese id
     */
    public Producto searchProducto(String id) throws ProductoNoEncontradoException {
        // TODO: implementar búsqueda de producto
        return null;
    }

    /**
     * Descuenta el stock de un producto según la cantidad comprada.
     * @param producto el producto a descontar
     * @param cantidad cantidad a descontar
     * @throws StockInsuficienteException si el stock es menor que la cantidad
     */
    public void descontarStock(Producto producto, int cantidad) throws StockInsuficienteException {
        // TODO: implementar descuento de stock
    }


}