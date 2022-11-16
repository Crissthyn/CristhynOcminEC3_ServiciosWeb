package pe.idat.service;

import java.util.List;

import pe.idat.model.Hospital;

public interface HospitalService {
	List<Hospital> listar();
	Hospital obtener(Integer id);
    public void actualizar(Hospital hospital);
    public void eliminar(Integer id);
    public void guardar(Hospital hospital);
}
