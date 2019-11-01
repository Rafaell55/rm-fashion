package com.rmfashion;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rmfashion.domain.CategoriaFeminino;
import com.rmfashion.domain.CategoriaMasculino;
import com.rmfashion.domain.Cidade;
import com.rmfashion.domain.Cliente;
import com.rmfashion.domain.Endereco;
import com.rmfashion.domain.Estado;
import com.rmfashion.domain.ProdutoFeminino;
import com.rmfashion.domain.ProdutoMasculino;
import com.rmfashion.domain.ProdutoVariado;
import com.rmfashion.domain.Variado;
import com.rmfashion.domain.enums.TipoCliente;
import com.rmfashion.repositories.CategoriaFemininoRepository;
import com.rmfashion.repositories.CategoriaMasculinoRepository;
import com.rmfashion.repositories.CidadeRepository;
import com.rmfashion.repositories.ClienteRepository;
import com.rmfashion.repositories.EnderecoRepository;
import com.rmfashion.repositories.EstadoRepository;
import com.rmfashion.repositories.ProdutoFemininoRepository;
import com.rmfashion.repositories.ProdutoMasculinoRepository;
import com.rmfashion.repositories.ProdutoVariadoRepository;
import com.rmfashion.repositories.VariadoRepository;

@SpringBootApplication
public class RmFashionApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RmFashionApplication.class, args);
	}

	@Autowired
	private CategoriaFemininoRepository categoriaFemininoRepository;
	@Autowired
	private CategoriaMasculinoRepository categoriaMasculinoRepository;
	@Autowired
	private VariadoRepository variadosRepository;
	
	@Autowired
	private ProdutoFemininoRepository produtoFeminoRepository;
	
	@Autowired
	private ProdutoMasculinoRepository produtoMasculinoRepository;
	
	@Autowired
	private ProdutoVariadoRepository produtoVariadoRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;	
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;


	@Override
	public void run(String... args) throws Exception {

		// Lista de categoria Feminino
		CategoriaFeminino catfem1 = new CategoriaFeminino(null, "Moda Íntima");
		CategoriaFeminino catfem2 = new CategoriaFeminino(null, "Moda Praia");
		CategoriaFeminino catfem3 = new CategoriaFeminino(null, "Saias");
		CategoriaFeminino catfem4 = new CategoriaFeminino(null, "Vestidos");
		CategoriaFeminino catfem5 = new CategoriaFeminino(null, "Blusas e Camisetas");
		CategoriaFeminino catfem6 = new CategoriaFeminino(null, "Calças");
		CategoriaFeminino catfem7 = new CategoriaFeminino(null, "Camisas");
		CategoriaFeminino catfem8 = new CategoriaFeminino(null, "Jeans");
		CategoriaFeminino catfem9 = new CategoriaFeminino(null, "Macacões e Jardineiras");

		categoriaFemininoRepository.saveAll(
				Arrays.asList(catfem1, catfem2, catfem3, catfem4, catfem5, catfem6, catfem7, catfem8, catfem9));

		// Lista de ProdutoFemininos femininos

		// Categoria Moda Íntima
		ProdutoFeminino prodFemModInt1 = new ProdutoFeminino(null, "Sutiã Tomara Que Caia em Cetim com Renda", "Preto",
				"44", 49.90);
		ProdutoFeminino prodFemModInt2 = new ProdutoFeminino(null, "Calcinha String em Cetim com Cós Renda", "Preto",
				"M", 25.90);
		ProdutoFeminino prodFemModInt3 = new ProdutoFeminino(null, "Sutiã Base com Renda Contrastante", "Preto", "42",
				49.90);

		// Categoria Moda Praia
		ProdutoFeminino prodFemModPraia1 = new ProdutoFeminino(null,
				"Biquíni Top Cropped Texturizado Listrado com Detalhe Nó", "Vermelho", "M", 69.90);
		ProdutoFeminino prodFemModPraia2 = new ProdutoFeminino(null,
				"Biquíni Calcinha com Lateral Drapeada Texturizado Listrada", "Vermelho", "M", 59.90);
		ProdutoFeminino prodFemModPraia3 = new ProdutoFeminino(null, "Maiô com Decote Reto Estampa Folhagem", "Bege",
				"M", 169.90);

		// Categoria Saias
		ProdutoFeminino prodFemSaia1 = new ProdutoFeminino(null, "Saia Floral com Botões", "Amarelo", "M", 159.90);
		ProdutoFeminino prodFemSaia2 = new ProdutoFeminino(null, "Saia Poá com Babados", "Verde", "M", 159.90);
		ProdutoFeminino prodFemSaia3 = new ProdutoFeminino(null, "Saia em Ribana com Elástico no Cós", "Preto", "M",
				79.90);

		// Categoria Vestidos
		ProdutoFeminino prodFemVest1 = new ProdutoFeminino(null, "Vestido Floral com Babados em Crepe", "Amarelo", "M",
				129.90);
		ProdutoFeminino prodFemVest2 = new ProdutoFeminino(null, "Vestido Liso com Cinto", "Branco", "M", 179.90);
		ProdutoFeminino prodFemVest3 = new ProdutoFeminino(null, "Vestido com Alças Finas Longo Listrado", "Branco",
				"M", 179.90);

		// Categoria Blusas e Camisetas
		ProdutoFeminino prodFemBlusCamiseta1 = new ProdutoFeminino(null,
				"Regata Esportiva Texturizada com Costas Diferenciadas", "Branco", "M", 49.90);
		ProdutoFeminino prodFemBlusCamiseta2 = new ProdutoFeminino(null, "Camiseta Esportiva Básica", "Verde", "M",
				39.90);
		ProdutoFeminino prodFemBlusCamiseta3 = new ProdutoFeminino(null, "Body de Alcinha com Abertura na Cintura",
				"Branco", "M", 89.90);

		// Categoria Calças
		ProdutoFeminino prodFemCalca1 = new ProdutoFeminino(null, "Calça em Linho Lisa com Amarração", "Bege", "M",
				99.90);
		ProdutoFeminino prodFemCalca2 = new ProdutoFeminino(null, "Calça Legging Esportiva com Textura", "Verde", "M",
				79.90);
		ProdutoFeminino prodFemCalca3 = new ProdutoFeminino(null, "Calça Cigarrete com Cinto", "Preto", "M", 139.90);

		// Categoria Camisas
		ProdutoFeminino prodFemCamisa1 = new ProdutoFeminino(null, "Camisa com Botões Manga Longa", "Verde", "M",
				119.90);
		ProdutoFeminino prodFemCamisa2 = new ProdutoFeminino(null, "Blusa com Nó e Botões em Jersey", "Preto", "M",
				99.90);
		ProdutoFeminino prodFemCamisa3 = new ProdutoFeminino(null, "Camisa Listrada Floral com Manga Ampla", "Branco",
				"M", 89.90);

		// Categoria Jeans
		ProdutoFeminino prodFemJeans1 = new ProdutoFeminino(null, "Short Jeans Boyfriend com Puídos", "Azul", "M",
				99.90);
		ProdutoFeminino prodFemJeans2 = new ProdutoFeminino(null, "Calça Jeans Skinny", "Bege", "M", 79.90);
		ProdutoFeminino prodFemJeans3 = new ProdutoFeminino(null, "Jaqueta Jeans com Puídos", "Azul", "M", 179.90);

		// Categoria Macacões e Jardineiras
		ProdutoFeminino prodFemMacaJardi1 = new ProdutoFeminino(null, "Macacão Pantacourt Listrado com Alças Largas",
				"Off-White", "P", 199.90);
		ProdutoFeminino prodFemMacaJardi2 = new ProdutoFeminino(null, "Macacão Midi com Nó Frontal", "Preto", "M",
				119.90);
		ProdutoFeminino prodFemMacaJardi3 = new ProdutoFeminino(null, "Macaquinho Floral com Decote V", "Azul", "M",
				159.90);

		catfem1.getProdutosFemininos().addAll(Arrays.asList(prodFemModInt1, prodFemModInt2, prodFemModInt3));

		catfem2.getProdutosFemininos().addAll(Arrays.asList(prodFemModPraia1, prodFemModPraia2, prodFemModPraia3));

		catfem3.getProdutosFemininos().addAll(Arrays.asList(prodFemSaia1, prodFemSaia2, prodFemSaia3));

		catfem4.getProdutosFemininos().addAll(Arrays.asList(prodFemVest1, prodFemVest2, prodFemVest3));

		catfem5.getProdutosFemininos()
				.addAll(Arrays.asList(prodFemBlusCamiseta1, prodFemBlusCamiseta2, prodFemBlusCamiseta3));

		catfem6.getProdutosFemininos().addAll(Arrays.asList(prodFemCalca1, prodFemCalca2, prodFemCalca3));

		catfem7.getProdutosFemininos().addAll(Arrays.asList(prodFemCamisa1, prodFemCamisa2, prodFemCamisa3));

		catfem8.getProdutosFemininos().addAll(Arrays.asList(prodFemJeans1, prodFemJeans2, prodFemJeans3));

		catfem9.getProdutosFemininos().addAll(Arrays.asList(prodFemMacaJardi1, prodFemMacaJardi2, prodFemMacaJardi3));

		// produtos reconhecendo as categorias

		// feminino
		prodFemModInt1.getCategoriasfeminino().addAll(Arrays.asList(catfem1));
		prodFemModInt2.getCategoriasfeminino().addAll(Arrays.asList(catfem1));
		prodFemModInt3.getCategoriasfeminino().addAll(Arrays.asList(catfem1));

		prodFemModPraia1.getCategoriasfeminino().addAll(Arrays.asList(catfem2));
		prodFemModPraia2.getCategoriasfeminino().addAll(Arrays.asList(catfem2));
		prodFemModPraia3.getCategoriasfeminino().addAll(Arrays.asList(catfem2));

		prodFemSaia1.getCategoriasfeminino().addAll(Arrays.asList(catfem3));
		prodFemSaia2.getCategoriasfeminino().addAll(Arrays.asList(catfem3));
		prodFemSaia3.getCategoriasfeminino().addAll(Arrays.asList(catfem3));

		prodFemVest1.getCategoriasfeminino().addAll(Arrays.asList(catfem4));
		prodFemVest2.getCategoriasfeminino().addAll(Arrays.asList(catfem4));
		prodFemVest3.getCategoriasfeminino().addAll(Arrays.asList(catfem4));

		prodFemBlusCamiseta1.getCategoriasfeminino().addAll(Arrays.asList(catfem5));
		prodFemBlusCamiseta2.getCategoriasfeminino().addAll(Arrays.asList(catfem5));
		prodFemBlusCamiseta3.getCategoriasfeminino().addAll(Arrays.asList(catfem5));

		prodFemCalca1.getCategoriasfeminino().addAll(Arrays.asList(catfem6));
		prodFemCalca2.getCategoriasfeminino().addAll(Arrays.asList(catfem6));
		prodFemCalca3.getCategoriasfeminino().addAll(Arrays.asList(catfem6));

		prodFemCamisa1.getCategoriasfeminino().addAll(Arrays.asList(catfem7));
		prodFemCamisa2.getCategoriasfeminino().addAll(Arrays.asList(catfem7));
		prodFemCamisa3.getCategoriasfeminino().addAll(Arrays.asList(catfem7));

		prodFemJeans1.getCategoriasfeminino().addAll(Arrays.asList(catfem8));
		prodFemJeans2.getCategoriasfeminino().addAll(Arrays.asList(catfem8));
		prodFemJeans3.getCategoriasfeminino().addAll(Arrays.asList(catfem8));

		prodFemMacaJardi1.getCategoriasfeminino().addAll(Arrays.asList(catfem9));
		prodFemMacaJardi2.getCategoriasfeminino().addAll(Arrays.asList(catfem9));
		prodFemMacaJardi3.getCategoriasfeminino().addAll(Arrays.asList(catfem9));

		produtoFeminoRepository.saveAll(
				Arrays.asList(prodFemModInt1, prodFemModInt2, prodFemModPraia1, prodFemModPraia2, prodFemModInt3,
						prodFemModPraia3, prodFemSaia1, prodFemSaia2, prodFemSaia3, prodFemVest1, prodFemVest2,
						prodFemVest3, prodFemBlusCamiseta1, prodFemBlusCamiseta2, prodFemBlusCamiseta3, prodFemCalca1,
						prodFemCalca2, prodFemCalca3, prodFemCamisa1, prodFemCamisa2, prodFemCamisa3, prodFemJeans1,
						prodFemJeans2, prodFemJeans3, prodFemMacaJardi1, prodFemMacaJardi2, prodFemMacaJardi3));
		// ---------------------------------------------------------------------------------------------------------------

		// Lista de Categoria Masculino
		CategoriaMasculino catmasc1 = new CategoriaMasculino(null, "Bermudas e Shorts");
		CategoriaMasculino catmasc2 = new CategoriaMasculino(null, "Calças");
		CategoriaMasculino catmasc3 = new CategoriaMasculino(null, "Camisas");
		CategoriaMasculino catmasc4 = new CategoriaMasculino(null, "Camisetas");
		CategoriaMasculino catmasc5 = new CategoriaMasculino(null, "Esportivo");
		CategoriaMasculino catmasc6 = new CategoriaMasculino(null, "Jeans");
		CategoriaMasculino catmasc7 = new CategoriaMasculino(null, "Moda Íntima");
		CategoriaMasculino catmasc8 = new CategoriaMasculino(null, "Moletons");
		CategoriaMasculino catmasc9 = new CategoriaMasculino(null, "Polos");
		CategoriaMasculino catmasc10 = new CategoriaMasculino(null, "Regatas");

		categoriaMasculinoRepository.saveAll(Arrays.asList(catmasc1, catmasc2, catmasc3, catmasc4, catmasc5, catmasc6,
				catmasc7, catmasc8, catmasc9, catmasc10));

		// Lista de produtos Masculino

		// Categoria Bermudas e Shorts

		ProdutoMasculino prodMascBermShort1 = new ProdutoMasculino(null, "Bermuda Esportiva Estampada", "Preto", "P",
				49.90);
		ProdutoMasculino prodMascBermShort2 = new ProdutoMasculino(null, "Bermuda Cós Fixo Com Bolsos", "Azul", "M",
				69.90);
		ProdutoMasculino prodMascBermShort3 = new ProdutoMasculino(null, "Bermuda com Bolso Embutido Peach Touch",
				"Azul", "G", 69.90);
		ProdutoMasculino prodMascBermShort4 = new ProdutoMasculino(null, "Bermuda Estampa Floral Com Amarração",
				"Branco", "M", 69.90);
		ProdutoMasculino prodMascBermShort5 = new ProdutoMasculino(null, "Bermuda Slim em Jeans", "Azul", "P", 79.90);

		// Categoria Calças
		ProdutoMasculino prodMascCalca1 = new ProdutoMasculino(null, "Calça Jogger Camuflada em Sarja", "Verde", "M",
				119.90);
		ProdutoMasculino prodMascCalca2 = new ProdutoMasculino(null, "Calça Skinny em Jeans", "Preto", "38", 99.90);
		ProdutoMasculino prodMascCalca3 = new ProdutoMasculino(null, "Calça Biker em Moletom", null, "M", 99.90);
		ProdutoMasculino prodMascCalca4 = new ProdutoMasculino(null, "Calça em Sarja Slim Lavada", "Preto", "M",
				139.90);
		ProdutoMasculino prodMascCalca5 = new ProdutoMasculino(null, "Calça Slim em Sarja", "Preto", "M", 119.90);

		// Categoria Camisa
		ProdutoMasculino prodMascCamisa1 = new ProdutoMasculino(null, "Camisa Slim Fit Manga Longa Estampa Xadrez",
				"Branco", "04", 119.90);
		ProdutoMasculino prodMascCamisa2 = new ProdutoMasculino(null, "Camisa Slim Fit Manga Longa Listrada", "Preto",
				"04", 99.90);
		ProdutoMasculino prodMascCamisa3 = new ProdutoMasculino(null, "Camisa Manga Longa Slim Fit Xadrez Vichy",
				"Verde", "03", 99.90);
		ProdutoMasculino prodMascCamisa4 = new ProdutoMasculino(null, "Camisa Manga Curta Estampa Elenco Simpsons",
				"Amarelo", "04", 99.90);

		// Categoria Camisetas
		ProdutoMasculino prodMascCamiseta1 = new ProdutoMasculino(null, "Camiseta Manga Reglan com Estampa Floral",
				null, "PP", 39.90);
		ProdutoMasculino prodMascCamiseta2 = new ProdutoMasculino(null,
				"Camiseta Estampa Homem Aranha Brilha no Escuro", "Preto", "M", 49.90);
		ProdutoMasculino prodMascCamiseta3 = new ProdutoMasculino(null, "Camiseta Estampa Floral Hibisco", "Laranja",
				"M", 49.90);

		// Categoria Esportivo
		ProdutoMasculino prodMascEsport1 = new ProdutoMasculino(null, "Bermuda Esportiva com Recorte", "Preto", "P",
				59.90);
		ProdutoMasculino prodMascEsport2 = new ProdutoMasculino(null, "Bermuda Esportiva Running", "Azul", "M", 49.90);
		ProdutoMasculino prodMascEsport3 = new ProdutoMasculino(null, "Bermuda Esportiva com Recorte Lateral", "Preto",
				"M", 59.90);

		// Produto Jeans
		ProdutoMasculino prodMascJeans1 = new ProdutoMasculino(null, "Calça Jeans Skinny", "Azul", "38", 119.90);
		ProdutoMasculino prodMascJeans2 = new ProdutoMasculino(null, "Calça Skinny em Jeans", "Azul", "38", 99.90);
		ProdutoMasculino prodMascJeans3 = new ProdutoMasculino(null, "Calça Jeans Marmorizado Skinny", "Azul", "38",
				99.90);

		// Produto Moda Íntima
		ProdutoMasculino prodMascModInt1 = new ProdutoMasculino(null, "Meia Cano Longo Estampas de Rosas e Onças",
				"Preto", "U", 12.90);
		ProdutoMasculino prodMascModInt2 = new ProdutoMasculino(null, "Meia Cano Longo Estampas de Palmeiras", "Rosa",
				"U", 12.90);
		ProdutoMasculino prodMascModInt3 = new ProdutoMasculino(null, "Meia Cano Longo Estampas Neon", "Preto", "U",
				12.90);

		// Produto Moletons
		ProdutoMasculino prodMascMoleton1 = new ProdutoMasculino(null,
				"Calça em Moletom com Bolsos em Zíper e Letterig nas Costas", "Preto", "M", 139.90);
		ProdutoMasculino prodMascMoleton2 = new ProdutoMasculino(null, "Bermuda Esportiva em Moletom", "Cinza", "M",
				69.90);
		ProdutoMasculino prodMascMoleton3 = new ProdutoMasculino(null, "Moletom Estampa Puglia com Ribana", "Branco",
				"M", 99.90);

		// Produto Polos
		ProdutoMasculino prodMascPolo1 = new ProdutoMasculino(null, "Polo Manga Curta Estampa Folhagem", "Azul", "M",
				89.90);
		ProdutoMasculino prodMascPolo2 = new ProdutoMasculino(null, "Polo Estampa Folhas Twisted", "Cinza", "M", 79.90);
		ProdutoMasculino prodMascPolo3 = new ProdutoMasculino(null, "Polo com Detalhe em Ribana", "Preto", "M", 79.90);

		// Produto Regatas
		ProdutoMasculino prodMascRegata1 = new ProdutoMasculino(null, "Regata Estampa Surf School com Coqueiro",
				"Branco", "M", 29.90);
		ProdutoMasculino prodMascRegata2 = new ProdutoMasculino(null, "Regata Estampa Floral Hibiscus", "Rosa", "M",
				39.90);
		ProdutoMasculino prodMascRegata3 = new ProdutoMasculino(null, "Regata Estampa Urso da California", "Preto", "M",
				39.90);

		catmasc1.getProdutosmasculinos().addAll(Arrays.asList(prodMascBermShort1, prodMascBermShort2,
				prodMascBermShort3, prodMascBermShort4, prodMascBermShort5));

		catmasc2.getProdutosmasculinos()
				.addAll(Arrays.asList(prodMascCalca1, prodMascCalca2, prodMascCalca3, prodMascCalca4, prodMascCalca5));

		catmasc3.getProdutosmasculinos()
				.addAll(Arrays.asList(prodMascCamisa1, prodMascCamisa2, prodMascCamisa3, prodMascCamisa4));

		catmasc4.getProdutosmasculinos().addAll(Arrays.asList(prodMascCamiseta1, prodMascCamiseta2, prodMascCamiseta3));

		catmasc5.getProdutosmasculinos().addAll(Arrays.asList(prodMascEsport1, prodMascEsport2, prodMascEsport3));

		catmasc6.getProdutosmasculinos().addAll(Arrays.asList(prodMascJeans1, prodMascJeans2, prodMascJeans3));

		catmasc7.getProdutosmasculinos().addAll(Arrays.asList(prodMascModInt1, prodMascModInt2, prodMascModInt3));

		catmasc8.getProdutosmasculinos().addAll(Arrays.asList(prodMascMoleton1, prodMascMoleton2, prodMascMoleton3));

		catmasc9.getProdutosmasculinos().addAll(Arrays.asList(prodMascPolo1, prodMascPolo2, prodMascPolo3));

		catmasc10.getProdutosmasculinos().addAll(Arrays.asList(prodMascRegata1, prodMascRegata2, prodMascRegata3));

		// Produtos reconhecendo a categoria

		// masculino
		prodMascBermShort1.getCategoriasmasculinos().addAll(Arrays.asList(catmasc1));
		prodMascBermShort2.getCategoriasmasculinos().addAll(Arrays.asList(catmasc1));
		prodMascBermShort3.getCategoriasmasculinos().addAll(Arrays.asList(catmasc1));
		prodMascBermShort4.getCategoriasmasculinos().addAll(Arrays.asList(catmasc1));
		prodMascBermShort5.getCategoriasmasculinos().addAll(Arrays.asList(catmasc1));

		prodMascCalca1.getCategoriasmasculinos().addAll(Arrays.asList(catmasc2));
		prodMascCalca2.getCategoriasmasculinos().addAll(Arrays.asList(catmasc2));
		prodMascCalca3.getCategoriasmasculinos().addAll(Arrays.asList(catmasc2));
		prodMascCalca4.getCategoriasmasculinos().addAll(Arrays.asList(catmasc2));
		prodMascCalca5.getCategoriasmasculinos().addAll(Arrays.asList(catmasc2));

		prodMascCamisa1.getCategoriasmasculinos().addAll(Arrays.asList(catmasc3));
		prodMascCamisa2.getCategoriasmasculinos().addAll(Arrays.asList(catmasc3));
		prodMascCamisa3.getCategoriasmasculinos().addAll(Arrays.asList(catmasc3));
		prodMascCamisa4.getCategoriasmasculinos().addAll(Arrays.asList(catmasc3));

		prodMascCamiseta1.getCategoriasmasculinos().addAll(Arrays.asList(catmasc4));
		prodMascCamiseta2.getCategoriasmasculinos().addAll(Arrays.asList(catmasc4));
		prodMascCamiseta3.getCategoriasmasculinos().addAll(Arrays.asList(catmasc4));

		prodMascEsport1.getCategoriasmasculinos().addAll(Arrays.asList(catmasc5));
		prodMascEsport2.getCategoriasmasculinos().addAll(Arrays.asList(catmasc5));
		prodMascEsport3.getCategoriasmasculinos().addAll(Arrays.asList(catmasc5));

		prodMascJeans1.getCategoriasmasculinos().addAll(Arrays.asList(catmasc6));
		prodMascJeans2.getCategoriasmasculinos().addAll(Arrays.asList(catmasc6));
		prodMascJeans3.getCategoriasmasculinos().addAll(Arrays.asList(catmasc6));

		prodMascModInt1.getCategoriasmasculinos().addAll(Arrays.asList(catmasc7));
		prodMascModInt2.getCategoriasmasculinos().addAll(Arrays.asList(catmasc7));
		prodMascModInt3.getCategoriasmasculinos().addAll(Arrays.asList(catmasc7));

		prodMascMoleton1.getCategoriasmasculinos().addAll(Arrays.asList(catmasc8));
		prodMascMoleton2.getCategoriasmasculinos().addAll(Arrays.asList(catmasc8));
		prodMascMoleton3.getCategoriasmasculinos().addAll(Arrays.asList(catmasc8));

		prodMascPolo1.getCategoriasmasculinos().addAll(Arrays.asList(catmasc9));
		prodMascPolo2.getCategoriasmasculinos().addAll(Arrays.asList(catmasc9));
		prodMascPolo3.getCategoriasmasculinos().addAll(Arrays.asList(catmasc9));

		prodMascRegata1.getCategoriasmasculinos().addAll(Arrays.asList(catmasc10));
		prodMascRegata2.getCategoriasmasculinos().addAll(Arrays.asList(catmasc10));
		prodMascRegata3.getCategoriasmasculinos().addAll(Arrays.asList(catmasc10));

		produtoMasculinoRepository.saveAll(Arrays.asList(prodMascBermShort1, prodMascBermShort2, prodMascBermShort3,
				prodMascBermShort4, prodMascBermShort5, prodMascCalca1, prodMascCalca2, prodMascCalca3, prodMascCalca4,
				prodMascCalca5, prodMascCamisa1, prodMascCamisa2, prodMascCamisa3, prodMascCamisa4, prodMascCamiseta1,
				prodMascCamiseta2, prodMascCamiseta3, prodMascEsport1, prodMascEsport2, prodMascEsport3, prodMascJeans1,
				prodMascJeans2, prodMascJeans3, prodMascModInt1, prodMascModInt2, prodMascModInt3, prodMascMoleton1,
				prodMascMoleton2, prodMascMoleton1, prodMascPolo1, prodMascPolo2, prodMascPolo3, prodMascRegata1,
				prodMascRegata2, prodMascRegata3));
		// --------------------------------------------------------------------------------------------------------------

		// Lista de categoria de produtos Variados
		Variado var1 = new Variado(null, "SEX SHOP");

		variadosRepository.saveAll(Arrays.asList(var1));

		ProdutoVariado variados1 = new ProdutoVariado(null, "Gel Corporal Beijavel Sabor Morango HOT", 6.00);
		ProdutoVariado variados2 = new ProdutoVariado(null, "SexPaper zero açúcar", 3.50);
		ProdutoVariado variados3 = new ProdutoVariado(null, "Gel Corporal Sabor Menta", 5.00);
		ProdutoVariado variados4 = new ProdutoVariado(null, "Gel Corporal Sabor Chiclete", 5.00);
		ProdutoVariado variados5 = new ProdutoVariado(null, "Gel Corporal Sabor Amarula", 5.00);
		ProdutoVariado variados6 = new ProdutoVariado(null, "Gel Corporal Sabor Caipirinha", 5.00);
		ProdutoVariado variados7 = new ProdutoVariado(null, "Raspadinha Do Prazer", 1.00);
		ProdutoVariado variados8 = new ProdutoVariado(null, "Rapadinha Kama Sutra", 1.00);
		ProdutoVariado variados9 = new ProdutoVariado(null, "Rapadinha Strip Tease", 1.00);
		ProdutoVariado variados10 = new ProdutoVariado(null, "Lubrificante Corporal", 7.50);
		ProdutoVariado variados11 = new ProdutoVariado(null, "Expansor ", 5.00);
		ProdutoVariado variados12 = new ProdutoVariado(null, "Bolinha Do Prazer", 5.00);
		ProdutoVariado variados13 = new ProdutoVariado(null, "Anel Peniano", 4.00);
		ProdutoVariado variados14 = new ProdutoVariado(null, "Sensitive Gel Corporal", 10.00);
		ProdutoVariado variados15 = new ProdutoVariado(null, "Jogo do Prazer", 6.00);
		ProdutoVariado variados16 = new ProdutoVariado(null,
				"Desodorante Corporal Fragrância Sensual Morango Com Champagne", 12.00);
		ProdutoVariado variados17 = new ProdutoVariado(null, "Virgine Gel Adistringente", 10.00);
		ProdutoVariado variados18 = new ProdutoVariado(null, "Aromatizante Bucal Morango Com Canela", 8.00);
		ProdutoVariado variados19 = new ProdutoVariado(null, "Beijo Hot Brilho Labial Sabor Morango", 15.00);
		ProdutoVariado variados20 = new ProdutoVariado(null, "Soft Love Mamba Negra", 7.50);
		ProdutoVariado variados21 = new ProdutoVariado(null, "Gel para Massagem Corporal Chinesinha", 7.50);
		ProdutoVariado variados22 = new ProdutoVariado(null, "Diaba Gel Corporal Feminino", 7.50);
		ProdutoVariado variados23 = new ProdutoVariado(null, "Bolinha do Prazer Óleo Lubrificante", 2.50);
		ProdutoVariado variados24 = new ProdutoVariado(null, "Retardante Gel Corporal Masculino", 10.00);
		ProdutoVariado variados25 = new ProdutoVariado(null, "Hot & Ice Gel Para Massagem", 10.00);
		ProdutoVariado variados26 = new ProdutoVariado(null, "Loka Sensacão Po Da Bruxinha", 5.00);
		ProdutoVariado variados27 = new ProdutoVariado(null, "Bala Dio Loko Sabor Cereja", 2.00);
		ProdutoVariado variados28 = new ProdutoVariado(null, "Anel Peniano Com Vidro", 15.00);

		var1.getProdutosvariados()
				.addAll(Arrays.asList(variados1, variados2, variados3, variados4, variados5, variados6, variados7,
						variados8, variados9, variados10, variados11, variados12, variados13, variados14, variados15,
						variados16, variados17, variados18, variados19, variados20, variados21, variados22, variados23,
						variados24, variados25, variados26, variados27, variados28));

		// produto reconhecendo a cetegoria

		variados1.getVariados().addAll(Arrays.asList(var1));
		variados2.getVariados().addAll(Arrays.asList(var1));
		variados3.getVariados().addAll(Arrays.asList(var1));
		variados4.getVariados().addAll(Arrays.asList(var1));
		variados5.getVariados().addAll(Arrays.asList(var1));
		variados6.getVariados().addAll(Arrays.asList(var1));
		variados7.getVariados().addAll(Arrays.asList(var1));
		variados8.getVariados().addAll(Arrays.asList(var1));
		variados9.getVariados().addAll(Arrays.asList(var1));
		variados10.getVariados().addAll(Arrays.asList(var1));
		variados11.getVariados().addAll(Arrays.asList(var1));
		variados11.getVariados().addAll(Arrays.asList(var1));
		variados13.getVariados().addAll(Arrays.asList(var1));
		variados14.getVariados().addAll(Arrays.asList(var1));
		variados15.getVariados().addAll(Arrays.asList(var1));
		variados16.getVariados().addAll(Arrays.asList(var1));
		variados17.getVariados().addAll(Arrays.asList(var1));
		variados18.getVariados().addAll(Arrays.asList(var1));
		variados19.getVariados().addAll(Arrays.asList(var1));
		variados20.getVariados().addAll(Arrays.asList(var1));
		variados21.getVariados().addAll(Arrays.asList(var1));
		variados22.getVariados().addAll(Arrays.asList(var1));
		variados23.getVariados().addAll(Arrays.asList(var1));
		variados24.getVariados().addAll(Arrays.asList(var1));
		variados25.getVariados().addAll(Arrays.asList(var1));
		variados26.getVariados().addAll(Arrays.asList(var1));
		variados27.getVariados().addAll(Arrays.asList(var1));
		variados28.getVariados().addAll(Arrays.asList(var1));

		produtoVariadoRepository.saveAll(Arrays.asList(variados1, variados2, variados3, variados4, variados5, variados6,
				variados7, variados8, variados9, variados10, variados11, variados12, variados13, variados14, variados15,
				variados16, variados17, variados18, variados19, variados20, variados21, variados22, variados23,
				variados24, variados25, variados26, variados27, variados28));

		// --------------------------------------------------------------------------------------------------------------
		// Estados
		Estado est1 = new Estado(null, "Ceará");
		Estado est2 = new Estado(null, "Rio Grande do Norte");
		Estado est3 = new Estado(null, "Paraíba");
		Estado est4 = new Estado(null, "Pernambuco");
		Estado est5 = new Estado(null, "Piauí");
		Estado est6 = new Estado(null, "São Paulo");

		// Cidades do Ceará
		Cidade c1 = new Cidade(null, "Fortaleza", est1);
		Cidade c2 = new Cidade(null, "Caucaia", est1);
		Cidade c3 = new Cidade(null, "Maracanaú", est1);
		Cidade c4 = new Cidade(null, "Maranguape", est1);
		Cidade c5 = new Cidade(null, "Pacatuba", est1);
		// Cidades do Rio Grande do Norte

		Cidade c6 = new Cidade(null, "Natal", est2);
		Cidade c7 = new Cidade(null, "Mossoró", est2);
		Cidade c8 = new Cidade(null, "Parnamirim", est2);
		// Cidades da Paraíba

		Cidade c9 = new Cidade(null, "João Pessoa", est3);
		Cidade c10 = new Cidade(null, "Campina Grande", est3);
		Cidade c11 = new Cidade(null, "Santa Rita", est3);
		// Cidades de Pernambuco
		Cidade c12 = new Cidade(null, "Recife", est4);
		Cidade c13 = new Cidade(null, "Jaboatão dos Guararapes", est4);
		Cidade c14 = new Cidade(null, "Olinda", est4);
		// Cidades do Piauí
		Cidade c15 = new Cidade(null, "Teresina", est5);
		Cidade c16 = new Cidade(null, "Parnaíba", est5);
		Cidade c17 = new Cidade(null, "Picos", est5);
		// Cidades de São Paulo
		Cidade c18 = new Cidade(null, "São Paulo", est6);
		Cidade c19 = new Cidade(null, "Guarulhos", est6);

		est1.getCidades().addAll(Arrays.asList(c1, c2, c3, c4, c5));
		est2.getCidades().addAll(Arrays.asList(c6, c7, c8));
		est3.getCidades().addAll(Arrays.asList(c9, c10, c11));
		est4.getCidades().addAll(Arrays.asList(c12, c13, c14));
		est5.getCidades().addAll(Arrays.asList(c15, c16, c17));
		est6.getCidades().addAll(Arrays.asList(c18, c19));

		estadoRepository.saveAll(Arrays.asList(est1, est2, est3, est4, est5, est6));
		cidadeRepository.saveAll(
				Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19));

		// -------------------------------------------------------------------------------
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");

		// Clientes
		
		Cliente cli1 = new Cliente(null, "Rafael Alves", "rafael-souza4@hotmail.com", "15401629079", data.parse("05/06/2000 00:00"), TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("27363323", "93838393"));

		Cliente cli2 = new Cliente(null, "Rafael Souza", "rafael_avalon@hotmail.com", "15401629079",
				data.parse("12/07/1999 00:00"), TipoCliente.PESSOAFISICA);
		cli2.getTelefones().addAll(Arrays.asList("958771254", "98554572"));
		
		Cliente cli3 = new Cliente(null, "Atacadista", "atacadista@gmail.com", "48490988000140", null,
				TipoCliente.PESSOAJURIDICA);
		cli3.getTelefones().addAll(Arrays.asList("958771254", "98554572"));

		// Endereços
		Endereco e1 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, c18);
		Endereco e2 = new Endereco(null, "Rua Waldir Diogo", "384", null, "Manuel Sátiro", "60764020", cli2, c1);
		Endereco e3 = new Endereco(null, "Rua Gois", "182", "Altos", "Novo Pabussu", "61600320", cli3, c2);

		cli1.getEnderecos().addAll(Arrays.asList(e1));
		cli2.getEnderecos().addAll(Arrays.asList(e2));
		cli3.getEnderecos().addAll(Arrays.asList(e3));
		
		clienteRepository.saveAll(Arrays.asList(cli1,cli2,cli3));
		enderecoRepository.saveAll(Arrays.asList(e1,e2,e3));
			
	}

}
