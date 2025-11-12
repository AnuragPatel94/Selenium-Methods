import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class DatePicker {
	  public static void main(String[] args)  {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://testautomationpractice.blogspot.com/");
	 
	        // Switch into iframe containing datepicker
             //driver.switchTo().frame(driver.findElement(By.xpath("//input[@id='datepicker']")));

    // Open calendar widget
    WebElement dateField = driver.findElement(By.xpath("//input[@id='datepicker']"));
    dateField.click();

    String expectedMonth = "March";
    String expectedDate = "12";
    String expectedYear = "2026";

    // Loop until desired month-year appears
    while (true) {
        String month = driver.findElement(By.className("ui-datepicker-month")).getText();
        String year = driver.findElement(By.className("ui-datepicker-year")).getText();

        if (month.equals(expectedMonth) && year.equals(expectedYear)) {
            break;
        } else {
            // Click Next button
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        }
    }

    // Select the date
    List<WebElement>AllDates=driver.findElements(By.xpath("//table[@class=\\\"ui-datepicker-calendar\\\"]//tbody//tr//td//a"));
    for (WebElement dt : AllDates) {
    	if(dt.getText().equals(expectedDate));
    	{dt.click();
    	  break;
    	}
    }

    System.out.println("Custom date selected successfully:");
}
}


SODHGANGA

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShodhgangaScraper {
    public static void main(String[] args) {
        // Set path to your chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Use a Set to avoid duplicate links
        Set<String> allLinks = new HashSet<>();

        try {
            String baseUrl = "https://shodhganga.inflibnet.ac.in/simple-search?location=&query=library&filter_field_1=subject&filter_type_1=equals&filter_value_1=Library+Information+and+Science&rpp=100&sort_by=score&order=DESC&etal=0&submit_search=Update";
            driver.get(baseUrl);
            Thread.sleep(4000);

            while (true) {
                // Collect all links on the current page
                List<WebElement> links = driver.findElements(By.xpath("//a[@href]"));
                for (WebElement link : links) {
                    String href = link.getAttribute("href");
                    if (href != null && href.startsWith("https://shodhganga.inflibnet.ac.in/handle/")) {
                        allLinks.add(href);
                    }
                }

                System.out.println("Collected links so far: " + allLinks.size());

                // Try to find and click the "Next Page" button
                List<WebElement> nextButtons = driver.findElements(By.xpath("//a[contains(text(),'Next Page')]"));
                if (nextButtons.isEmpty()) {
                    System.out.println("No more pages found. Stopping.");
                    break; // Exit loop if no next page
                } else {
                    WebElement next = nextButtons.get(0);
                    // Click Next Page and wait for page to load
                    next.click();
                    Thread.sleep(4000);
                }
            }

            // Print all collected URLs
            System.out.println("\n=== ALL THESIS URLs COLLECTED ===");
            for (String link : allLinks) {
                System.out.println(link);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}


