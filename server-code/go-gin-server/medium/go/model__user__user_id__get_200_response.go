/*
 * Medium API
 *
 * Medium API helps you to quickly extract data from Medium's Website (https://medium.com).   You can gather data related to users, publications, articles (including its textual content), latest posts &amp; top writers within a topic/niche, etc… 
 *
 * API version: 1.0
 * Contact: nishu@mediumapi.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type UserUserIdGet200Response struct {

	AllowNotes bool `json:"allow_notes,omitempty"`

	Bio string `json:"bio,omitempty"`

	FollowersCount int32 `json:"followers_count,omitempty"`

	FollowingCount int32 `json:"following_count,omitempty"`

	Fullname string `json:"fullname,omitempty"`

	HasList bool `json:"has_list,omitempty"`

	Id string `json:"id,omitempty"`

	ImageUrl string `json:"image_url,omitempty"`

	IsBookAuthor bool `json:"is_book_author,omitempty"`

	IsSuspended bool `json:"is_suspended,omitempty"`

	IsWriterProgramEnrolled bool `json:"is_writer_program_enrolled,omitempty"`

	MediumMemberAt string `json:"medium_member_at,omitempty"`

	TopWriterIn []string `json:"top_writer_in,omitempty"`

	TwitterUsername string `json:"twitter_username,omitempty"`

	Username string `json:"username,omitempty"`
}
