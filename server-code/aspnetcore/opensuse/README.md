# Org.OpenAPITools - ASP.NET Core 3.1 Server

The _Open Build Service API_ is a XML API.

To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.

There is no API versioning as there is no need for it right now.

Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations.
In case of abuse, we will limit/remove your access.

For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API.
It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below)


## Upgrade NuGet Packages

NuGet packages get frequently updated.

To upgrade this solution to the latest version of all NuGet packages, use the dotnet-outdated tool.


Install dotnet-outdated tool:

```
dotnet tool install --global dotnet-outdated-tool
```

Upgrade only to new minor versions of packages

```
dotnet outdated --upgrade --version-lock Major
```

Upgrade to all new versions of packages (more likely to include breaking API changes)

```
dotnet outdated --upgrade
```


## Run

Linux/OS X:

```
sh build.sh
```

Windows:

```
build.bat
```
## Run in Docker

```
cd src/Org.OpenAPITools
docker build -t org.openapitools .
docker run -p 5000:8080 org.openapitools
```
