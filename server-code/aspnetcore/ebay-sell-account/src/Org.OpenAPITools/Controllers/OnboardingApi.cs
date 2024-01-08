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
    public class OnboardingApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is no longer applicable, as all seller accounts globally have been enabled for the new eBay payment and checkout flow.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;This method retrieves a seller&#39;s onboarding status for a payments program for a specified marketplace. The overall onboarding status of the seller and the status of each onboarding step is returned.</remarks>
        /// <param name="marketplaceId">The eBay marketplace ID associated with the onboarding status to retrieve.</param>
        /// <param name="paymentsProgramType">The type of payments program whose status is returned by the method.</param>
        /// <response code="200">Success</response>
        /// <response code="400">Bad Request</response>
        /// <response code="404">Not Found</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("/sell/account/v1/payments_program/{marketplace_id}/{payments_program_type}/onboarding")]
        [ValidateModelState]
        [SwaggerOperation("GetPaymentsProgramOnboarding")]
        [SwaggerResponse(statusCode: 200, type: typeof(PaymentsProgramOnboardingResponse), description: "Success")]
        public virtual IActionResult GetPaymentsProgramOnboarding([FromRoute (Name = "marketplace_id")][Required]string marketplaceId, [FromRoute (Name = "payments_program_type")][Required]string paymentsProgramType)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PaymentsProgramOnboardingResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500);
            string exampleJson = null;
            exampleJson = "{\n  \"onboardingStatus\" : \"onboardingStatus\",\n  \"steps\" : [ {\n    \"webUrl\" : \"webUrl\",\n    \"name\" : \"name\",\n    \"status\" : \"status\"\n  }, {\n    \"webUrl\" : \"webUrl\",\n    \"name\" : \"name\",\n    \"status\" : \"status\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PaymentsProgramOnboardingResponse>(exampleJson)
            : default(PaymentsProgramOnboardingResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}