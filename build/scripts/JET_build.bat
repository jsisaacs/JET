@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  JET_build startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and JET_BUILD_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\jline-2.12.jar;%APP_HOME%\lib\ST4-4.0.8.jar;%APP_HOME%\lib\tomcat-embed-el-8.0.28.jar;%APP_HOME%\lib\spring-shell-standard-2.0.0.M1.jar;%APP_HOME%\lib\antlr4-4.5.1.jar;%APP_HOME%\lib\jcl-over-slf4j-1.7.13.jar;%APP_HOME%\lib\jline-terminal-3.4.0.jar;%APP_HOME%\lib\spring-beans-4.2.4.RELEASE.jar;%APP_HOME%\lib\jline-3.4.0.jar;%APP_HOME%\lib\spring-boot-autoconfigure-1.3.0.RELEASE.jar;%APP_HOME%\lib\spring-boot-1.3.0.RELEASE.jar;%APP_HOME%\lib\commons-logging-1.2.jar;%APP_HOME%\lib\skb-interfaces-0.0.1.jar;%APP_HOME%\lib\spring-shell-core-2.0.0.M1.jar;%APP_HOME%\lib\spring-aop-4.2.4.RELEASE.jar;%APP_HOME%\lib\spring-shell-standard-commands-2.0.0.M1.jar;%APP_HOME%\lib\JET-0.0.1.jar;%APP_HOME%\lib\spring-shell-starter-2.0.0.M1.jar;%APP_HOME%\lib\spring-context-4.2.4.RELEASE.jar;%APP_HOME%\lib\jul-to-slf4j-1.7.13.jar;%APP_HOME%\lib\jna-4.2.2.jar;%APP_HOME%\lib\spring-core-4.2.4.RELEASE.jar;%APP_HOME%\lib\ascii-utf-themes-0.0.1.jar;%APP_HOME%\lib\spring-expression-4.2.4.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-logging-1.3.0.RELEASE.jar;%APP_HOME%\lib\spring-shell-1.2.0.RELEASE.jar;%APP_HOME%\lib\snakeyaml-1.16.jar;%APP_HOME%\lib\commons-lang3-3.4.jar;%APP_HOME%\lib\slf4j-api-1.7.13.jar;%APP_HOME%\lib\classmate-1.1.0.jar;%APP_HOME%\lib\log4j-over-slf4j-1.7.13.jar;%APP_HOME%\lib\validation-api-1.1.0.Final.jar;%APP_HOME%\lib\logback-core-1.1.3.jar;%APP_HOME%\lib\spring-shell-jcommander-adapter-2.0.0.M1.jar;%APP_HOME%\lib\spring-context-support-4.2.4.RELEASE.jar;%APP_HOME%\lib\jline-terminal-jna-3.4.0.jar;%APP_HOME%\lib\jboss-logging-3.2.1.Final.jar;%APP_HOME%\lib\spring-shell-shell1-adapter-2.0.0.M1.jar;%APP_HOME%\lib\hibernate-validator-5.2.2.Final.jar;%APP_HOME%\lib\antlr-runtime-3.5.2.jar;%APP_HOME%\lib\aopalliance-1.0.jar;%APP_HOME%\lib\spring-boot-starter-validation-1.3.0.RELEASE.jar;%APP_HOME%\lib\char-translation-0.0.2.jar;%APP_HOME%\lib\logback-classic-1.1.3.jar;%APP_HOME%\lib\commons-io-2.4.jar;%APP_HOME%\lib\spring-boot-starter-1.3.0.RELEASE.jar;%APP_HOME%\lib\guava-17.0.jar;%APP_HOME%\lib\spring-shell-table-2.0.0.M1.jar;%APP_HOME%\lib\asciitable-0.3.2.jar

@rem Execute JET_build
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %JET_BUILD_OPTS%  -classpath "%CLASSPATH%" files.ExerciseMain %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable JET_BUILD_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%JET_BUILD_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
