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
    public class PaymentPolicyApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>This method creates a new payment policy where the policy encapsulates seller&#39;s terms for order payments.  &lt;br/&gt;&lt;br/&gt;Each policy targets a specific eBay marketplace and category group, and you can create multiple policies for each combination.  &lt;br/&gt;&lt;br/&gt;A successful request returns the &lt;b&gt;getPaymentPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/seller-accounts/business-policies.html\&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;</remarks>
        /// <param name="paymentPolicyRequest">Payment policy request</param>
        /// <response code="201">Created</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpPost]
        [Route("/sell/account/v1/payment_policy")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("CreatePaymentPolicy")]
        [SwaggerResponse(statusCode: 201, type: typeof(SetPaymentPolicyResponse), description: "Created")]
        public virtual IActionResult CreatePaymentPolicy([FromBody]PaymentPolicyRequest paymentPolicyRequest)
        {

            //TODO: Uncomment the next line to return response 201 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(201, default(SetPaymentPolicyResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500);
            string exampleJson = null;
            exampleJson = "{\n  \"marketplaceId\" : \"marketplaceId\",\n  \"categoryTypes\" : [ {\n    \"default\" : true,\n    \"name\" : \"name\"\n  }, {\n    \"default\" : true,\n    \"name\" : \"name\"\n  } ],\n  \"paymentMethods\" : [ {\n    \"recipientAccountReference\" : {\n      \"referenceType\" : \"referenceType\",\n      \"referenceId\" : \"referenceId\"\n    },\n    \"brands\" : [ \"brands\", \"brands\" ],\n    \"paymentMethodType\" : \"paymentMethodType\"\n  }, {\n    \"recipientAccountReference\" : {\n      \"referenceType\" : \"referenceType\",\n      \"referenceId\" : \"referenceId\"\n    },\n    \"brands\" : [ \"brands\", \"brands\" ],\n    \"paymentMethodType\" : \"paymentMethodType\"\n  } ],\n  \"warnings\" : [ {\n    \"domain\" : \"domain\",\n    \"subdomain\" : \"subdomain\",\n    \"outputRefIds\" : [ \"outputRefIds\", \"outputRefIds\" ],\n    \"errorId\" : 0,\n    \"inputRefIds\" : [ \"inputRefIds\", \"inputRefIds\" ],\n    \"category\" : \"category\",\n    \"longMessage\" : \"longMessage\",\n    \"message\" : \"message\",\n    \"parameters\" : [ {\n      \"name\" : \"name\",\n      \"value\" : \"value\"\n    }, {\n      \"name\" : \"name\",\n      \"value\" : \"value\"\n    } ]\n  }, {\n    \"domain\" : \"domain\",\n    \"subdomain\" : \"subdomain\",\n    \"outputRefIds\" : [ \"outputRefIds\", \"outputRefIds\" ],\n    \"errorId\" : 0,\n    \"inputRefIds\" : [ \"inputRefIds\", \"inputRefIds\" ],\n    \"category\" : \"category\",\n    \"longMessage\" : \"longMessage\",\n    \"message\" : \"message\",\n    \"parameters\" : [ {\n      \"name\" : \"name\",\n      \"value\" : \"value\"\n    }, {\n      \"name\" : \"name\",\n      \"value\" : \"value\"\n    } ]\n  } ],\n  \"name\" : \"name\",\n  \"paymentInstructions\" : \"paymentInstructions\",\n  \"deposit\" : {\n    \"amount\" : {\n      \"currency\" : \"currency\",\n      \"value\" : \"value\"\n    },\n    \"paymentMethods\" : [ {\n      \"recipientAccountReference\" : {\n        \"referenceType\" : \"referenceType\",\n        \"referenceId\" : \"referenceId\"\n      },\n      \"brands\" : [ \"brands\", \"brands\" ],\n      \"paymentMethodType\" : \"paymentMethodType\"\n    }, {\n      \"recipientAccountReference\" : {\n        \"referenceType\" : \"referenceType\",\n        \"referenceId\" : \"referenceId\"\n      },\n      \"brands\" : [ \"brands\", \"brands\" ],\n      \"paymentMethodType\" : \"paymentMethodType\"\n    } ],\n    \"dueIn\" : {\n      \"unit\" : \"unit\",\n      \"value\" : 0\n    }\n  },\n  \"description\" : \"description\",\n  \"immediatePay\" : true,\n  \"paymentPolicyId\" : \"paymentPolicyId\",\n  \"fullPaymentDueIn\" : {\n    \"unit\" : \"unit\",\n    \"value\" : 0\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<SetPaymentPolicyResponse>(exampleJson)
            : default(SetPaymentPolicyResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>This method deletes a payment policy. Supply the ID of the policy you want to delete in the &lt;b&gt;paymentPolicyId&lt;/b&gt; path parameter. </remarks>
        /// <param name="paymentPolicyId">This path parameter specifies the ID of the payment policy you want to delete.</param>
        /// <response code="204">No Content</response>
        /// <response code="400">Bad Request</response>
        /// <response code="404">Not Found</response>
        /// <response code="409">Conflict</response>
        /// <response code="500">Internal Server Error</response>
        [HttpDelete]
        [Route("/sell/account/v1/payment_policy/{payment_policy_id}")]
        [ValidateModelState]
        [SwaggerOperation("DeletePaymentPolicy")]
        public virtual IActionResult DeletePaymentPolicy([FromRoute (Name = "payment_policy_id")][Required]string paymentPolicyId)
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
        /// <remarks>This method retrieves all the payment policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.  &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policies for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get the policies for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot; target&#x3D;\&quot;_blank\&quot;&gt;HTTP request headers&lt;/a&gt;.</remarks>
        /// <param name="marketplaceId">This query parameter specifies the eBay marketplace of the policies you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum</param>
        /// <response code="200">Success</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("/sell/account/v1/payment_policy")]
        [ValidateModelState]
        [SwaggerOperation("GetPaymentPolicies")]
        [SwaggerResponse(statusCode: 200, type: typeof(PaymentPolicyResponse), description: "Success")]
        public virtual IActionResult GetPaymentPolicies([FromQuery (Name = "marketplace_id")][Required()]string marketplaceId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PaymentPolicyResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500);
            string exampleJson = null;
            exampleJson = "{\n  \"next\" : \"next\",\n  \"total\" : 1,\n  \"offset\" : 6,\n  \"prev\" : \"prev\",\n  \"limit\" : 0,\n  \"href\" : \"href\",\n  \"paymentPolicies\" : [ {\n    \"marketplaceId\" : \"marketplaceId\",\n    \"categoryTypes\" : [ {\n      \"default\" : true,\n      \"name\" : \"name\"\n    }, {\n      \"default\" : true,\n      \"name\" : \"name\"\n    } ],\n    \"paymentMethods\" : [ {\n      \"recipientAccountReference\" : {\n        \"referenceType\" : \"referenceType\",\n        \"referenceId\" : \"referenceId\"\n      },\n      \"brands\" : [ \"brands\", \"brands\" ],\n      \"paymentMethodType\" : \"paymentMethodType\"\n    }, {\n      \"recipientAccountReference\" : {\n        \"referenceType\" : \"referenceType\",\n        \"referenceId\" : \"referenceId\"\n      },\n      \"brands\" : [ \"brands\", \"brands\" ],\n      \"paymentMethodType\" : \"paymentMethodType\"\n    } ],\n    \"name\" : \"name\",\n    \"paymentInstructions\" : \"paymentInstructions\",\n    \"deposit\" : {\n      \"amount\" : {\n        \"currency\" : \"currency\",\n        \"value\" : \"value\"\n      },\n      \"paymentMethods\" : [ {\n        \"recipientAccountReference\" : {\n          \"referenceType\" : \"referenceType\",\n          \"referenceId\" : \"referenceId\"\n        },\n        \"brands\" : [ \"brands\", \"brands\" ],\n        \"paymentMethodType\" : \"paymentMethodType\"\n      }, {\n        \"recipientAccountReference\" : {\n          \"referenceType\" : \"referenceType\",\n          \"referenceId\" : \"referenceId\"\n        },\n        \"brands\" : [ \"brands\", \"brands\" ],\n        \"paymentMethodType\" : \"paymentMethodType\"\n      } ],\n      \"dueIn\" : {\n        \"unit\" : \"unit\",\n        \"value\" : 0\n      }\n    },\n    \"description\" : \"description\",\n    \"immediatePay\" : true,\n    \"paymentPolicyId\" : \"paymentPolicyId\",\n    \"fullPaymentDueIn\" : {\n      \"unit\" : \"unit\",\n      \"value\" : 0\n    }\n  }, {\n    \"marketplaceId\" : \"marketplaceId\",\n    \"categoryTypes\" : [ {\n      \"default\" : true,\n      \"name\" : \"name\"\n    }, {\n      \"default\" : true,\n      \"name\" : \"name\"\n    } ],\n    \"paymentMethods\" : [ {\n      \"recipientAccountReference\" : {\n        \"referenceType\" : \"referenceType\",\n        \"referenceId\" : \"referenceId\"\n      },\n      \"brands\" : [ \"brands\", \"brands\" ],\n      \"paymentMethodType\" : \"paymentMethodType\"\n    }, {\n      \"recipientAccountReference\" : {\n        \"referenceType\" : \"referenceType\",\n        \"referenceId\" : \"referenceId\"\n      },\n      \"brands\" : [ \"brands\", \"brands\" ],\n      \"paymentMethodType\" : \"paymentMethodType\"\n    } ],\n    \"name\" : \"name\",\n    \"paymentInstructions\" : \"paymentInstructions\",\n    \"deposit\" : {\n      \"amount\" : {\n        \"currency\" : \"currency\",\n        \"value\" : \"value\"\n      },\n      \"paymentMethods\" : [ {\n        \"recipientAccountReference\" : {\n          \"referenceType\" : \"referenceType\",\n          \"referenceId\" : \"referenceId\"\n        },\n        \"brands\" : [ \"brands\", \"brands\" ],\n        \"paymentMethodType\" : \"paymentMethodType\"\n      }, {\n        \"recipientAccountReference\" : {\n          \"referenceType\" : \"referenceType\",\n          \"referenceId\" : \"referenceId\"\n        },\n        \"brands\" : [ \"brands\", \"brands\" ],\n        \"paymentMethodType\" : \"paymentMethodType\"\n      } ],\n      \"dueIn\" : {\n        \"unit\" : \"unit\",\n        \"value\" : 0\n      }\n    },\n    \"description\" : \"description\",\n    \"immediatePay\" : true,\n    \"paymentPolicyId\" : \"paymentPolicyId\",\n    \"fullPaymentDueIn\" : {\n      \"unit\" : \"unit\",\n      \"value\" : 0\n    }\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PaymentPolicyResponse>(exampleJson)
            : default(PaymentPolicyResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>This method retrieves the complete details of a payment policy. Supply the ID of the policy you want to retrieve using the &lt;b&gt;paymentPolicyId&lt;/b&gt; path parameter.</remarks>
        /// <param name="paymentPolicyId">This path parameter specifies the ID of the payment policy you want to retrieve.</param>
        /// <response code="200">Success</response>
        /// <response code="400">Bad Request</response>
        /// <response code="404">Not Found</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("/sell/account/v1/payment_policy/{payment_policy_id}")]
        [ValidateModelState]
        [SwaggerOperation("GetPaymentPolicy")]
        [SwaggerResponse(statusCode: 200, type: typeof(PaymentPolicy), description: "Success")]
        public virtual IActionResult GetPaymentPolicy([FromRoute (Name = "payment_policy_id")][Required]string paymentPolicyId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PaymentPolicy));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500);
            string exampleJson = null;
            exampleJson = "{\n  \"marketplaceId\" : \"marketplaceId\",\n  \"categoryTypes\" : [ {\n    \"default\" : true,\n    \"name\" : \"name\"\n  }, {\n    \"default\" : true,\n    \"name\" : \"name\"\n  } ],\n  \"paymentMethods\" : [ {\n    \"recipientAccountReference\" : {\n      \"referenceType\" : \"referenceType\",\n      \"referenceId\" : \"referenceId\"\n    },\n    \"brands\" : [ \"brands\", \"brands\" ],\n    \"paymentMethodType\" : \"paymentMethodType\"\n  }, {\n    \"recipientAccountReference\" : {\n      \"referenceType\" : \"referenceType\",\n      \"referenceId\" : \"referenceId\"\n    },\n    \"brands\" : [ \"brands\", \"brands\" ],\n    \"paymentMethodType\" : \"paymentMethodType\"\n  } ],\n  \"name\" : \"name\",\n  \"paymentInstructions\" : \"paymentInstructions\",\n  \"deposit\" : {\n    \"amount\" : {\n      \"currency\" : \"currency\",\n      \"value\" : \"value\"\n    },\n    \"paymentMethods\" : [ {\n      \"recipientAccountReference\" : {\n        \"referenceType\" : \"referenceType\",\n        \"referenceId\" : \"referenceId\"\n      },\n      \"brands\" : [ \"brands\", \"brands\" ],\n      \"paymentMethodType\" : \"paymentMethodType\"\n    }, {\n      \"recipientAccountReference\" : {\n        \"referenceType\" : \"referenceType\",\n        \"referenceId\" : \"referenceId\"\n      },\n      \"brands\" : [ \"brands\", \"brands\" ],\n      \"paymentMethodType\" : \"paymentMethodType\"\n    } ],\n    \"dueIn\" : {\n      \"unit\" : \"unit\",\n      \"value\" : 0\n    }\n  },\n  \"description\" : \"description\",\n  \"immediatePay\" : true,\n  \"paymentPolicyId\" : \"paymentPolicyId\",\n  \"fullPaymentDueIn\" : {\n    \"unit\" : \"unit\",\n    \"value\" : 0\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PaymentPolicy>(exampleJson)
            : default(PaymentPolicy);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>This method retrieves the details of a specific payment policy. Supply both the policy &lt;code&gt;name&lt;/code&gt; and its associated &lt;code&gt;marketplace_id&lt;/code&gt; in the request query parameters.   &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policy for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get a policy for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt;.</remarks>
        /// <param name="marketplaceId">This query parameter specifies the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum</param>
        /// <param name="name">This query parameter specifies the seller-defined name of the payment policy you want to retrieve.</param>
        /// <response code="200">Success</response>
        /// <response code="400">Bad Request</response>
        /// <response code="500">Internal Server Error</response>
        [HttpGet]
        [Route("/sell/account/v1/payment_policy/get_by_policy_name")]
        [ValidateModelState]
        [SwaggerOperation("GetPaymentPolicyByName")]
        [SwaggerResponse(statusCode: 200, type: typeof(PaymentPolicy), description: "Success")]
        public virtual IActionResult GetPaymentPolicyByName([FromQuery (Name = "marketplace_id")][Required()]string marketplaceId, [FromQuery (Name = "name")][Required()]string name)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PaymentPolicy));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500);
            string exampleJson = null;
            exampleJson = "{\n  \"marketplaceId\" : \"marketplaceId\",\n  \"categoryTypes\" : [ {\n    \"default\" : true,\n    \"name\" : \"name\"\n  }, {\n    \"default\" : true,\n    \"name\" : \"name\"\n  } ],\n  \"paymentMethods\" : [ {\n    \"recipientAccountReference\" : {\n      \"referenceType\" : \"referenceType\",\n      \"referenceId\" : \"referenceId\"\n    },\n    \"brands\" : [ \"brands\", \"brands\" ],\n    \"paymentMethodType\" : \"paymentMethodType\"\n  }, {\n    \"recipientAccountReference\" : {\n      \"referenceType\" : \"referenceType\",\n      \"referenceId\" : \"referenceId\"\n    },\n    \"brands\" : [ \"brands\", \"brands\" ],\n    \"paymentMethodType\" : \"paymentMethodType\"\n  } ],\n  \"name\" : \"name\",\n  \"paymentInstructions\" : \"paymentInstructions\",\n  \"deposit\" : {\n    \"amount\" : {\n      \"currency\" : \"currency\",\n      \"value\" : \"value\"\n    },\n    \"paymentMethods\" : [ {\n      \"recipientAccountReference\" : {\n        \"referenceType\" : \"referenceType\",\n        \"referenceId\" : \"referenceId\"\n      },\n      \"brands\" : [ \"brands\", \"brands\" ],\n      \"paymentMethodType\" : \"paymentMethodType\"\n    }, {\n      \"recipientAccountReference\" : {\n        \"referenceType\" : \"referenceType\",\n        \"referenceId\" : \"referenceId\"\n      },\n      \"brands\" : [ \"brands\", \"brands\" ],\n      \"paymentMethodType\" : \"paymentMethodType\"\n    } ],\n    \"dueIn\" : {\n      \"unit\" : \"unit\",\n      \"value\" : 0\n    }\n  },\n  \"description\" : \"description\",\n  \"immediatePay\" : true,\n  \"paymentPolicyId\" : \"paymentPolicyId\",\n  \"fullPaymentDueIn\" : {\n    \"unit\" : \"unit\",\n    \"value\" : 0\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PaymentPolicy>(exampleJson)
            : default(PaymentPolicy);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>This method updates an existing payment policy. Specify the policy you want to update using the &lt;b&gt;payment_policy_id&lt;/b&gt; path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.</remarks>
        /// <param name="paymentPolicyId">This path parameter specifies the ID of the payment policy you want to update.</param>
        /// <param name="paymentPolicyRequest">Payment policy request</param>
        /// <response code="200">OK</response>
        /// <response code="400">Bad Request</response>
        /// <response code="404">Not Found</response>
        /// <response code="500">Internal Server Error</response>
        [HttpPut]
        [Route("/sell/account/v1/payment_policy/{payment_policy_id}")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("UpdatePaymentPolicy")]
        [SwaggerResponse(statusCode: 200, type: typeof(SetPaymentPolicyResponse), description: "OK")]
        public virtual IActionResult UpdatePaymentPolicy([FromRoute (Name = "payment_policy_id")][Required]string paymentPolicyId, [FromBody]PaymentPolicyRequest paymentPolicyRequest)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(SetPaymentPolicyResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500);
            string exampleJson = null;
            exampleJson = "{\n  \"marketplaceId\" : \"marketplaceId\",\n  \"categoryTypes\" : [ {\n    \"default\" : true,\n    \"name\" : \"name\"\n  }, {\n    \"default\" : true,\n    \"name\" : \"name\"\n  } ],\n  \"paymentMethods\" : [ {\n    \"recipientAccountReference\" : {\n      \"referenceType\" : \"referenceType\",\n      \"referenceId\" : \"referenceId\"\n    },\n    \"brands\" : [ \"brands\", \"brands\" ],\n    \"paymentMethodType\" : \"paymentMethodType\"\n  }, {\n    \"recipientAccountReference\" : {\n      \"referenceType\" : \"referenceType\",\n      \"referenceId\" : \"referenceId\"\n    },\n    \"brands\" : [ \"brands\", \"brands\" ],\n    \"paymentMethodType\" : \"paymentMethodType\"\n  } ],\n  \"warnings\" : [ {\n    \"domain\" : \"domain\",\n    \"subdomain\" : \"subdomain\",\n    \"outputRefIds\" : [ \"outputRefIds\", \"outputRefIds\" ],\n    \"errorId\" : 0,\n    \"inputRefIds\" : [ \"inputRefIds\", \"inputRefIds\" ],\n    \"category\" : \"category\",\n    \"longMessage\" : \"longMessage\",\n    \"message\" : \"message\",\n    \"parameters\" : [ {\n      \"name\" : \"name\",\n      \"value\" : \"value\"\n    }, {\n      \"name\" : \"name\",\n      \"value\" : \"value\"\n    } ]\n  }, {\n    \"domain\" : \"domain\",\n    \"subdomain\" : \"subdomain\",\n    \"outputRefIds\" : [ \"outputRefIds\", \"outputRefIds\" ],\n    \"errorId\" : 0,\n    \"inputRefIds\" : [ \"inputRefIds\", \"inputRefIds\" ],\n    \"category\" : \"category\",\n    \"longMessage\" : \"longMessage\",\n    \"message\" : \"message\",\n    \"parameters\" : [ {\n      \"name\" : \"name\",\n      \"value\" : \"value\"\n    }, {\n      \"name\" : \"name\",\n      \"value\" : \"value\"\n    } ]\n  } ],\n  \"name\" : \"name\",\n  \"paymentInstructions\" : \"paymentInstructions\",\n  \"deposit\" : {\n    \"amount\" : {\n      \"currency\" : \"currency\",\n      \"value\" : \"value\"\n    },\n    \"paymentMethods\" : [ {\n      \"recipientAccountReference\" : {\n        \"referenceType\" : \"referenceType\",\n        \"referenceId\" : \"referenceId\"\n      },\n      \"brands\" : [ \"brands\", \"brands\" ],\n      \"paymentMethodType\" : \"paymentMethodType\"\n    }, {\n      \"recipientAccountReference\" : {\n        \"referenceType\" : \"referenceType\",\n        \"referenceId\" : \"referenceId\"\n      },\n      \"brands\" : [ \"brands\", \"brands\" ],\n      \"paymentMethodType\" : \"paymentMethodType\"\n    } ],\n    \"dueIn\" : {\n      \"unit\" : \"unit\",\n      \"value\" : 0\n    }\n  },\n  \"description\" : \"description\",\n  \"immediatePay\" : true,\n  \"paymentPolicyId\" : \"paymentPolicyId\",\n  \"fullPaymentDueIn\" : {\n    \"unit\" : \"unit\",\n    \"value\" : 0\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<SetPaymentPolicyResponse>(exampleJson)
            : default(SetPaymentPolicyResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
