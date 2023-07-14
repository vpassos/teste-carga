//package br.com.claro.carga.load;
//
//import static br.com.claro.commons.State.IGNORED;
//
//import java.lang.reflect.InvocationTargetException;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.UUID;
//
//import javax.annotation.PostConstruct;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import br.com.claro.persistence.bean.ClienteBean;
//import br.com.claro.persistence.bean.ClienteProdutoBean;
//import br.com.claro.persistence.bean.EventoBean;
//import br.com.claro.persistence.bean.ParceiroBean;
//import br.com.claro.persistence.repository.ClienteJpaRepository;
//import br.com.claro.persistence.repository.ClienteProdutoJpaRepository;
//import br.com.claro.persistence.repository.EventoJpaRepository;
//import br.com.claro.persistence.repository.ParceiroJpaRepository;
//
//@Component
//public class Load {
//	
//	private final static Logger LOGGER = LoggerFactory.getLogger(Load.class);
//	
//	@Autowired
//	private EventoJpaRepository eventoJpaRepository;
//	
//	@Autowired
//	private ClienteJpaRepository clienteJpaRepository;
//	
//	@Autowired
//	private ParceiroJpaRepository parceiroJpaRepository;
//	
//	@Autowired
//	private ClienteProdutoJpaRepository clienteProdutoJpaRepository; 
//
//	@PostConstruct
//	public void load() throws IllegalAccessException, InvocationTargetException {
//		
//		ClienteBean cliente = clienteJpaRepository.findById(110276L).get();
//		
//		ParceiroBean parceiro = parceiroJpaRepository.findById(10L).get();
//		
//		ClienteProdutoBean clienteProduto =  clienteProdutoJpaRepository.findById(109220l).get();
//		
////		EventoBean eventoBean1 = this.novoEvento(cliente, parceiro, clienteProduto);
////		eventoJpaRepository.save(eventoBean1);
//
//		int i = 0;
//		int j = 0;
//		List<EventoBean> list = new ArrayList<>();
//		while (i < 1000) {
//			EventoBean eventoBean = this.novoEvento(cliente, parceiro, clienteProduto);
//			//LOGGER.info("Adicionando evento com o x-requestId: {} na lista",eventoBean.getRequestId());
//			list.add(eventoBean);
//			j++;
//			if(j == 30) {
//				LOGGER.info("Salvando {} na tabela de evento",j);
//				eventoJpaRepository.saveAllAndFlush(list);
//				LOGGER.info("Eventos salvos na tabela de evento");
//				list.clear();
//				j = 0;
//			}
//			i++;
//		}
//		LOGGER.info("Fim da carga");
//		
//	}
//	
//	private EventoBean novoEvento(ClienteBean cliente, ParceiroBean parceiro, ClienteProdutoBean clienteProduto) {
//
//		return new EventoBean()
//		.withcdPai("110276v2AMR")
//		.withstEvento(IGNORED)
//		.withstNotificacao(IGNORED)
//		.withstSpr(IGNORED)
//		.withstCommunication(IGNORED)
//		.withstConsumer(IGNORED)
//		.withdhCriacao(new Date())
//		.withdsEvento("CHECKOUT_TESTE")
////		.withidCliente(cliente)
//		.withdsErro("Evento Desconsiderado - Teste Carga.")
//		.withParceiro(parceiro)
//		.withidProduto(82l)
////		.withClienteProduto(clienteProduto)
//		.withcdPaiProduto(clienteProduto.getCdPaiProduto())
//		.withdsRequestId(UUID.randomUUID().toString())
//		.withcdProduto(clienteProduto.getCdPaiProduto())
//		.withdhAtivacao(new Date());
//		
//	}
//	
//}
