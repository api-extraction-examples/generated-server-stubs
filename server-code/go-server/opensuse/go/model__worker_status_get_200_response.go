/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * API version: 2.10.50
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type WorkerStatusGet200Response struct {

	Blocked []WorkerStatusGet200ResponseBlockedInner `json:"blocked,omitempty"`

	Buildavg []WorkerStatusGet200ResponseBuildavgInner `json:"buildavg,omitempty"`

	Building []WorkerStatusGet200ResponseBuildingInner `json:"building,omitempty"`

	Clients int32 `json:"clients,omitempty"`

	Down []WorkerStatusGet200ResponseDownInner `json:"down,omitempty"`

	Idle []WorkerStatusGet200ResponseDownInner `json:"idle,omitempty"`

	Partition []WorkerStatusGet200ResponsePartitionInner `json:"partition,omitempty"`

	Waiting []WorkerStatusGet200ResponseBlockedInner `json:"waiting,omitempty"`
}

// AssertWorkerStatusGet200ResponseRequired checks if the required fields are not zero-ed
func AssertWorkerStatusGet200ResponseRequired(obj WorkerStatusGet200Response) error {
	for _, el := range obj.Blocked {
		if err := AssertWorkerStatusGet200ResponseBlockedInnerRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Buildavg {
		if err := AssertWorkerStatusGet200ResponseBuildavgInnerRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Building {
		if err := AssertWorkerStatusGet200ResponseBuildingInnerRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Down {
		if err := AssertWorkerStatusGet200ResponseDownInnerRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Idle {
		if err := AssertWorkerStatusGet200ResponseDownInnerRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Partition {
		if err := AssertWorkerStatusGet200ResponsePartitionInnerRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Waiting {
		if err := AssertWorkerStatusGet200ResponseBlockedInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertWorkerStatusGet200ResponseConstraints checks if the values respects the defined constraints
func AssertWorkerStatusGet200ResponseConstraints(obj WorkerStatusGet200Response) error {
	return nil
}