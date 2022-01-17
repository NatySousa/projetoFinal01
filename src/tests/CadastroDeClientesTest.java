package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroDeClientesTest {

	@Test
	public void testCadastroDeClienteComSucesso() {

		// executando o driver do googlechrome
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver\\chromedriver.exe");

		// Abrindo o navegador (google chrome)
		WebDriver driver = new ChromeDriver();

		// maximizar o navegador
		driver.manage().window().maximize();

		// acessar a página  do sistema que será testada
		driver.get("http://exercteste01-001-site1.gtempurl.com/Home/Exercicio03");

		// preencher o nome do cliente
		driver.findElement(By.xpath("//*[@id=\"Nome\"]")).sendKeys("Ana Paula da Silva");

		// preencher o RG do cliente
		driver.findElement(By.xpath("//*[@id=\"RG\"]")).sendKeys("1234567890");

		// preencher o cpf do cliente
		driver.findElement(By.xpath("//*[@id=\"Cpf\"]")).sendKeys("32145687600");

		// preencher a data de nascimento do cliente
		driver.findElement(By.xpath("//*[@id=\"DataNascimento\"]")).sendKeys("10/01/1985");

		// clicar no botão de realizar inscrição
		driver.findElement(By.xpath("//*[@id=\"btnCadastro\"]")).click();

		// capturar a mensagem obtida no sistema
		String mensagem = driver.findElement(By.xpath("//*[@id=\"mensagem\"]")).getText();

		// comparando se a mensagem obtida do sistema é "Processo realizado com sucesso"
		assertEquals(mensagem, "Processo realizado com sucesso");

		// fechar o navegador
		driver.close();
		driver.quit();

	}

}
