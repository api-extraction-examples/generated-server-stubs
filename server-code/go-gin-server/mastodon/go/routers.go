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
	"net/http"

	"github.com/gin-gonic/gin"
)

// Route is the information for every URI.
type Route struct {
	// Name is the name of this Route.
	Name		string
	// Method is the string for the HTTP method. ex) GET, POST etc..
	Method		string
	// Pattern is the pattern of the URI.
	Pattern	 	string
	// HandlerFunc is the handler function of this route.
	HandlerFunc	gin.HandlerFunc
}

// NewRouter returns a new router.
func NewRouter(handleFunctions ApiHandleFunctions) *gin.Engine {
	router := gin.Default()
	for _, route := range getRoutes(handleFunctions) {
		if route.HandlerFunc == nil {
			route.HandlerFunc = DefaultHandleFunc
		}
		switch route.Method {
		case http.MethodGet:
			router.GET(route.Pattern, route.HandlerFunc)
		case http.MethodPost:
			router.POST(route.Pattern, route.HandlerFunc)
		case http.MethodPut:
			router.PUT(route.Pattern, route.HandlerFunc)
		case http.MethodPatch:
			router.PATCH(route.Pattern, route.HandlerFunc)
		case http.MethodDelete:
			router.DELETE(route.Pattern, route.HandlerFunc)
		}
	}

	return router
}

// Default handler for not yet implemented routes
func DefaultHandleFunc(c *gin.Context) {
	c.String(http.StatusNotImplemented, "501 not implemented")
}

type ApiHandleFunctions struct {

	// Routes for the AccountsAPI part of the API
	AccountsAPI AccountsAPI
	// Routes for the AppsAPI part of the API
	AppsAPI AppsAPI
	// Routes for the DefaultAPI part of the API
	DefaultAPI DefaultAPI
	// Routes for the OauthAPI part of the API
	OauthAPI OauthAPI
	// Routes for the TODOSecurityAPI part of the API
	TODOSecurityAPI TODOSecurityAPI
}

func getRoutes(handleFunctions ApiHandleFunctions) []Route {
	return []Route{ 
		{
			"ApiV1AccountsIdBlockPost",
			http.MethodPost,
			"/api/v1/accounts/:id/block",
			handleFunctions.AccountsAPI.ApiV1AccountsIdBlockPost,
		},
		{
			"ApiV1AccountsIdFeaturedTagsGet",
			http.MethodGet,
			"/api/v1/accounts/:id/featured_tags",
			handleFunctions.AccountsAPI.ApiV1AccountsIdFeaturedTagsGet,
		},
		{
			"ApiV1AccountsIdFollowPost",
			http.MethodPost,
			"/api/v1/accounts/:id/follow",
			handleFunctions.AccountsAPI.ApiV1AccountsIdFollowPost,
		},
		{
			"ApiV1AccountsIdFollowersGet",
			http.MethodGet,
			"/api/v1/accounts/:id/followers",
			handleFunctions.AccountsAPI.ApiV1AccountsIdFollowersGet,
		},
		{
			"ApiV1AccountsIdFollowingGet",
			http.MethodGet,
			"/api/v1/accounts/:id/following",
			handleFunctions.AccountsAPI.ApiV1AccountsIdFollowingGet,
		},
		{
			"ApiV1AccountsIdGet",
			http.MethodGet,
			"/api/v1/accounts/:id",
			handleFunctions.AccountsAPI.ApiV1AccountsIdGet,
		},
		{
			"ApiV1AccountsIdIdentityProofsGet",
			http.MethodGet,
			"/api/v1/accounts/:id/identity_proofs",
			handleFunctions.AccountsAPI.ApiV1AccountsIdIdentityProofsGet,
		},
		{
			"ApiV1AccountsIdListsGet",
			http.MethodGet,
			"/api/v1/accounts/:id/lists",
			handleFunctions.AccountsAPI.ApiV1AccountsIdListsGet,
		},
		{
			"ApiV1AccountsIdMutePost",
			http.MethodPost,
			"/api/v1/accounts/:id/mute",
			handleFunctions.AccountsAPI.ApiV1AccountsIdMutePost,
		},
		{
			"ApiV1AccountsIdNotePost",
			http.MethodPost,
			"/api/v1/accounts/:id/note",
			handleFunctions.AccountsAPI.ApiV1AccountsIdNotePost,
		},
		{
			"ApiV1AccountsIdPinPost",
			http.MethodPost,
			"/api/v1/accounts/:id/pin",
			handleFunctions.AccountsAPI.ApiV1AccountsIdPinPost,
		},
		{
			"ApiV1AccountsIdStatusesGet",
			http.MethodGet,
			"/api/v1/accounts/:id/statuses",
			handleFunctions.AccountsAPI.ApiV1AccountsIdStatusesGet,
		},
		{
			"ApiV1AccountsIdUnblockPost",
			http.MethodPost,
			"/api/v1/accounts/:id/unblock",
			handleFunctions.AccountsAPI.ApiV1AccountsIdUnblockPost,
		},
		{
			"ApiV1AccountsIdUnfollowPost",
			http.MethodPost,
			"/api/v1/accounts/:id/unfollow",
			handleFunctions.AccountsAPI.ApiV1AccountsIdUnfollowPost,
		},
		{
			"ApiV1AccountsIdUnmutePost",
			http.MethodPost,
			"/api/v1/accounts/:id/unmute",
			handleFunctions.AccountsAPI.ApiV1AccountsIdUnmutePost,
		},
		{
			"ApiV1AccountsIdUnpinPost",
			http.MethodPost,
			"/api/v1/accounts/:id/unpin",
			handleFunctions.AccountsAPI.ApiV1AccountsIdUnpinPost,
		},
		{
			"ApiV1AccountsPost",
			http.MethodPost,
			"/api/v1/accounts",
			handleFunctions.AccountsAPI.ApiV1AccountsPost,
		},
		{
			"ApiV1AccountsRelationshipsGet",
			http.MethodGet,
			"/api/v1/accounts/relationships",
			handleFunctions.AccountsAPI.ApiV1AccountsRelationshipsGet,
		},
		{
			"ApiV1AccountsSearchGet",
			http.MethodGet,
			"/api/v1/accounts/search",
			handleFunctions.AccountsAPI.ApiV1AccountsSearchGet,
		},
		{
			"ApiV1AccountsUpdateCredentialsPatch",
			http.MethodPatch,
			"/api/v1/accounts/update_credentials",
			handleFunctions.AccountsAPI.ApiV1AccountsUpdateCredentialsPatch,
		},
		{
			"ApiV1AccountsVerifyCredentialsGet",
			http.MethodGet,
			"/api/v1/accounts/verify_credentials",
			handleFunctions.AccountsAPI.ApiV1AccountsVerifyCredentialsGet,
		},
		{
			"ApiV1AppsPost",
			http.MethodPost,
			"/api/v1/apps",
			handleFunctions.AppsAPI.ApiV1AppsPost,
		},
		{
			"ApiV1AppsVerifyCredentialsGet",
			http.MethodGet,
			"/api/v1/apps/verify_credentials",
			handleFunctions.AppsAPI.ApiV1AppsVerifyCredentialsGet,
		},
		{
			"ApiOembedGet",
			http.MethodGet,
			"/api/oembed",
			handleFunctions.DefaultAPI.ApiOembedGet,
		},
		{
			"ApiProofsGet",
			http.MethodGet,
			"/api/proofs",
			handleFunctions.DefaultAPI.ApiProofsGet,
		},
		{
			"ApiV1AdminAccountsGet",
			http.MethodGet,
			"/api/v1/admin/accounts",
			handleFunctions.DefaultAPI.ApiV1AdminAccountsGet,
		},
		{
			"ApiV1AdminAccountsIdActionPost",
			http.MethodPost,
			"/api/v1/admin/accounts/:id/action",
			handleFunctions.DefaultAPI.ApiV1AdminAccountsIdActionPost,
		},
		{
			"ApiV1AdminAccountsIdApprovePost",
			http.MethodPost,
			"/api/v1/admin/accounts/:id/approve",
			handleFunctions.DefaultAPI.ApiV1AdminAccountsIdApprovePost,
		},
		{
			"ApiV1AdminAccountsIdEnablePost",
			http.MethodPost,
			"/api/v1/admin/accounts/:id/enable",
			handleFunctions.DefaultAPI.ApiV1AdminAccountsIdEnablePost,
		},
		{
			"ApiV1AdminAccountsIdGet",
			http.MethodGet,
			"/api/v1/admin/accounts/:id",
			handleFunctions.DefaultAPI.ApiV1AdminAccountsIdGet,
		},
		{
			"ApiV1AdminAccountsIdRejectPost",
			http.MethodPost,
			"/api/v1/admin/accounts/:id/reject",
			handleFunctions.DefaultAPI.ApiV1AdminAccountsIdRejectPost,
		},
		{
			"ApiV1AdminAccountsIdUnsilencePost",
			http.MethodPost,
			"/api/v1/admin/accounts/:id/unsilence",
			handleFunctions.DefaultAPI.ApiV1AdminAccountsIdUnsilencePost,
		},
		{
			"ApiV1AdminAccountsIdUnsuspendPost",
			http.MethodPost,
			"/api/v1/admin/accounts/:id/unsuspend",
			handleFunctions.DefaultAPI.ApiV1AdminAccountsIdUnsuspendPost,
		},
		{
			"ApiV1AdminReportsGet",
			http.MethodGet,
			"/api/v1/admin/reports",
			handleFunctions.DefaultAPI.ApiV1AdminReportsGet,
		},
		{
			"ApiV1AdminReportsIdAssignToSelfPost",
			http.MethodPost,
			"/api/v1/admin/reports/:id/assign_to_self",
			handleFunctions.DefaultAPI.ApiV1AdminReportsIdAssignToSelfPost,
		},
		{
			"ApiV1AdminReportsIdGet",
			http.MethodGet,
			"/api/v1/admin/reports/:id",
			handleFunctions.DefaultAPI.ApiV1AdminReportsIdGet,
		},
		{
			"ApiV1AdminReportsIdReopenPost",
			http.MethodPost,
			"/api/v1/admin/reports/:id/reopen",
			handleFunctions.DefaultAPI.ApiV1AdminReportsIdReopenPost,
		},
		{
			"ApiV1AdminReportsIdResolvePost",
			http.MethodPost,
			"/api/v1/admin/reports/:id/resolve",
			handleFunctions.DefaultAPI.ApiV1AdminReportsIdResolvePost,
		},
		{
			"ApiV1AdminReportsIdUnassignPost",
			http.MethodPost,
			"/api/v1/admin/reports/:id/unassign",
			handleFunctions.DefaultAPI.ApiV1AdminReportsIdUnassignPost,
		},
		{
			"ApiV1AnnouncementsGet",
			http.MethodGet,
			"/api/v1/announcements",
			handleFunctions.DefaultAPI.ApiV1AnnouncementsGet,
		},
		{
			"ApiV1AnnouncementsIdDismissPost",
			http.MethodPost,
			"/api/v1/announcements/:id/dismiss",
			handleFunctions.DefaultAPI.ApiV1AnnouncementsIdDismissPost,
		},
		{
			"ApiV1AnnouncementsIdReactionsNameDelete",
			http.MethodDelete,
			"/api/v1/announcements/:id/reactions/:name",
			handleFunctions.DefaultAPI.ApiV1AnnouncementsIdReactionsNameDelete,
		},
		{
			"ApiV1AnnouncementsIdReactionsNamePut",
			http.MethodPut,
			"/api/v1/announcements/:id/reactions/:name",
			handleFunctions.DefaultAPI.ApiV1AnnouncementsIdReactionsNamePut,
		},
		{
			"ApiV1BlocksGet",
			http.MethodGet,
			"/api/v1/blocks",
			handleFunctions.DefaultAPI.ApiV1BlocksGet,
		},
		{
			"ApiV1BookmarksGet",
			http.MethodGet,
			"/api/v1/bookmarks",
			handleFunctions.DefaultAPI.ApiV1BookmarksGet,
		},
		{
			"ApiV1ConversationsGet",
			http.MethodGet,
			"/api/v1/conversations",
			handleFunctions.DefaultAPI.ApiV1ConversationsGet,
		},
		{
			"ApiV1ConversationsIdDelete",
			http.MethodDelete,
			"/api/v1/conversations/:id",
			handleFunctions.DefaultAPI.ApiV1ConversationsIdDelete,
		},
		{
			"ApiV1ConversationsIdReadPost",
			http.MethodPost,
			"/api/v1/conversations/:id/read",
			handleFunctions.DefaultAPI.ApiV1ConversationsIdReadPost,
		},
		{
			"ApiV1CustomEmojisGet",
			http.MethodGet,
			"/api/v1/custom_emojis",
			handleFunctions.DefaultAPI.ApiV1CustomEmojisGet,
		},
		{
			"ApiV1DirectoryGet",
			http.MethodGet,
			"/api/v1/directory",
			handleFunctions.DefaultAPI.ApiV1DirectoryGet,
		},
		{
			"ApiV1DomainBlocksDelete",
			http.MethodDelete,
			"/api/v1/domain_blocks",
			handleFunctions.DefaultAPI.ApiV1DomainBlocksDelete,
		},
		{
			"ApiV1DomainBlocksGet",
			http.MethodGet,
			"/api/v1/domain_blocks",
			handleFunctions.DefaultAPI.ApiV1DomainBlocksGet,
		},
		{
			"ApiV1DomainBlocksPost",
			http.MethodPost,
			"/api/v1/domain_blocks",
			handleFunctions.DefaultAPI.ApiV1DomainBlocksPost,
		},
		{
			"ApiV1EndorsementsGet",
			http.MethodGet,
			"/api/v1/endorsements",
			handleFunctions.DefaultAPI.ApiV1EndorsementsGet,
		},
		{
			"ApiV1FavouritesGet",
			http.MethodGet,
			"/api/v1/favourites",
			handleFunctions.DefaultAPI.ApiV1FavouritesGet,
		},
		{
			"ApiV1FeaturedTagsGet",
			http.MethodGet,
			"/api/v1/featured_tags",
			handleFunctions.DefaultAPI.ApiV1FeaturedTagsGet,
		},
		{
			"ApiV1FeaturedTagsIdDelete",
			http.MethodDelete,
			"/api/v1/featured_tags/:id",
			handleFunctions.DefaultAPI.ApiV1FeaturedTagsIdDelete,
		},
		{
			"ApiV1FeaturedTagsPost",
			http.MethodPost,
			"/api/v1/featured_tags",
			handleFunctions.DefaultAPI.ApiV1FeaturedTagsPost,
		},
		{
			"ApiV1FeaturedTagsSuggestionsGet",
			http.MethodGet,
			"/api/v1/featured_tags/suggestions",
			handleFunctions.DefaultAPI.ApiV1FeaturedTagsSuggestionsGet,
		},
		{
			"ApiV1FiltersGet",
			http.MethodGet,
			"/api/v1/filters",
			handleFunctions.DefaultAPI.ApiV1FiltersGet,
		},
		{
			"ApiV1FiltersIdDelete",
			http.MethodDelete,
			"/api/v1/filters/:id",
			handleFunctions.DefaultAPI.ApiV1FiltersIdDelete,
		},
		{
			"ApiV1FiltersIdGet",
			http.MethodGet,
			"/api/v1/filters/:id",
			handleFunctions.DefaultAPI.ApiV1FiltersIdGet,
		},
		{
			"ApiV1FiltersIdPut",
			http.MethodPut,
			"/api/v1/filters/:id",
			handleFunctions.DefaultAPI.ApiV1FiltersIdPut,
		},
		{
			"ApiV1FiltersPost",
			http.MethodPost,
			"/api/v1/filters",
			handleFunctions.DefaultAPI.ApiV1FiltersPost,
		},
		{
			"ApiV1FollowRequestsGet",
			http.MethodGet,
			"/api/v1/follow_requests",
			handleFunctions.DefaultAPI.ApiV1FollowRequestsGet,
		},
		{
			"ApiV1FollowRequestsIdAuthorizePost",
			http.MethodPost,
			"/api/v1/follow_requests/:id/authorize",
			handleFunctions.DefaultAPI.ApiV1FollowRequestsIdAuthorizePost,
		},
		{
			"ApiV1FollowRequestsIdRejectPost",
			http.MethodPost,
			"/api/v1/follow_requests/:id/reject",
			handleFunctions.DefaultAPI.ApiV1FollowRequestsIdRejectPost,
		},
		{
			"ApiV1InstanceActivityGet",
			http.MethodGet,
			"/api/v1/instance/activity",
			handleFunctions.DefaultAPI.ApiV1InstanceActivityGet,
		},
		{
			"ApiV1InstanceGet",
			http.MethodGet,
			"/api/v1/instance",
			handleFunctions.DefaultAPI.ApiV1InstanceGet,
		},
		{
			"ApiV1InstancePeersGet",
			http.MethodGet,
			"/api/v1/instance/peers",
			handleFunctions.DefaultAPI.ApiV1InstancePeersGet,
		},
		{
			"ApiV1ListsDelete",
			http.MethodDelete,
			"/api/v1/lists",
			handleFunctions.DefaultAPI.ApiV1ListsDelete,
		},
		{
			"ApiV1ListsGet",
			http.MethodGet,
			"/api/v1/lists",
			handleFunctions.DefaultAPI.ApiV1ListsGet,
		},
		{
			"ApiV1ListsIdAccountsDelete",
			http.MethodDelete,
			"/api/v1/lists/:id/accounts",
			handleFunctions.DefaultAPI.ApiV1ListsIdAccountsDelete,
		},
		{
			"ApiV1ListsIdAccountsGet",
			http.MethodGet,
			"/api/v1/lists/:id/accounts",
			handleFunctions.DefaultAPI.ApiV1ListsIdAccountsGet,
		},
		{
			"ApiV1ListsIdAccountsPost",
			http.MethodPost,
			"/api/v1/lists/:id/accounts",
			handleFunctions.DefaultAPI.ApiV1ListsIdAccountsPost,
		},
		{
			"ApiV1ListsIdGet",
			http.MethodGet,
			"/api/v1/lists/:id",
			handleFunctions.DefaultAPI.ApiV1ListsIdGet,
		},
		{
			"ApiV1ListsPost",
			http.MethodPost,
			"/api/v1/lists",
			handleFunctions.DefaultAPI.ApiV1ListsPost,
		},
		{
			"ApiV1ListsPut",
			http.MethodPut,
			"/api/v1/lists",
			handleFunctions.DefaultAPI.ApiV1ListsPut,
		},
		{
			"ApiV1MarkersGet",
			http.MethodGet,
			"/api/v1/markers",
			handleFunctions.DefaultAPI.ApiV1MarkersGet,
		},
		{
			"ApiV1MarkersPost",
			http.MethodPost,
			"/api/v1/markers",
			handleFunctions.DefaultAPI.ApiV1MarkersPost,
		},
		{
			"ApiV1MediaIdGet",
			http.MethodGet,
			"/api/v1/media/:id",
			handleFunctions.DefaultAPI.ApiV1MediaIdGet,
		},
		{
			"ApiV1MediaIdPost",
			http.MethodPost,
			"/api/v1/media/:id",
			handleFunctions.DefaultAPI.ApiV1MediaIdPost,
		},
		{
			"ApiV1MediaPost",
			http.MethodPost,
			"/api/v1/media",
			handleFunctions.DefaultAPI.ApiV1MediaPost,
		},
		{
			"ApiV1MutesGet",
			http.MethodGet,
			"/api/v1/mutes",
			handleFunctions.DefaultAPI.ApiV1MutesGet,
		},
		{
			"ApiV1NotificationsClearPost",
			http.MethodPost,
			"/api/v1/notifications/clear",
			handleFunctions.DefaultAPI.ApiV1NotificationsClearPost,
		},
		{
			"ApiV1NotificationsGet",
			http.MethodGet,
			"/api/v1/notifications",
			handleFunctions.DefaultAPI.ApiV1NotificationsGet,
		},
		{
			"ApiV1NotificationsIdDismissPost",
			http.MethodPost,
			"/api/v1/notifications/:id/dismiss",
			handleFunctions.DefaultAPI.ApiV1NotificationsIdDismissPost,
		},
		{
			"ApiV1NotificationsIdGet",
			http.MethodGet,
			"/api/v1/notifications/:id",
			handleFunctions.DefaultAPI.ApiV1NotificationsIdGet,
		},
		{
			"ApiV1PollsIdGet",
			http.MethodGet,
			"/api/v1/polls/:id",
			handleFunctions.DefaultAPI.ApiV1PollsIdGet,
		},
		{
			"ApiV1PollsIdPost",
			http.MethodPost,
			"/api/v1/polls/:id",
			handleFunctions.DefaultAPI.ApiV1PollsIdPost,
		},
		{
			"ApiV1PreferencesGet",
			http.MethodGet,
			"/api/v1/preferences",
			handleFunctions.DefaultAPI.ApiV1PreferencesGet,
		},
		{
			"ApiV1PushSubscriptionDelete",
			http.MethodDelete,
			"/api/v1/push/subscription",
			handleFunctions.DefaultAPI.ApiV1PushSubscriptionDelete,
		},
		{
			"ApiV1PushSubscriptionGet",
			http.MethodGet,
			"/api/v1/push/subscription",
			handleFunctions.DefaultAPI.ApiV1PushSubscriptionGet,
		},
		{
			"ApiV1PushSubscriptionPost",
			http.MethodPost,
			"/api/v1/push/subscription",
			handleFunctions.DefaultAPI.ApiV1PushSubscriptionPost,
		},
		{
			"ApiV1PushSubscriptionPut",
			http.MethodPut,
			"/api/v1/push/subscription",
			handleFunctions.DefaultAPI.ApiV1PushSubscriptionPut,
		},
		{
			"ApiV1ReportsPost",
			http.MethodPost,
			"/api/v1/reports",
			handleFunctions.DefaultAPI.ApiV1ReportsPost,
		},
		{
			"ApiV1ScheduledStatusesGet",
			http.MethodGet,
			"/api/v1/scheduled_statuses",
			handleFunctions.DefaultAPI.ApiV1ScheduledStatusesGet,
		},
		{
			"ApiV1ScheduledStatusesIdDelete",
			http.MethodDelete,
			"/api/v1/scheduled_statuses/:id",
			handleFunctions.DefaultAPI.ApiV1ScheduledStatusesIdDelete,
		},
		{
			"ApiV1ScheduledStatusesIdGet",
			http.MethodGet,
			"/api/v1/scheduled_statuses/:id",
			handleFunctions.DefaultAPI.ApiV1ScheduledStatusesIdGet,
		},
		{
			"ApiV1ScheduledStatusesIdPut",
			http.MethodPut,
			"/api/v1/scheduled_statuses/:id",
			handleFunctions.DefaultAPI.ApiV1ScheduledStatusesIdPut,
		},
		{
			"ApiV1StatusesIdBookmarkPost",
			http.MethodPost,
			"/api/v1/statuses/:id/bookmark",
			handleFunctions.DefaultAPI.ApiV1StatusesIdBookmarkPost,
		},
		{
			"ApiV1StatusesIdContextGet",
			http.MethodGet,
			"/api/v1/statuses/:id/context",
			handleFunctions.DefaultAPI.ApiV1StatusesIdContextGet,
		},
		{
			"ApiV1StatusesIdDelete",
			http.MethodDelete,
			"/api/v1/statuses/:id",
			handleFunctions.DefaultAPI.ApiV1StatusesIdDelete,
		},
		{
			"ApiV1StatusesIdFavouritePost",
			http.MethodPost,
			"/api/v1/statuses/:id/favourite",
			handleFunctions.DefaultAPI.ApiV1StatusesIdFavouritePost,
		},
		{
			"ApiV1StatusesIdFavouritedByGet",
			http.MethodGet,
			"/api/v1/statuses/:id/favourited_by",
			handleFunctions.DefaultAPI.ApiV1StatusesIdFavouritedByGet,
		},
		{
			"ApiV1StatusesIdGet",
			http.MethodGet,
			"/api/v1/statuses/:id",
			handleFunctions.DefaultAPI.ApiV1StatusesIdGet,
		},
		{
			"ApiV1StatusesIdMutePost",
			http.MethodPost,
			"/api/v1/statuses/:id/mute",
			handleFunctions.DefaultAPI.ApiV1StatusesIdMutePost,
		},
		{
			"ApiV1StatusesIdPinPost",
			http.MethodPost,
			"/api/v1/statuses/:id/pin",
			handleFunctions.DefaultAPI.ApiV1StatusesIdPinPost,
		},
		{
			"ApiV1StatusesIdReblogPost",
			http.MethodPost,
			"/api/v1/statuses/:id/reblog",
			handleFunctions.DefaultAPI.ApiV1StatusesIdReblogPost,
		},
		{
			"ApiV1StatusesIdRebloggedByGet",
			http.MethodGet,
			"/api/v1/statuses/:id/reblogged_by",
			handleFunctions.DefaultAPI.ApiV1StatusesIdRebloggedByGet,
		},
		{
			"ApiV1StatusesIdUnbookmarkPost",
			http.MethodPost,
			"/api/v1/statuses/:id/unbookmark",
			handleFunctions.DefaultAPI.ApiV1StatusesIdUnbookmarkPost,
		},
		{
			"ApiV1StatusesIdUnfavouritePost",
			http.MethodPost,
			"/api/v1/statuses/:id/unfavourite",
			handleFunctions.DefaultAPI.ApiV1StatusesIdUnfavouritePost,
		},
		{
			"ApiV1StatusesIdUnmutePost",
			http.MethodPost,
			"/api/v1/statuses/:id/unmute",
			handleFunctions.DefaultAPI.ApiV1StatusesIdUnmutePost,
		},
		{
			"ApiV1StatusesIdUnpinPost",
			http.MethodPost,
			"/api/v1/statuses/:id/unpin",
			handleFunctions.DefaultAPI.ApiV1StatusesIdUnpinPost,
		},
		{
			"ApiV1StatusesIdUnreblogPost",
			http.MethodPost,
			"/api/v1/statuses/:id/unreblog",
			handleFunctions.DefaultAPI.ApiV1StatusesIdUnreblogPost,
		},
		{
			"ApiV1StatusesPost",
			http.MethodPost,
			"/api/v1/statuses",
			handleFunctions.DefaultAPI.ApiV1StatusesPost,
		},
		{
			"ApiV1SuggestionsGet",
			http.MethodGet,
			"/api/v1/suggestions",
			handleFunctions.DefaultAPI.ApiV1SuggestionsGet,
		},
		{
			"ApiV1SuggestionsIdDelete",
			http.MethodDelete,
			"/api/v1/suggestions/:id",
			handleFunctions.DefaultAPI.ApiV1SuggestionsIdDelete,
		},
		{
			"ApiV1TimelinesHomeGet",
			http.MethodGet,
			"/api/v1/timelines/home",
			handleFunctions.DefaultAPI.ApiV1TimelinesHomeGet,
		},
		{
			"ApiV1TimelinesListListIdGet",
			http.MethodGet,
			"/api/v1/timelines/list/:list_id",
			handleFunctions.DefaultAPI.ApiV1TimelinesListListIdGet,
		},
		{
			"ApiV1TimelinesPublicGet",
			http.MethodGet,
			"/api/v1/timelines/public",
			handleFunctions.DefaultAPI.ApiV1TimelinesPublicGet,
		},
		{
			"ApiV1TimelinesTagHashtagGet",
			http.MethodGet,
			"/api/v1/timelines/tag/:hashtag",
			handleFunctions.DefaultAPI.ApiV1TimelinesTagHashtagGet,
		},
		{
			"ApiV1TrendsGet",
			http.MethodGet,
			"/api/v1/trends",
			handleFunctions.DefaultAPI.ApiV1TrendsGet,
		},
		{
			"ApiV2SearchGet",
			http.MethodGet,
			"/api/v2/search",
			handleFunctions.DefaultAPI.ApiV2SearchGet,
		},
		{
			"OauthAuthorizeGet",
			http.MethodGet,
			"/oauth/authorize",
			handleFunctions.OauthAPI.OauthAuthorizeGet,
		},
		{
			"OauthRevokePost",
			http.MethodPost,
			"/oauth/revoke",
			handleFunctions.OauthAPI.OauthRevokePost,
		},
		{
			"OauthTokenPost",
			http.MethodPost,
			"/oauth/token",
			handleFunctions.OauthAPI.OauthTokenPost,
		},
		{
			"ApiV1AccountsPost",
			http.MethodPost,
			"/api/v1/accounts",
			handleFunctions.TODOSecurityAPI.ApiV1AccountsPost,
		},
	}
}
