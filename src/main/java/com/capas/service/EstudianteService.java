package com.capas.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.capas.domain.Estudiante;

public interface EstudianteService {
	public List<Estudiante> findAll() throws DataAccessException;
	public Estudiante findOne(Integer code) throws DataAccessException;
	public void save(Estudiante es) throws DataAccessException;
	public void delete(Integer c_estudiante) throws DataAccessException;
	public List<Estudiante> filtrarPor(String cadena) throws DataAccessException;
	public List<Estudiante> filtrarApellidoIniciandoEn(String cadena) throws DataAccessException;
	public void update(Estudiante es) throws DataAccessException;
}
