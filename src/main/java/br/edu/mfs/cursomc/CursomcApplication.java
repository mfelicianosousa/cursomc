package br.edu.mfs.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.mfs.cursomc.domain.Categoria;
import br.edu.mfs.cursomc.domain.Cliente;
import br.edu.mfs.cursomc.domain.ClienteEndereco;
import br.edu.mfs.cursomc.domain.Estado;
import br.edu.mfs.cursomc.domain.Municipio;
import br.edu.mfs.cursomc.domain.Pagamento;
import br.edu.mfs.cursomc.domain.PagamentoComBoleto;
import br.edu.mfs.cursomc.domain.PagamentoComCartao;
import br.edu.mfs.cursomc.domain.Pedido;
import br.edu.mfs.cursomc.domain.Produto;
import br.edu.mfs.cursomc.domain.Segmento;
import br.edu.mfs.cursomc.domain.enums.EstadoPagamento;
import br.edu.mfs.cursomc.domain.enums.Regiao;
import br.edu.mfs.cursomc.domain.enums.TipoCliente;
import br.edu.mfs.cursomc.domain.enums.TipoEndereco;
import br.edu.mfs.cursomc.repositories.CategoriaRepository;
import br.edu.mfs.cursomc.repositories.ClienteEnderecoRepository;
import br.edu.mfs.cursomc.repositories.ClienteRepository;
import br.edu.mfs.cursomc.repositories.EstadoRepository;
import br.edu.mfs.cursomc.repositories.MunicipioRepository;
import br.edu.mfs.cursomc.repositories.PagamentoRepository;
import br.edu.mfs.cursomc.repositories.PedidoRepository;
import br.edu.mfs.cursomc.repositories.ProdutoRepository;
import br.edu.mfs.cursomc.repositories.SegmentoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired 
	private ProdutoRepository produtoRepository ;
	
	@Autowired 
	private CategoriaRepository categoriaRepository ;
	
	@Autowired 
	private SegmentoRepository segmentoRepository ;
	
	@Autowired 
	private EstadoRepository estadoRepository ;
	
	@Autowired 
	private MunicipioRepository municipioRepository ;
	
	@Autowired 
	private ClienteRepository clienteRepository ;
	
	@Autowired 
	private ClienteEnderecoRepository clienteEnderecoRepository ;
	
	@Autowired 
	private PedidoRepository pedidoRepository ;
	
	@Autowired 
	private PagamentoRepository pagamentoRepository ;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria( 0, "INFORMATICA", 0) ;
		Categoria cat2 = new Categoria( 0, "ESCRITORIO",0) ;
		
		Produto p1 = new Produto(0,"Computador",2000, 1500) ;
		Produto p2 = new Produto(0, "Impressora",800,500) ;
		Produto p3 = new Produto(0, "Mouse",80,40) ;
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3)) ;
		cat2.getProdutos().addAll(Arrays.asList(p2)) ;
		
				
		p1.getCategorias().addAll(Arrays.asList(cat1)) ;
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2)) ;
		p3.getCategorias().addAll(Arrays.asList(cat1)) ;
		
		
		Segmento seg1 = new Segmento(0,"PROGRAMAS DE INFORMÁTICA SOB ENCOMENDA; DESENVOLVIMENTO, PRODUÇÃO, DOCUMENTAÇÃO DE", "6201.5") ;
		Segmento seg2 = new Segmento(0,"ENTREGA DE REFEIÇÕES, ALIMENTOS PARA RESTAURANTES; SERVIÇOS DE", "5320-2") ;
		
		cat1.getSegmentos().addAll(Arrays.asList(seg1));
		cat2.getSegmentos().addAll(Arrays.asList(seg1));
		
		segmentoRepository.saveAll(Arrays.asList(seg1,seg2)) ;
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2)) ;
		
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3)) ;
		
		//public Estado(String siglaUf, String codEstado, String nome, String capital, Regiao regiao) {

		Estado RO = new Estado() ;
		RO.setCodEstado("11");
		RO.setUf("RO");
		RO.setNome("RONDONIA");
		RO.setCapital("PORTO VELHO");
		RO.setRegiao(Regiao.NORTE);
		
		
		Estado AC = new Estado("AC","12", "ACRE","RIO BRANCO",Regiao.NORTE) ;
		Estado AM = new Estado("AM","13", "AMAZONAS","MANAUS",Regiao.NORTE) ;
		Estado RR = new Estado("RR","14", "RORAIMA","RR",Regiao.NORTE) ;
		Estado PA = new Estado("PA","15", "PARÁ","BELEM",Regiao.NORTE) ;
		Estado AP = new Estado("AP","16", "AMAPÁ","AMAPA",Regiao.NORTE) ;
		Estado TO = new Estado("TO","17", "TOCANTINS","TOCANTINS",Regiao.NORTE) ;
		Estado MA = new Estado("MA","21", "MARANHÃO","SÃO LUIZ",Regiao.NORDESTE) ;
		Estado PI = new Estado("PI","22", "PIAUÍ","PI",Regiao.NORDESTE) ;
		Estado CE = new Estado("CE","23", "CEARÁ","FORTALEZA",Regiao.NORDESTE) ;
		Estado RN = new Estado("RN","24", "RIO GRANDE DO NORTE","NATAL",Regiao.NORDESTE) ;
		Estado PB = new Estado("PB","25", "PARAÍBA","JOÃO PESSOA",Regiao.NORDESTE) ;
		Estado PE = new Estado("PE","26", "PERNAMBUCO","RECIFE",Regiao.NORDESTE) ;
		Estado AL = new Estado("AL","27", "ALAGOAS","MACEIO",Regiao.NORDESTE) ;
		Estado SE = new Estado("SE","28", "SERGIPE","SE",Regiao.NORDESTE) ;
		Estado BA = new Estado("BA","29", "BAHIA","SALVADOR",Regiao.NORDESTE) ;
		Estado MG = new Estado("MG","31", "MINAS GERAIS","BELO HORIZONTE",Regiao.SUDESTE) ;
		Estado ES = new Estado("ES","32", "ESPIRITO SANTO","ES",Regiao.SUDESTE) ;
		Estado RJ = new Estado("RJ","33", "RIO DE JANEIRO","RIO DE JANEIRO",Regiao.SUDESTE) ;
		Estado SP = new Estado("SP","35", "SÃO PAULO","SÃO PAULO",Regiao.SUDESTE) ;
		Estado PR = new Estado("PR","41", "PARANÁ","PA",Regiao.SUL) ;
		Estado SC = new Estado("SC","42", "SANTA CATARINA","FLORIANOPOLIS",Regiao.SUL) ;
		Estado RS = new Estado("RS","43", "RIO GRANDE DO SUL","PORTO ALEGRE",Regiao.SUL) ;
		Estado MS = new Estado("MS","50", "MATO GROSSO DO SUL","MS",Regiao.CENTROOESTE) ;
		Estado MT = new Estado("MT","51", "MATO GROSSO","MT",Regiao.CENTROOESTE) ;
		Estado GO = new Estado("GO","52", "GOIAS","GO",Regiao.CENTROOESTE) ;
		Estado DF = new Estado("DF","53", "DISTRITO FEDERAL","DF",Regiao.CENTROOESTE) ;
		
		estadoRepository.saveAll(Arrays.asList(RO,AC,AM,RR,PA,AP,TO,MA,PI,CE,RN,PB,PE,AL,SE,BA,MG,ES,RJ,SP,PR,SC,RS,MS,MT,GO,DF)) ;
		
		//public Municipio(int id, String codMunicipio, String nome, String ddd, long latitude, long longitude, Estado uf) {
		
		Municipio M1= new Municipio(0,"00102","ACORIZAL","65",0,0,MT);
		Municipio M2 = new Municipio(0,"00201","AGUA BOA","65",0,0,MT);
		Municipio M3 = new Municipio(0,"00250","ALTA FLORESTA","65",0,0,MT);
		Municipio M4 = new Municipio(0,"00300","ALTO ARAGUAI","65",0,0,MT);
		Municipio M5 = new Municipio(0,"00359","ALTO DA BOA VISTA","65",0,0,MT);
		Municipio M6 = new Municipio(0,"00409","ALTO GARÇAS","65",0,0,MT);
		Municipio M7 = new Municipio(0,"00508","ALTO PARAGUAI","65",0,0,MT);
		Municipio M8 = new Municipio(0,"00607","ALTO TAQUARI","65",0,0,MT);
		Municipio M9 = new Municipio(0,"00805","APIACAS","65",0,0,MT);
		Municipio M10 = new Municipio(0,"03403","CUIABÁ","65",0,0,MT);
		
		//MT.getMunicipio().addAll(Arrays.asList(MT1,MT2,MT3,MT4,MT5,MT6,MT7,MT8,MT9,MT10));
		
		//estadoRepository.saveAll(Arrays.asList(RO,AC,AM,RR,PA,AP,TO,MA,PI,CE,RN,PB,PE,AL,SE,BA,MG,ES,RJ,SP,PR,SC,RS,MS,MT,GO,DF)) ;
			
		//municipioRepository.saveAll(Arrays.asList(MT1,MT2,MT3,MT4,MT5,MT6,MT7,MT8,MT9,MT10));
        /*MUNICIPIOS DO AC */
		
		Municipio M11 = new Municipio(0,"00013","ACRELÂNDIA","00",0,0,AC);
		Municipio M12 = new Municipio(0,"00054","ASSIS BRASIL","00",0,0,AC);
		Municipio M13 = new Municipio(0,"00104","BRASILÉIA","",0,0,AC);
		Municipio M14 = new Municipio(0,"00138","BUJARI","",0,0,AC);
		Municipio M15 = new Municipio(0,"00179","CAPIXABA","",0,0,AC);
		Municipio M16 = new Municipio(0,"00203","CRUZEIRO DO SUL","65",0,0,AC);
		Municipio M17 = new Municipio(0,"00252","EPITACIOLÂNDIA","65",0,0,AC);
		Municipio M18 = new Municipio(0,"00302","FEIJÓ","65",0,0,AC);
		Municipio M19 = new Municipio(0,"00328","JORDÃO","65",0,0,AC);
		Municipio M20 = new Municipio(0,"00336","MÂNCIO LIMA","65",0,0,AC);
		Municipio M21 = new Municipio(0,"00344","MANOEL URBANO","00",0,0,AC);
		Municipio M22 = new Municipio(0,"00351","MARECHAL THAUMATURGO","00",0,0,AC);
		Municipio M23 = new Municipio(0,"00385","PLÁCIDO DE CASTRO","",0,0,AC);
		Municipio M24 = new Municipio(0,"00393","PORTO WALTER","",0,0,AC);
		Municipio M25 = new Municipio(0,"00401","RIO BRANCO","",0,0,AC);
		Municipio M26 = new Municipio(0,"00427","RODRIGUES ALVES","",0,0,AC);
		Municipio M27 = new Municipio(0,"00435","SANTA ROSA DO PURUS","65",0,0,AC);
		Municipio M28 = new Municipio(0,"00450","SENADOR GUIOMARD","",0,0,AC);
		Municipio M29 = new Municipio(0,"00500","SENA MADUREIRA","65",0,0,AC);
		Municipio M30 = new Municipio(0,"00609","TARAUACÁ","65",0,0,AC);
		Municipio M31 = new Municipio(0,"00708","XAPURI","65",0,0,AC);
		Municipio M32 = new Municipio(0,"00807","PORTO ACRE","65",0,0,AC);
	
		//AC.getMunicipio().addAll(Arrays.asList(AC1,AC2,AC3,AC4,AC5,AC6,AC7,AC8,AC9,AC10,AC11,AC12,AC13,AC14,AC15,AC16,AC17,AC18,AC19,AC20,AC21,AC22));
		
		municipioRepository.saveAll(Arrays.asList(M1,M2,M3,M4,M5,M6,M7,M8,M9,M10,M11,M12,M13,M14,M15,M16,M17,M18,M19,M20,M21,M22,M23,M24,M25,M26,M27,M28,M29,M30,M31,M32));
		
		/* Clientes, Endereços e Cidades
		 * public Cliente(int id, String nome, String email, String cpfOuCnpj, TipoCliente tipoCliente) {
		 *  */
		

		Cliente cli1 = new Cliente(0,"Maria Silva","maria@gmail.com","36378912377",TipoCliente.PESSOA_FISICA);
		cli1.getTelefones().addAll(Arrays.asList("27363323","93838393")) ;
		
		ClienteEndereco e1 = new ClienteEndereco(0,TipoEndereco.RESIDENCIAL,"78088120","Rua 201","6","TIJUCAL","PROX. NERCY CABELELEIRA",cli1, M10);
		ClienteEndereco e2 = new ClienteEndereco(0,TipoEndereco.COMERCIAL,"78088000","Rua Alcantara","1006","PAZ","PROX. AV GETULIO VARGAS,1220",cli1, M15);
	    // Cliente precisa conhecer os endereços dele
		cli1.getEnderecos().addAll(Arrays.asList(e1,e2)) ;
		
		clienteRepository.saveAll( Arrays.asList(cli1));
		clienteEnderecoRepository.saveAll(Arrays.asList(e1,e2)) ;
	
		
	    // pedidos
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Pedido ped1 = new Pedido( 0, sdf.parse("30/09/2017 10:32"), cli1, e1);
		Pedido ped2 = new Pedido( 0, sdf.parse("10/10/2017 19:35"), cli1, e2);
		
		Pagamento pagto1 = new PagamentoComCartao(0,EstadoPagamento.QUITADO, ped1, 6);
		ped1.setPagamento(pagto1);
		
		Pagamento pagto2 = new PagamentoComBoleto(0,EstadoPagamento.PENDENTE, ped2, sdf.parse("20/10/2017 00:00"),null);
		ped2.setPagamento(pagto2);
		
		cli1.getPedidos().addAll(Arrays.asList(ped1, ped2));
		
		pedidoRepository.saveAll(Arrays.asList(ped1, ped2)) ;
		
		pagamentoRepository.saveAll(Arrays.asList(pagto1, pagto2));
	
				
	}

}
