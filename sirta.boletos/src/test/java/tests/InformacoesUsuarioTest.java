package tests;

import static org.junit.Assert.*;
import static org.openqa.selenium.By.linkText;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.pagefactory.ByAll;

public class InformacoesUsuarioTest {
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
        // Abrindo o navegador
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\allana.souza\\drivers\\geckodriver.exe");
        FirefoxDriver navegador = new FirefoxDriver();

        // Navegando para a página do SIRTA em des1 onde está Boletos
        navegador.get("http://sirta.des.caixa/sirta-web/");
        navegador.manage(). window().maximize();

        // Identificando o formulário de Login
        WebElement form = navegador.findElement(By.name("form"));

        // Digitar no campo com ID "j_username" que está dentro do formulario de name "form" o texto "c891177"
        form.findElement(By.id("j_username")).sendKeys("c891177");

        // Digitar no campo com ID "j_password" qu está dentro do formulário de name "form" o texto "Rta2021"
        form.findElement(By.id("j_password")).sendKeys("Rta2021");

        // Clicar no botão com texto "Entrar"
        navegador.findElement(By.cssSelector("button[type='submit']")).click();

        // Validar que dentro do elentro com class "" está o texto ""

        // Fechar o navegador
    }

}
