1. Base Branch : basic-h2
This is basic H2 implementation ,
Tech : 
	1. Spring Boot / web .
	2. H2.
	3. Lombok
	4. JPA
	
	This uses h2 to store data .
	Hits request to Department service to get Department  while fetching user.

    1. Create Department with basic
	2. Create User
	Post :
	http://localhost:8080/users/
	{
		"firstName" : "aditya",
		"lastName" : "jagtap",
		"departmentId" : 1
	}

	3. Get User
	Get :
	http://localhost:8080/users/1
	It will Return as below : 
	{
        "user": {
            "userId": 1,
            "firstName": "aditya",
            "lastName": "jagtap",
            "departmentId": 1
        },
        "department": {
            "departmentId": 1,
            "departmentName": "Chess",
            "departmentHead": "Magnus Carlsen"
        }
    }

