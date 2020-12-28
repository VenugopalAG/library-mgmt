# library-mgmt-venugilki
A library management system

#Steps to build the jar
1. mvn clean install
2. go to target folder . run the following command:
java -jar library-mgmt-0.0.1-SNAPSHOT.jar

#H2 DB config;
url : http://localhost:8080/h2-console
jdbc url : jdbc:h2:mem:librarymgmtdb
username: sa
password: password
 
#postman collection is attached, happy path working. id is used as the primary key
1. Create a shelf 
2. Add a book
3. Add a member
4. Reserve a book . no_of_available books counter would be decremented

#TODO
1. oauth2 implementation
2. role based access
3. optimize JPA, extend from common repository
4. map a member 
5. junit test
