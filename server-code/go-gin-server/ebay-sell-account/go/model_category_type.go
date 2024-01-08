/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * API version: v1.9.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// CategoryType - The category type discerns whether the policy applies to motor vehicle listings, or to any other items except motor vehicle listings. <br/><br/>Each business policy can be associated with either or both categories ('MOTORS_VEHICLES' and 'ALL_EXCLUDING_MOTORS_VEHICLES'); however, return business policies are not applicable for motor vehicle listings.
type CategoryType struct {

	// <span class=\"tablenote\"><strong>Note:</strong> This field has been deprecated and is no longer used.<ul><li>Do not include this field in any <b>create</b> or <b>update</b> method.</li><li>This field may be returned within the payload of a <b>get</b> method, but it can be ignored.</li></ul></span>
	Default bool `json:"default,omitempty"`

	// The category type to which the policy applies (motor vehicles or non-motor vehicles). <br /><br />The <code>MOTORS_VEHICLES</code> category type is not valid for return policies. eBay flows do not support the return of motor vehicles. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:CategoryTypeEnum'>eBay API documentation</a>
	Name string `json:"name,omitempty"`
}
