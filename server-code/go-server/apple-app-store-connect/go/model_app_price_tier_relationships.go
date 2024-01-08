/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppPriceTierRelationships struct {

	PricePoints AppPriceTierRelationshipsPricePoints `json:"pricePoints,omitempty"`
}

// AssertAppPriceTierRelationshipsRequired checks if the required fields are not zero-ed
func AssertAppPriceTierRelationshipsRequired(obj AppPriceTierRelationships) error {
	if err := AssertAppPriceTierRelationshipsPricePointsRequired(obj.PricePoints); err != nil {
		return err
	}
	return nil
}

// AssertAppPriceTierRelationshipsConstraints checks if the values respects the defined constraints
func AssertAppPriceTierRelationshipsConstraints(obj AppPriceTierRelationships) error {
	return nil
}