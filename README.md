
# 🚀 Projeto Java com Maven + Selenium + JUnit + ChromeDriver

Este guia te mostra como criar um projeto Java do zero com Maven no VS Code, configurar o Selenium WebDriver, JUnit para testes e o ChromeDriver compatível com a versão atual do Google Chrome.

---

## 📌 Parte 1: Instalações e Configurações (Português)

### ✅ Pré-requisitos
- Java JDK (recomendado: 17 ou superior)
- Apache Maven
- Visual Studio Code
- Extensões: **Extension Pack for Java**, **Maven for Java**

### ☕ Instalar o Java JDK
Baixe e instale o JDK a partir de: https://www.oracle.com/java/technologies/javase-downloads.html  
Verifique no terminal:
```bash
java -version
```

### 🧰 Instalar o Maven
1. Baixe o Maven: https://maven.apache.org/download.cgi  
   Escolha o arquivo `.zip` (ex: apache-maven-3.9.9-bin.zip)
2. Extraia em: `C:\Program Files\Apache\Maven\apache-maven-3.9.9`
3. Configure as Variáveis de Ambiente:
   - Adicione `C:\Program Files\Apache\Maven\apache-maven-3.9.9\bin` ao `Path`
   - Crie a variável `MAVEN_HOME` com o valor do caminho Maven

Verifique no CMD:
```bash
mvn -v
```

### 🧪 Usar Maven no Git Bash (VS Code)
Adicione ao arquivo `~/.bashrc`:
```bash
export PATH="/c/Program Files/Apache/Maven/apache-maven-3.9.9/bin:$PATH"
```
Depois rode:
```bash
source ~/.bashrc
```

### 📦 Criar o projeto com Maven
```bash
mvn archetype:generate -DgroupId=com.seuprojeto -DartifactId=meuprojeto -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

Abra o projeto:
```bash
cd meuprojeto
code .
```

### ⚙️ Configurar dependências no `pom.xml`

#### 🧷 Selenium Java
```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.21.0</version>
</dependency>
```

#### 🧪 JUnit
```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
```

### 🧭 Instalar o ChromeDriver
1. Verifique a versão do Chrome: `chrome://settings/help`
2. Baixe o ChromeDriver compatível: https://googlechromelabs.github.io/chrome-for-testing/
3. Extraia o `chromedriver.exe` para:
```
src/drivers/chromedriver.exe
```

### 🧪 Exemplo de código Selenium
```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
```

---

# 🌎 Java Project with Maven + Selenium + JUnit + ChromeDriver (English)

This is a complete step-by-step guide to set up a Java Maven project with Selenium WebDriver, JUnit, and ChromeDriver using VS Code.

### ✅ Prerequisites
- Java JDK (recommended: 17+)
- Apache Maven
- Visual Studio Code
- Extensions: **Extension Pack for Java**, **Maven for Java**

### ☕ Install Java JDK
Download and install from: https://www.oracle.com/java/technologies/javase-downloads.html  
Check it:
```bash
java -version
```

### 🧰 Install Apache Maven
1. Download from: https://maven.apache.org/download.cgi  
   Use `.zip` file (e.g. apache-maven-3.9.9-bin.zip)
2. Extract to:
```
C:\Program Files\Apache\Maven\apache-maven-3.9.9
```
3. Configure Environment Variables:
   - Add to `Path`: `C:\Program Files\Apache\Maven\apache-maven-3.9.9\bin`
   - Create `MAVEN_HOME` variable

Check it:
```bash
mvn -v
```

### 🧪 Use Maven in Git Bash (VS Code)
Edit `~/.bashrc`:
```bash
export PATH="/c/Program Files/Apache/Maven/apache-maven-3.9.9/bin:$PATH"
```
Then run:
```bash
source ~/.bashrc
```

### 📦 Create Maven project
```bash
mvn archetype:generate -DgroupId=com.myproject -DartifactId=myproject -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

Open it:
```bash
cd myproject
code .
```

### ⚙️ Add dependencies to `pom.xml`

#### 🧷 Selenium Java
```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.21.0</version>
</dependency>
```

#### 🧪 JUnit
```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>
```

### 🧭 Install ChromeDriver
1. Check your Chrome version: `chrome://settings/help`
2. Download the right driver: https://googlechromelabs.github.io/chrome-for-testing/
3. Extract `chromedriver.exe` to:
```
src/drivers/chromedriver.exe
```

### 🧪 Example Selenium Code
```java
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
```

---

✨ **Pronto! Agora você tem um ambiente completo com Maven + Selenium + JUnit no VS Code. Boa sorte nos seus testes!**
