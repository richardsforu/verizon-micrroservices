fetch("http://localhost:8082/api/search", {
      
    // Adding method type
    method: "POST",
      
    // Adding body or contents to send
    body: JSON.stringify({
        origin: "Delhi",
        destination: "Chennai",
        flightDate: "2021-05-26",
        travellers: 3
    }),
      
    // Adding headers to the request
    headers: {
        "Content-type": "application/json; charset=UTF-8"
    }
})
  
// Converting to JSON
.then(response => response.json())
  
// Displaying results to console
.then(json => console.log(json));