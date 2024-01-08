/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.PaymentPolicy;
import org.openapitools.model.PaymentPolicyRequest;
import org.openapitools.model.PaymentPolicyResponse;
import org.openapitools.model.SetPaymentPolicyResponse;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "payment_policy", description = "the payment_policy API")
public interface PaymentPolicyApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /payment_policy
     * This method creates a new payment policy where the policy encapsulates seller&#39;s terms for order payments.  &lt;br/&gt;&lt;br/&gt;Each policy targets a specific eBay marketplace and category group, and you can create multiple policies for each combination.  &lt;br/&gt;&lt;br/&gt;A successful request returns the &lt;b&gt;getPaymentPolicy&lt;/b&gt; URI to the new policy in the &lt;b&gt;Location&lt;/b&gt; response header and the ID for the new policy is returned in the response payload.  &lt;p class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Tip:&lt;/b&gt; For details on creating and using the business policies supported by the Account API, see &lt;a href&#x3D;\&quot;/api-docs/sell/static/seller-accounts/business-policies.html\&quot;&gt;eBay business policies&lt;/a&gt;.&lt;/p&gt;
     *
     * @param paymentPolicyRequest Payment policy request (required)
     * @return Created (status code 201)
     *         or Bad Request (status code 400)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "createPaymentPolicy",
        description = "This method creates a new payment policy where the policy encapsulates seller's terms for order payments.  <br/><br/>Each policy targets a specific eBay marketplace and category group, and you can create multiple policies for each combination.  <br/><br/>A successful request returns the <b>getPaymentPolicy</b> URI to the new policy in the <b>Location</b> response header and the ID for the new policy is returned in the response payload.  <p class=\"tablenote\"><b>Tip:</b> For details on creating and using the business policies supported by the Account API, see <a href=\"/api-docs/sell/static/seller-accounts/business-policies.html\">eBay business policies</a>.</p>",
        tags = { "payment_policy" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Created", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SetPaymentPolicyResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")
        },
        security = {
            @SecurityRequirement(name = "api_auth", scopes={ "https://api.ebay.com/oauth/api_scope/sell.account" })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/payment_policy",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<SetPaymentPolicyResponse> createPaymentPolicy(
        @Parameter(name = "PaymentPolicyRequest", description = "Payment policy request", required = true) @Valid @RequestBody PaymentPolicyRequest paymentPolicyRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"marketplaceId\" : \"marketplaceId\", \"categoryTypes\" : [ { \"default\" : true, \"name\" : \"name\" }, { \"default\" : true, \"name\" : \"name\" } ], \"paymentMethods\" : [ { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" }, { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" } ], \"warnings\" : [ { \"domain\" : \"domain\", \"subdomain\" : \"subdomain\", \"outputRefIds\" : [ \"outputRefIds\", \"outputRefIds\" ], \"errorId\" : 0, \"inputRefIds\" : [ \"inputRefIds\", \"inputRefIds\" ], \"category\" : \"category\", \"longMessage\" : \"longMessage\", \"message\" : \"message\", \"parameters\" : [ { \"name\" : \"name\", \"value\" : \"value\" }, { \"name\" : \"name\", \"value\" : \"value\" } ] }, { \"domain\" : \"domain\", \"subdomain\" : \"subdomain\", \"outputRefIds\" : [ \"outputRefIds\", \"outputRefIds\" ], \"errorId\" : 0, \"inputRefIds\" : [ \"inputRefIds\", \"inputRefIds\" ], \"category\" : \"category\", \"longMessage\" : \"longMessage\", \"message\" : \"message\", \"parameters\" : [ { \"name\" : \"name\", \"value\" : \"value\" }, { \"name\" : \"name\", \"value\" : \"value\" } ] } ], \"name\" : \"name\", \"paymentInstructions\" : \"paymentInstructions\", \"deposit\" : { \"amount\" : { \"currency\" : \"currency\", \"value\" : \"value\" }, \"paymentMethods\" : [ { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" }, { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" } ], \"dueIn\" : { \"unit\" : \"unit\", \"value\" : 0 } }, \"description\" : \"description\", \"immediatePay\" : true, \"paymentPolicyId\" : \"paymentPolicyId\", \"fullPaymentDueIn\" : { \"unit\" : \"unit\", \"value\" : 0 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /payment_policy/{payment_policy_id}
     * This method deletes a payment policy. Supply the ID of the policy you want to delete in the &lt;b&gt;paymentPolicyId&lt;/b&gt; path parameter. 
     *
     * @param paymentPolicyId This path parameter specifies the ID of the payment policy you want to delete. (required)
     * @return No Content (status code 204)
     *         or Bad Request (status code 400)
     *         or Not Found (status code 404)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "deletePaymentPolicy",
        description = "This method deletes a payment policy. Supply the ID of the policy you want to delete in the <b>paymentPolicyId</b> path parameter. ",
        tags = { "payment_policy" },
        responses = {
            @ApiResponse(responseCode = "204", description = "No Content"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not Found"),
            @ApiResponse(responseCode = "409", description = "Conflict"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")
        },
        security = {
            @SecurityRequirement(name = "api_auth", scopes={ "https://api.ebay.com/oauth/api_scope/sell.account" })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/payment_policy/{payment_policy_id}"
    )
    
    default ResponseEntity<Void> deletePaymentPolicy(
        @Parameter(name = "payment_policy_id", description = "This path parameter specifies the ID of the payment policy you want to delete.", required = true, in = ParameterIn.PATH) @PathVariable("payment_policy_id") String paymentPolicyId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /payment_policy
     * This method retrieves all the payment policies configured for the marketplace you specify using the &lt;code&gt;marketplace_id&lt;/code&gt; query parameter.  &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policies for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get the policies for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot; target&#x3D;\&quot;_blank\&quot;&gt;HTTP request headers&lt;/a&gt;.
     *
     * @param marketplaceId This query parameter specifies the eBay marketplace of the policies you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum (required)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "getPaymentPolicies",
        description = "This method retrieves all the payment policies configured for the marketplace you specify using the <code>marketplace_id</code> query parameter.  <br/><br/><b>Marketplaces and locales</b>  <br/><br/>Get the correct policies for a marketplace that supports multiple locales using the <code>Content-Language</code> request header. For example, get the policies for the French locale of the Canadian marketplace by specifying <code>fr-CA</code> for the <code>Content-Language</code> header. Likewise, target the Dutch locale of the Belgium marketplace by setting <code>Content-Language: nl-BE</code>. For details on header values, see <a href=\"/api-docs/static/rest-request-components.html#HTTP\" target=\"_blank\">HTTP request headers</a>.",
        tags = { "payment_policy" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PaymentPolicyResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")
        },
        security = {
            @SecurityRequirement(name = "api_auth", scopes={ "https://api.ebay.com/oauth/api_scope/sell.account", "https://api.ebay.com/oauth/api_scope/sell.account.readonly" })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/payment_policy",
        produces = { "application/json" }
    )
    
    default ResponseEntity<PaymentPolicyResponse> getPaymentPolicies(
        @NotNull @Parameter(name = "marketplace_id", description = "This query parameter specifies the eBay marketplace of the policies you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "marketplace_id", required = true) String marketplaceId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"next\" : \"next\", \"total\" : 1, \"offset\" : 6, \"prev\" : \"prev\", \"limit\" : 0, \"href\" : \"href\", \"paymentPolicies\" : [ { \"marketplaceId\" : \"marketplaceId\", \"categoryTypes\" : [ { \"default\" : true, \"name\" : \"name\" }, { \"default\" : true, \"name\" : \"name\" } ], \"paymentMethods\" : [ { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" }, { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" } ], \"name\" : \"name\", \"paymentInstructions\" : \"paymentInstructions\", \"deposit\" : { \"amount\" : { \"currency\" : \"currency\", \"value\" : \"value\" }, \"paymentMethods\" : [ { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" }, { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" } ], \"dueIn\" : { \"unit\" : \"unit\", \"value\" : 0 } }, \"description\" : \"description\", \"immediatePay\" : true, \"paymentPolicyId\" : \"paymentPolicyId\", \"fullPaymentDueIn\" : { \"unit\" : \"unit\", \"value\" : 0 } }, { \"marketplaceId\" : \"marketplaceId\", \"categoryTypes\" : [ { \"default\" : true, \"name\" : \"name\" }, { \"default\" : true, \"name\" : \"name\" } ], \"paymentMethods\" : [ { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" }, { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" } ], \"name\" : \"name\", \"paymentInstructions\" : \"paymentInstructions\", \"deposit\" : { \"amount\" : { \"currency\" : \"currency\", \"value\" : \"value\" }, \"paymentMethods\" : [ { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" }, { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" } ], \"dueIn\" : { \"unit\" : \"unit\", \"value\" : 0 } }, \"description\" : \"description\", \"immediatePay\" : true, \"paymentPolicyId\" : \"paymentPolicyId\", \"fullPaymentDueIn\" : { \"unit\" : \"unit\", \"value\" : 0 } } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /payment_policy/{payment_policy_id}
     * This method retrieves the complete details of a payment policy. Supply the ID of the policy you want to retrieve using the &lt;b&gt;paymentPolicyId&lt;/b&gt; path parameter.
     *
     * @param paymentPolicyId This path parameter specifies the ID of the payment policy you want to retrieve. (required)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Not Found (status code 404)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "getPaymentPolicy",
        description = "This method retrieves the complete details of a payment policy. Supply the ID of the policy you want to retrieve using the <b>paymentPolicyId</b> path parameter.",
        tags = { "payment_policy" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PaymentPolicy.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not Found"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")
        },
        security = {
            @SecurityRequirement(name = "api_auth", scopes={ "https://api.ebay.com/oauth/api_scope/sell.account", "https://api.ebay.com/oauth/api_scope/sell.account.readonly" })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/payment_policy/{payment_policy_id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<PaymentPolicy> getPaymentPolicy(
        @Parameter(name = "payment_policy_id", description = "This path parameter specifies the ID of the payment policy you want to retrieve.", required = true, in = ParameterIn.PATH) @PathVariable("payment_policy_id") String paymentPolicyId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"marketplaceId\" : \"marketplaceId\", \"categoryTypes\" : [ { \"default\" : true, \"name\" : \"name\" }, { \"default\" : true, \"name\" : \"name\" } ], \"paymentMethods\" : [ { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" }, { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" } ], \"name\" : \"name\", \"paymentInstructions\" : \"paymentInstructions\", \"deposit\" : { \"amount\" : { \"currency\" : \"currency\", \"value\" : \"value\" }, \"paymentMethods\" : [ { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" }, { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" } ], \"dueIn\" : { \"unit\" : \"unit\", \"value\" : 0 } }, \"description\" : \"description\", \"immediatePay\" : true, \"paymentPolicyId\" : \"paymentPolicyId\", \"fullPaymentDueIn\" : { \"unit\" : \"unit\", \"value\" : 0 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /payment_policy/get_by_policy_name
     * This method retrieves the details of a specific payment policy. Supply both the policy &lt;code&gt;name&lt;/code&gt; and its associated &lt;code&gt;marketplace_id&lt;/code&gt; in the request query parameters.   &lt;br/&gt;&lt;br/&gt;&lt;b&gt;Marketplaces and locales&lt;/b&gt;  &lt;br/&gt;&lt;br/&gt;Get the correct policy for a marketplace that supports multiple locales using the &lt;code&gt;Content-Language&lt;/code&gt; request header. For example, get a policy for the French locale of the Canadian marketplace by specifying &lt;code&gt;fr-CA&lt;/code&gt; for the &lt;code&gt;Content-Language&lt;/code&gt; header. Likewise, target the Dutch locale of the Belgium marketplace by setting &lt;code&gt;Content-Language: nl-BE&lt;/code&gt;. For details on header values, see &lt;a href&#x3D;\&quot;/api-docs/static/rest-request-components.html#HTTP\&quot;&gt;HTTP request headers&lt;/a&gt;.
     *
     * @param marketplaceId This query parameter specifies the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum (required)
     * @param name This query parameter specifies the seller-defined name of the payment policy you want to retrieve. (required)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "getPaymentPolicyByName",
        description = "This method retrieves the details of a specific payment policy. Supply both the policy <code>name</code> and its associated <code>marketplace_id</code> in the request query parameters.   <br/><br/><b>Marketplaces and locales</b>  <br/><br/>Get the correct policy for a marketplace that supports multiple locales using the <code>Content-Language</code> request header. For example, get a policy for the French locale of the Canadian marketplace by specifying <code>fr-CA</code> for the <code>Content-Language</code> header. Likewise, target the Dutch locale of the Belgium marketplace by setting <code>Content-Language: nl-BE</code>. For details on header values, see <a href=\"/api-docs/static/rest-request-components.html#HTTP\">HTTP request headers</a>.",
        tags = { "payment_policy" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PaymentPolicy.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")
        },
        security = {
            @SecurityRequirement(name = "api_auth", scopes={ "https://api.ebay.com/oauth/api_scope/sell.account", "https://api.ebay.com/oauth/api_scope/sell.account.readonly" })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/payment_policy/get_by_policy_name",
        produces = { "application/json" }
    )
    
    default ResponseEntity<PaymentPolicy> getPaymentPolicyByName(
        @NotNull @Parameter(name = "marketplace_id", description = "This query parameter specifies the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "marketplace_id", required = true) String marketplaceId,
        @NotNull @Parameter(name = "name", description = "This query parameter specifies the seller-defined name of the payment policy you want to retrieve.", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "name", required = true) String name
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"marketplaceId\" : \"marketplaceId\", \"categoryTypes\" : [ { \"default\" : true, \"name\" : \"name\" }, { \"default\" : true, \"name\" : \"name\" } ], \"paymentMethods\" : [ { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" }, { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" } ], \"name\" : \"name\", \"paymentInstructions\" : \"paymentInstructions\", \"deposit\" : { \"amount\" : { \"currency\" : \"currency\", \"value\" : \"value\" }, \"paymentMethods\" : [ { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" }, { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" } ], \"dueIn\" : { \"unit\" : \"unit\", \"value\" : 0 } }, \"description\" : \"description\", \"immediatePay\" : true, \"paymentPolicyId\" : \"paymentPolicyId\", \"fullPaymentDueIn\" : { \"unit\" : \"unit\", \"value\" : 0 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /payment_policy/{payment_policy_id}
     * This method updates an existing payment policy. Specify the policy you want to update using the &lt;b&gt;payment_policy_id&lt;/b&gt; path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.
     *
     * @param paymentPolicyId This path parameter specifies the ID of the payment policy you want to update. (required)
     * @param paymentPolicyRequest Payment policy request (required)
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Not Found (status code 404)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "updatePaymentPolicy",
        description = "This method updates an existing payment policy. Specify the policy you want to update using the <b>payment_policy_id</b> path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.",
        tags = { "payment_policy" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SetPaymentPolicyResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "404", description = "Not Found"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")
        },
        security = {
            @SecurityRequirement(name = "api_auth", scopes={ "https://api.ebay.com/oauth/api_scope/sell.account" })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/payment_policy/{payment_policy_id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<SetPaymentPolicyResponse> updatePaymentPolicy(
        @Parameter(name = "payment_policy_id", description = "This path parameter specifies the ID of the payment policy you want to update.", required = true, in = ParameterIn.PATH) @PathVariable("payment_policy_id") String paymentPolicyId,
        @Parameter(name = "PaymentPolicyRequest", description = "Payment policy request", required = true) @Valid @RequestBody PaymentPolicyRequest paymentPolicyRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"marketplaceId\" : \"marketplaceId\", \"categoryTypes\" : [ { \"default\" : true, \"name\" : \"name\" }, { \"default\" : true, \"name\" : \"name\" } ], \"paymentMethods\" : [ { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" }, { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" } ], \"warnings\" : [ { \"domain\" : \"domain\", \"subdomain\" : \"subdomain\", \"outputRefIds\" : [ \"outputRefIds\", \"outputRefIds\" ], \"errorId\" : 0, \"inputRefIds\" : [ \"inputRefIds\", \"inputRefIds\" ], \"category\" : \"category\", \"longMessage\" : \"longMessage\", \"message\" : \"message\", \"parameters\" : [ { \"name\" : \"name\", \"value\" : \"value\" }, { \"name\" : \"name\", \"value\" : \"value\" } ] }, { \"domain\" : \"domain\", \"subdomain\" : \"subdomain\", \"outputRefIds\" : [ \"outputRefIds\", \"outputRefIds\" ], \"errorId\" : 0, \"inputRefIds\" : [ \"inputRefIds\", \"inputRefIds\" ], \"category\" : \"category\", \"longMessage\" : \"longMessage\", \"message\" : \"message\", \"parameters\" : [ { \"name\" : \"name\", \"value\" : \"value\" }, { \"name\" : \"name\", \"value\" : \"value\" } ] } ], \"name\" : \"name\", \"paymentInstructions\" : \"paymentInstructions\", \"deposit\" : { \"amount\" : { \"currency\" : \"currency\", \"value\" : \"value\" }, \"paymentMethods\" : [ { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" }, { \"recipientAccountReference\" : { \"referenceType\" : \"referenceType\", \"referenceId\" : \"referenceId\" }, \"brands\" : [ \"brands\", \"brands\" ], \"paymentMethodType\" : \"paymentMethodType\" } ], \"dueIn\" : { \"unit\" : \"unit\", \"value\" : 0 } }, \"description\" : \"description\", \"immediatePay\" : true, \"paymentPolicyId\" : \"paymentPolicyId\", \"fullPaymentDueIn\" : { \"unit\" : \"unit\", \"value\" : 0 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}