import org.openqa.selenium.By;  
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.edge.EdgeDriver;  
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
  
public class example {  
  
    public static void main(String[] args) {  
        
    // declaration and instantiation of objects/variables  
    System.setProperty("webdriver.edge.driver", "D:\\msegdedriver.exe");  
    WebDriver driver=new EdgeDriver();  
      
// Launch website  
    String url ="http://localhost:8070/";  
    driver.get(url) ;
    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
    ImageIO.write(s.getImage(),"PNG",new File("C:\\Users\\HP\\Desktop\\test\\test.png"));
    driver.quit();


    }      

      
    }  
 
