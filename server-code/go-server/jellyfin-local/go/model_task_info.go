/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// TaskInfo - Class TaskInfo.
type TaskInfo struct {

	// Gets or sets the category.
	Category *string `json:"Category,omitempty"`

	// Gets or sets the progress.
	CurrentProgressPercentage *float64 `json:"CurrentProgressPercentage,omitempty"`

	// Gets or sets the description.
	Description *string `json:"Description,omitempty"`

	// Gets or sets the id.
	Id *string `json:"Id,omitempty"`

	// Gets or sets a value indicating whether this instance is hidden.
	IsHidden bool `json:"IsHidden,omitempty"`

	// Gets or sets the key.
	Key *string `json:"Key,omitempty"`

	LastExecutionResult TaskResult `json:"LastExecutionResult,omitempty"`

	// Gets or sets the name.
	Name *string `json:"Name,omitempty"`

	State TaskState `json:"State,omitempty"`

	// Gets or sets the triggers.
	Triggers *[]TaskTriggerInfo `json:"Triggers,omitempty"`
}

// AssertTaskInfoRequired checks if the required fields are not zero-ed
func AssertTaskInfoRequired(obj TaskInfo) error {
	if err := AssertTaskResultRequired(obj.LastExecutionResult); err != nil {
		return err
	}
	if obj.Triggers != nil {
		for _, el := range *obj.Triggers {
			if err := AssertTaskTriggerInfoRequired(el); err != nil {
				return err
			}
		}
	}
	return nil
}

// AssertTaskInfoConstraints checks if the values respects the defined constraints
func AssertTaskInfoConstraints(obj TaskInfo) error {
	return nil
}