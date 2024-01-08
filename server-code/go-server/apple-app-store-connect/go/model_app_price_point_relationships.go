/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppPricePointRelationships struct {

	PriceTier AppPriceRelationshipsPriceTier `json:"priceTier,omitempty"`

	Territory AppPricePointRelationshipsTerritory `json:"territory,omitempty"`
}

// AssertAppPricePointRelationshipsRequired checks if the required fields are not zero-ed
func AssertAppPricePointRelationshipsRequired(obj AppPricePointRelationships) error {
	if err := AssertAppPriceRelationshipsPriceTierRequired(obj.PriceTier); err != nil {
		return err
	}
	if err := AssertAppPricePointRelationshipsTerritoryRequired(obj.Territory); err != nil {
		return err
	}
	return nil
}

// AssertAppPricePointRelationshipsConstraints checks if the values respects the defined constraints
func AssertAppPricePointRelationshipsConstraints(obj AppPricePointRelationships) error {
	return nil
}
