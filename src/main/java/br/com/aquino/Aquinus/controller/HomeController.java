package br.com.aquino.Aquinus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.aquino.Aquinus.model.Pedido;
import br.com.aquino.Aquinus.repository.PedidoRepository;

@Controller
public class HomeController {
	
	@Autowired
	private PedidoRepository repositoryRepository;
		
	@GetMapping("/home")
	public String home(Model model){				
		List<Pedido> pedidos = repositoryRepository.findAll();
		model.addAttribute("pedidos", pedidos);		
		return "home";
		
	}
}
																														