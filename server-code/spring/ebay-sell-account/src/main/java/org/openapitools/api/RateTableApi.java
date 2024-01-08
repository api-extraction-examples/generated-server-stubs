/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.RateTableResponse;
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
@Tag(name = "rate_table", description = "the rate_table API")
public interface RateTableApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /rate_table
     * This method retrieves a seller&#39;s &lt;i&gt;shipping rate tables&lt;/i&gt; for the country specified in the &lt;b&gt;country_code&lt;/b&gt; query parameter. If you call this method without specifying a country code, the call returns all of the seller&#39;s shipping rate tables.  &lt;br/&gt;&lt;br/&gt;The method&#39;s response includes a &lt;b&gt;rateTableId&lt;/b&gt; for each table defined by the seller. This &lt;b&gt;rateTableId&lt;/b&gt; value is used in add/revise item call or in create/update fulfillment business policy call to specify the shipping rate table to use for that policy&#39;s domestic or international shipping options. &lt;br/&gt;&lt;br/&gt;This call currently supports getting rate tables related to the following marketplaces:&lt;ul&gt;&lt;li&gt;&lt;code&gt;EBAY_AU&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_CA&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_DE&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_ES&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_FR&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_GB&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_IT&lt;/code&gt;&lt;/li&gt; &lt;li&gt;&lt;code&gt;EBAY_US&lt;/code&gt;&lt;/li&gt;&lt;/ul&gt;  &lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;b&gt;Note:&lt;/b&gt; Rate tables created with the Trading API might not have been assigned a &lt;b&gt;rateTableId&lt;/b&gt; at the time of their creation. This method can assign and return &lt;b&gt;rateTableId&lt;/b&gt; values for rate tables with missing IDs if you make a request using the &lt;b&gt;country_code&lt;/b&gt; where the seller has defined rate tables.&lt;/span&gt;  &lt;br/&gt;&lt;br/&gt;Sellers can define up to 40 shipping rate tables for their account, which lets them set up different rate tables for each of the marketplaces they sell into. Go to &lt;a href&#x3D;\&quot;https://www.ebay.com/ship/rt \&quot;&gt;Shipping rate tables&lt;/a&gt; in  &lt;b&gt;My eBay&lt;/b&gt; to create and update rate tables.
     *
     * @param countryCode This query parameter specifies the two-letter &lt;a href&#x3D;\&quot;https://www.iso.org/iso-3166-country-codes.html \&quot; title&#x3D;\&quot;https://www.iso.org \&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166&lt;/a&gt; code of country for which you want shipping rate table information. If you do not specify a country code, the request returns all of the seller&#39;s defined shipping rate tables for all eBay marketplaces. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "getRateTables",
        description = "This method retrieves a seller's <i>shipping rate tables</i> for the country specified in the <b>country_code</b> query parameter. If you call this method without specifying a country code, the call returns all of the seller's shipping rate tables.  <br/><br/>The method's response includes a <b>rateTableId</b> for each table defined by the seller. This <b>rateTableId</b> value is used in add/revise item call or in create/update fulfillment business policy call to specify the shipping rate table to use for that policy's domestic or international shipping options. <br/><br/>This call currently supports getting rate tables related to the following marketplaces:<ul><li><code>EBAY_AU</code></li> <li><code>EBAY_CA</code></li> <li><code>EBAY_DE</code></li> <li><code>EBAY_ES</code></li> <li><code>EBAY_FR</code></li> <li><code>EBAY_GB</code></li> <li><code>EBAY_IT</code></li> <li><code>EBAY_US</code></li></ul>  <span class=\"tablenote\"><b>Note:</b> Rate tables created with the Trading API might not have been assigned a <b>rateTableId</b> at the time of their creation. This method can assign and return <b>rateTableId</b> values for rate tables with missing IDs if you make a request using the <b>country_code</b> where the seller has defined rate tables.</span>  <br/><br/>Sellers can define up to 40 shipping rate tables for their account, which lets them set up different rate tables for each of the marketplaces they sell into. Go to <a href=\"https://www.ebay.com/ship/rt \">Shipping rate tables</a> in  <b>My eBay</b> to create and update rate tables.",
        tags = { "rate_table" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RateTableResponse.class))
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
        value = "/rate_table",
        produces = { "application/json" }
    )
    
    default ResponseEntity<RateTableResponse> getRateTables(
        @Parameter(name = "country_code", description = "This query parameter specifies the two-letter <a href=\"https://www.iso.org/iso-3166-country-codes.html \" title=\"https://www.iso.org \" target=\"_blank\">ISO 3166</a> code of country for which you want shipping rate table information. If you do not specify a country code, the request returns all of the seller's defined shipping rate tables for all eBay marketplaces. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:CountryCodeEnum", in = ParameterIn.QUERY) @Valid @RequestParam(value = "country_code", required = false) String countryCode
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"rateTables\" : [ { \"rateTableId\" : \"rateTableId\", \"countryCode\" : \"countryCode\", \"locality\" : \"locality\", \"name\" : \"name\" }, { \"rateTableId\" : \"rateTableId\", \"countryCode\" : \"countryCode\", \"locality\" : \"locality\", \"name\" : \"name\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
