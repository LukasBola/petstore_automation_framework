# petstore_automation_framework

Install scoop

In PowerShell:

>Set-ExecutionPolicy RemoteSigned -scope CurrentUser
>Invoke-Expression (New-Object System.Net.WebClient).DownloadString('https://get.scoop.sh')
>scoop install allure

Also Scoop is capable of updating Allure distribution installations. To do so navigate to the Scoop installation directory and execute
>\bin\checkver.ps1 allure -u

This will check for newer versions of Allure, and update the manifest file. Then execute
>scoop update allure

Run tests suite via cmd using maven:
>mvn clean test 

To generate Allure html report and automatically open it in a web browser type in PowerShell:
>allure serve target/allure-results
