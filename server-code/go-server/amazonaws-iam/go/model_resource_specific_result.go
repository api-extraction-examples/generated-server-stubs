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




// ResourceSpecificResult - <p>Contains the result of the simulation of a single API operation call on a single resource.</p> <p>This data type is used by a member of the <a>EvaluationResult</a> data type.</p>
type ResourceSpecificResult struct {

	EvalResourceName string `json:"EvalResourceName"`

	EvalResourceDecision PolicyEvaluationDecisionType `json:"EvalResourceDecision"`

	MatchedStatements Array `json:"MatchedStatements,omitempty"`

	MissingContextValues Array `json:"MissingContextValues,omitempty"`

	EvalDecisionDetails ModelMap `json:"EvalDecisionDetails,omitempty"`

	PermissionsBoundaryDecisionDetail ResourceSpecificResultPermissionsBoundaryDecisionDetail `json:"PermissionsBoundaryDecisionDetail,omitempty"`
}

// AssertResourceSpecificResultRequired checks if the required fields are not zero-ed
func AssertResourceSpecificResultRequired(obj ResourceSpecificResult) error {
	elements := map[string]interface{}{
		"EvalResourceName": obj.EvalResourceName,
		"EvalResourceDecision": obj.EvalResourceDecision,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertstringRequired(obj.EvalResourceName); err != nil {
		return err
	}
	if err := AssertPolicyEvaluationDecisionTypeRequired(obj.EvalResourceDecision); err != nil {
		return err
	}
	if err := AssertarrayRequired(obj.MatchedStatements); err != nil {
		return err
	}
	if err := AssertarrayRequired(obj.MissingContextValues); err != nil {
		return err
	}
	if err := AssertmapRequired(obj.EvalDecisionDetails); err != nil {
		return err
	}
	if err := AssertResourceSpecificResultPermissionsBoundaryDecisionDetailRequired(obj.PermissionsBoundaryDecisionDetail); err != nil {
		return err
	}
	return nil
}

// AssertResourceSpecificResultConstraints checks if the values respects the defined constraints
func AssertResourceSpecificResultConstraints(obj ResourceSpecificResult) error {
	return nil
}
