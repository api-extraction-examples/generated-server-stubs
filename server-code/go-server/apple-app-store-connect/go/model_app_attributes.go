/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppAttributes struct {

	AvailableInNewTerritories bool `json:"availableInNewTerritories,omitempty"`

	BundleId string `json:"bundleId,omitempty"`

	ContentRightsDeclaration string `json:"contentRightsDeclaration,omitempty"`

	IsOrEverWasMadeForKids bool `json:"isOrEverWasMadeForKids,omitempty"`

	Name string `json:"name,omitempty"`

	PrimaryLocale string `json:"primaryLocale,omitempty"`

	Sku string `json:"sku,omitempty"`
}

// AssertAppAttributesRequired checks if the required fields are not zero-ed
func AssertAppAttributesRequired(obj AppAttributes) error {
	return nil
}

// AssertAppAttributesConstraints checks if the values respects the defined constraints
func AssertAppAttributesConstraints(obj AppAttributes) error {
	return nil
}