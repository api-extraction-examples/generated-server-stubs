/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0
 * Contact: sardo@hey.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type DefaultAPI struct {
}

// Get /api/oembed
func (api *DefaultAPI) ApiOembedGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/proofs
func (api *DefaultAPI) ApiProofsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/admin/accounts
func (api *DefaultAPI) ApiV1AdminAccountsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/admin/accounts/:id/action
func (api *DefaultAPI) ApiV1AdminAccountsIdActionPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/admin/accounts/:id/approve
func (api *DefaultAPI) ApiV1AdminAccountsIdApprovePost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/admin/accounts/:id/enable
func (api *DefaultAPI) ApiV1AdminAccountsIdEnablePost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/admin/accounts/:id
func (api *DefaultAPI) ApiV1AdminAccountsIdGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/admin/accounts/:id/reject
func (api *DefaultAPI) ApiV1AdminAccountsIdRejectPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/admin/accounts/:id/unsilence
func (api *DefaultAPI) ApiV1AdminAccountsIdUnsilencePost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/admin/accounts/:id/unsuspend
func (api *DefaultAPI) ApiV1AdminAccountsIdUnsuspendPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/admin/reports
func (api *DefaultAPI) ApiV1AdminReportsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/admin/reports/:id/assign_to_self
func (api *DefaultAPI) ApiV1AdminReportsIdAssignToSelfPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/admin/reports/:id
func (api *DefaultAPI) ApiV1AdminReportsIdGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/admin/reports/:id/reopen
func (api *DefaultAPI) ApiV1AdminReportsIdReopenPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/admin/reports/:id/resolve
func (api *DefaultAPI) ApiV1AdminReportsIdResolvePost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/admin/reports/:id/unassign
func (api *DefaultAPI) ApiV1AdminReportsIdUnassignPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/announcements
func (api *DefaultAPI) ApiV1AnnouncementsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/announcements/:id/dismiss
func (api *DefaultAPI) ApiV1AnnouncementsIdDismissPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /api/v1/announcements/:id/reactions/:name
func (api *DefaultAPI) ApiV1AnnouncementsIdReactionsNameDelete(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /api/v1/announcements/:id/reactions/:name
func (api *DefaultAPI) ApiV1AnnouncementsIdReactionsNamePut(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/blocks
func (api *DefaultAPI) ApiV1BlocksGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/bookmarks
func (api *DefaultAPI) ApiV1BookmarksGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/conversations
func (api *DefaultAPI) ApiV1ConversationsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /api/v1/conversations/:id
func (api *DefaultAPI) ApiV1ConversationsIdDelete(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/conversations/:id/read
func (api *DefaultAPI) ApiV1ConversationsIdReadPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/custom_emojis
func (api *DefaultAPI) ApiV1CustomEmojisGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/directory
func (api *DefaultAPI) ApiV1DirectoryGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /api/v1/domain_blocks
func (api *DefaultAPI) ApiV1DomainBlocksDelete(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/domain_blocks
func (api *DefaultAPI) ApiV1DomainBlocksGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/domain_blocks
func (api *DefaultAPI) ApiV1DomainBlocksPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/endorsements
func (api *DefaultAPI) ApiV1EndorsementsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/favourites
func (api *DefaultAPI) ApiV1FavouritesGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/featured_tags
func (api *DefaultAPI) ApiV1FeaturedTagsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /api/v1/featured_tags/:id
func (api *DefaultAPI) ApiV1FeaturedTagsIdDelete(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/featured_tags
func (api *DefaultAPI) ApiV1FeaturedTagsPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/featured_tags/suggestions
func (api *DefaultAPI) ApiV1FeaturedTagsSuggestionsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/filters
func (api *DefaultAPI) ApiV1FiltersGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /api/v1/filters/:id
func (api *DefaultAPI) ApiV1FiltersIdDelete(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/filters/:id
func (api *DefaultAPI) ApiV1FiltersIdGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /api/v1/filters/:id
func (api *DefaultAPI) ApiV1FiltersIdPut(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/filters
func (api *DefaultAPI) ApiV1FiltersPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/follow_requests
func (api *DefaultAPI) ApiV1FollowRequestsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/follow_requests/:id/authorize
func (api *DefaultAPI) ApiV1FollowRequestsIdAuthorizePost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/follow_requests/:id/reject
func (api *DefaultAPI) ApiV1FollowRequestsIdRejectPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/instance/activity
func (api *DefaultAPI) ApiV1InstanceActivityGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/instance
func (api *DefaultAPI) ApiV1InstanceGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/instance/peers
func (api *DefaultAPI) ApiV1InstancePeersGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /api/v1/lists
func (api *DefaultAPI) ApiV1ListsDelete(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/lists
func (api *DefaultAPI) ApiV1ListsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /api/v1/lists/:id/accounts
func (api *DefaultAPI) ApiV1ListsIdAccountsDelete(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/lists/:id/accounts
func (api *DefaultAPI) ApiV1ListsIdAccountsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/lists/:id/accounts
func (api *DefaultAPI) ApiV1ListsIdAccountsPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/lists/:id
func (api *DefaultAPI) ApiV1ListsIdGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/lists
func (api *DefaultAPI) ApiV1ListsPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /api/v1/lists
func (api *DefaultAPI) ApiV1ListsPut(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/markers
func (api *DefaultAPI) ApiV1MarkersGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/markers
func (api *DefaultAPI) ApiV1MarkersPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/media/:id
func (api *DefaultAPI) ApiV1MediaIdGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/media/:id
func (api *DefaultAPI) ApiV1MediaIdPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/media
func (api *DefaultAPI) ApiV1MediaPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/mutes
func (api *DefaultAPI) ApiV1MutesGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/notifications/clear
func (api *DefaultAPI) ApiV1NotificationsClearPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/notifications
func (api *DefaultAPI) ApiV1NotificationsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/notifications/:id/dismiss
func (api *DefaultAPI) ApiV1NotificationsIdDismissPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/notifications/:id
func (api *DefaultAPI) ApiV1NotificationsIdGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/polls/:id
func (api *DefaultAPI) ApiV1PollsIdGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/polls/:id
func (api *DefaultAPI) ApiV1PollsIdPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/preferences
func (api *DefaultAPI) ApiV1PreferencesGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /api/v1/push/subscription
func (api *DefaultAPI) ApiV1PushSubscriptionDelete(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/push/subscription
func (api *DefaultAPI) ApiV1PushSubscriptionGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/push/subscription
func (api *DefaultAPI) ApiV1PushSubscriptionPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /api/v1/push/subscription
func (api *DefaultAPI) ApiV1PushSubscriptionPut(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/reports
func (api *DefaultAPI) ApiV1ReportsPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/scheduled_statuses
func (api *DefaultAPI) ApiV1ScheduledStatusesGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /api/v1/scheduled_statuses/:id
func (api *DefaultAPI) ApiV1ScheduledStatusesIdDelete(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/scheduled_statuses/:id
func (api *DefaultAPI) ApiV1ScheduledStatusesIdGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Put /api/v1/scheduled_statuses/:id
func (api *DefaultAPI) ApiV1ScheduledStatusesIdPut(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/statuses/:id/bookmark
func (api *DefaultAPI) ApiV1StatusesIdBookmarkPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/statuses/:id/context
func (api *DefaultAPI) ApiV1StatusesIdContextGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /api/v1/statuses/:id
func (api *DefaultAPI) ApiV1StatusesIdDelete(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/statuses/:id/favourite
func (api *DefaultAPI) ApiV1StatusesIdFavouritePost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/statuses/:id/favourited_by
func (api *DefaultAPI) ApiV1StatusesIdFavouritedByGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/statuses/:id
func (api *DefaultAPI) ApiV1StatusesIdGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/statuses/:id/mute
func (api *DefaultAPI) ApiV1StatusesIdMutePost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/statuses/:id/pin
func (api *DefaultAPI) ApiV1StatusesIdPinPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/statuses/:id/reblog
func (api *DefaultAPI) ApiV1StatusesIdReblogPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/statuses/:id/reblogged_by
func (api *DefaultAPI) ApiV1StatusesIdRebloggedByGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/statuses/:id/unbookmark
func (api *DefaultAPI) ApiV1StatusesIdUnbookmarkPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/statuses/:id/unfavourite
func (api *DefaultAPI) ApiV1StatusesIdUnfavouritePost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/statuses/:id/unmute
func (api *DefaultAPI) ApiV1StatusesIdUnmutePost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/statuses/:id/unpin
func (api *DefaultAPI) ApiV1StatusesIdUnpinPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/statuses/:id/unreblog
func (api *DefaultAPI) ApiV1StatusesIdUnreblogPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /api/v1/statuses
func (api *DefaultAPI) ApiV1StatusesPost(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/suggestions
func (api *DefaultAPI) ApiV1SuggestionsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /api/v1/suggestions/:id
func (api *DefaultAPI) ApiV1SuggestionsIdDelete(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/timelines/home
func (api *DefaultAPI) ApiV1TimelinesHomeGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/timelines/list/:list_id
func (api *DefaultAPI) ApiV1TimelinesListListIdGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/timelines/public
func (api *DefaultAPI) ApiV1TimelinesPublicGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/timelines/tag/:hashtag
func (api *DefaultAPI) ApiV1TimelinesTagHashtagGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v1/trends
func (api *DefaultAPI) ApiV1TrendsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /api/v2/search
func (api *DefaultAPI) ApiV2SearchGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

