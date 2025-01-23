import pytest
from selenium.webdriver.common.by import By

@pytest.mark.usefixtures("setup")
class TestVerifyLogo:
    def test_w3schools_logo(self):
        """
        Test to verify the w3schools logo is present on the homepage.
        """
        self.driver.get("https://www.w3schools.com/")

        try:
            logo = self.driver.find_element(By.XPATH, "//a[@id='w3-logo']")
            assert logo.is_displayed(), "Logo is displayed on the page."
            print("Logo is present on the page.")
        except Exception as e:
            pytest.fail(f"Test failed: {e}")