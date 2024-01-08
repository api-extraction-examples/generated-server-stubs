/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// DashboardGadgetResponse - The list of gadgets on the dashboard.
type DashboardGadgetResponse struct {

	// The list of gadgets.
	Gadgets []DashboardGadget `json:"gadgets"`
}

// AssertDashboardGadgetResponseRequired checks if the required fields are not zero-ed
func AssertDashboardGadgetResponseRequired(obj DashboardGadgetResponse) error {
	elements := map[string]interface{}{
		"gadgets": obj.Gadgets,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Gadgets {
		if err := AssertDashboardGadgetRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertDashboardGadgetResponseConstraints checks if the values respects the defined constraints
func AssertDashboardGadgetResponseConstraints(obj DashboardGadgetResponse) error {
	return nil
}
