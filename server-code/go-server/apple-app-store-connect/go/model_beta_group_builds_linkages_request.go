/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BetaGroupBuildsLinkagesRequest struct {

	Data []AppRelationshipsBuildsDataInner `json:"data"`
}

// AssertBetaGroupBuildsLinkagesRequestRequired checks if the required fields are not zero-ed
func AssertBetaGroupBuildsLinkagesRequestRequired(obj BetaGroupBuildsLinkagesRequest) error {
	elements := map[string]interface{}{
		"data": obj.Data,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Data {
		if err := AssertAppRelationshipsBuildsDataInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertBetaGroupBuildsLinkagesRequestConstraints checks if the values respects the defined constraints
func AssertBetaGroupBuildsLinkagesRequestConstraints(obj BetaGroupBuildsLinkagesRequest) error {
	return nil
}
