/*
 * Instagram API
 *
 * Description of Instagram RESTful API.  Current limitations:   * Instagram service does not support [cross origin headers](https://developer.mozilla.org/en-US/docs/Web/HTTP/Access_control_CORS)   for security reasons, therefore it is not possible to use Swagger UI and make API calls directly from browser.   * Modification API requests (`POST`, `DELETE`) require additional security [scopes](https://instagram.com/developer/authorization/)   that are available for Apps [created on or after Nov 17, 2015](http://instagram.com/developer/review/) and   started in [Sandbox Mode](http://instagram.com/developer/sandbox/).   * Consider the [Instagram limitations](https://instagram.com/developer/limits/) for API calls that depends on App Mode.  **Warning:** For Apps [created on or after Nov 17, 2015](http://instagram.com/developer/changelog/) API responses containing media objects no longer return the `data` field in `comments` and `likes` nodes.  Last update: 2015-11-28 
 *
 * The version of the OpenAPI document: 1.0.0
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
    public class TagsApiController : ControllerBase
    { 
        /// <summary>
        /// Search for tags by name.
        /// </summary>
        /// <remarks>Search for tags by name.</remarks>
        /// <param name="q">A valid tag name without a leading \\#. (eg. snowy, nofilter)</param>
        /// <response code="200">List of found tags and their statistics.</response>
        [HttpGet]
        [Route("/v1/tags/search")]
        [Authorize(Policy = "api_key")]
        [ValidateModelState]
        [SwaggerOperation("TagsSearchGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(TagSearchResponse), description: "List of found tags and their statistics.")]
        public virtual IActionResult TagsSearchGet([FromQuery (Name = "q")][Required()]string q)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TagSearchResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : [ {\n    \"media_count\" : 0,\n    \"name\" : \"name\"\n  }, {\n    \"media_count\" : 0,\n    \"name\" : \"name\"\n  } ],\n  \"meta\" : {\n    \"code\" : 3\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TagSearchResponse>(exampleJson)
            : default(TagSearchResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get information about a tag object.
        /// </summary>
        /// <remarks>Get information about a tag object.</remarks>
        /// <param name="tagName">The tag name.</param>
        /// <response code="200">Tag information response.</response>
        [HttpGet]
        [Route("/v1/tags/{tag-name}")]
        [Authorize(Policy = "api_key")]
        [ValidateModelState]
        [SwaggerOperation("TagsTagNameGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(TagInfoResponse), description: "Tag information response.")]
        public virtual IActionResult TagsTagNameGet([FromRoute (Name = "tag-name")][Required]string tagName)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TagInfoResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : {\n    \"media_count\" : 0,\n    \"name\" : \"name\"\n  },\n  \"meta\" : {\n    \"code\" : 3\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TagInfoResponse>(exampleJson)
            : default(TagInfoResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get a list of recently tagged media.
        /// </summary>
        /// <remarks>Get a list of recently tagged media. Use the &#x60;max_tag_id&#x60; and &#x60;min_tag_id&#x60; parameters in the pagination response to paginate through these objects. </remarks>
        /// <param name="tagName">The tag name.</param>
        /// <param name="count">Count of tagged media to return.</param>
        /// <param name="minTagId">Return media before this &#x60;min_tag_id&#x60;.</param>
        /// <param name="maxTagId">Return media after this &#x60;max_tag_id&#x60;.</param>
        /// <response code="200">List of media entries with this tag.</response>
        [HttpGet]
        [Route("/v1/tags/{tag-name}/media/recent")]
        [Authorize(Policy = "api_key")]
        [ValidateModelState]
        [SwaggerOperation("TagsTagNameMediaRecentGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(TagMediaListResponse), description: "List of media entries with this tag.")]
        public virtual IActionResult TagsTagNameMediaRecentGet([FromRoute (Name = "tag-name")][Required]string tagName, [FromQuery (Name = "count")]int? count, [FromQuery (Name = "min_tag_id")]string minTagId, [FromQuery (Name = "max_tag_id")]string maxTagId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TagMediaListResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"pagination\" : {\n    \"next_min_id\" : \"next_min_id\",\n    \"next_url\" : \"next_url\",\n    \"next_max_id\" : \"next_max_id\",\n    \"min_tag_id\" : \"min_tag_id\",\n    \"next_max_tag_id\" : \"next_max_tag_id\",\n    \"deprecation_warning\" : \"deprecation_warning\"\n  },\n  \"data\" : [ {\n    \"created_time\" : \"created_time\",\n    \"images\" : {\n      \"thumbnail\" : {\n        \"width\" : 1,\n        \"url\" : \"url\",\n        \"height\" : 6\n      },\n      \"low_resolution\" : {\n        \"width\" : 1,\n        \"url\" : \"url\",\n        \"height\" : 6\n      },\n      \"standard_resolution\" : {\n        \"width\" : 1,\n        \"url\" : \"url\",\n        \"height\" : 6\n      }\n    },\n    \"comments\" : {\n      \"data\" : [ {\n        \"created_time\" : \"created_time\",\n        \"from\" : {\n          \"full_name\" : \"full_name\",\n          \"profile_picture\" : \"profile_picture\",\n          \"id\" : \"id\",\n          \"username\" : \"username\"\n        },\n        \"id\" : \"id\",\n        \"text\" : \"text\"\n      }, {\n        \"created_time\" : \"created_time\",\n        \"from\" : {\n          \"full_name\" : \"full_name\",\n          \"profile_picture\" : \"profile_picture\",\n          \"id\" : \"id\",\n          \"username\" : \"username\"\n        },\n        \"id\" : \"id\",\n        \"text\" : \"text\"\n      } ],\n      \"count\" : 0\n    },\n    \"users_in_photo\" : [ {\n      \"position\" : {\n        \"x\" : 7.0614014,\n        \"y\" : 9.301444\n      },\n      \"user\" : {\n        \"full_name\" : \"full_name\",\n        \"profile_picture\" : \"profile_picture\",\n        \"id\" : \"id\",\n        \"username\" : \"username\"\n      }\n    }, {\n      \"position\" : {\n        \"x\" : 7.0614014,\n        \"y\" : 9.301444\n      },\n      \"user\" : {\n        \"full_name\" : \"full_name\",\n        \"profile_picture\" : \"profile_picture\",\n        \"id\" : \"id\",\n        \"username\" : \"username\"\n      }\n    } ],\n    \"user_has_liked\" : true,\n    \"link\" : \"link\",\n    \"caption\" : {\n      \"created_time\" : \"created_time\",\n      \"from\" : {\n        \"full_name\" : \"full_name\",\n        \"profile_picture\" : \"profile_picture\",\n        \"id\" : \"id\",\n        \"username\" : \"username\"\n      },\n      \"id\" : \"id\",\n      \"text\" : \"text\"\n    },\n    \"videos\" : {\n      \"low_resolution\" : {\n        \"width\" : 1,\n        \"url\" : \"url\",\n        \"height\" : 6\n      },\n      \"standard_resolution\" : {\n        \"width\" : 1,\n        \"url\" : \"url\",\n        \"height\" : 6\n      }\n    },\n    \"type\" : \"image\",\n    \"tags\" : [ \"tags\", \"tags\" ],\n    \"filter\" : \"filter\",\n    \"attribution\" : \"attribution\",\n    \"location\" : {\n      \"latitude\" : 5.637376656633329,\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"longitude\" : 2.3021358869347655\n    },\n    \"id\" : \"id\",\n    \"user\" : {\n      \"full_name\" : \"full_name\",\n      \"profile_picture\" : \"profile_picture\",\n      \"id\" : \"id\",\n      \"username\" : \"username\"\n    },\n    \"likes\" : {\n      \"data\" : [ {\n        \"full_name\" : \"full_name\",\n        \"profile_picture\" : \"profile_picture\",\n        \"id\" : \"id\",\n        \"username\" : \"username\"\n      }, {\n        \"full_name\" : \"full_name\",\n        \"profile_picture\" : \"profile_picture\",\n        \"id\" : \"id\",\n        \"username\" : \"username\"\n      } ],\n      \"count\" : 5\n    }\n  }, {\n    \"created_time\" : \"created_time\",\n    \"images\" : {\n      \"thumbnail\" : {\n        \"width\" : 1,\n        \"url\" : \"url\",\n        \"height\" : 6\n      },\n      \"low_resolution\" : {\n        \"width\" : 1,\n        \"url\" : \"url\",\n        \"height\" : 6\n      },\n      \"standard_resolution\" : {\n        \"width\" : 1,\n        \"url\" : \"url\",\n        \"height\" : 6\n      }\n    },\n    \"comments\" : {\n      \"data\" : [ {\n        \"created_time\" : \"created_time\",\n        \"from\" : {\n          \"full_name\" : \"full_name\",\n          \"profile_picture\" : \"profile_picture\",\n          \"id\" : \"id\",\n          \"username\" : \"username\"\n        },\n        \"id\" : \"id\",\n        \"text\" : \"text\"\n      }, {\n        \"created_time\" : \"created_time\",\n        \"from\" : {\n          \"full_name\" : \"full_name\",\n          \"profile_picture\" : \"profile_picture\",\n          \"id\" : \"id\",\n          \"username\" : \"username\"\n        },\n        \"id\" : \"id\",\n        \"text\" : \"text\"\n      } ],\n      \"count\" : 0\n    },\n    \"users_in_photo\" : [ {\n      \"position\" : {\n        \"x\" : 7.0614014,\n        \"y\" : 9.301444\n      },\n      \"user\" : {\n        \"full_name\" : \"full_name\",\n        \"profile_picture\" : \"profile_picture\",\n        \"id\" : \"id\",\n        \"username\" : \"username\"\n      }\n    }, {\n      \"position\" : {\n        \"x\" : 7.0614014,\n        \"y\" : 9.301444\n      },\n      \"user\" : {\n        \"full_name\" : \"full_name\",\n        \"profile_picture\" : \"profile_picture\",\n        \"id\" : \"id\",\n        \"username\" : \"username\"\n      }\n    } ],\n    \"user_has_liked\" : true,\n    \"link\" : \"link\",\n    \"caption\" : {\n      \"created_time\" : \"created_time\",\n      \"from\" : {\n        \"full_name\" : \"full_name\",\n        \"profile_picture\" : \"profile_picture\",\n        \"id\" : \"id\",\n        \"username\" : \"username\"\n      },\n      \"id\" : \"id\",\n      \"text\" : \"text\"\n    },\n    \"videos\" : {\n      \"low_resolution\" : {\n        \"width\" : 1,\n        \"url\" : \"url\",\n        \"height\" : 6\n      },\n      \"standard_resolution\" : {\n        \"width\" : 1,\n        \"url\" : \"url\",\n        \"height\" : 6\n      }\n    },\n    \"type\" : \"image\",\n    \"tags\" : [ \"tags\", \"tags\" ],\n    \"filter\" : \"filter\",\n    \"attribution\" : \"attribution\",\n    \"location\" : {\n      \"latitude\" : 5.637376656633329,\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"longitude\" : 2.3021358869347655\n    },\n    \"id\" : \"id\",\n    \"user\" : {\n      \"full_name\" : \"full_name\",\n      \"profile_picture\" : \"profile_picture\",\n      \"id\" : \"id\",\n      \"username\" : \"username\"\n    },\n    \"likes\" : {\n      \"data\" : [ {\n        \"full_name\" : \"full_name\",\n        \"profile_picture\" : \"profile_picture\",\n        \"id\" : \"id\",\n        \"username\" : \"username\"\n      }, {\n        \"full_name\" : \"full_name\",\n        \"profile_picture\" : \"profile_picture\",\n        \"id\" : \"id\",\n        \"username\" : \"username\"\n      } ],\n      \"count\" : 5\n    }\n  } ],\n  \"meta\" : {\n    \"code\" : 3\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TagMediaListResponse>(exampleJson)
            : default(TagMediaListResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
