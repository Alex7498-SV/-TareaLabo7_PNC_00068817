package com.capas.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.capas.dao.EstudianteDAO;
import com.capas.domain.Estudiante;
import com.capas.repositories.EstudianteRepo;

@Service
public class EstudianteServiceImpl implements EstudianteService {

	@Autowired
	EstudianteRepo estudianteRepo;
	//EstudianteDAO estudianteDAO;
	
	@Override
	public List<Estudiante> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		//return estudianteRepo.findAll();
		return estudianteRepo.mostrarTodos();
	}

	@Override
	public Estudiante findOne(Integer code) throws DataAccessException {
		// TODO Auto-generated method stub
		return estudianteRepo.getOne(code);
	}

	@Override
	public void save(Estudiante es) throws DataAccessException {
		// TODO Auto-generated method stub
		estudianteRepo.save(es);
	}
	
	@Transactional
	@Override
	public void update(Estudiante es) throws DataAccessException{
		estudianteRepo.save(es);
	}

	@Override
	public void delete(Integer c_estudiante) throws DataAccessException {
		// TODO Auto-generated method stub
		estudianteRepo.deleteById(c_estudiante);
	}

	@Override
	public List<Estudiante> filtrarPor(String cadena) throws DataAccessException {
		// TODO Auto-generated method stub
		return estudianteRepo.findByNombre(cadena);
	}

	@Override
	public List<Estudiante> filtrarApellidoIniciandoEn(String cadena) throws DataAccessException {
		// TODO Auto-generated method stub
		return estudianteRepo.findByApellidoStartingWith(cadena);
	}
}
