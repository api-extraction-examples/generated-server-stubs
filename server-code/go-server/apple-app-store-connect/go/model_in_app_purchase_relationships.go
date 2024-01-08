/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type InAppPurchaseRelationships struct {

	Apps BetaTesterRelationshipsApps `json:"apps,omitempty"`
}

// AssertInAppPurchaseRelationshipsRequired checks if the required fields are not zero-ed
func AssertInAppPurchaseRelationshipsRequired(obj InAppPurchaseRelationships) error {
	if err := AssertBetaTesterRelationshipsAppsRequired(obj.Apps); err != nil {
		return err
	}
	return nil
}

// AssertInAppPurchaseRelationshipsConstraints checks if the values respects the defined constraints
func AssertInAppPurchaseRelationshipsConstraints(obj InAppPurchaseRelationships) error {
	return nil
}