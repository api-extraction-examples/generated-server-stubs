/*
 * Medium API
 *
 * Medium API helps you to quickly extract data from Medium's Website (https://medium.com).   You can gather data related to users, publications, articles (including its textual content), latest posts &amp; top writers within a topic/niche, etc… 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: nishu@mediumapi.com
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
    public class SearchApiController : ControllerBase
    { 
        /// <summary>
        /// Search Articles
        /// </summary>
        /// <remarks>Returns the list of &#x60;articles_ids&#x60; for the given search query results. (Max Length &#x3D; 1000) </remarks>
        /// <param name="query">Search query</param>
        /// <response code="200">OK</response>
        [HttpGet]
        [Route("/search/articles/query={query}")]
        [ValidateModelState]
        [SwaggerOperation("SearchArticlesqueryqueryGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(SearchArticlesQueryQueryGet200Response), description: "OK")]
        public virtual IActionResult SearchArticlesqueryqueryGet([FromQuery (Name = "query")][Required()]string query)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(SearchArticlesQueryQueryGet200Response));
            string exampleJson = null;
            exampleJson = "{\n  \"search_query\" : \"startup\",\n  \"articles\" : [ \"6556feb21311\", \"6556feb21311\" ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<SearchArticlesQueryQueryGet200Response>(exampleJson)
            : default(SearchArticlesQueryQueryGet200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Search Lists
        /// </summary>
        /// <remarks>Returns an array of &#x60;list_ids&#x60; for the given search query results. (Max Length &#x3D; 1000) </remarks>
        /// <param name="query">Search query</param>
        /// <response code="200">OK</response>
        [HttpGet]
        [Route("/search/lists/query={query}")]
        [ValidateModelState]
        [SwaggerOperation("SearchListsqueryqueryGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(SearchListsQueryQueryGet200Response), description: "OK")]
        public virtual IActionResult SearchListsqueryqueryGet([FromQuery (Name = "query")][Required()]string query)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(SearchListsQueryQueryGet200Response));
            string exampleJson = null;
            exampleJson = "{\n  \"lists\" : [ \"a8266c175cda\", \"a8266c175cda\" ],\n  \"search_query\" : \"artificial intelligence\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<SearchListsQueryQueryGet200Response>(exampleJson)
            : default(SearchListsQueryQueryGet200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Search Publications
        /// </summary>
        /// <remarks>Returns the list of &#x60;publication_ids&#x60; for the given search query results. (Max Length &#x3D; 1000) </remarks>
        /// <param name="query">Search query</param>
        /// <response code="200">OK</response>
        [HttpGet]
        [Route("/search/publications/query={query}")]
        [ValidateModelState]
        [SwaggerOperation("SearchPublicationsqueryqueryGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(SearchPublicationsQueryQueryGet200Response), description: "OK")]
        public virtual IActionResult SearchPublicationsqueryqueryGet([FromQuery (Name = "query")][Required()]string query)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(SearchPublicationsQueryQueryGet200Response));
            string exampleJson = null;
            exampleJson = "{\n  \"search_query\" : \"mental health\",\n  \"publications\" : [ \"8d6b8a439e32\", \"8d6b8a439e32\" ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<SearchPublicationsQueryQueryGet200Response>(exampleJson)
            : default(SearchPublicationsQueryQueryGet200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Search Tags
        /// </summary>
        /// <remarks>Returns a list of &#x60;tags&#x60; for the given search query results. (Max Length &#x3D; 1000) </remarks>
        /// <param name="query">Search query</param>
        /// <response code="200">OK</response>
        [HttpGet]
        [Route("/search/tags/query={query}")]
        [ValidateModelState]
        [SwaggerOperation("SearchTagsqueryqueryGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(SearchTagsQueryQueryGet200Response), description: "OK")]
        public virtual IActionResult SearchTagsqueryqueryGet([FromQuery (Name = "query")][Required()]string query)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(SearchTagsQueryQueryGet200Response));
            string exampleJson = null;
            exampleJson = "{\n  \"search_query\" : \"blockchain\",\n  \"tags\" : [ \"blockchain-technology\", \"blockchain-technology\" ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<SearchTagsQueryQueryGet200Response>(exampleJson)
            : default(SearchTagsQueryQueryGet200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Search Users
        /// </summary>
        /// <remarks>Returns a list of &#x60;user_ids&#x60; for the given search query results. (Max Length &#x3D; 1000) </remarks>
        /// <param name="query">Search query</param>
        /// <response code="200">OK</response>
        [HttpGet]
        [Route("/search/users/query={query}")]
        [ValidateModelState]
        [SwaggerOperation("SearchUsersqueryqueryGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(SearchUsersQueryQueryGet200Response), description: "OK")]
        public virtual IActionResult SearchUsersqueryqueryGet([FromQuery (Name = "query")][Required()]string query)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(SearchUsersQueryQueryGet200Response));
            string exampleJson = null;
            exampleJson = "{\n  \"search_query\" : \"data engineer\",\n  \"users\" : [ \"1985b61817c3\", \"1985b61817c3\" ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<SearchUsersQueryQueryGet200Response>(exampleJson)
            : default(SearchUsersQueryQueryGet200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
