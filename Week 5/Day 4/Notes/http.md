# HTTP
- hypertext transfer protocol
- used to interact with other devices over the world wide web
- devices send messages full of data to one another

---

# Context
- Internet: network of computers
- Protocol: different rules for different types of communication
- World Wed Web: hypertext documents that are linked in non-linear way
- Browser: application used to navigate the web

---
# Requests
- the communication that clients send using HTTP is made up of one or more request

- Requests contain:
    - url
    - method
    - protocol version
    - headers (additional, optional useful info)
    - body

---
# Responses
- the communication that the server sends back using HTTP is made up of one or more responses
- Responses contain:
    - protocol version
    - status code
    - status message
    - headers (additional, optional useful info)
    - body
---

# HTTP Verbs/Methods
- these verbs indicate to the server what type of action the client wants to perform on the resource specified. 
- The server performs the action if it allows it.
- GET: requests information
- POST: add information
- PUT: updates information
- DELETE: removes information
- PATCH (supplementary): updates some information
- OPTIONS (supplementary): requests supported methods 


---

# HTTP Status Codes
-   Response codes are grouped in five classes:
    -   Informational responses (100–199)
    -   Successful responses (200–299)
	    - 200 OK
	    - 201 Created
    -   Redirection messages (300–399)
    -   Client error responses (400–499)
	    - 400 bad request
	    - 401 unauthorized
	    - 404 not found
    -   Server error responses (500–599)
	    - 500 internal server error

