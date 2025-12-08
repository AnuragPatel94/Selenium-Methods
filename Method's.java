
//CREATE PUBLIC CLASS
    public static void main(string[]args)

//LUNCH CHROME BROWSER &  CREATE OBJECT AND INSTANTIATE DRIVER
    //system.setproperty("webdriver.chrome.driver","C:\Users\selenium\anurag\chromedriver.exe")
    //WebDriver driver = new chromeDriver();
    //system.setproperty("webdriver.gecko.driver","C:\Users\selenium\anurag\geckodriver.exe")
    //WebDriver driver = new firefoxDriver();
    //system.setproperty("webdriver.safari.driver","C:\Users\selenium\anurag\safaridriver.exe")
    //WebDriver driver = new safariDriver();
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new chromeDriver();


// MAXIMIZE WINDOW
    driver.manage().window().maximize();

// LUNCH WEB PAGE & SAVE IN STRING VARIABLE
    driver.get("https://glbg.servergi.com:8072/SIMWEBGLB/Login");                            
    String title = driver.getTitle();
    System. out.println("https://glbg.servergi.com:8072/SIMWEBGLB/Login:" + driver.getcurrenturl());
    System. out.println("Title of The Web Page:" + driver.getTitle());
    System. out.println(driver.getPageSource());

// LOCATE USER NAME & ENTRE USERID
    driver.findelement(By.id("txtUserid")).sendKeys("glbctm3655");
    &
    driver.findelement(By.Xpath("//input[@id='txtUserId']")).sendkeys("glbctm3655");

// LOCATE USER PASSWORD & ENTER PASSWORD
    driver.findElement(by.name("txtPass").sendkyes("Anurag@3655");
    &
    driver.findelement(By.Xpath("//input[@id='txtPass']]")).sendkeys("Anurag@3655");

// LOCATE LOGIN BTN & PERFORM CLICK ACTION
    driver.findElement(by.class name("blueBtn")).click();
    &
    driver.findelement(By.Xpath("//input[@id='btnLogin']")).ckick(); 

// FIND ALERT BTN & FIND YES BTN AND CLICK FOR ACCEPTING
   driver.switchTo().alert().accept();

// SWITCH TO EMPLOYEE DASHBOARD AND VERIFY HEADER LINK
   string Currentwindow Handel = driver.getwindowhandle();
   driver.switchto().window(CurrentWindow Handle);
   List<WebElement> headerLinks=driver.findElements(By.className("mm-item"));
   System.out.println("Total No Of Header link:"+headerLinks.size());

// VERIFY ALL LINK ON PAGE  
   List<WebElement>Links=driver.findElements(By.tagName("a"));
   System.out.println("Total No Of link:"+Links.size());

// PERFORM MOUSE ACTION
// LOCATE ELEMENT
   Webelement Button= driver.FindElement(By.Xpath("//input[@id='txtemployee"));

//RIGHT CLICK
   Actions act = newAction(driver);
   act.contextclick(button).perform();

//DOUBLE CLICK
   Actions act = newAction(driver);
   act.doubleclick(button).perform();

//DRAG AND DROP ACTION
//LOCATE SOURCE AND TARGET ELEMENT
  WebElement source1 = driver.findElement(By.id("box1"));
  WebElement source2 = driver.findElement(By.id("box2"));
//PERFORM ACTION
  Actions act = newAction(driver);
  act.DragAndDrop("source1","source2").perform();

//USING AXES TO PERFORM DRAG AND DROP ACTION
   WebDriver driver = new ChromeDriver();
 // Open target page
     driver.get("https://example.com/drag-and-drop-demo");
// LOCATE ELEMENT
    WebElement min_slider = driver.findElement(By.xpath("xpath"));
// Create Actions instance
     Actions act = new Actions(driver);
// LOCATE AXES VALUE
   system.out.println("Default Loation:"+min_slider.getLocation());
// PERFORM ACTION
        act.dragAndDropBy(min_slider, X axes Value, Y axes Value).perform();  
    }
//HOVER ACTION
//LOCATE ELEMENT
  WebElement element = driver.findElement(By.Text("EMPLOYEE"));
//PERFORM ACTION
   Actions act = newAction(driver);
   act.moveToElement(element).perform();


//KEYBOARD ACTION

        WebDriver driver = new ChromeDriver();
        driver.get("URL");

        // Locate the input field or textarea
            WebElement inputField = driver.findElement(By.id("inputBox"));

        // Type some data
           inputField.sendKeys("WELCOME TO GLBITM");

        Actions act = new Actions(driver);

        // Select all text: Ctrl + A
          act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

        // Copy selected text: Ctrl + C
          act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

        // Move to next field: Tab
           act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        // Paste text: Ctrl + V (in new focused field)
           act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

        // IF 3 KEYS Ctrl+Shift+A
           act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).keyDown("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();

//NEW WINDOW HANDLE CMD
           driver.swithcTo().newWindow(windowtype.WINDOW OR TAB);
}


//LOCATE  LEAVE APPLY ELEMENT
  WebElement element = driver.findElement(By.Text("LeaveApply")).click();

// HANDLING DROP DOWN LIST
// LOCATE ELEMENT
   elemet= driver.findElement(By.id("Value");
   select dropdown= new Select(element);
   dropdown.selectBy VisibleText("input");
   &
   dropdown.selectBy Value("input");
   dropdown.selectBy index("input");

// CHECK MULTIPLE OPTION
   if (dropdown.isMultiple());
       {System.out.println("Dropdown is Multiple");}
   else
       {system.out.println("dropdown is not multiple");}

//PRINT LIST OF DROPDOWN WEBELEMENT
   List<WebElement> Alldropdownoption=dropdown.getoption();
   for (WebElement el: Alldropdownoption)
       {system.out.println(el.getText());
        System.out.println("Total Option:"+Alldropdownoption.size());}

// SELECT MULTI OPTION FROM DROPDOWN LIST
    for (WebElement el: Alldropdownoption){
         string Alldropdownoption=el.getText();
    if (Alldropdownoption.equal('Value1')|| Alldropdownoption.equal('Value2')|| Alldropdownoption.equal('Value3')){
       Alldropdownoption.click();}}

//HANDLE HIDDEN DROPDOWN LIST
    for (WebElement option : options) {
            String text = option.getText();
            System.out.println("Option: " + text);
            if (text.equals("Group 1, option 2")) {  // Select specific option
                option.click();
                break;
            }


// COUNT AND PRINT HYPERLINK ON PAGE
//LOCATE ELEMENT(PAGE CONTAIN LINKS UNDER ANCHOR TAG("a")**
  List<WebElement> LinkElement= driver.findElements(By.TagName("a"));
  System.out.println("Total link On Web Page:"+LinkElement.size());
//PRINT ALL LINK TEXT
   for(WebElement el:LinkElement){
   System.out.println(el.gettext());}

//VERIFY LOGO IS DISPLAYED
   WebElement logo = driver.findElement(By.xpath("//a[@aria-label='GL Bajaj']"));
   System.out.println("Page Logo:"+logo.isDisplayed());

//CHECK SEARCH BTN IS ENABLE OR NOT
   boolean status = driver.findElement(By.xpath("//input[@NAME='header1$txtSeach']")).isEnabled();
   System.out.println("Enable Status:"+status);

//COUNT TOTAL NUMBER OF RADIO BTN
// LOCATE RADIO BTN
   List<WebElement> RadioBtnList=driver.findElements(By.xpath("//input[@id='rbSearchFor_0']"))
   System.out.println("No Of Redio Button:"+RadioBtnList.size());

//NAVIGATE METHOD
  driver.navigate().to("https://www.glbitm.org/");
  driver.navigate().to("https://glbg.servergi.com:8072/SIMwebGLB/Login");
			 
  driver.navigate().back();
  System.out.println(driver.getCurrentUrl());
			
  driver.navigate().forward();
  System.out.println(driver.getCurrentUrl());

//CHECK ALL CHECKBOX OR LAST FEW WITH FOR LOOP
  List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
  for (WebElement checkbox:checkboxes) {
  checkbox .click();
  for(int i=4;i<checkboxes.size();i++)
  {checkboxes.get(i).click();}}

//UPLOAD FILE
1-SEND KEYS METHOD
//LOCATE ELEMENT
  WebElement Button=driver.finfElement(By.Xpath);
  Action act=new Action(driver);
  act.moveToElement(Button).click().perform();

2-ROBOT CLASS METHOD
  Robot rb=newrobot()
  rb.delay(2000);
StringSelection ss=newStringSelection("FilePath");
Toolkit.getDefaultToolkit().getSystemClipboard().setcontent(ss,null);
//PERFORM CTRL ACTION
  rb.keyPress(KeyEvent.VK_CONTROL);
  rb.keyPress(KeyEvent.VK_V));
  rb.keyReleae(KeyEvent.VK_V)
  rb.keyPress(KeyEvent.VK_ENTER)
  rb.keyReleae(KeyEvent.VK_ENTER)

//CAPTURE SCREEN SHOT
//FULL PAGE USEING Ashot(Chrome)
 Screenshot screenshot = new AShot()
 .shootingStrategy(ShootingStrategies.viewportPasting(1000))
  takeScreenshot ts=(takescreenshot)driver;
  
  ImageIO.write(screenshot.getImage(), "PNG", new File("FullPageAShot.png"));

//PARTICULAR SECTION
  // LOCATE ELEMENT
     WebElement element = driver.findElement(By.cssSelector("h1"));

  // CAPTURE ELEMENT SCREENSHOT
     File src = element.getScreenshotAs(OutputType.FILE);
     FileHandler.copy(src, new File("ElementScreenshot.png"));


//USE OF CHROME OPTIONS CLASS
 1- HOW TO HANDLE SSL ERROR
=> Using setAcceptInsecurecert method
   ChromeOptions options=new ChromeOption();
   options.setAcceptInsecurecert(true);
 2-Headless and Headed mode
 3-Block Ad
 4-Test execution in incognito mode
    ChromeOptions options=new ChromeOption();
    options.addArguments("--incognito");

//SCROLLING PAGE
  JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by 500 pixels
           js.executeScript("window.scrollBy(0,500)");
           Thread.sleep(2000);
        // Scroll up by 300 pixels
           js.executeScript("window.scrollBy(0,-300)");
           Thread.sleep(2000);
        // Scroll to bottom
           js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        // Locate element
           WebElement element = driver.findElement(By.xpath("//h1"));
        // Scroll till element is in view
           js.executeScript("arguments[0].scrollIntoView(true);", element);
        // Scroll right by 200 pixels
           js.executeScript("window.scrollBy(200,0)");
        //ZOOM In ZOOM Out 
           js.executeScript("document.body.style.zoom'50%'");

//HADLING TABLE ON PAGE
  //LOCATE TABLE
    WebElement table = driver.findElement(By.id("bookTable"));
  // Row count (tr)
    List<WebElement> rows = table.findElements(By.tagName("tr"));
    System.out.println("Total Rows: " + rows.size());
 // Column count (th)
    List<WebElement> cols = table.findElements(By.tagName("th"));
    System.out.println("Total Columns: " + cols.size());
 //READ ENTIRE DATA IN TABLE
    for (WebElement row : rows) {
    List<WebElement> cells = row.findElements(By.tagName("td"));
    for (WebElement cell : cells) {
        System.out.print(cell.getText() + " | ");
    }
    System.out.println();
 // Get 2nd row (index starts from 0)
    List<WebElement> secondRow = rows.get(2).findElements(By.tagName("td"));
    for (WebElement cell : secondRow) {
    System.out.print(cell.getText() + " | ");
}
 // Print all Authors (2nd column)
    for (int i = 1; i < rows.size(); i++) { // skip header row
    WebElement author = rows.get(i).findElements(By.tagName("td")).get(1);
    System.out.println(author.getText());
}
//FIND ROW AND COLUMN VALUE
  int rowIndex = 2;  // 3rd row
  int colIndex = 0;  // 1st column
  String cellValue = rows.get(rowIndex).findElements(By.tagName("td")).get(colIndex).getText();
  System.out.println("Cell Value: " + cellValue);

// DYANAMIC TABLE PAGINATION
   // USEING SUBSTRING METHD FOR COUNTING ALL PAGES
   // inbuilt method- s.substring(s.Indexof("(")+1,s.Indexof("Pages"-1))
      String text=driver.findElementBy(xpathe"xpath,'Pages').getText();"
      int total_pages=integer.ParseInt(text.substring(text.Indexof("(")+1,text.Indexof("Pages"-1)));
//REAPITING PAGES
      for(int p=1;p<5;p++){
        if(p>1){
    WebElemnt active_page=driver.findBy(xpath"xpath//*"+p+""
    active_page.click();
//READING DATA FROM PAGE
    int NoofRow=driver.findElements(Byxpath"xpath"//tbody);
    for (int=r1;r+NoofRows;r++);
         string CustName=driver.find(Byxpath"xpath//")
         string CustID=driver.find(Byxpath"xpath//")
         string CustMail=driver.find(Byxpath"xpath//")
     System.out.println(CustName+"\t"CustID+"\t"CustMail);

//USE IMPLICIT EXPLICIT AND FLUCENT WAIT

  // ----------------- 1. IMPLICIT WAIT -----------------
        // Applies globally for all findElement calls
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Locate username and password fields (implicit wait applied)
        driver.findElement(By.id("txtUserID")).sendKeys("glbctm3655");
        driver.findElement(By.id("txtPass")).sendKeys("Anurag@3655");

        // ----------------- 2. EXPLICIT WAIT -----------------
        // Wait until login button is clickable
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement loginBtn = explicitWait.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']"))
        );
        loginBtn.click();

        // ----------------- 3. FLUENT WAIT -----------------
        // Wait for logout button after successful login
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))      // max wait time
                .pollingEvery(Duration.ofSeconds(2))      // check every 2 sec
                .ignoring(NoSuchElementException.class);  // ignore if not found

        WebElement logoutBtn = fluentWait.until(d ->
                d.findElement(By.cssSelector("a.button.secondary.radius"))
        );

        System.out.println("Login Successful! Logout button text: " + logoutBtn.getText());

        // Close browser
        driver.quit();
    }
Implicit Wait: one-time setup, applied to all findElement.

Explicit Wait: applied only when needed, based on a condition.

Fluent Wait: more flexible version of explicit wait (polling + exception handling).



//iFRAME HANDLING
  // Switch to iframe by ID or Name
        driver.switchTo().frame("mce_0_ifr");

        // Locate text area inside iframe
        WebElement textArea = driver.findElement(By.id("tinymce"));
        textArea.clear();
        textArea.sendKeys("Hello, this is inside iframe!");

        // Switch back to main content
        driver.switchTo().defaultContent();

//NESTED FRAME
   // Switch to top frame
        driver.switchTo().frame("frame-top");

        // Switch to middle frame (inside top)
        driver.switchTo().frame("frame-middle");

        // Get text inside middle frame
        WebElement content = driver.findElement(By.id("content"));
        System.out.println("Text in Middle Frame: " + content.getText());

        // Switch back to parent (top frame)
        driver.switchTo().parentFrame();

        // Now switch to right frame (sibling of middle)
        driver.switchTo().frame("frame-right");
        System.out.println("Text in Right Frame: " + driver.findElement(By.tagName("body")).getText());

        // Back to main content
        driver.switchTo().defaultContent();

        // Switch to bottom frame
        driver.switchTo().frame("frame-bottom");
        System.out.println("Text in Bottom Frame: " + driver.findElement(By.tagName("body")).getText());

//HANDLE DATE PICKER
  // Switch into iframe containing datepicker
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        // Open calendar widget
        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.click();

        String expectedMonth = "October";
        String expectedYear = "2025";
        String expectedDay = "15";

        // Loop until desired month-year appears
        while (true) {
            String month = driver.findElement(By.className("ui-datepicker-month")).getText();
            String year = driver.findElement(By.className("ui-datepicker-year")).getText();

            if (month.equals(expectedMonth) && year.equals(expectedYear)) {
                break;
            } else {
                // Click Next button
                driver.findElement(By.xpath("//a[@title='Next']")).click();
            }
        }

        // Select the day
        driver.findElement(By.xpath("//a[text()='" + expectedDay + "']")).click();

        System.out.println("Custom date selected successfully!");
    }
}

// HANDLING BROKEN LINKS IN WEBPAGE
  public class findbrokenlinks {
  public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		
	        driver.get("http://www.deadlinkcity.com/");

	        // Get all anchor tags
	        List<WebElement> links = driver.findElements(By.tagName("a"));

	        System.out.println("Total links found: " + links.size());

	        for (WebElement link : links) {
	            String url = link.getAttribute("href");

	            if (url == null || url.isEmpty()) {
	                System.out.println("URL is empty or null for link text: " + link.getText());
	                continue;
	            }

	            // Check link status
	            try {
	                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
	                connection.setRequestMethod("HEAD");
	                connection.connect();

	                int responseCode = connection.getResponseCode();

	                if (responseCode >= 400) {
	                    System.out.println(url + " is a broken link. Response code: " + responseCode);
	                } else {
	                    System.out.println(url + " is a valid link. Response code: " + responseCode);
	                }
	            } catch (Exception e) {
	                System.out.println("Exception checking URL: " + url + " -> " + e.getMessage());
	            }
	        }

	 








