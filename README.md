# petstore_automation_framework

Install scoop

In PowerShell:

>Set-ExecutionPolicy RemoteSigned -scope CurrentUser
>Invoke-Expression (New-Object System.Net.WebClient).DownloadString('https://get.scoop.sh')


To generate Allure html report and automatically open it in a web browser type in PowerShell:

>allure serve target/allure-results
