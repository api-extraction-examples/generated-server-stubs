/*
 * CircleCI REST API
 *
 * The CircleCI API is a RESTful, fully-featured API that allows you to do almost anything in CircleCI. You can access all information and trigger all actions. The only thing we don’t provide access to is billing functions, which must be done from the CircleCI web UI. 
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"time"
)

type User struct {

	Admin bool `json:"admin,omitempty"`

	AllEmails []string `json:"all_emails,omitempty"`

	AnalyticsId string `json:"analytics_id,omitempty"`

	AvatarUrl string `json:"avatar_url,omitempty"`

	BasicEmailPrefs string `json:"basic_email_prefs,omitempty"`

	Bitbucket *int32 `json:"bitbucket,omitempty"`

	BitbucketAuthorized bool `json:"bitbucket_authorized,omitempty"`

	Containers int32 `json:"containers,omitempty"`

	CreatedAt time.Time `json:"created_at,omitempty"`

	DaysLeftInTrial int32 `json:"days_left_in_trial,omitempty"`

	DevAdmin bool `json:"dev_admin,omitempty"`

	EnrolledBetas []string `json:"enrolled_betas,omitempty"`

	GithubId *int32 `json:"github_id,omitempty"`

	GithubOauthScopes []string `json:"github_oauth_scopes,omitempty"`

	GravatarId *int32 `json:"gravatar_id,omitempty"`

	HerokuApiKey *string `json:"heroku_api_key,omitempty"`

	InBetaProgram bool `json:"in_beta_program,omitempty"`

	Login string `json:"login,omitempty"`

	Name string `json:"name,omitempty"`

	OrganizationPrefs map[string]interface{} `json:"organization_prefs,omitempty"`

	Parallelism int32 `json:"parallelism,omitempty"`

	Plan *string `json:"plan,omitempty"`

	Projects map[string]interface{} `json:"projects,omitempty"`

	PusherId string `json:"pusher_id,omitempty"`

	SelectedEmail string `json:"selected_email,omitempty"`

	SignInCount int32 `json:"sign_in_count,omitempty"`

	TrialEnd time.Time `json:"trial_end,omitempty"`
}