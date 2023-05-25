## Cursor Based Pagination with Spring Boot and JPA
This repository provides an example implementation of Cursor Based Pagination using Spring Boot and JPA. 

Cursor Based Pagination is a technique for fetching a large result set in smaller chunks using cursors instead of traditional page 
numbers. 

It offers better performance and stability compared to offset/limit or page-based pagination.

### How it works?
Cursor Based Pagination operates by using a unique cursor or marker to indicate the position in the result set. 
Instead of returning a specific page, it retrieves the next set of results based on the cursor value. 
This approach allows for efficient retrieval of large data sets without the need to calculate total counts or skip a 
specific number of records.

### Technologies Used
- Java 20
- Spring Boot
- Spring Data JPA
- H2 Database

### Getting Started
Just run the project and database will be initialized and populated with the required data that can be used in testing
purposes.

### API Endpoints
`GET /api/posts`: Retrieves all the posts from the database  

`GET /api/posts?size=4`: Retrieves specified number of records from database and will generate next page cursor 
if data exists

`GET /api/posts?size=4&nextPageCursor`: Retrieves specified number of records from given next page cursor

`GET /api/posts?size=4&previousPageCursor`: Retrieves specified number of records from given previous page cursor

All endpoints are defined in `http_examples` folder. By using HTTP Client extension in IntelliJ you can try it without 
any additional configuration.

### Customization and Extension
You can customize and extend this project according to your specific requirements:

- Modify the entity and repository classes to match your domain model
- Implement additional API endpoints or add more features as needed
- Adapt the database configuration for your preferred database system

### Contribution/Suggestions
If someone is interested in contribution or have some suggestions please contact me on email hedzaprog@gmail.com.

### Author
Heril Muratović  
Software Engineer

Mobile/Viber/WhatsUp: +382 69 657 962  
Email: hedzaprog@gmail.com  
Skype: hedza06  
Twitter: herilmuratovic  
LinkedIn: https://www.linkedin.com/in/heril-muratovi%C4%87-021097132/  
StackOverflow: https://stackoverflow.com/users/4078505/heril-muratovic
