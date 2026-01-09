# Setting Up Apache Tomcat Server and Creating a Dynamic Web Project in Eclipse
 

## 🖥️ Prerequisites
 
- **Eclipse IDE for Enterprise Java Developers** installed  
- **Apache Tomcat v10** downloaded and extracted  
- **Java JDK (version 11 or above)** properly configured in Eclipse  

---

## ⚙️ Step 1: Connect Apache Tomcat Server to Eclipse
  
1. Go to:  **Window > Preferences > Server > Runtime Environments**  
2. Click **Add**  
3. Select:  **Apache > Apache Tomcat v10.0 > Next**   
4. Click **Browse**, then select your **Tomcat installation directory** (the parent folder that contains the `bin` directory)
5. Click:  **Finish > Apply and Close**
 
---

## 📁 Step 2: Create a Dynamic Web Project

1. Go to:  **File > New > Dynamic Web Project** 
2. Make sure the **Target Runtime** is set to your configured **Apache Tomcat v10**
3. Create a Servlet in WebProject: WebProject -> New -> Servlet -> Class name : HelloServlet -> Finish
  
> ⚠️ **Important:**  
> Always connect and configure the Tomcat server **before** creating your web project.  
> This ensures that the **Tomcat library** is automatically added to your project’s build path.  
> If you skip this and create the project first, you’ll need to **manually add the Tomcat runtime library** later.
  - Right-click the project → **Build Path > Configure Build Path > Add Library > Server Runtime > Apache Tomcat v10**

---

## ▶️ Step 3: Run Your Project

1. Right-click on your project  
2. Select **Run As > Run on Server**  
3. Choose **Apache Tomcat v10**  
4. Click **Finish**  
5. Open your browser and visit localhost:8080 : http://localhost:8080/WebProject/HelloServlet
- http => hypertext transfer protocol
- localhost => IP Address or Hostname of tomcat server
- 8080 => port number where tomcat server is running
- WebProject => Project Name / Application Name
- HelloServlet => url pattern


>for jdbc connection the driver jar file should be in  WEB-INF > lib
