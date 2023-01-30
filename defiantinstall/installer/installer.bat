@echo off
title Defiant Installer

:test
cls
echo. +===================+
echo    Defiant Installer
echo. +===================+
echo Check directory settings. If incorrect, set from Installer settings in menu.
if exist installdir.settings (set /p installdir=<installdir.settings)
if exist mcdir.settings (set /p mcdir=<mcdir.settings)
if (%installdir%) == () (echo Installer directory not set! Set from Installer settings in menu && set installdirset=no) else (set installdirset=yes)
if (%mcdir%) == () (echo .minecraft directory not set! Set from Installer settings in menu && set mcset=no) else (set mcset=yes)
if (%installdirset%) == (yes) (echo Installation directory: %installdir%)
if (%mcset%) == (yes) (echo .minecraft directory: %mcdir%)
pause
goto home

:home
cls
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
echo [1] Defiant Resource Pack
echo [2] DefiantCE
echo [3] Back
echo.
choice /c 1234 /n /m "Option (Numeral): "
IF %ERRORLEVEL% EQU 1 goto dlres
IF %ERRORLEVEL% EQU 2 goto dlclients
IF %ERRORLEVEL% EQU 3 goto home

:settings
cls
echo. +===================+
echo    Defiant Installer
echo. +===================+
echo [1] Set Installer directory
echo [2] Set .minecraft directory
echo [3] Back
echo.
choice /c 1234 /n /m "Option (Numeral): "
IF %ERRORLEVEL% EQU 1 goto setcd
IF %ERRORLEVEL% EQU 2 goto setmc
IF %ERRORLEVEL% EQU 3 goto home

:setcd
cls
echo. +===================+
echo    Defiant Installer
echo. +===================+
set /p %setcd%=Installation directory (without back "\"): 
echo %setcd% > installdir.settings
pause
goto home

:setmc
cls
echo. +===================+
echo    Defiant Installer
echo. +===================+
set /p %setmc%=.minecraft directory (without back "\"): 
echo %setmc% > mcdir.settings
pause
goto home

:about
cls
echo. +===================+
echo    Defiant Installer
echo. +===================+
echo          About
echo. +===================+
echo.
echo wget for Windows: https://eternallybored.org/ (https://eternallybored.org/misc/wget/)
echo The Defiant series of MC Clients: CubeUltm, Suvik, Healer (Former texture artist) from Bastion
echo Batch code: CubeUltm
echo Batch reference: https://ss64.com/, https://learn.microsoft.com/
echo wget reference: https://medium.com/theloudcloud/download-a-file-from-github-using-linux-commands-f0ce4e154c25
echo.
echo <<Back home>>
pause
