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
    public class PublicationApiController : ControllerBase
    { 
        /// <summary>
        /// Get Publication ID
        /// </summary>
        /// <remarks>Returns the unique &#x60;publication_id&#x60; for the given &#x60;publication_slug&#x60;.  **Note:** You can find the &#x60;publication_slug&#x60; from the publication&#39;s homepage URL. - medium.com/_**publication_slug** </remarks>
        /// <param name="publicationSlug">It&#39;s a lowercased hyphen-separated unique string alloted to each Medium Publication.</param>
        /// <response code="200">OK</response>
        [HttpGet]
        [Route("/publication/id_for/{publication_slug}")]
        [ValidateModelState]
        [SwaggerOperation("PublicationIdForPublicationSlugGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(PublicationIdForPublicationSlugGet200Response), description: "OK")]
        public virtual IActionResult PublicationIdForPublicationSlugGet([FromRoute (Name = "publication_slug")][Required]string publicationSlug)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PublicationIdForPublicationSlugGet200Response));
            string exampleJson = null;
            exampleJson = "{\n  \"publication_id\" : \"29038077e4c6\",\n  \"publication_slug\" : \"codex\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PublicationIdForPublicationSlugGet200Response>(exampleJson)
            : default(PublicationIdForPublicationSlugGet200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get Publication Articles
        /// </summary>
        /// <remarks>Returns the list of &#x60;articles_ids&#x60;, of the latest 25 articles, posted in that publication. </remarks>
        /// <param name="publicationId">It&#39;s a unique hash id assigned to every Medium Publication.</param>
        /// <param name="from">To get the articles before specified date and time.</param>
        /// <response code="200">OK</response>
        [HttpGet]
        [Route("/publication/{publication_id}/articles")]
        [ValidateModelState]
        [SwaggerOperation("PublicationPublicationIdArticlesGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(PublicationPublicationIdArticlesGet200Response), description: "OK")]
        public virtual IActionResult PublicationPublicationIdArticlesGet([FromRoute (Name = "publication_id")][Required]string publicationId, [FromQuery (Name = "from")]string from)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PublicationPublicationIdArticlesGet200Response));
            string exampleJson = null;
            exampleJson = "{\n  \"publication_articles\" : [ \"67fa62fc1971\", \"67fa62fc1971\" ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PublicationPublicationIdArticlesGet200Response>(exampleJson)
            : default(PublicationPublicationIdArticlesGet200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get Publication Info
        /// </summary>
        /// <remarks>Returns the publication related information such as *Publication name, Tagline, Description, Tags, Followers Count, Twitter username, Instagram username, Facebook Page name, etc …*  **Note:** If you don&#39;t know the &#x60;publication_id&#x60;, you can get it from any article published by it. Use endpoint \&quot;/article/{article_id}\&quot; to retrieve the &#x60;publication_id&#x60;. </remarks>
        /// <param name="publicationId">It&#39;s a unique hash id assigned to every Medium Publication.</param>
        /// <response code="200">OK</response>
        [HttpGet]
        [Route("/publication/{publication_id}")]
        [ValidateModelState]
        [SwaggerOperation("PublicationPublicationIdGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(PublicationPublicationIdGet200Response), description: "OK")]
        public virtual IActionResult PublicationPublicationIdGet([FromRoute (Name = "publication_id")][Required]string publicationId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PublicationPublicationIdGet200Response));
            string exampleJson = null;
            exampleJson = "{\n  \"creator\" : \"8a819983d566\",\n  \"twitter_username\" : \"towards_AI\",\n  \"description\" : \"Towards AI is the world's leading AI and technology publication. Publishing unbiased AI and technology-related articles. Read by thought-leaders and decision-makers around the world.\",\n  \"url\" : \"pub.towardsai.net\",\n  \"tags\" : [ \"ARTIFICIAL INTELLIGENCE\", \"ARTIFICIAL INTELLIGENCE\" ],\n  \"followers\" : 25260,\n  \"facebook_pagename\" : \"towardsAl\",\n  \"name\" : \"Towards AI\",\n  \"tagline\" : \"The World's Leading AI and Technology Publication\",\n  \"id\" : \"98111c9905da\",\n  \"instagram_username\" : \"towards_ai\",\n  \"editors\" : [ \"aea8a19ea239\", \"aea8a19ea239\" ],\n  \"slug\" : \"towards-artificial-intelligence\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PublicationPublicationIdGet200Response>(exampleJson)
            : default(PublicationPublicationIdGet200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get Publication Newsletter
        /// </summary>
        /// <remarks>Returns the newsletter related information such as *id, name, description, slug, creator_id, subscribers, image_url, etc …*  **Note:** If you don&#39;t know the &#x60;publication_id&#x60;, you can get it from any article published by it. Use endpoint \&quot;/article/{article_id}\&quot; to retrieve the &#x60;publication_id&#x60;. </remarks>
        /// <param name="publicationId">It&#39;s a unique hash id assigned to every Medium Publication.</param>
        /// <response code="200">OK</response>
        [HttpGet]
        [Route("/publication/{publication_id}/newsletter")]
        [ValidateModelState]
        [SwaggerOperation("PublicationPublicationIdNewsletterGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(PublicationPublicationIdNewsletterGet200Response), description: "OK")]
        public virtual IActionResult PublicationPublicationIdNewsletterGet([FromRoute (Name = "publication_id")][Required]string publicationId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PublicationPublicationIdNewsletterGet200Response));
            string exampleJson = null;
            exampleJson = "{\n  \"image\" : \"https://miro.medium.com/1*j2OVd7j2o2FHeE7T8TzpXw.png\",\n  \"subscribers\" : 6752,\n  \"creator_id\" : \"aea8a19ea239\",\n  \"name\" : \"This AI newsletter is all you need\",\n  \"description\" : \"We have moved our newsletter. Subscribe → https://ws.towardsai.net/subscribe\",\n  \"id\" : \"d710a73cd042\",\n  \"slug\" : \"this-ai-newsletter-is-all-you-need\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PublicationPublicationIdNewsletterGet200Response>(exampleJson)
            : default(PublicationPublicationIdNewsletterGet200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
