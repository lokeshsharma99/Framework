package utility;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class captureScreenshot {
	static WebDriver driver;
	public static void captureSS() throws Exception
	{
	TakesScreenshot ts=(TakesScreenshot)driver;	
	File source=ts.getScreenshotAs(OutputType.FILE)	;
	String name="TC01";
	FileUtils.copyFile(source,new File("./Screenshots/"+name+".jpeg"));
	
	}
	
}
