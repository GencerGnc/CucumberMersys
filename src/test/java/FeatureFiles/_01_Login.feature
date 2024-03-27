     # Login fonksiyon kontrolu
# Siteye git (driver.get)
# Login bilgilerini gir (username, password sendkeys)
# Giris yaptigini kontrol et (verify)



Feature: Login functionality
  @SmokeTest @Regression
  Scenario: Login with valid username and password

    Given Navigate to campus
    When Enter user name and password and click login button
    Then User should successfully

