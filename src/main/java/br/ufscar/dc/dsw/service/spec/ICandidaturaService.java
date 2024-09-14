package br.ufscar.dc.dsw.service.spec;

import java.util.List;

import br.ufscar.dc.dsw.domain.Candidatura;
import br.ufscar.dc.dsw.domain.Usuario;

public interface ICandidaturaService {

	Candidatura buscarPorId(Long id);

	List<Candidatura> buscarTodosPorUsuario(Usuario u);

	List<Candidatura> buscarTodos();
	
	void salvar(Candidatura candidatura);
	
	void excluir(Long id);
}