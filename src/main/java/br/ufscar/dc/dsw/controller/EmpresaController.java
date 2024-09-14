package br.ufscar.dc.dsw.controller;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.ufscar.dc.dsw.domain.Empresa;
import br.ufscar.dc.dsw.service.spec.IEmpresaService;

@Controller
@RequestMapping("/empresas")
public class EmpresaController {
	
	@Autowired
	private IEmpresaService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Empresa empresa) {
		return "empresa/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("empresas",service.buscarTodos());
		return "empresa/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(@Valid Empresa empresa, BindingResult result, RedirectAttributes attr) {
		
		if (result.hasErrors()) {
			return "empresa/cadastro";
		}
		
		service.salvar(empresa);
		attr.addFlashAttribute("sucess", "empresa.create.sucess");
		return "redirect:/empresas/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("empresa", service.buscarPorId(id));
		return "empresa/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(@Valid Empresa empresa, BindingResult result, RedirectAttributes attr) {
		
		// Apenas rejeita se o problema não for com o CNPJ (CNPJ campo read-only) 
		
		if (result.getFieldErrorCount() > 1 || result.getFieldError("CNPJ") == null) {
			return "empresa/cadastro";
		}

		service.salvar(empresa);
		attr.addFlashAttribute("sucess", "empresa.edit.sucess");
		return "redirect:/empresas/listar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		if (service.empresaTemVagas(id)) {
			model.addAttribute("fail", "empresa.delete.fail");
		} else {
			service.excluir(id);
			model.addAttribute("sucess", "empresa.delete.sucess");
		}
		return listar(model);
	}
}