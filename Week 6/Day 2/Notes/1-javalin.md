# Javalin
- lightweight web framework
- web framework: role is to make web development easier 
- not opinionated: you can structure your project how you want
- provides a Context object for working with requests and responses

---

# Steps
- install Javalin as a dependency
- create a Javalin object
- create endpoints

---

# Endpoint Handlers
- respond to client requests
- made up of three parts: verb, path, implementation

---

# Context Object
- this object contains request and response information and functionality
- getting info from request: pathParam() or bodyAsClass()
- sending info to the client: result() or json()