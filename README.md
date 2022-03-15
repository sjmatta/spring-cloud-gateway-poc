##Run
###Mac/Linux
```bash
./mvnw spring-boot:run
```
###Windows
```bash
mvnw spring-boot:run
```

##SOAP Endpoint
```bash
curl --location --request POST 'http://localhost:8080/tempconvert' \
--header 'Content-Type: application/soap+xml; charset=utf-8' \
--data-raw '<?xml version="1.0" encoding="utf-8"?>
<soap12:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://www.w3.org/2003/05/soap-envelope">
  <soap12:Body>
    <CelsiusToFahrenheit xmlns="https://www.w3schools.com/xml/">
      <Celsius>20</Celsius>
    </CelsiusToFahrenheit>
  </soap12:Body>
</soap12:Envelope>
```

##REST Endpoint
```bash
curl http://localhost:8080/helloworld
```
