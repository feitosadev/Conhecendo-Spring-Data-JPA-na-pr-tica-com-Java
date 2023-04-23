package me.dio.academia.digital.repository;

import java.util.List;
import java.util.Optional;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.Matricula;

public interface MatriculaRepository {
	List<Matricula> findByAlunoBairro(String bairro);

	Matricula save(Matricula matricula);

	Optional<Aluno> findById(Long id);

	List<Matricula> findAll();

	List<Matricula> findAlunosMatriculadosBairro(String bairro);
}
