# discovery-mars
Mars Exploration by Robots

## Installation
build and running the project
```shell
./start.sh
```

### Samples:

```shell
curl -s --request POST http://localhost:8080/rest/mars/MMRMMRMM
```  
Result: *(2, 0, S)*

```shell
curl -s --request POST http://localhost:8080/rest/mars/MML
```  
Result: *(0, 2, W)*

```shell
curl -s --request POST http://localhost:8080/rest/mars/AAA
```
Result: *400 Bad Request*

```shell
curl -s --request POST http://localhost:8080/rest/mars/MMMMMMMMMMMMMMMMMMMMMMMM
```
Result: *400 Bad Request*