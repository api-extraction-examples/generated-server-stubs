/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * The version of the OpenAPI document: v1.9.0
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
    public class ReturnPolicyApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>This method creates a new return policy where the policy encapsulates seller&#39;s terms for returning items.  &lt;br/&gt;&lt;br/&gt;Each policy targets a specific marketplace, and you can create multiple policies for each marketplace. Return policies are not applicable to motor-vehicle listings.&lt;br/&gt;&lt;br/&gt;A successful request returns the &lt;b&gt;getReturnPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/seller-accounts/business-policies.html\&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;</remarks>
        /// <param name="returnPolicyRequest">Return policy request</param>
        /// <response code="201">Created</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpPost]
        [Route("/sell/account/v1/return_policy")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("CreateReturnPolicy")]
        [SwaggerResponse(statusCode: 201, type: typeof(SetReturnPolicyResponse), description: "Created")]
        public virtual IActionResult CreateReturnPolicy([FromBody]ReturnPolicyRequest returnPolicyRequest)
        {

            //TODO: Uncomment the next line to return response 201 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(201, default(SetReturnPolicyResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500);
            string exampleJson = null;
            exampleJson = "{\n  \"returnShippingCostPayer\" : \"returnShippingCostPayer\",\n  \"categoryTypes\" : [ {\n    \"default\" : true,\n    \"name\" : \"name\"\n  }, {\n    \"default\" : true,\n    \"name\" : \"name\"\n  } ],\n  \"refundMethod\" : \"refundMethod\",\n  \"warnings\" : [ {\n    \"domain\" : \"domain\",\n    \"subdomain\" : \"subdomain\",\n    \"outputRefIds\" : [ \"outputRefIds\", \"outputRefIds\" ],\n    \"errorId\" : 0,\n    \"inputRefIds\" : [ \"inputRefIds\", \"inputRefIds\" ],\n    \"category\" : \"category\",\n    \"longMessage\" : \"longMessage\",\n    \"message\" : \"message\",\n    \"parameters\" : [ {\n      \"name\" : \"name\",\n      \"value\" : \"value\"\n    }, {\n      \"name\" : \"name\",\n      \"value\" : \"value\"\n    } ]\n  }, {\n    \"domain\" : \"domain\",\n    \"subdomain\" : \"subdomain\",\n    \"outputRefIds\" : [ \"outputRefIds\", \"outputRefIds\" ],\n    \"errorId\" : 0,\n    \"inputRefIds\" : [ \"inputRefIds\", \"inputRefIds\" ],\n    \"category\" : \"category\",\n    \"longMessage\" : \"longMessage\",\n    \"message\" : \"message\",\n    \"parameters\" : [ {\n      \"name\" : \"name\",\n      \"value\" : \"value\"\n    }, {\n      \"name\" : \"name\",\n      \"value\" : \"value\"\n    } ]\n  } ],\n  \"description\" : \"description\",\n  \"restockingFeePercentage\" : \"restockingFeePercentage\",\n  \"returnInstructions\" : \"returnInstructions\",\n  \"returnPeriod\" : {\n    \"unit\" : \"unit\",\n    \"value\" : 0\n  },\n  \"marketplaceId\" : \"marketplaceId\",\n  \"internationalOverride\" : {\n    \"returnShippingCostPayer\" : \"returnShippingCostPayer\",\n    \"returnMethod\" : \"returnMethod\",\n    \"returnsAccepted\" : true,\n    \"returnPeriod\" : {\n      \"unit\" : \"unit\",\n      \"value\" : 0\n    }\n  },\n  \"returnMethod\" : \"returnMethod\",\n  \"returnPolicyId\" : \"returnPolicyId\",\n  \"name\" : \"name\",\n  \"returnsAccepted\" : true,\n  \"extendedHolidayReturnsOffered\" : true\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<SetReturnPolicyResponse>(exampleJson)
            : default(SetReturnPolicyResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>This method deletes a return policy. Supply the ID of the policy you want to delete in the &lt;b&gt;returnPolicyId&lt;/b&gt; path parameter.</remarks>
        /// <param name="returnPolicyId">This path parameter specifies the ID of the return policy you want to delete.</param>
        /// <response code="204">No Content</response>
        /// <response code="400">Bad Request</response>
        /// <response code="404">Not Found</response>
        /// <response code="409">Conflict</response>
        /// <response code="500">Internal Server Error</response>
        [HttpDelete]
        [Route("/sell/account/v1/return_policy/{return_policy_id}")]
        [ValidateModelState]
        [SwaggerOperation("DeleteReturnPolicy")]
        public virtual IActionResult DeleteReturnPolicy([FromRoute (Name = "return_policy_id")][Required]string returnPolicyId)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409);
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500);

            throw new NotImplementedException();
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>This method retrieves all the return policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.  &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policies for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get the policies for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot; target&#x3D;\&quot;_blank\&quot;&gt;HTTP request headers&lt;/a&gt;.</remarks>
        /// <param name="marketplaceId">This query parameter specifies the ID of the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum</param>
        /// <response code="200">Success</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("/sell/account/v1/return_policy")]
        [ValidateModelState]
        [SwaggerOperation("GetReturnPolicies")]
        [SwaggerResponse(statusCode: 200, type: typeof(ReturnPolicyResponse), description: "Success")]
        public virtual IActionResult GetReturnPolicies([FromQuery (Name = "marketplace_id")][Required()]string marketplaceId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ReturnPolicyResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500);
            string exampleJson = null;
            exampleJson = "{\n  \"next\" : \"next\",\n  \"total\" : 1,\n  \"offset\" : 6,\n  \"prev\" : \"prev\",\n  \"limit\" : 0,\n  \"returnPolicies\" : [ {\n    \"returnShippingCostPayer\" : \"returnShippingCostPayer\",\n    \"categoryTypes\" : [ {\n      \"default\" : true,\n      \"name\" : \"name\"\n    }, {\n      \"default\" : true,\n      \"name\" : \"name\"\n    } ],\n    \"refundMethod\" : \"refundMethod\",\n    \"description\" : \"description\",\n    \"restockingFeePercentage\" : \"restockingFeePercentage\",\n    \"returnInstructions\" : \"returnInstructions\",\n    \"returnPeriod\" : {\n      \"unit\" : \"unit\",\n      \"value\" : 0\n    },\n    \"marketplaceId\" : \"marketplaceId\",\n    \"internationalOverride\" : {\n      \"returnShippingCostPayer\" : \"returnShippingCostPayer\",\n      \"returnMethod\" : \"returnMethod\",\n      \"returnsAccepted\" : true,\n      \"returnPeriod\" : {\n        \"unit\" : \"unit\",\n        \"value\" : 0\n      }\n    },\n    \"returnMethod\" : \"returnMethod\",\n    \"returnPolicyId\" : \"returnPolicyId\",\n    \"name\" : \"name\",\n    \"returnsAccepted\" : true,\n    \"extendedHolidayReturnsOffered\" : true\n  }, {\n    \"returnShippingCostPayer\" : \"returnShippingCostPayer\",\n    \"categoryTypes\" : [ {\n      \"default\" : true,\n      \"name\" : \"name\"\n    }, {\n      \"default\" : true,\n      \"name\" : \"name\"\n    } ],\n    \"refundMethod\" : \"refundMethod\",\n    \"description\" : \"description\",\n    \"restockingFeePercentage\" : \"restockingFeePercentage\",\n    \"returnInstructions\" : \"returnInstructions\",\n    \"returnPeriod\" : {\n      \"unit\" : \"unit\",\n      \"value\" : 0\n    },\n    \"marketplaceId\" : \"marketplaceId\",\n    \"internationalOverride\" : {\n      \"returnShippingCostPayer\" : \"returnShippingCostPayer\",\n      \"returnMethod\" : \"returnMethod\",\n      \"returnsAccepted\" : true,\n      \"returnPeriod\" : {\n        \"unit\" : \"unit\",\n        \"value\" : 0\n      }\n    },\n    \"returnMethod\" : \"returnMethod\",\n    \"returnPolicyId\" : \"returnPolicyId\",\n    \"name\" : \"name\",\n    \"returnsAccepted\" : true,\n    \"extendedHolidayReturnsOffered\" : true\n  } ],\n  \"href\" : \"href\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ReturnPolicyResponse>(exampleJson)
            : default(ReturnPolicyResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>This method retrieves the complete details of the return policy specified by the &lt;b&gt;returnPolicyId&lt;/b&gt; path parameter.</remarks>
        /// <param name="returnPolicyId">This path parameter specifies the of the return policy you want to retrieve.</param>
        /// <response code="200">Success</response>
        /// <response code="400">Bad Request</response>
        /// <response code="404">Not Found</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("/sell/account/v1/return_policy/{return_policy_id}")]
        [ValidateModelState]
        [SwaggerOperation("GetReturnPolicy")]
        [SwaggerResponse(statusCode: 200, type: typeof(ReturnPolicy), description: "Success")]
        public virtual IActionResult GetReturnPolicy([FromRoute (Name = "return_policy_id")][Required]string returnPolicyId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ReturnPolicy));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500);
            string exampleJson = null;
            exampleJson = "{\n  \"returnShippingCostPayer\" : \"returnShippingCostPayer\",\n  \"categoryTypes\" : [ {\n    \"default\" : true,\n    \"name\" : \"name\"\n  }, {\n    \"default\" : true,\n    \"name\" : \"name\"\n  } ],\n  \"refundMethod\" : \"refundMethod\",\n  \"description\" : \"description\",\n  \"restockingFeePercentage\" : \"restockingFeePercentage\",\n  \"returnInstructions\" : \"returnInstructions\",\n  \"returnPeriod\" : {\n    \"unit\" : \"unit\",\n    \"value\" : 0\n  },\n  \"marketplaceId\" : \"marketplaceId\",\n  \"internationalOverride\" : {\n    \"returnShippingCostPayer\" : \"returnShippingCostPayer\",\n    \"returnMethod\" : \"returnMethod\",\n    \"returnsAccepted\" : true,\n    \"returnPeriod\" : {\n      \"unit\" : \"unit\",\n      \"value\" : 0\n    }\n  },\n  \"returnMethod\" : \"returnMethod\",\n  \"returnPolicyId\" : \"returnPolicyId\",\n  \"name\" : \"name\",\n  \"returnsAccepted\" : true,\n  \"extendedHolidayReturnsOffered\" : true\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ReturnPolicy>(exampleJson)
            : default(ReturnPolicy);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>This method retrieves the details of a specific return policy. Supply both the policy &lt;code&gt;name&lt;/code&gt; and its associated &lt;code&gt;marketplace_id&lt;/code&gt; in the request query parameters.   &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policy for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get a policy for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt;.</remarks>
        /// <param name="marketplaceId">This query parameter specifies the ID of the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum</param>
        /// <param name="name">This query parameter specifies the seller-defined name of the return policy you want to retrieve.</param>
        /// <response code="200">Success</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("/sell/account/v1/return_policy/get_by_policy_name")]
        [ValidateModelState]
        [SwaggerOperation("GetReturnPolicyByName")]
        [SwaggerResponse(statusCode: 200, type: typeof(ReturnPolicy), description: "Success")]
        public virtual IActionResult GetReturnPolicyByName([FromQuery (Name = "marketplace_id")][Required()]string marketplaceId, [FromQuery (Name = "name")][Required()]string name)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ReturnPolicy));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500);
            string exampleJson = null;
            exampleJson = "{\n  \"returnShippingCostPayer\" : \"returnShippingCostPayer\",\n  \"categoryTypes\" : [ {\n    \"default\" : true,\n    \"name\" : \"name\"\n  }, {\n    \"default\" : true,\n    \"name\" : \"name\"\n  } ],\n  \"refundMethod\" : \"refundMethod\",\n  \"description\" : \"description\",\n  \"restockingFeePercentage\" : \"restockingFeePercentage\",\n  \"returnInstructions\" : \"returnInstructions\",\n  \"returnPeriod\" : {\n    \"unit\" : \"unit\",\n    \"value\" : 0\n  },\n  \"marketplaceId\" : \"marketplaceId\",\n  \"internationalOverride\" : {\n    \"returnShippingCostPayer\" : \"returnShippingCostPayer\",\n    \"returnMethod\" : \"returnMethod\",\n    \"returnsAccepted\" : true,\n    \"returnPeriod\" : {\n      \"unit\" : \"unit\",\n      \"value\" : 0\n    }\n  },\n  \"returnMethod\" : \"returnMethod\",\n  \"returnPolicyId\" : \"returnPolicyId\",\n  \"name\" : \"name\",\n  \"returnsAccepted\" : true,\n  \"extendedHolidayReturnsOffered\" : true\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ReturnPolicy>(exampleJson)
            : default(ReturnPolicy);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>This method updates an existing return policy. Specify the policy you want to update using the &lt;b&gt;return_policy_id&lt;/b&gt; path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.</remarks>
        /// <param name="returnPolicyId">This path parameter specifies the ID of the return policy you want to update.</param>
        /// <param name="returnPolicyRequest">Container for a return policy request.</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="404">Not Found</response>
        /// <response code="500">Internal Server Error</response>
        [HttpPut]
        [Route("/sell/account/v1/return_policy/{return_policy_id}")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("UpdateReturnPolicy")]
        [SwaggerResponse(statusCode: 200, type: typeof(SetReturnPolicyResponse), description: "OK")]
        public virtual IActionResult UpdateReturnPolicy([FromRoute (Name = "return_policy_id")][Required]string returnPolicyId, [FromBody]ReturnPolicyRequest returnPolicyRequest)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(SetReturnPolicyResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500);
            string exampleJson = null;
            exampleJson = "{\n  \"returnShippingCostPayer\" : \"returnShippingCostPayer\",\n  \"categoryTypes\" : [ {\n    \"default\" : true,\n    \"name\" : \"name\"\n  }, {\n    \"default\" : true,\n    \"name\" : \"name\"\n  } ],\n  \"refundMethod\" : \"refundMethod\",\n  \"warnings\" : [ {\n    \"domain\" : \"domain\",\n    \"subdomain\" : \"subdomain\",\n    \"outputRefIds\" : [ \"outputRefIds\", \"outputRefIds\" ],\n    \"errorId\" : 0,\n    \"inputRefIds\" : [ \"inputRefIds\", \"inputRefIds\" ],\n    \"category\" : \"category\",\n    \"longMessage\" : \"longMessage\",\n    \"message\" : \"message\",\n    \"parameters\" : [ {\n      \"name\" : \"name\",\n      \"value\" : \"value\"\n    }, {\n      \"name\" : \"name\",\n      \"value\" : \"value\"\n    } ]\n  }, {\n    \"domain\" : \"domain\",\n    \"subdomain\" : \"subdomain\",\n    \"outputRefIds\" : [ \"outputRefIds\", \"outputRefIds\" ],\n    \"errorId\" : 0,\n    \"inputRefIds\" : [ \"inputRefIds\", \"inputRefIds\" ],\n    \"category\" : \"category\",\n    \"longMessage\" : \"longMessage\",\n    \"message\" : \"message\",\n    \"parameters\" : [ {\n      \"name\" : \"name\",\n      \"value\" : \"value\"\n    }, {\n      \"name\" : \"name\",\n      \"value\" : \"value\"\n    } ]\n  } ],\n  \"description\" : \"description\",\n  \"restockingFeePercentage\" : \"restockingFeePercentage\",\n  \"returnInstructions\" : \"returnInstructions\",\n  \"returnPeriod\" : {\n    \"unit\" : \"unit\",\n    \"value\" : 0\n  },\n  \"marketplaceId\" : \"marketplaceId\",\n  \"internationalOverride\" : {\n    \"returnShippingCostPayer\" : \"returnShippingCostPayer\",\n    \"returnMethod\" : \"returnMethod\",\n    \"returnsAccepted\" : true,\n    \"returnPeriod\" : {\n      \"unit\" : \"unit\",\n      \"value\" : 0\n    }\n  },\n  \"returnMethod\" : \"returnMethod\",\n  \"returnPolicyId\" : \"returnPolicyId\",\n  \"name\" : \"name\",\n  \"returnsAccepted\" : true,\n  \"extendedHolidayReturnsOffered\" : true\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<SetReturnPolicyResponse>(exampleJson)
            : default(SetReturnPolicyResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
