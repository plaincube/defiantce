@echo off
title Defiant Installer
wget -q https://raw.githubusercontent.com/plaincube/defiantce/main/defiantinstall/jars/jarlist.txt
echo. +===================+
echo    Defiant Installer
echo. +===================+
echo With GNU wget port to Windows from https://eternallybored.org/
echo [1] Download
echo [2] Settings
echo [3] About
echo [4] Exit
echo.

choice /c 1234 /n /m "Option (Numeral): "
IF %ERRORLEVEL% EQU 1 goto download
IF %ERRORLEVEL% EQU 2 goto settings
IF %ERRORLEVEL% EQU 3 goto about
IF %ERRORLEVEL% EQU 4 exit

:download
cls
echo. +===================+
echo    Defiant Installer
echo. +===================+


:settings
cls

:about
cls
echo. +===================+
echo    Defiant Installer
echo. +===================+
echo          About
echo. +===================+
echo.
echo wget for Windows: https://eternallybored.org/ (https://eternallybored.org/misc/wget/)
echo The Defiant series of MC Clients: CubeUltm, Suvik, Healer (Former texture artist) from Bastion/Core
echo Batch code: CubeUltm
echo Batch reference: https://ss64.com/, https://learn.microsoft.com/
echo wget reference: https://medium.com/theloudcloud/download-a-file-from-github-using-linux-commands-f0ce4e154c25
echo.
echo <<Back home>>
pause