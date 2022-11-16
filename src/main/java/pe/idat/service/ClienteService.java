package pe.idat.service;

import java.util.List;

import pe.idat.model.Cliente;

public interface ClienteService {
	List<Cliente> listar();
	Cliente obtener(Integer id);
    public void actualizar(Cliente cliente);
    public void eliminar(Integer id);
    public void guardar(Cliente cliente);
}
