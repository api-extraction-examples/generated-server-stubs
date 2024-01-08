/*
 * Open Banking - Payments initiation service
 *
 * Open Banking - Payments initiation service
 *
 * The version of the OpenAPI document: 1.16.0
 * Contact: apisupport@mastercard.com
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
    public class DomesticPaymentsStatusApiController : ControllerBase
    { 
        /// <summary>
        /// Get payment status
        /// </summary>
        /// <remarks>Get the status for an existing domestic credit transfer payment.</remarks>
        /// <param name="body">Request Body</param>
        /// <response code="200">Success</response>
        /// <response code="400">Bad request</response>
        /// <response code="500">Error</response>
        /// <response code="504">Server while acting as a gateway or proxy, cannot get a response in time.</response>
        [HttpPost]
        [Route("/openbanking/sandbox/connect/api/payments/domestic-credit-transfers/payment-status")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("PaymentsDomesticCreditTransfersPaymentStatusPost")]
        [SwaggerResponse(statusCode: 200, type: typeof(PostPaymentsDomesticCreditTransfersPaymentStatusOKBody), description: "Success")]
        [SwaggerResponse(statusCode: 400, type: typeof(Error), description: "Bad request")]
        [SwaggerResponse(statusCode: 500, type: typeof(Error), description: "Error")]
        [SwaggerResponse(statusCode: 504, type: typeof(Error), description: "Server while acting as a gateway or proxy, cannot get a response in time.")]
        public virtual IActionResult PaymentsDomesticCreditTransfersPaymentStatusPost([FromBody]PostPaymentsDomesticCreditTransfersPaymentStatusParamsBody body)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PostPaymentsDomesticCreditTransfersPaymentStatusOKBody));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(Error));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(Error));
            //TODO: Uncomment the next line to return response 504 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(504, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"payments\" : {\n    \"transactionStatus\" : \"ACCP\",\n    \"statusReasonCode\" : \"AM04\"\n  },\n  \"originalRequestInfo\" : {\n    \"xRequestId\" : \"444e4567-e55b-12d3-a456-426655448888\"\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PostPaymentsDomesticCreditTransfersPaymentStatusOKBody>(exampleJson)
            : default(PostPaymentsDomesticCreditTransfersPaymentStatusOKBody);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}