/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type GetPortfolioMembership200Response struct {

	Data PortfolioMembershipCompact `json:"data,omitempty"`
}

// AssertGetPortfolioMembership200ResponseRequired checks if the required fields are not zero-ed
func AssertGetPortfolioMembership200ResponseRequired(obj GetPortfolioMembership200Response) error {
	if err := AssertPortfolioMembershipCompactRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertGetPortfolioMembership200ResponseConstraints checks if the values respects the defined constraints
func AssertGetPortfolioMembership200ResponseConstraints(obj GetPortfolioMembership200Response) error {
	return nil
}
