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
    public class NodeApiController : ControllerBase
    { 
        /// <summary>
        /// Delete a node
        /// </summary>
        /// <param name="id">The ID or name of the node</param>
        /// <param name="force">Force remove a node from the swarm</param>
        /// <response code="200">no error</response>
        /// <response code="404">no such node</response>
        /// <response code="500">server error</response>
        /// <response code="503">node is not part of a swarm</response>
        [HttpDelete]
        [Route("/v1.33/nodes/{id}")]
        [ValidateModelState]
        [SwaggerOperation("NodeDelete")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "no such node")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "server error")]
        [SwaggerResponse(statusCode: 503, type: typeof(ErrorResponse), description: "node is not part of a swarm")]
        public virtual IActionResult NodeDelete([FromRoute (Name = "id")][Required]string id, [FromQuery (Name = "force")]bool? force)
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
        /// Inspect a node
        /// </summary>
        /// <param name="id">The ID or name of the node</param>
        /// <response code="200">no error</response>
        /// <response code="404">no such node</response>
        /// <response code="500">server error</response>
        /// <response code="503">node is not part of a swarm</response>
        [HttpGet]
        [Route("/v1.33/nodes/{id}")]
        [ValidateModelState]
        [SwaggerOperation("NodeInspect")]
        [SwaggerResponse(statusCode: 200, type: typeof(Node), description: "no error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "no such node")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "server error")]
        [SwaggerResponse(statusCode: 503, type: typeof(ErrorResponse), description: "node is not part of a swarm")]
        public virtual IActionResult NodeInspect([FromRoute (Name = "id")][Required]string id)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Node));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 503 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(503, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"Status\" : {\n    \"Message\" : \"\",\n    \"State\" : \"ready\",\n    \"Addr\" : \"172.17.0.2\"\n  },\n  \"Description\" : {\n    \"Platform\" : {\n      \"Architecture\" : \"x86_64\",\n      \"OS\" : \"linux\"\n    },\n    \"Hostname\" : \"bf3067039e47\",\n    \"TLSInfo\" : {\n      \"CertIssuerPublicKey\" : \"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEmT9XIw9h1qoNclv9VeHmf/Vi6/uI2vFXdBveXTpcPjqx6i9wNazchk1XWV/dKTKvSh9xyGKmiIeRcE4OiMnJ1A==\",\n      \"CertIssuerSubject\" : \"MBMxETAPBgNVBAMTCHN3YXJtLWNh\",\n      \"TrustRoot\" : \"-----BEGIN CERTIFICATE-----\nMIIBajCCARCgAwIBAgIUbYqrLSOSQHoxD8CwG6Bi2PJi9c8wCgYIKoZIzj0EAwIw\nEzERMA8GA1UEAxMIc3dhcm0tY2EwHhcNMTcwNDI0MjE0MzAwWhcNMzcwNDE5MjE0\nMzAwWjATMREwDwYDVQQDEwhzd2FybS1jYTBZMBMGByqGSM49AgEGCCqGSM49AwEH\nA0IABJk/VyMPYdaqDXJb/VXh5n/1Yuv7iNrxV3Qb3l06XD46seovcDWs3IZNV1lf\n3Skyr0ofcchipoiHkXBODojJydSjQjBAMA4GA1UdDwEB/wQEAwIBBjAPBgNVHRMB\nAf8EBTADAQH/MB0GA1UdDgQWBBRUXxuRcnFjDfR/RIAUQab8ZV/n4jAKBggqhkjO\nPQQDAgNIADBFAiAy+JTe6Uc3KyLCMiqGl2GyWGQqQDEcO3/YG36x7om65AIhAJvz\npxv6zFeVEkAEEkqIYi0omA9+CjanB/6Bz4n1uw8H\n-----END CERTIFICATE-----\n\"\n    },\n    \"Resources\" : {\n      \"NanoCPUs\" : 4000000000,\n      \"GenericResources\" : [ {\n        \"DiscreteResourceSpec\" : {\n          \"Kind\" : \"SSD\",\n          \"Value\" : 3\n        }\n      }, {\n        \"NamedResourceSpec\" : {\n          \"Kind\" : \"GPU\",\n          \"Value\" : \"UUID1\"\n        }\n      }, {\n        \"NamedResourceSpec\" : {\n          \"Kind\" : \"GPU\",\n          \"Value\" : \"UUID2\"\n        }\n      } ],\n      \"MemoryBytes\" : 8272408576\n    },\n    \"Engine\" : {\n      \"EngineVersion\" : \"17.06.0\",\n      \"Labels\" : {\n        \"foo\" : \"bar\"\n      },\n      \"Plugins\" : [ {\n        \"Name\" : \"awslogs\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"fluentd\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"gcplogs\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"gelf\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"journald\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"json-file\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"logentries\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"splunk\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"syslog\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"bridge\",\n        \"Type\" : \"Network\"\n      }, {\n        \"Name\" : \"host\",\n        \"Type\" : \"Network\"\n      }, {\n        \"Name\" : \"ipvlan\",\n        \"Type\" : \"Network\"\n      }, {\n        \"Name\" : \"macvlan\",\n        \"Type\" : \"Network\"\n      }, {\n        \"Name\" : \"null\",\n        \"Type\" : \"Network\"\n      }, {\n        \"Name\" : \"overlay\",\n        \"Type\" : \"Network\"\n      }, {\n        \"Name\" : \"local\",\n        \"Type\" : \"Volume\"\n      }, {\n        \"Name\" : \"localhost:5000/vieux/sshfs:latest\",\n        \"Type\" : \"Volume\"\n      }, {\n        \"Name\" : \"vieux/sshfs:latest\",\n        \"Type\" : \"Volume\"\n      } ]\n    }\n  },\n  \"Version\" : {\n    \"Index\" : 373531\n  },\n  \"ManagerStatus\" : {\n    \"Leader\" : true,\n    \"Addr\" : \"10.0.0.46:2377\",\n    \"Reachability\" : \"reachable\"\n  },\n  \"CreatedAt\" : \"2016-08-18T10:44:24.496525531Z\",\n  \"ID\" : \"24ifsmvkjbyhk\",\n  \"Spec\" : {\n    \"Availability\" : \"active\",\n    \"Labels\" : {\n      \"foo\" : \"bar\"\n    },\n    \"Name\" : \"node-name\",\n    \"Role\" : \"manager\"\n  },\n  \"UpdatedAt\" : \"2017-08-09T07:09:37.632105588Z\"\n}";
            exampleJson = "Custom MIME type example not yet supported: text/plain";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Node>(exampleJson)
            : default(Node);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// List nodes
        /// </summary>
        /// <param name="filters">Filters to process on the nodes list, encoded as JSON (a &#x60;map[string][]string&#x60;).  Available filters: - &#x60;id&#x3D;&lt;node id&gt;&#x60; - &#x60;label&#x3D;&lt;engine label&gt;&#x60; - &#x60;membership&#x3D;&#x60;(&#x60;accepted&#x60;|&#x60;pending&#x60;)&#x60; - &#x60;name&#x3D;&lt;node name&gt;&#x60; - &#x60;role&#x3D;&#x60;(&#x60;manager&#x60;|&#x60;worker&#x60;)&#x60; </param>
        /// <response code="200">no error</response>
        /// <response code="500">server error</response>
        /// <response code="503">node is not part of a swarm</response>
        [HttpGet]
        [Route("/v1.33/nodes")]
        [ValidateModelState]
        [SwaggerOperation("NodeList")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Node>), description: "no error")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "server error")]
        [SwaggerResponse(statusCode: 503, type: typeof(ErrorResponse), description: "node is not part of a swarm")]
        public virtual IActionResult NodeList([FromQuery (Name = "filters")]string filters)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Node>));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 503 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(503, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "[ {\n  \"Status\" : {\n    \"Message\" : \"\",\n    \"State\" : \"ready\",\n    \"Addr\" : \"172.17.0.2\"\n  },\n  \"Description\" : {\n    \"Platform\" : {\n      \"Architecture\" : \"x86_64\",\n      \"OS\" : \"linux\"\n    },\n    \"Hostname\" : \"bf3067039e47\",\n    \"TLSInfo\" : {\n      \"CertIssuerPublicKey\" : \"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEmT9XIw9h1qoNclv9VeHmf/Vi6/uI2vFXdBveXTpcPjqx6i9wNazchk1XWV/dKTKvSh9xyGKmiIeRcE4OiMnJ1A==\",\n      \"CertIssuerSubject\" : \"MBMxETAPBgNVBAMTCHN3YXJtLWNh\",\n      \"TrustRoot\" : \"-----BEGIN CERTIFICATE-----\nMIIBajCCARCgAwIBAgIUbYqrLSOSQHoxD8CwG6Bi2PJi9c8wCgYIKoZIzj0EAwIw\nEzERMA8GA1UEAxMIc3dhcm0tY2EwHhcNMTcwNDI0MjE0MzAwWhcNMzcwNDE5MjE0\nMzAwWjATMREwDwYDVQQDEwhzd2FybS1jYTBZMBMGByqGSM49AgEGCCqGSM49AwEH\nA0IABJk/VyMPYdaqDXJb/VXh5n/1Yuv7iNrxV3Qb3l06XD46seovcDWs3IZNV1lf\n3Skyr0ofcchipoiHkXBODojJydSjQjBAMA4GA1UdDwEB/wQEAwIBBjAPBgNVHRMB\nAf8EBTADAQH/MB0GA1UdDgQWBBRUXxuRcnFjDfR/RIAUQab8ZV/n4jAKBggqhkjO\nPQQDAgNIADBFAiAy+JTe6Uc3KyLCMiqGl2GyWGQqQDEcO3/YG36x7om65AIhAJvz\npxv6zFeVEkAEEkqIYi0omA9+CjanB/6Bz4n1uw8H\n-----END CERTIFICATE-----\n\"\n    },\n    \"Resources\" : {\n      \"NanoCPUs\" : 4000000000,\n      \"GenericResources\" : [ {\n        \"DiscreteResourceSpec\" : {\n          \"Kind\" : \"SSD\",\n          \"Value\" : 3\n        }\n      }, {\n        \"NamedResourceSpec\" : {\n          \"Kind\" : \"GPU\",\n          \"Value\" : \"UUID1\"\n        }\n      }, {\n        \"NamedResourceSpec\" : {\n          \"Kind\" : \"GPU\",\n          \"Value\" : \"UUID2\"\n        }\n      } ],\n      \"MemoryBytes\" : 8272408576\n    },\n    \"Engine\" : {\n      \"EngineVersion\" : \"17.06.0\",\n      \"Labels\" : {\n        \"foo\" : \"bar\"\n      },\n      \"Plugins\" : [ {\n        \"Name\" : \"awslogs\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"fluentd\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"gcplogs\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"gelf\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"journald\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"json-file\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"logentries\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"splunk\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"syslog\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"bridge\",\n        \"Type\" : \"Network\"\n      }, {\n        \"Name\" : \"host\",\n        \"Type\" : \"Network\"\n      }, {\n        \"Name\" : \"ipvlan\",\n        \"Type\" : \"Network\"\n      }, {\n        \"Name\" : \"macvlan\",\n        \"Type\" : \"Network\"\n      }, {\n        \"Name\" : \"null\",\n        \"Type\" : \"Network\"\n      }, {\n        \"Name\" : \"overlay\",\n        \"Type\" : \"Network\"\n      }, {\n        \"Name\" : \"local\",\n        \"Type\" : \"Volume\"\n      }, {\n        \"Name\" : \"localhost:5000/vieux/sshfs:latest\",\n        \"Type\" : \"Volume\"\n      }, {\n        \"Name\" : \"vieux/sshfs:latest\",\n        \"Type\" : \"Volume\"\n      } ]\n    }\n  },\n  \"Version\" : {\n    \"Index\" : 373531\n  },\n  \"ManagerStatus\" : {\n    \"Leader\" : true,\n    \"Addr\" : \"10.0.0.46:2377\",\n    \"Reachability\" : \"reachable\"\n  },\n  \"CreatedAt\" : \"2016-08-18T10:44:24.496525531Z\",\n  \"ID\" : \"24ifsmvkjbyhk\",\n  \"Spec\" : {\n    \"Availability\" : \"active\",\n    \"Labels\" : {\n      \"foo\" : \"bar\"\n    },\n    \"Name\" : \"node-name\",\n    \"Role\" : \"manager\"\n  },\n  \"UpdatedAt\" : \"2017-08-09T07:09:37.632105588Z\"\n}, {\n  \"Status\" : {\n    \"Message\" : \"\",\n    \"State\" : \"ready\",\n    \"Addr\" : \"172.17.0.2\"\n  },\n  \"Description\" : {\n    \"Platform\" : {\n      \"Architecture\" : \"x86_64\",\n      \"OS\" : \"linux\"\n    },\n    \"Hostname\" : \"bf3067039e47\",\n    \"TLSInfo\" : {\n      \"CertIssuerPublicKey\" : \"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEmT9XIw9h1qoNclv9VeHmf/Vi6/uI2vFXdBveXTpcPjqx6i9wNazchk1XWV/dKTKvSh9xyGKmiIeRcE4OiMnJ1A==\",\n      \"CertIssuerSubject\" : \"MBMxETAPBgNVBAMTCHN3YXJtLWNh\",\n      \"TrustRoot\" : \"-----BEGIN CERTIFICATE-----\nMIIBajCCARCgAwIBAgIUbYqrLSOSQHoxD8CwG6Bi2PJi9c8wCgYIKoZIzj0EAwIw\nEzERMA8GA1UEAxMIc3dhcm0tY2EwHhcNMTcwNDI0MjE0MzAwWhcNMzcwNDE5MjE0\nMzAwWjATMREwDwYDVQQDEwhzd2FybS1jYTBZMBMGByqGSM49AgEGCCqGSM49AwEH\nA0IABJk/VyMPYdaqDXJb/VXh5n/1Yuv7iNrxV3Qb3l06XD46seovcDWs3IZNV1lf\n3Skyr0ofcchipoiHkXBODojJydSjQjBAMA4GA1UdDwEB/wQEAwIBBjAPBgNVHRMB\nAf8EBTADAQH/MB0GA1UdDgQWBBRUXxuRcnFjDfR/RIAUQab8ZV/n4jAKBggqhkjO\nPQQDAgNIADBFAiAy+JTe6Uc3KyLCMiqGl2GyWGQqQDEcO3/YG36x7om65AIhAJvz\npxv6zFeVEkAEEkqIYi0omA9+CjanB/6Bz4n1uw8H\n-----END CERTIFICATE-----\n\"\n    },\n    \"Resources\" : {\n      \"NanoCPUs\" : 4000000000,\n      \"GenericResources\" : [ {\n        \"DiscreteResourceSpec\" : {\n          \"Kind\" : \"SSD\",\n          \"Value\" : 3\n        }\n      }, {\n        \"NamedResourceSpec\" : {\n          \"Kind\" : \"GPU\",\n          \"Value\" : \"UUID1\"\n        }\n      }, {\n        \"NamedResourceSpec\" : {\n          \"Kind\" : \"GPU\",\n          \"Value\" : \"UUID2\"\n        }\n      } ],\n      \"MemoryBytes\" : 8272408576\n    },\n    \"Engine\" : {\n      \"EngineVersion\" : \"17.06.0\",\n      \"Labels\" : {\n        \"foo\" : \"bar\"\n      },\n      \"Plugins\" : [ {\n        \"Name\" : \"awslogs\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"fluentd\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"gcplogs\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"gelf\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"journald\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"json-file\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"logentries\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"splunk\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"syslog\",\n        \"Type\" : \"Log\"\n      }, {\n        \"Name\" : \"bridge\",\n        \"Type\" : \"Network\"\n      }, {\n        \"Name\" : \"host\",\n        \"Type\" : \"Network\"\n      }, {\n        \"Name\" : \"ipvlan\",\n        \"Type\" : \"Network\"\n      }, {\n        \"Name\" : \"macvlan\",\n        \"Type\" : \"Network\"\n      }, {\n        \"Name\" : \"null\",\n        \"Type\" : \"Network\"\n      }, {\n        \"Name\" : \"overlay\",\n        \"Type\" : \"Network\"\n      }, {\n        \"Name\" : \"local\",\n        \"Type\" : \"Volume\"\n      }, {\n        \"Name\" : \"localhost:5000/vieux/sshfs:latest\",\n        \"Type\" : \"Volume\"\n      }, {\n        \"Name\" : \"vieux/sshfs:latest\",\n        \"Type\" : \"Volume\"\n      } ]\n    }\n  },\n  \"Version\" : {\n    \"Index\" : 373531\n  },\n  \"ManagerStatus\" : {\n    \"Leader\" : true,\n    \"Addr\" : \"10.0.0.46:2377\",\n    \"Reachability\" : \"reachable\"\n  },\n  \"CreatedAt\" : \"2016-08-18T10:44:24.496525531Z\",\n  \"ID\" : \"24ifsmvkjbyhk\",\n  \"Spec\" : {\n    \"Availability\" : \"active\",\n    \"Labels\" : {\n      \"foo\" : \"bar\"\n    },\n    \"Name\" : \"node-name\",\n    \"Role\" : \"manager\"\n  },\n  \"UpdatedAt\" : \"2017-08-09T07:09:37.632105588Z\"\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Node>>(exampleJson)
            : default(List<Node>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update a node
        /// </summary>
        /// <param name="id">The ID of the node</param>
        /// <param name="varVersion">The version number of the node object being updated. This is required to avoid conflicting writes.</param>
        /// <param name="nodeSpec"></param>
        /// <response code="200">no error</response>
        /// <response code="400">bad parameter</response>
        /// <response code="404">no such node</response>
        /// <response code="500">server error</response>
        /// <response code="503">node is not part of a swarm</response>
        [HttpPost]
        [Route("/v1.33/nodes/{id}/update")]
        [Consumes("application/json", "text/plain")]
        [ValidateModelState]
        [SwaggerOperation("NodeUpdate")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "bad parameter")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "no such node")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "server error")]
        [SwaggerResponse(statusCode: 503, type: typeof(ErrorResponse), description: "node is not part of a swarm")]
        public virtual IActionResult NodeUpdate([FromRoute (Name = "id")][Required]string id, [FromQuery (Name = "version")][Required()]long varVersion, [FromBody]NodeSpec nodeSpec)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 503 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(503, default(ErrorResponse));

            throw new NotImplementedException();
        }
    }
}
