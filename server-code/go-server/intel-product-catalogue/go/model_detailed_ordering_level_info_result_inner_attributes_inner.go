/*
 * Intel Product Catalogue Service
 *
 * This is the documentation for PIM Micro services. In order to use this tool you need to have Basic Auth credentials and a client id. If you dont have one, please make sure to request one by sending an email to the PIM MS team: [pim.360.team@intel.com](mailto:pim.360.team@intel.com?subject=PIMServices)
 *
 * API version: 0.1.0
 * Contact: pim.360.team@intel.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type DetailedOrderingLevelInfoResultInnerAttributesInner struct {

	HighlightKey string `json:"highlight_key,omitempty"`

	Label string `json:"label,omitempty"`

	RawValue string `json:"raw_value,omitempty"`

	ToolTip string `json:"tool_tip,omitempty"`

	Value string `json:"value,omitempty"`
}

// AssertDetailedOrderingLevelInfoResultInnerAttributesInnerRequired checks if the required fields are not zero-ed
func AssertDetailedOrderingLevelInfoResultInnerAttributesInnerRequired(obj DetailedOrderingLevelInfoResultInnerAttributesInner) error {
	return nil
}

// AssertDetailedOrderingLevelInfoResultInnerAttributesInnerConstraints checks if the values respects the defined constraints
func AssertDetailedOrderingLevelInfoResultInnerAttributesInnerConstraints(obj DetailedOrderingLevelInfoResultInnerAttributesInner) error {
	return nil
}
