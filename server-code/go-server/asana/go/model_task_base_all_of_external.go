/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// TaskBaseAllOfExternal - *OAuth Required*. *Conditional*. This field is returned only if external values are set or included by using [Opt In] (/docs/input-output-options). The external field allows you to store app-specific metadata on tasks, including a gid that can be used to retrieve tasks and a data blob that can store app-specific character strings. Note that you will need to authenticate with Oauth to access or modify this data. Once an external gid is set, you can use the notation `external:custom_gid` to reference your object anywhere in the API where you may use the original object gid. See the page on Custom External Data for more details.
type TaskBaseAllOfExternal struct {

	Data string `json:"data,omitempty"`

	Gid string `json:"gid,omitempty"`
}

// AssertTaskBaseAllOfExternalRequired checks if the required fields are not zero-ed
func AssertTaskBaseAllOfExternalRequired(obj TaskBaseAllOfExternal) error {
	return nil
}

// AssertTaskBaseAllOfExternalConstraints checks if the values respects the defined constraints
func AssertTaskBaseAllOfExternalConstraints(obj TaskBaseAllOfExternal) error {
	return nil
}
