# User-api
The API is a spring boot application that encrypts and creates user data. Data is stored in H2 database.

## Local installation
Tools used : JDK 8, Maven 3.6.3
1. Clone the repository (user-api) from github : https://github.com/kartheekmanevarthe/user-api.git
2. Import this project as a maven project into IDE (Intellij/Eclipse)
3. Run the spring boot application to start the server

##Application guide
User data can be created using the following post request.
http://localhost:8080/user

   **sample json payload :**
   
{
   "userName": "kartheek",
   "emailAddress": "kartheekmanevarthe@gmail.com",
   "phoneNumber": "07423430221",
   "address": "Flat 87, Hatton Place, 118 Midland Road, Luton"
   }

## Database
This API uses spring data JPA to connect to H2 in memory database.
Database console is available at http://localhost:8080/h2-console
**Configurations:** 
JDBC URL : jdbc:h2:mem:userdb
user name : savethechildren
password : savethechildren