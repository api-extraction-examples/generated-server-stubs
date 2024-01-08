/*
 * Docker Engine API
 *
 * The Engine API is an HTTP API served by Docker Engine. It is the API the Docker client uses to communicate with the Engine, so everything the Docker client can do can be done with the API.  Most of the client's commands map directly to API endpoints (e.g. `docker ps` is `GET /containers/json`). The notable exception is running containers, which consists of several API calls.  # Errors  The API uses standard HTTP status codes to indicate the success or failure of the API call. The body of the response will be JSON in the following format:  ``` {   \"message\": \"page not found\" } ```  # Versioning  The API is usually changed in each release of Docker, so API calls are versioned to ensure that clients don't break.  For Docker Engine 17.09, the API version is 1.32. To lock to this version, you prefix the URL with `/v1.32`. For example, calling `/info` is the same as calling `/v1.32/info`.  Engine releases in the near future should support this version of the API, so your client will continue to work even if it is talking to a newer Engine.  In previous versions of Docker, it was possible to access the API without providing a version. This behaviour is now deprecated will be removed in a future version of Docker.  The API uses an open schema model, which means server may add extra properties to responses. Likewise, the server will ignore any extra query parameters and request body properties. When you write clients, you need to ignore additional properties in responses to ensure they do not break when talking to newer Docker daemons.  This documentation is for version 1.33 of the API. Use this table to find documentation for previous versions of the API:  Docker version  | API version | Changes - -- -- -- -- -- -- -- -|- -- -- -- -- -- --|- -- -- -- -- 17.09.x | [1.31](https://docs.docker.com/engine/api/v1.32/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-32-api-changes) 17.07.x | [1.31](https://docs.docker.com/engine/api/v1.31/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-31-api-changes) 17.06.x | [1.30](https://docs.docker.com/engine/api/v1.30/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-30-api-changes) 17.05.x | [1.29](https://docs.docker.com/engine/api/v1.29/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-29-api-changes) 17.04.x | [1.28](https://docs.docker.com/engine/api/v1.28/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-28-api-changes) 17.03.1 | [1.27](https://docs.docker.com/engine/api/v1.27/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-27-api-changes) 1.13.1 & 17.03.0 | [1.26](https://docs.docker.com/engine/api/v1.26/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-26-api-changes) 1.13.0 | [1.25](https://docs.docker.com/engine/api/v1.25/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-25-api-changes) 1.12.x | [1.24](https://docs.docker.com/engine/api/v1.24/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-24-api-changes) 1.11.x | [1.23](https://docs.docker.com/engine/api/v1.23/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-23-api-changes) 1.10.x | [1.22](https://docs.docker.com/engine/api/v1.22/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-22-api-changes) 1.9.x | [1.21](https://docs.docker.com/engine/api/v1.21/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-21-api-changes) 1.8.x | [1.20](https://docs.docker.com/engine/api/v1.20/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-20-api-changes) 1.7.x | [1.19](https://docs.docker.com/engine/api/v1.19/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-19-api-changes) 1.6.x | [1.18](https://docs.docker.com/engine/api/v1.18/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-18-api-changes)  # Authentication  Authentication for registries is handled client side. The client has to send authentication details to various endpoints that need to communicate with registries, such as `POST /images/(name)/push`. These are sent as `X-Registry-Auth` header as a Base64 encoded (JSON) string with the following structure:  ``` {   \"username\": \"string\",   \"password\": \"string\",   \"email\": \"string\",   \"serveraddress\": \"string\" } ```  The `serveraddress` is a domain/IP without a protocol. Throughout this structure, double quotes are required.  If you have already got an identity token from the [`/auth` endpoint](#operation/SystemAuth), you can just pass this instead of credentials:  ``` {   \"identitytoken\": \"9cbaf023786cd7...\" } ``` 
 *
 * The version of the OpenAPI document: 1.33
 * 
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Http;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using Org.OpenAPITools.Attributes;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class ServiceApiController : ControllerBase
    { 
        /// <summary>
        /// Create a service
        /// </summary>
        /// <param name="serviceCreateRequest"></param>
        /// <param name="xRegistryAuth">A base64-encoded auth configuration for pulling from private registries. [See the authentication section for details.](#section/Authentication)</param>
        /// <response code="201">no error</response>
        /// <response code="400">bad parameter</response>
        /// <response code="403">network is not eligible for services</response>
        /// <response code="409">name conflicts with an existing service</response>
        /// <response code="500">server error</response>
        /// <response code="503">node is not part of a swarm</response>
        [HttpPost]
        [Route("/v1.33/services/create")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("ServiceCreate")]
        [SwaggerResponse(statusCode: 201, type: typeof(ServiceCreate201Response), description: "no error")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "bad parameter")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "network is not eligible for services")]
        [SwaggerResponse(statusCode: 409, type: typeof(ErrorResponse), description: "name conflicts with an existing service")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "server error")]
        [SwaggerResponse(statusCode: 503, type: typeof(ErrorResponse), description: "node is not part of a swarm")]
        public virtual IActionResult ServiceCreate([FromBody]ServiceCreateRequest serviceCreateRequest, [FromHeader (Name = "X-Registry-Auth")]string xRegistryAuth)
        {

            //TODO: Uncomment the next line to return response 201 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(201, default(ServiceCreate201Response));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 503 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(503, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"ID\" : \"ak7w3gjqoa3kuz8xcpnyy0pvl\",\n  \"Warning\" : \"unable to pin image doesnotexist:latest to digest: image library/doesnotexist:latest not found\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ServiceCreate201Response>(exampleJson)
            : default(ServiceCreate201Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Delete a service
        /// </summary>
        /// <param name="id">ID or name of service.</param>
        /// <response code="200">no error</response>
        /// <response code="404">no such service</response>
        /// <response code="500">server error</response>
        /// <response code="503">node is not part of a swarm</response>
        [HttpDelete]
        [Route("/v1.33/services/{id}")]
        [ValidateModelState]
        [SwaggerOperation("ServiceDelete")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "no such service")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "server error")]
        [SwaggerResponse(statusCode: 503, type: typeof(ErrorResponse), description: "node is not part of a swarm")]
        public virtual IActionResult ServiceDelete([FromRoute (Name = "id")][Required]string id)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 503 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(503, default(ErrorResponse));

            throw new NotImplementedException();
        }

        /// <summary>
        /// Inspect a service
        /// </summary>
        /// <param name="id">ID or name of service.</param>
        /// <param name="insertDefaults">Fill empty fields with default values.</param>
        /// <response code="200">no error</response>
        /// <response code="404">no such service</response>
        /// <response code="500">server error</response>
        /// <response code="503">node is not part of a swarm</response>
        [HttpGet]
        [Route("/v1.33/services/{id}")]
        [ValidateModelState]
        [SwaggerOperation("ServiceInspect")]
        [SwaggerResponse(statusCode: 200, type: typeof(Service), description: "no error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "no such service")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "server error")]
        [SwaggerResponse(statusCode: 503, type: typeof(ErrorResponse), description: "node is not part of a swarm")]
        public virtual IActionResult ServiceInspect([FromRoute (Name = "id")][Required]string id, [FromQuery (Name = "insertDefaults")]bool? insertDefaults)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Service));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 503 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(503, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"CreatedAt\" : \"2016-06-07T21:05:51.880065305Z\",\n  \"Endpoint\" : {\n    \"Ports\" : [ {\n      \"Protocol\" : \"tcp\",\n      \"PublishedPort\" : 30001,\n      \"TargetPort\" : 6379\n    } ],\n    \"Spec\" : {\n      \"Mode\" : \"vip\",\n      \"Ports\" : [ {\n        \"Protocol\" : \"tcp\",\n        \"PublishedPort\" : 30001,\n        \"TargetPort\" : 6379\n      } ]\n    },\n    \"VirtualIPs\" : [ {\n      \"Addr\" : \"10.255.0.2/16\",\n      \"NetworkID\" : \"4qvuz4ko70xaltuqbt8956gd1\"\n    }, {\n      \"Addr\" : \"10.255.0.3/16\",\n      \"NetworkID\" : \"4qvuz4ko70xaltuqbt8956gd1\"\n    } ]\n  },\n  \"ID\" : \"9mnpnzenvg8p8tdbtq4wvbkcz\",\n  \"Spec\" : {\n    \"EndpointSpec\" : {\n      \"Mode\" : \"vip\",\n      \"Ports\" : [ {\n        \"Protocol\" : \"tcp\",\n        \"PublishedPort\" : 30001,\n        \"TargetPort\" : 6379\n      } ]\n    },\n    \"Mode\" : {\n      \"Replicated\" : {\n        \"Replicas\" : 1\n      }\n    },\n    \"Name\" : \"hopeful_cori\",\n    \"RollbackConfig\" : {\n      \"Delay\" : 1000000000,\n      \"FailureAction\" : \"pause\",\n      \"MaxFailureRatio\" : 0.15,\n      \"Monitor\" : 15000000000,\n      \"Parallelism\" : 1\n    },\n    \"TaskTemplate\" : {\n      \"ContainerSpec\" : {\n        \"Image\" : \"redis\"\n      },\n      \"ForceUpdate\" : 0,\n      \"Placement\" : { },\n      \"Resources\" : {\n        \"Limits\" : { },\n        \"Reservations\" : { }\n      },\n      \"RestartPolicy\" : {\n        \"Condition\" : \"any\",\n        \"MaxAttempts\" : 0\n      }\n    },\n    \"UpdateConfig\" : {\n      \"Delay\" : 1000000000,\n      \"FailureAction\" : \"pause\",\n      \"MaxFailureRatio\" : 0.15,\n      \"Monitor\" : 15000000000,\n      \"Parallelism\" : 1\n    }\n  },\n  \"UpdatedAt\" : \"2016-06-07T21:07:29.962229872Z\",\n  \"Version\" : {\n    \"Index\" : 19\n  }\n}";
            exampleJson = "Custom MIME type example not yet supported: text/plain";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Service>(exampleJson)
            : default(Service);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// List services
        /// </summary>
        /// <param name="filters">A JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the services list. Available filters:  - &#x60;id&#x3D;&lt;service id&gt;&#x60; - &#x60;label&#x3D;&lt;service label&gt;&#x60; - &#x60;mode&#x3D;[\&quot;replicated\&quot;|\&quot;global\&quot;]&#x60; - &#x60;name&#x3D;&lt;service name&gt;&#x60; </param>
        /// <response code="200">no error</response>
        /// <response code="500">server error</response>
        /// <response code="503">node is not part of a swarm</response>
        [HttpGet]
        [Route("/v1.33/services")]
        [ValidateModelState]
        [SwaggerOperation("ServiceList")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Service>), description: "no error")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "server error")]
        [SwaggerResponse(statusCode: 503, type: typeof(ErrorResponse), description: "node is not part of a swarm")]
        public virtual IActionResult ServiceList([FromQuery (Name = "filters")]string filters)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Service>));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 503 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(503, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "[ {\n  \"CreatedAt\" : \"2016-06-07T21:05:51.880065305Z\",\n  \"Endpoint\" : {\n    \"Ports\" : [ {\n      \"Protocol\" : \"tcp\",\n      \"PublishedPort\" : 30001,\n      \"TargetPort\" : 6379\n    } ],\n    \"Spec\" : {\n      \"Mode\" : \"vip\",\n      \"Ports\" : [ {\n        \"Protocol\" : \"tcp\",\n        \"PublishedPort\" : 30001,\n        \"TargetPort\" : 6379\n      } ]\n    },\n    \"VirtualIPs\" : [ {\n      \"Addr\" : \"10.255.0.2/16\",\n      \"NetworkID\" : \"4qvuz4ko70xaltuqbt8956gd1\"\n    }, {\n      \"Addr\" : \"10.255.0.3/16\",\n      \"NetworkID\" : \"4qvuz4ko70xaltuqbt8956gd1\"\n    } ]\n  },\n  \"ID\" : \"9mnpnzenvg8p8tdbtq4wvbkcz\",\n  \"Spec\" : {\n    \"EndpointSpec\" : {\n      \"Mode\" : \"vip\",\n      \"Ports\" : [ {\n        \"Protocol\" : \"tcp\",\n        \"PublishedPort\" : 30001,\n        \"TargetPort\" : 6379\n      } ]\n    },\n    \"Mode\" : {\n      \"Replicated\" : {\n        \"Replicas\" : 1\n      }\n    },\n    \"Name\" : \"hopeful_cori\",\n    \"RollbackConfig\" : {\n      \"Delay\" : 1000000000,\n      \"FailureAction\" : \"pause\",\n      \"MaxFailureRatio\" : 0.15,\n      \"Monitor\" : 15000000000,\n      \"Parallelism\" : 1\n    },\n    \"TaskTemplate\" : {\n      \"ContainerSpec\" : {\n        \"Image\" : \"redis\"\n      },\n      \"ForceUpdate\" : 0,\n      \"Placement\" : { },\n      \"Resources\" : {\n        \"Limits\" : { },\n        \"Reservations\" : { }\n      },\n      \"RestartPolicy\" : {\n        \"Condition\" : \"any\",\n        \"MaxAttempts\" : 0\n      }\n    },\n    \"UpdateConfig\" : {\n      \"Delay\" : 1000000000,\n      \"FailureAction\" : \"pause\",\n      \"MaxFailureRatio\" : 0.15,\n      \"Monitor\" : 15000000000,\n      \"Parallelism\" : 1\n    }\n  },\n  \"UpdatedAt\" : \"2016-06-07T21:07:29.962229872Z\",\n  \"Version\" : {\n    \"Index\" : 19\n  }\n}, {\n  \"CreatedAt\" : \"2016-06-07T21:05:51.880065305Z\",\n  \"Endpoint\" : {\n    \"Ports\" : [ {\n      \"Protocol\" : \"tcp\",\n      \"PublishedPort\" : 30001,\n      \"TargetPort\" : 6379\n    } ],\n    \"Spec\" : {\n      \"Mode\" : \"vip\",\n      \"Ports\" : [ {\n        \"Protocol\" : \"tcp\",\n        \"PublishedPort\" : 30001,\n        \"TargetPort\" : 6379\n      } ]\n    },\n    \"VirtualIPs\" : [ {\n      \"Addr\" : \"10.255.0.2/16\",\n      \"NetworkID\" : \"4qvuz4ko70xaltuqbt8956gd1\"\n    }, {\n      \"Addr\" : \"10.255.0.3/16\",\n      \"NetworkID\" : \"4qvuz4ko70xaltuqbt8956gd1\"\n    } ]\n  },\n  \"ID\" : \"9mnpnzenvg8p8tdbtq4wvbkcz\",\n  \"Spec\" : {\n    \"EndpointSpec\" : {\n      \"Mode\" : \"vip\",\n      \"Ports\" : [ {\n        \"Protocol\" : \"tcp\",\n        \"PublishedPort\" : 30001,\n        \"TargetPort\" : 6379\n      } ]\n    },\n    \"Mode\" : {\n      \"Replicated\" : {\n        \"Replicas\" : 1\n      }\n    },\n    \"Name\" : \"hopeful_cori\",\n    \"RollbackConfig\" : {\n      \"Delay\" : 1000000000,\n      \"FailureAction\" : \"pause\",\n      \"MaxFailureRatio\" : 0.15,\n      \"Monitor\" : 15000000000,\n      \"Parallelism\" : 1\n    },\n    \"TaskTemplate\" : {\n      \"ContainerSpec\" : {\n        \"Image\" : \"redis\"\n      },\n      \"ForceUpdate\" : 0,\n      \"Placement\" : { },\n      \"Resources\" : {\n        \"Limits\" : { },\n        \"Reservations\" : { }\n      },\n      \"RestartPolicy\" : {\n        \"Condition\" : \"any\",\n        \"MaxAttempts\" : 0\n      }\n    },\n    \"UpdateConfig\" : {\n      \"Delay\" : 1000000000,\n      \"FailureAction\" : \"pause\",\n      \"MaxFailureRatio\" : 0.15,\n      \"Monitor\" : 15000000000,\n      \"Parallelism\" : 1\n    }\n  },\n  \"UpdatedAt\" : \"2016-06-07T21:07:29.962229872Z\",\n  \"Version\" : {\n    \"Index\" : 19\n  }\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Service>>(exampleJson)
            : default(List<Service>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get service logs
        /// </summary>
        /// <remarks>Get &#x60;stdout&#x60; and &#x60;stderr&#x60; logs from a service.  **Note**: This endpoint works only for services with the &#x60;json-file&#x60; or &#x60;journald&#x60; logging drivers. </remarks>
        /// <param name="id">ID or name of the service</param>
        /// <param name="details">Show service context and extra details provided to logs.</param>
        /// <param name="follow">Return the logs as a stream.  This will return a &#x60;101&#x60; HTTP response with a &#x60;Connection: upgrade&#x60; header, then hijack the HTTP connection to send raw output. For more information about hijacking and the stream format, [see the documentation for the attach endpoint](#operation/ContainerAttach). </param>
        /// <param name="stdout">Return logs from &#x60;stdout&#x60;</param>
        /// <param name="stderr">Return logs from &#x60;stderr&#x60;</param>
        /// <param name="since">Only return logs since this time, as a UNIX timestamp</param>
        /// <param name="timestamps">Add timestamps to every log line</param>
        /// <param name="tail">Only return this number of log lines from the end of the logs. Specify as an integer or &#x60;all&#x60; to output all log lines.</param>
        /// <response code="101">logs returned as a stream</response>
        /// <response code="200">logs returned as a string in response body</response>
        /// <response code="404">no such service</response>
        /// <response code="500">server error</response>
        /// <response code="503">node is not part of a swarm</response>
        [HttpGet]
        [Route("/v1.33/services/{id}/logs")]
        [ValidateModelState]
        [SwaggerOperation("ServiceLogs")]
        [SwaggerResponse(statusCode: 101, type: typeof(System.IO.Stream), description: "logs returned as a stream")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "logs returned as a string in response body")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "no such service")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "server error")]
        [SwaggerResponse(statusCode: 503, type: typeof(ErrorResponse), description: "node is not part of a swarm")]
        public virtual IActionResult ServiceLogs([FromRoute (Name = "id")][Required]string id, [FromQuery (Name = "details")]bool? details, [FromQuery (Name = "follow")]bool? follow, [FromQuery (Name = "stdout")]bool? stdout, [FromQuery (Name = "stderr")]bool? stderr, [FromQuery (Name = "since")]int? since, [FromQuery (Name = "timestamps")]bool? timestamps, [FromQuery (Name = "tail")]string tail)
        {

            //TODO: Uncomment the next line to return response 101 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(101, default(System.IO.Stream));
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(string));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 503 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(503, default(ErrorResponse));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<string>(exampleJson)
            : default(string);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update a service
        /// </summary>
        /// <param name="id">ID or name of service.</param>
        /// <param name="varVersion">The version number of the service object being updated. This is required to avoid conflicting writes.</param>
        /// <param name="serviceUpdateRequest"></param>
        /// <param name="registryAuthFrom">If the X-Registry-Auth header is not specified, this parameter indicates where to find registry authorization credentials. The valid values are &#x60;spec&#x60; and &#x60;previous-spec&#x60;.</param>
        /// <param name="rollback">Set to this parameter to &#x60;previous&#x60; to cause a server-side rollback to the previous service spec. The supplied spec will be ignored in this case.</param>
        /// <param name="xRegistryAuth">A base64-encoded auth configuration for pulling from private registries. [See the authentication section for details.](#section/Authentication)</param>
        /// <response code="200">no error</response>
        /// <response code="400">bad parameter</response>
        /// <response code="404">no such service</response>
        /// <response code="500">server error</response>
        /// <response code="503">node is not part of a swarm</response>
        [HttpPost]
        [Route("/v1.33/services/{id}/update")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("ServiceUpdate")]
        [SwaggerResponse(statusCode: 200, type: typeof(ServiceUpdateResponse), description: "no error")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "bad parameter")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "no such service")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "server error")]
        [SwaggerResponse(statusCode: 503, type: typeof(ErrorResponse), description: "node is not part of a swarm")]
        public virtual IActionResult ServiceUpdate([FromRoute (Name = "id")][Required]string id, [FromQuery (Name = "version")][Required()]int varVersion, [FromBody]ServiceUpdateRequest serviceUpdateRequest, [FromQuery (Name = "registryAuthFrom")]string registryAuthFrom, [FromQuery (Name = "rollback")]string rollback, [FromHeader (Name = "X-Registry-Auth")]string xRegistryAuth)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ServiceUpdateResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 503 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(503, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"Warning\" : \"unable to pin image doesnotexist:latest to digest: image library/doesnotexist:latest not found\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ServiceUpdateResponse>(exampleJson)
            : default(ServiceUpdateResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
