/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type CreatePortfolio201Response struct {

	Data PortfolioResponse `json:"data,omitempty"`
}

// AssertCreatePortfolio201ResponseRequired checks if the required fields are not zero-ed
func AssertCreatePortfolio201ResponseRequired(obj CreatePortfolio201Response) error {
	if err := AssertPortfolioResponseRequired(obj.Data); err != nil {
		return err
	}
	return nil
}

// AssertCreatePortfolio201ResponseConstraints checks if the values respects the defined constraints
func AssertCreatePortfolio201ResponseConstraints(obj CreatePortfolio201Response) error {
	return nil
}
