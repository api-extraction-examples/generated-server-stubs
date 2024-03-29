/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BetaTesterCreateRequestDataRelationshipsBetaGroups struct {

	Data []AppRelationshipsBetaGroupsDataInner `json:"data,omitempty"`
}

// AssertBetaTesterCreateRequestDataRelationshipsBetaGroupsRequired checks if the required fields are not zero-ed
func AssertBetaTesterCreateRequestDataRelationshipsBetaGroupsRequired(obj BetaTesterCreateRequestDataRelationshipsBetaGroups) error {
	for _, el := range obj.Data {
		if err := AssertAppRelationshipsBetaGroupsDataInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertBetaTesterCreateRequestDataRelationshipsBetaGroupsConstraints checks if the values respects the defined constraints
func AssertBetaTesterCreateRequestDataRelationshipsBetaGroupsConstraints(obj BetaTesterCreateRequestDataRelationshipsBetaGroups) error {
	return nil
}
