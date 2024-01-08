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
    public class ListApiController : ControllerBase
    { 
        /// <summary>
        /// Get List Articles
        /// </summary>
        /// <remarks>Returns an array of &#x60;articles_ids&#x60; present in the given Medium List. </remarks>
        /// <param name="listId">It&#39;s a unique hash id assigned to every Medium List.</param>
        /// <response code="200">OK</response>
        [HttpGet]
        [Route("/list/{list_id}/articles")]
        [ValidateModelState]
        [SwaggerOperation("ListListIdArticlesGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(ListListIdArticlesGet200Response), description: "OK")]
        public virtual IActionResult ListListIdArticlesGet([FromRoute (Name = "list_id")][Required]string listId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ListListIdArticlesGet200Response));
            string exampleJson = null;
            exampleJson = "{\n  \"list_articles\" : [ \"90a01549d8db\", \"90a01549d8db\" ],\n  \"id\" : \"38f9e0f9bea6\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ListListIdArticlesGet200Response>(exampleJson)
            : default(ListListIdArticlesGet200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get List Info
        /// </summary>
        /// <remarks>Returns the list-related information such as *id, name, author, description,  thumbnail image url, creation datetime, last article inserted datetime,  number of articles in the list, claps, voters, and comments/responses*. </remarks>
        /// <param name="listId">It&#39;s a unique hash id assigned to every Medium List.</param>
        /// <response code="200">OK</response>
        [HttpGet]
        [Route("/list/{list_id}")]
        [ValidateModelState]
        [SwaggerOperation("ListListIdGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(ListListIdGet200Response), description: "OK")]
        public virtual IActionResult ListListIdGet([FromRoute (Name = "list_id")][Required]string listId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ListListIdGet200Response));
            string exampleJson = null;
            exampleJson = "{\n  \"last_item_inserted_at\" : \"2023-03-12 06:53:02\",\n  \"thumbnail\" : \"https://miro.medium.com/0*8f634a2860234802375db89fbfcccb5cc717f3fd.jpeg\",\n  \"responses_count\" : 1,\n  \"voters\" : 1,\n  \"author\" : \"1985b61817c3\",\n  \"count\" : 18,\n  \"name\" : \"Medium API\",\n  \"created_at\" : \"2023-03-12 06:46:46\",\n  \"description\" : \"Collections of all the articles and resources related to Medium API\",\n  \"id\" : \"38f9e0f9bea6\",\n  \"claps\" : 48\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ListListIdGet200Response>(exampleJson)
            : default(ListListIdGet200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get List Responses
        /// </summary>
        /// <remarks>Returns an array of &#x60;response_ids&#x60; of the comments (same as &#x60;article_ids&#x60;) on the given Medium List. </remarks>
        /// <param name="listId">It&#39;s a unique hash id assigned to every Medium List.</param>
        /// <response code="200">OK</response>
        [HttpGet]
        [Route("/list/{list_id}/responses")]
        [ValidateModelState]
        [SwaggerOperation("ListListIdResponsesGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(ListListIdResponsesGet200Response), description: "OK")]
        public virtual IActionResult ListListIdResponsesGet([FromRoute (Name = "list_id")][Required]string listId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ListListIdResponsesGet200Response));
            string exampleJson = null;
            exampleJson = "{\n  \"responses\" : [ \"f31a257b42e8\", \"f31a257b42e8\" ],\n  \"id\" : \"38f9e0f9bea6\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ListListIdResponsesGet200Response>(exampleJson)
            : default(ListListIdResponsesGet200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
