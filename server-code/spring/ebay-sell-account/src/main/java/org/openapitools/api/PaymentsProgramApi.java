/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.PaymentsProgramOnboardingResponse;
import org.openapitools.model.PaymentsProgramResponse;
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
@Tag(name = "payments_program", description = "the payments_program API")
public interface PaymentsProgramApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /payments_program/{marketplace_id}/{payments_program_type}
     * &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is no longer applicable, as all seller accounts globally have been enabled for the new eBay payment and checkout flow.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;This method returns whether or not the user is opted-in to the specified payments program. Sellers opt-in to payments programs by marketplace and you use the &lt;b&gt;marketplace_id&lt;/b&gt; path parameter to specify the marketplace of the status flag you want returned.
     *
     * @param marketplaceId This path parameter specifies the eBay marketplace of the payments program for which you want to retrieve the seller&#39;s status. (required)
     * @param paymentsProgramType This path parameter specifies the payments program whose status is returned by the call. (required)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Not Found (status code 404)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "getPaymentsProgram",
        description = "<span class=\"tablenote\"><b>Note:</b> This method is no longer applicable, as all seller accounts globally have been enabled for the new eBay payment and checkout flow.</span><br/><br/>This method returns whether or not the user is opted-in to the specified payments program. Sellers opt-in to payments programs by marketplace and you use the <b>marketplace_id</b> path parameter to specify the marketplace of the status flag you want returned.",
        tags = { "payments_program" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PaymentsProgramResponse.class))
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
        value = "/payments_program/{marketplace_id}/{payments_program_type}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<PaymentsProgramResponse> getPaymentsProgram(
        @Parameter(name = "marketplace_id", description = "This path parameter specifies the eBay marketplace of the payments program for which you want to retrieve the seller's status.", required = true, in = ParameterIn.PATH) @PathVariable("marketplace_id") String marketplaceId,
        @Parameter(name = "payments_program_type", description = "This path parameter specifies the payments program whose status is returned by the call.", required = true, in = ParameterIn.PATH) @PathVariable("payments_program_type") String paymentsProgramType
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"marketplaceId\" : \"marketplaceId\", \"wasPreviouslyOptedIn\" : true, \"paymentsProgramType\" : \"paymentsProgramType\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /payments_program/{marketplace_id}/{payments_program_type}/onboarding
     * &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; This method is no longer applicable, as all seller accounts globally have been enabled for the new eBay payment and checkout flow.&lt;/span&gt;&lt;br/&gt;&lt;br/&gt;This method retrieves a seller&#39;s onboarding status for a payments program for a specified marketplace. The overall onboarding status of the seller and the status of each onboarding step is returned.
     *
     * @param marketplaceId The eBay marketplace ID associated with the onboarding status to retrieve. (required)
     * @param paymentsProgramType The type of payments program whose status is returned by the method. (required)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Not Found (status code 404)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "getPaymentsProgramOnboarding",
        description = "<span class=\"tablenote\"><b>Note:</b> This method is no longer applicable, as all seller accounts globally have been enabled for the new eBay payment and checkout flow.</span><br/><br/>This method retrieves a seller's onboarding status for a payments program for a specified marketplace. The overall onboarding status of the seller and the status of each onboarding step is returned.",
        tags = { "onboarding" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PaymentsProgramOnboardingResponse.class))
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
        value = "/payments_program/{marketplace_id}/{payments_program_type}/onboarding",
        produces = { "application/json" }
    )
    
    default ResponseEntity<PaymentsProgramOnboardingResponse> getPaymentsProgramOnboarding(
        @Parameter(name = "marketplace_id", description = "The eBay marketplace ID associated with the onboarding status to retrieve.", required = true, in = ParameterIn.PATH) @PathVariable("marketplace_id") String marketplaceId,
        @Parameter(name = "payments_program_type", description = "The type of payments program whose status is returned by the method.", required = true, in = ParameterIn.PATH) @PathVariable("payments_program_type") String paymentsProgramType
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"onboardingStatus\" : \"onboardingStatus\", \"steps\" : [ { \"webUrl\" : \"webUrl\", \"name\" : \"name\", \"status\" : \"status\" }, { \"webUrl\" : \"webUrl\", \"name\" : \"name\", \"status\" : \"status\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
