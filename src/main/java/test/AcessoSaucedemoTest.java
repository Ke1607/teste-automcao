package test;
import org.junit.Test;

import page.AcessoSaucedemoPage;

public class AcessoSaucedemoTest {

	@Test
	public void deveLogar() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		AcessoSaucedemoPage pagina = new AcessoSaucedemoPage();
		pagina.acesso();
		pagina.login();
		pagina.ordenacao();
		pagina.adicao();
		pagina.carrinho();
		pagina.formulario();
		org.junit.Assert.assertTrue(pagina.getMensagemSucesso().contains("THANK YOU FOR YOUR ORDER"));
		pagina.sair();
	}

}
