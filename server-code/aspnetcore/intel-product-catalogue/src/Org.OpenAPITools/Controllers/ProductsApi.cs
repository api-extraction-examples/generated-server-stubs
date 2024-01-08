/*
 * Intel Product Catalogue Service
 *
 * This is the documentation for PIM Micro services. In order to use this tool you need to have Basic Auth credentials and a client id. If you dont have one, please make sure to request one by sending an email to the PIM MS team: [pim.360.team@intel.com](mailto:pim.360.team@intel.com?subject=PIMServices)
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: pim.360.team@intel.com
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
    public class ProductsApiController : ControllerBase
    { 
        /// <summary>
        /// 5. Get list of codename details for Intel products.
        /// </summary>
        /// <remarks>Use this to get codename details for Intel products. No pagination supported.</remarks>
        /// <param name="localeGeoId">Locale and Geo code used to get localised data.&lt;br/&gt;&lt;br/&gt;</param>
        /// <response code="200">successful operation</response>
        /// <response code="500">unsuccessful operation</response>
        [HttpGet]
        [Route("/api/products/get-codename")]
        [Authorize(Policy = "ClientId")]
        [ValidateModelState]
        [SwaggerOperation("GetCodeName")]
        [SwaggerResponse(statusCode: 200, type: typeof(CompleteCodenameLsit), description: "successful operation")]
        [SwaggerResponse(statusCode: 500, type: typeof(UnsuccessfulOperation), description: "unsuccessful operation")]
        public virtual IActionResult GetCodeName([FromQuery (Name = "locale_geo_id")][Required()]string localeGeoId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(CompleteCodenameLsit));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UnsuccessfulOperation));
            string exampleJson = null;
            exampleJson = "{\n  \"result\" : [ {\n    \"CodeNameId\" : \"37567\",\n    \"CodeNameText\" : \"Products formerly Tunnel Creek\",\n    \"CodeNameType\" : \"CODENAME\",\n    \"UrlText\" : \"Tunnel-Creek\"\n  }, {\n    \"CodeNameId\" : \"37567\",\n    \"CodeNameText\" : \"Products formerly Tunnel Creek\",\n    \"CodeNameType\" : \"CODENAME\",\n    \"UrlText\" : \"Tunnel-Creek\"\n  } ],\n  \"total_count\" : 909,\n  \"status\" : \"success\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<CompleteCodenameLsit>(exampleJson)
            : default(CompleteCodenameLsit);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 2. Get complete product info with product id.
        /// </summary>
        /// <remarks>Use this to get complete product info. No pagination supported.</remarks>
        /// <param name="localeGeoId">Locale and Geo code used to get localised data.&lt;br/&gt;&lt;br/&gt;</param>
        /// <param name="productId">Product id&#39;s that needs to be filtered. Only max of 40 products are supported now. Values must be enclosed in [ square brackets ] and each value must be in \&quot;double quotes\&quot;. Use comma to add multiple values.&lt;br/&gt;&lt;br/&gt;Example: [\&quot;223\&quot;,\&quot;224\&quot;]</param>
        /// <param name="includeReference">If send \&quot;true\&quot;, this will fetch variant/compatible info into result set. Default is false.</param>
        /// <response code="200">Successful operation.</response>
        /// <response code="500">unsuccessful operation</response>
        [HttpGet]
        [Route("/api/products/get-products-info")]
        [Authorize(Policy = "ClientId")]
        [ValidateModelState]
        [SwaggerOperation("GetProductInfo")]
        [SwaggerResponse(statusCode: 200, type: typeof(DetailedProductInformation), description: "Successful operation.")]
        [SwaggerResponse(statusCode: 500, type: typeof(UnsuccessfulOperation), description: "unsuccessful operation")]
        public virtual IActionResult GetProductInfo([FromQuery (Name = "locale_geo_id")][Required()]string localeGeoId, [FromQuery (Name = "product_id")][Required()]string productId, [FromQuery (Name = "include_reference")]string includeReference)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DetailedProductInformation));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UnsuccessfulOperation));
            string exampleJson = null;
            exampleJson = "{\n  \"result\" : [ null, null ],\n  \"total_count\" : 10,\n  \"status\" : \"success\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DetailedProductInformation>(exampleJson)
            : default(DetailedProductInformation);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 1. Find products by product id or category id
        /// </summary>
        /// <remarks>Use this to get basic details of products with pagination. Can be used to generate listing page for products.</remarks>
        /// <param name="localeGeoId">Locale and Geo code used to get localised data.&lt;br/&gt;&lt;br/&gt;</param>
        /// <param name="categoryId">Filter products based on one or multiple category id. Either category id or product id is mandatory for any request. Values must be enclosed in [ square brackets ] and each value must be in \&quot;double quotes\&quot;. Use comma to add multiple values. &lt;br/&gt;&lt;br/&gt;Example: [\&quot;873\&quot;]&lt;br/&gt;&lt;br/&gt;Categories Available:&lt;br/&gt; Processors &#x3D; 873, Server Products &#x3D; 1201, Mini PC&#39;s &#x3D; 98414, Wireless Networking &#x3D; 59485, Ethernet Products &#x3D; 36773, Fabric products &#x3D; 70021, Memory and Storage &#x3D; 35125, Chipsets &#x3D; 53, Graphics Drivers &#x3D; 80939 &lt;br/&gt;&lt;br/&gt;</param>
        /// <param name="productId">Filter products based on one or multiple product id. Either category id or product id is mandatory for any request. Values must be enclosed in [ square brackets ] and each value must be in \&quot;double quotes\&quot;. Use comma to add multiple values. &lt;br/&gt;&lt;br/&gt;Example: [\&quot;123003\&quot;]&lt;br/&gt;&lt;br/&gt;</param>
        /// <param name="highlights">Specification values which needs to be pulled from product data. Values must be enclosed in [ square brackets ] and each value must be in \&quot;double quotes\&quot;. Use comma to add multiple values. &lt;br/&gt;&lt;br/&gt;Example: [\&quot;CoreCount\&quot;, \&quot;StatusCodeText\&quot;]&lt;br/&gt;&lt;br/&gt;</param>
        /// <param name="sort">Indicates sorting fields. Accepts array of objects in format like: [{\&quot;field\&quot;:\&quot;name\&quot;,\&quot;order\&quot;:\&quot;ASC\&quot;}].&lt;br/&gt;&lt;br/&gt;Any specification that we get from get-product-info can be used to sort result. Other generic sort field is \&quot;name\&quot;.&lt;br/&gt;&lt;br/&gt;</param>
        /// <param name="filters">Allows to filter data.&lt;br/&gt;&lt;br/&gt;Format of filter: [{\&quot;type\&quot;:\&quot;specvalue\&quot;,\&quot;name\&quot;:\&quot;ThreadCount\&quot;,\&quot;gteq\&quot;:\&quot;4\&quot;}]&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Available operators are:&lt;/b&gt; \&quot;eq\&quot;: equal to, \&quot;neq\&quot;: not equal to, \&quot;lteq\&quot;: less than or equal to, \&quot;gteq\&quot;: greater than or equal to, \&quot;swc\&quot;: starts with characters, \&quot;nswc\&quot;: not starting with characters, \&quot;cts\&quot;: contains, \&quot;ncts\&quot;: not contains&lt;br/&gt;&lt;br/&gt;&lt;b&gt;Conditions:&lt;/b&gt; By default all objects works on an AND condition. But inside an object we have the capability to put an \&quot;OR\&quot; or \&quot;AND\&quot; condition.&lt;br/&gt;Example conditions: [{\&quot;type\&quot;:\&quot;specvalue\&quot;,\&quot;name\&quot;:\&quot;ThreadCount\&quot;,\&quot;ncts\&quot;:\&quot;4,5\&quot;,\&quot;cond\&quot;:\&quot;AND\&quot;}]&lt;br/&gt;&lt;br/&gt;&lt;br/&gt;</param>
        /// <param name="perPage">Filter number of products in response to desired size.</param>
        /// <param name="pageNo">Indicates page number for pagination of results.</param>
        /// <response code="200">successful operation</response>
        /// <response code="500">unsuccessful operation</response>
        [HttpGet]
        [Route("/api/products/get-products")]
        [Authorize(Policy = "ClientId")]
        [ValidateModelState]
        [SwaggerOperation("GetProductList")]
        [SwaggerResponse(statusCode: 200, type: typeof(ProductListingLevelInfo), description: "successful operation")]
        [SwaggerResponse(statusCode: 500, type: typeof(UnsuccessfulOperation), description: "unsuccessful operation")]
        public virtual IActionResult GetProductList([FromQuery (Name = "locale_geo_id")][Required()]string localeGeoId, [FromQuery (Name = "category_id")]string categoryId, [FromQuery (Name = "product_id")]string productId, [FromQuery (Name = "highlights")]string highlights, [FromQuery (Name = "sort")]string sort, [FromQuery (Name = "filters")]string filters, [FromQuery (Name = "per_page")]int? perPage, [FromQuery (Name = "page_no")]int? pageNo)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ProductListingLevelInfo));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UnsuccessfulOperation));
            string exampleJson = null;
            exampleJson = "{\n  \"result\" : [ {\n    \"product_name_raw\" : \"Intel® Xeon® Gold 5122 Processor (16.5M Cache, 3.60 GHz)\",\n    \"product_id\" : \"120475\",\n    \"highlights_info\" : [ {\n      \"highlight_key\" : \"StatusCodeText\",\n      \"raw_value\" : \"4\",\n      \"label\" : \"Status\",\n      \"value\" : \"Launched\"\n    }, {\n      \"highlight_key\" : \"StatusCodeText\",\n      \"raw_value\" : \"4\",\n      \"label\" : \"Status\",\n      \"value\" : \"Launched\"\n    } ],\n    \"mktg_prd_type\" : \"18\",\n    \"product_on_market_date\" : \"2017-07-11T00:00:00:000-0400\",\n    \"created_date\" : \"2018-04-17T08:29:13:770-0400\",\n    \"product_manufacturer\" : \"Intel\",\n    \"updated_date\" : \"2018-10-11T07:20:11:500-0400\",\n    \"product_description\" : \"Intel® Xeon® Gold 5122 Processor (16.5M Cache, 3.60 GHz)\",\n    \"product_name\" : \"Intel® Xeon® Gold 5122 Processor (16.5M Cache, 3.60 GHz)\",\n    \"product_category\" : [ \"51163\", \"12201\" ]\n  }, {\n    \"product_name_raw\" : \"Intel® Xeon® Gold 5122 Processor (16.5M Cache, 3.60 GHz)\",\n    \"product_id\" : \"120475\",\n    \"highlights_info\" : [ {\n      \"highlight_key\" : \"StatusCodeText\",\n      \"raw_value\" : \"4\",\n      \"label\" : \"Status\",\n      \"value\" : \"Launched\"\n    }, {\n      \"highlight_key\" : \"StatusCodeText\",\n      \"raw_value\" : \"4\",\n      \"label\" : \"Status\",\n      \"value\" : \"Launched\"\n    } ],\n    \"mktg_prd_type\" : \"18\",\n    \"product_on_market_date\" : \"2017-07-11T00:00:00:000-0400\",\n    \"created_date\" : \"2018-04-17T08:29:13:770-0400\",\n    \"product_manufacturer\" : \"Intel\",\n    \"updated_date\" : \"2018-10-11T07:20:11:500-0400\",\n    \"product_description\" : \"Intel® Xeon® Gold 5122 Processor (16.5M Cache, 3.60 GHz)\",\n    \"product_name\" : \"Intel® Xeon® Gold 5122 Processor (16.5M Cache, 3.60 GHz)\",\n    \"product_category\" : [ \"51163\", \"12201\" ]\n  } ],\n  \"per_page\" : 10,\n  \"total_count\" : 230,\n  \"page_no\" : \"1\",\n  \"status\" : \"success\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ProductListingLevelInfo>(exampleJson)
            : default(ProductListingLevelInfo);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 3. Get ordering info for product id&#39;s requested.
        /// </summary>
        /// <remarks>Use this to fetch ordering info details for Intel products. No pagination supported.</remarks>
        /// <param name="productId">Filter ordering info details based on one or multiple product id&#39;s. Values must be enclosed in [ square brackets ] and each value must be in \&quot;double quotes\&quot;. Use comma to add multiple values. &lt;br/&gt;&lt;br/&gt;Example: [\&quot;123003\&quot;]</param>
        /// <param name="localeGeoId">Locale and Geo code used to get localised data.&lt;br/&gt;&lt;br/&gt;</param>
        /// <response code="200">successful operation</response>
        /// <response code="500">unsuccessful operation</response>
        [HttpGet]
        [Route("/api/products/get-ordering-info")]
        [Authorize(Policy = "ClientId")]
        [ValidateModelState]
        [SwaggerOperation("Getorderinginfo")]
        [SwaggerResponse(statusCode: 200, type: typeof(DetailedOrderingLevelInfo), description: "successful operation")]
        [SwaggerResponse(statusCode: 500, type: typeof(UnsuccessfulOperation), description: "unsuccessful operation")]
        public virtual IActionResult Getorderinginfo([FromQuery (Name = "product_id")][Required()]string productId, [FromQuery (Name = "locale_geo_id")][Required()]string localeGeoId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DetailedOrderingLevelInfo));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(UnsuccessfulOperation));
            string exampleJson = null;
            exampleJson = "{\n  \"result\" : [ {\n    \"product_id\" : \"123003\",\n    \"attributes\" : [ {\n      \"highlight_key\" : \"OrderingCode\",\n      \"tool_tip\" : \"tool tip\",\n      \"raw_value\" : \"CM8068403377111\",\n      \"label\" : \"Ordering Code\",\n      \"value\" : \"CM8068403377111\"\n    }, {\n      \"highlight_key\" : \"OrderingCode\",\n      \"tool_tip\" : \"tool tip\",\n      \"raw_value\" : \"CM8068403377111\",\n      \"label\" : \"Ordering Code\",\n      \"value\" : \"CM8068403377111\"\n    } ]\n  }, {\n    \"product_id\" : \"123003\",\n    \"attributes\" : [ {\n      \"highlight_key\" : \"OrderingCode\",\n      \"tool_tip\" : \"tool tip\",\n      \"raw_value\" : \"CM8068403377111\",\n      \"label\" : \"Ordering Code\",\n      \"value\" : \"CM8068403377111\"\n    }, {\n      \"highlight_key\" : \"OrderingCode\",\n      \"tool_tip\" : \"tool tip\",\n      \"raw_value\" : \"CM8068403377111\",\n      \"label\" : \"Ordering Code\",\n      \"value\" : \"CM8068403377111\"\n    } ]\n  } ],\n  \"total_count\" : 1,\n  \"status\" : \"success\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DetailedOrderingLevelInfo>(exampleJson)
            : default(DetailedOrderingLevelInfo);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}