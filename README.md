#**CarConsumer**

  As a consumer of a RESTFul API, to be able to add, retrieve, and remove cars."
  This applcation has following capabilities:
    1. Add Car
    2. Retrieve Cars
    3. Remove Car
  
  **To run the program please following steps:**

  1. Install & configure java (https://java.com/en/download/help/download_options.html)
  2. Install & configure mvn (https://www.javatpoint.com/how-to-install-maven)
  3. Checkout the code from https://github.com/kulkarnirahuls/carweb.git
  4. On after successfull cloning, please execute following command in your project root directory. i.e. <demo app>/pom.xml
        
	mvn clean install
	
  5. To run the application, please go to <demo app>/target/ directory and execute following command:
     
	java -Dfile.encoding=UTF-8 -jar demo-0.0.1-SNAPSHOT.jar
	
  6. Install Postman (https://www.toolsqa.com/postman/download-and-install-postman/) 
  7. For testing Add Car functionality, please keep following configuration in the Postman:
      
	
	Request Method: POST
	URI: http://localhost:8080/api/v1/add
	Body Type: JSON(application/json)
	Body JSON: 
              {
                "make": "BmW",
                "model": "Tat",
                "colour": "Black",
                "year": "2015"
              }
	
	
  8. For testing Retrieve Cars functionality, please keep following configuration in the Postman:
      
	
	Request method: GET
	URI: http://localhost:8080/api/v1/retrieve/all
	
	
  9. For testing Remove Car functionality, please keep following configuration in the Postman:
      
	Request Method: DELETE
	URI: http://localhost:8080/api/v1/remove/{id}
	
  _
  Note: Database will be flushed once JVM get restarted_
      
