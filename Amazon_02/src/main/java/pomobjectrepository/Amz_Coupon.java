package pomobjectrepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amz_Coupon {

	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='spc-gcpromoinput']")
	WebElement coupon_code;

	@FindBy(xpath = "//span[@id='gcApplyButtonId-announce']")
	WebElement apply_coupon;

	public void coupon_data() {
		coupon_code.sendKeys("abc");
	}

	public void apply_this_coupon() {
		apply_coupon.click();
	}
	public void apply_coupon_verifed()
	{
		Assert.assertEquals(apply_coupon.isDisplayed(),true,"coupon is not applied");
	}

	public Amz_Coupon(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
