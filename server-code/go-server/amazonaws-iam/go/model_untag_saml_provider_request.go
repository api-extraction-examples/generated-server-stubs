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




type UntagSamlProviderRequest struct {

	SAMLProviderArn string `json:"SAMLProviderArn"`

	TagKeys Array `json:"TagKeys"`
}

// AssertUntagSamlProviderRequestRequired checks if the required fields are not zero-ed
func AssertUntagSamlProviderRequestRequired(obj UntagSamlProviderRequest) error {
	elements := map[string]interface{}{
		"SAMLProviderArn": obj.SAMLProviderArn,
		"TagKeys": obj.TagKeys,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertstringRequired(obj.SAMLProviderArn); err != nil {
		return err
	}
	if err := AssertarrayRequired(obj.TagKeys); err != nil {
		return err
	}
	return nil
}

// AssertUntagSamlProviderRequestConstraints checks if the values respects the defined constraints
func AssertUntagSamlProviderRequestConstraints(obj UntagSamlProviderRequest) error {
	return nil
}
