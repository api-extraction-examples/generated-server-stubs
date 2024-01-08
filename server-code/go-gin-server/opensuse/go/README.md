# Go API Server for openapi

The _Open Build Service API_ is a XML API.

To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.

There is no API versioning as there is no need for it right now.

Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations.
In case of abuse, we will limit/remove your access.

For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API.
It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below)


## Overview
This server was generated by the [openapi-generator]
(https://openapi-generator.tech) project.
By using the [OpenAPI-Spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate a server stub.
-

To see how to make this your own, look here:

[README](https://openapi-generator.tech)

- API version: 2.10.50
- Build date: 2024-01-06T13:52:51.065218-04:00[America/Lower_Princes]
For more information, please visit [https://openbuildservice.org/](https://openbuildservice.org/)

### Running the server

To run the server, follow these simple steps:

```
go run main.go
```

To run the server in a docker container
```
docker build --network=host -t openapi .
```

Once the image is built, just run
```
docker run --rm -it openapi
```

### Known Issue

Endpoints sharing a common path may result in issues. For example, `/v2/pet/findByTags` and `/v2/pet/:petId` will result in an issue with the Gin framework. For more information about this known limitation, please refer to [gin-gonic/gin#388](https://github.com/gin-gonic/gin/issues/388) for more information.

A workaround is to manually update the path and handler. Please refer to [gin-gonic/gin/issues/205#issuecomment-296155497](https://github.com/gin-gonic/gin/issues/205#issuecomment-296155497) for more information.