package GraphApi;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.FacebookClient.AccessToken;
import com.restfb.types.FacebookType;
import com.restfb.types.User;

public class TestsSeleniumAndFbApi {

 	//public String _accessToken;
    private final String _loginUser = "brunographapi@hotmail.com";
    private final String _password = "vegeto321";
    private final String _baseUrl = "https://www.facebook.com/login/reauth.php?app_id=307866053369194&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fv3.2%2Fdialog%2Foauth%3Fredirect_uri%3Dhttps%253A%252F%252Fwww.facebook.com%252Fconnect%26state%3D%257Bstate-param%257D%26client_id%3D307866053369194%26ret%3Dlogin%26logger_id%3Df5116c96-241b-bb93-9766-653315642373&cancel_url=https%3A%2F%2Fwww.facebook.com%2Fconnect%3Ferror%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied%26state%3D%257Bstate-param%257D%23_%3D_&display=page&locale=pt_BR&logger_id=f5116c96-241b-bb93-9766-653315642373";
	private String nameuser = "Api Graph Bruno";
	
	
	@Test
	public void FacebookAuthentication() {
		String accessToken = "EAAQNizIgDt8BAHpnjrCffNcGqx29BdhXNWQcG4JQztLGL3D7QlykH6OL6qyGgte744wOXZCl41Fac6CgeFVsz3Ar45EeZBgQ9CKxcZCqnpOrR7UaPKDMlZA4iQupeaGAfbzW45ygk4jgqZC2VFEEgQ1dvNypOW4OKkHZCBA3ojyeR01faMOJsU";
		
		@SuppressWarnings("deprecation")
		FacebookClient fbClient = new DefaultFacebookClient(accessToken);
		
		User me = fbClient.fetchObject("me", User.class);
		System.out.println("AUTENTICAÇÃO FACEBOOK!");
		System.out.println(me.getName());
		Assert.assertEquals(nameuser, me.getName());
		System.out.println("##############TEST CASE 1###################");
		System.out.println();
		
	}
	@Test
	public void PostTimeLine() {

		String accessToken = "EAAQNizIgDt8BAHpnjrCffNcGqx29BdhXNWQcG4JQztLGL3D7QlykH6OL6qyGgte744wOXZCl41Fac6CgeFVsz3Ar45EeZBgQ9CKxcZCqnpOrR7UaPKDMlZA4iQupeaGAfbzW45ygk4jgqZC2VFEEgQ1dvNypOW4OKkHZCBA3ojyeR01faMOJsU";
		
		@SuppressWarnings("deprecation")
		FacebookClient fbClient = new DefaultFacebookClient(accessToken);
		
		User me = fbClient.fetchObject("me", User.class);
		System.out.println("AUTENTICAÇÃO FACEBOOK!");
		System.out.println(me.getName());
		//System.out.println(me.getLanguages().get(0).getName());
		
		//
		AccessToken exAccessToken = fbClient.obtainExtendedAccessToken("1140791399419615", "6f3f663cca0f3d7eec26515eefcf6f6c");
		
	
		System.out.println("Exentendendo Token");
		  
		  //publish the timeline
			
		  try {
			  FacebookType response = fbClient.publish("me/feed",FacebookType.class, Parameter.with("message", "Graph Api Test")); // POST
				
				System.out.println("fb.com/" + response.getId());
		  }
		  catch(Exception ex) {
			  String msg = ex.getMessage();
			  System.out.println("Este metodo precisa da aprovação do facebook");
			  System.out.println(msg);
			  System.out.println("##############TEST CASE 2###################");
				System.out.println();
		  }
	}
	@Test
	public void ExtendsToken() {
String accessToken = "EAAQNizIgDt8BAHpnjrCffNcGqx29BdhXNWQcG4JQztLGL3D7QlykH6OL6qyGgte744wOXZCl41Fac6CgeFVsz3Ar45EeZBgQ9CKxcZCqnpOrR7UaPKDMlZA4iQupeaGAfbzW45ygk4jgqZC2VFEEgQ1dvNypOW4OKkHZCBA3ojyeR01faMOJsU";
		
		@SuppressWarnings("deprecation")
		FacebookClient fbClient = new DefaultFacebookClient(accessToken);
		
		User me = fbClient.fetchObject("me", User.class);
		System.out.println("AUTENTICAÇÃO FACEBOOK!");
		System.out.println(me.getName());
		AccessToken exAccessToken = fbClient.obtainExtendedAccessToken("1140791399419615", "6f3f663cca0f3d7eec26515eefcf6f6c");
		System.out.println("Extends Token");
		  System.out.println(exAccessToken.getAccessToken());
		  System.out.println(exAccessToken.getExpires());
		  System.out.println("##############TEST CASE 3###################");
	}
	 @Test
	    public void LoginWithInvalidEmail() {
	    	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	    	 WebDriver driver=new ChromeDriver();
	    	
	    	 driver.get(_baseUrl);
	    	 driver.findElement(By.id("email")).sendKeys("avestrus@test.com");
	    	 driver.findElement(By.id("pass")).sendKeys("123654");
	    	 driver.findElement(By.id("loginbutton")).click();
	    	 String msgErro = driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText();   	     	 
	    	 System.out.println(msgErro);
	    	 
	    	 assertEquals(msgErro, "O e-mail inserido não corresponde a nenhuma conta. Cadastre-se para abrir uma conta.");
	    	 driver.close();
	    	
	    }
	    
	    @Test
	    public void LoginWithInvalid__password() {
	    	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	    	 WebDriver driver=new ChromeDriver();

	    	 driver.get(_baseUrl);
	    	 driver.findElement(By.id("email")).sendKeys(_loginUser);
	    	 driver.findElement(By.id("pass")).sendKeys("1236ss54");
	    	 driver.findElement(By.id("loginbutton")).click();
	    	 String msgErro = driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText();   	     	 
	    	 System.out.println(msgErro);
	    	 
	    	 assertEquals(msgErro, "A senha inserida está incorreta. Esqueceu a senha?");
	    	 driver.close();
	    	
	    }
	    
	    @Test
	    public void LoginWithInvalid_passwordAndUser() {
	    	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	    	 WebDriver driver=new ChromeDriver();
	    	
	    	 driver.get(_baseUrl);
	    	 driver.findElement(By.id("email")).sendKeys("Avestruz");
	    	 driver.findElement(By.id("pass")).sendKeys("1236ss54");
	    	 driver.findElement(By.id("loginbutton")).click();
	    	 String msgErro = driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText();   	     	 
	    	 System.out.println(msgErro);
	    	 
	    	 assertEquals(msgErro, "O email ou o número de telefone inserido não corresponde a nenhuma conta. Cadastre-se para abrir uma conta.");
	    	 driver.close();
	    	
	    }
	    
	    
	    @Test
	    public void LoginWithout_password() {
	    	 System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	    	 WebDriver driver=new ChromeDriver();
	    	
	    	 driver.get(_baseUrl);
	    	 driver.findElement(By.id("email")).sendKeys(_loginUser);
	    	 driver.findElement(By.id("pass")).sendKeys("");
	    	 driver.findElement(By.id("loginbutton")).click();
	    	 String msgErro = driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText();   	     	 
	    	 System.out.println(msgErro);
	    	 
	    	 assertEquals(msgErro, "A senha inserida está incorreta. Esqueceu a senha?");
	    	 driver.close();
	    }
	    
	    @Test
	    public void LoginWithaAllBlankFields() {
	    	 System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	    	 WebDriver driver=new ChromeDriver();

	    	 driver.get(_baseUrl);
	    	 driver.findElement(By.id("email")).sendKeys("");
	    	 driver.findElement(By.id("pass")).sendKeys("");
	    	 driver.findElement(By.id("loginbutton")).click();
	    	 String msgErro = driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText();   	     	 
	    	 System.out.println(msgErro);
	    	 
	    	 assertEquals(msgErro, "O email ou o número de telefone inserido não corresponde a nenhuma conta. Cadastre-se para abrir uma conta.");
	    	 driver.close();
	    }
	    
	    @Test
	    public void LoginWithoutEmail() {
	    	 System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	    	 WebDriver driver=new ChromeDriver();
	    	
	    	 driver.get(_baseUrl);
	    	 driver.findElement(By.id("email")).sendKeys("");
	    	 driver.findElement(By.id("pass")).sendKeys(_password);
	    	 driver.findElement(By.id("loginbutton")).click();
	    	 String msgErro = driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText();   	     	 
	    	 System.out.println(msgErro);
	    	 
	    	 assertEquals(msgErro, "O email ou o número de telefone inserido não corresponde a nenhuma conta. Cadastre-se para abrir uma conta.");
	    	 driver.close();
	    }
}
