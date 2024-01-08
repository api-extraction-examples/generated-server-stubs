/*
 * AWS Identity and Access Management
 *
 * <fullname>Identity and Access Management</fullname> <p>Identity and Access Management (IAM) is a web service for securely controlling access to Amazon Web Services services. With IAM, you can centrally manage users, security credentials such as access keys, and permissions that control which Amazon Web Services resources users and applications can access. For more information about IAM, see <a href=\"http://aws.amazon.com/iam/\">Identity and Access Management (IAM)</a> and the <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/\">Identity and Access Management User Guide</a>.</p>
 *
 * API version: 2010-05-08
 * Contact: mike.ralphson@gmail.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type SimulatePrincipalPolicyRequest struct {

	PolicySourceArn string `json:"PolicySourceArn"`

	PolicyInputList Array `json:"PolicyInputList,omitempty"`

	PermissionsBoundaryPolicyInputList Array `json:"PermissionsBoundaryPolicyInputList,omitempty"`

	ActionNames Array `json:"ActionNames"`

	ResourceArns Array `json:"ResourceArns,omitempty"`

	ResourcePolicy string `json:"ResourcePolicy,omitempty"`

	ResourceOwner string `json:"ResourceOwner,omitempty"`

	CallerArn string `json:"CallerArn,omitempty"`

	ContextEntries Array `json:"ContextEntries,omitempty"`

	ResourceHandlingOption string `json:"ResourceHandlingOption,omitempty"`

	MaxItems int32 `json:"MaxItems,omitempty"`

	Marker string `json:"Marker,omitempty"`
}

// AssertSimulatePrincipalPolicyRequestRequired checks if the required fields are not zero-ed
func AssertSimulatePrincipalPolicyRequestRequired(obj SimulatePrincipalPolicyRequest) error {
	elements := map[string]interface{}{
		"PolicySourceArn": obj.PolicySourceArn,
		"ActionNames": obj.ActionNames,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertstringRequired(obj.PolicySourceArn); err != nil {
		return err
	}
	if err := AssertarrayRequired(obj.PolicyInputList); err != nil {
		return err
	}
	if err := AssertarrayRequired(obj.PermissionsBoundaryPolicyInputList); err != nil {
		return err
	}
	if err := AssertarrayRequired(obj.ActionNames); err != nil {
		return err
	}
	if err := AssertarrayRequired(obj.ResourceArns); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.ResourcePolicy); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.ResourceOwner); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.CallerArn); err != nil {
		return err
	}
	if err := AssertarrayRequired(obj.ContextEntries); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.ResourceHandlingOption); err != nil {
		return err
	}
	if err := Assertint32Required(obj.MaxItems); err != nil {
		return err
	}
	if err := AssertstringRequired(obj.Marker); err != nil {
		return err
	}
	return nil
}

// AssertSimulatePrincipalPolicyRequestConstraints checks if the values respects the defined constraints
func AssertSimulatePrincipalPolicyRequestConstraints(obj SimulatePrincipalPolicyRequest) error {
	return nil
}
