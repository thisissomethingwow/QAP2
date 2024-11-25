# QAP2 for SDAT 
## API setup
To start you will need to update the database URL, username and password in application.properties file as well as in the DB URL in docker-compose 
## How to run in Docker
1. Make a .jar file from the project ***Note*** the process is different for each IDE 
2. Open the terminal of the project and type ```docker build -t qap2 .```
3. Once its dont building type ```docker compose up ``` in the terrminal to push to Docker Desktop

## Search API
### Members
get/post members
```
http://localhost:8080/members  
```
update members
```
http://localhost:8080/members/{id} 
```
search by name
```
http://localhost:8080/members/name_search?name=yourName    
```
search by membership type
```
http://localhost:8080/members/membership_search?is_premium=true/false  
```
search by phone number
```
http://localhost:8080/members/phoneNumber_search?phoneNumber=yourPhoneNumber  
```
search by email
```
http://localhost:8080/members/email_search?email=yourEmail 
```
search by membership end date
```
http://localhost:8080/members/endDate_search?membershipEndDate=yyyy-MM-dd 
```

### Tournaments
get/post tournaments
```
http://localhost:8080/tournaments 
```
update tournaments
```
http://localhost:8080/tournaments/{id} 
```
search by start date
```
http://localhost:8080/members/startDate_search?startDate=yyyy-MM-dd 
```
search by location
```
http://localhost:8080/members/location_search?location=yourLocation 
```
find all members in a tournament
```
http://localhost:8080/tournaments/{id}/members 
```
