# REST
- Representational State Transfer
- architecture for exposing information and functionality between software or devices
- information provided is a representation of the state of a given resource
- representation is usually JSON

---

# Resource
- entity or data that API can provide info about
- can be identified by a URL
- can allow actions to be performed on it (GET, POST, PUT, DELETE)

---

# Constraints (principles)
- client/server relationship: separate components interacting through an interface
- uniform interface: use of resources, self-descriptive messages 
- stateless: each message contains all info needed
- HATEOS / Hypertext as the engine of application state (make API discoverable in state through links!)
- layered system: application itself is ideally in layers interacting through interfaces
- cachable: responses should specify if info is cachable or not.

---

# Best Practices
- use nouns for resources (users, posts, etc)
- use plurals for resources that are collections
- single resources are represented by a name or id
- send appropriate response code back
