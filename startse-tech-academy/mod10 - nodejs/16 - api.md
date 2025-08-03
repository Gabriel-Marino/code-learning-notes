API stand for application programming interface, is a set of specifications of possible iteractions between systems or applications.

REST stands for Representational State Transfer, it's an architeture for API's

An API which implements REST it's a RESTful API

---

Main methods of an API is:
* GET, recover all or one resource from a collection
* POST, create a new resource
* PUT, update a resource
* PATCH, update a resource
* DELETE, delete a resource
* OPTIONS, return all available methods

---

HTTP code's:
* 2XX: confirmation
    * 200 (OK): the request was successfully treated and completed
    * 201 (Created): the creation of a resource was successed
* 3XX: Redirect
    * 301: permanently changed
* 4XX: Invalid request
    * Client side error, due to request with wrong or invalid parameters
    * 401 (Not authorized): Tryed to access a resource without the needed authorization
    * 404 (Not found): The requested resource don't exists
* 5XX: Server error
    * Whenever the server throw an exception while exectuing the request

---

Request parameters
* Header params: sent in the header of the request
* Query params: sent in the url with key and value
* Route params: sent by the route
* Body params: sent with the body of the request

---

Good habits with API Rest
* get the user lsit GET/users
* get user details GET/users/{id}
* create a new user POST/users
* delete a user DELETE/users/{id}
* update a user PUT/users/{id}
* update a single detail of an user PATCH/user/{id}
