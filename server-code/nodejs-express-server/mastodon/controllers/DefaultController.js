/**
 * The DefaultController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/DefaultService');
const apiOembedGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiOembedGET);
};

const apiProofsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiProofsGET);
};

const apiV1AdminAccountsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AdminAccountsGET);
};

const apiV1AdminAccountsIdActionPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AdminAccountsIdActionPOST);
};

const apiV1AdminAccountsIdApprovePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AdminAccountsIdApprovePOST);
};

const apiV1AdminAccountsIdEnablePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AdminAccountsIdEnablePOST);
};

const apiV1AdminAccountsIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AdminAccountsIdGET);
};

const apiV1AdminAccountsIdRejectPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AdminAccountsIdRejectPOST);
};

const apiV1AdminAccountsIdUnsilencePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AdminAccountsIdUnsilencePOST);
};

const apiV1AdminAccountsIdUnsuspendPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AdminAccountsIdUnsuspendPOST);
};

const apiV1AdminReportsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AdminReportsGET);
};

const apiV1AdminReportsIdAssignToSelfPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AdminReportsIdAssignToSelfPOST);
};

const apiV1AdminReportsIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AdminReportsIdGET);
};

const apiV1AdminReportsIdReopenPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AdminReportsIdReopenPOST);
};

const apiV1AdminReportsIdResolvePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AdminReportsIdResolvePOST);
};

const apiV1AdminReportsIdUnassignPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AdminReportsIdUnassignPOST);
};

const apiV1AnnouncementsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AnnouncementsGET);
};

const apiV1AnnouncementsIdDismissPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AnnouncementsIdDismissPOST);
};

const apiV1AnnouncementsIdReactionsNameDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AnnouncementsIdReactionsNameDELETE);
};

const apiV1AnnouncementsIdReactionsNamePUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1AnnouncementsIdReactionsNamePUT);
};

const apiV1BlocksGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1BlocksGET);
};

const apiV1BookmarksGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1BookmarksGET);
};

const apiV1ConversationsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1ConversationsGET);
};

const apiV1ConversationsIdDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1ConversationsIdDELETE);
};

const apiV1ConversationsIdReadPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1ConversationsIdReadPOST);
};

const apiV1CustomEmojisGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1CustomEmojisGET);
};

const apiV1DirectoryGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1DirectoryGET);
};

const apiV1DomainBlocksDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1DomainBlocksDELETE);
};

const apiV1DomainBlocksGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1DomainBlocksGET);
};

const apiV1DomainBlocksPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1DomainBlocksPOST);
};

const apiV1EndorsementsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1EndorsementsGET);
};

const apiV1FavouritesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1FavouritesGET);
};

const apiV1FeaturedTagsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1FeaturedTagsGET);
};

const apiV1FeaturedTagsIdDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1FeaturedTagsIdDELETE);
};

const apiV1FeaturedTagsPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1FeaturedTagsPOST);
};

const apiV1FeaturedTagsSuggestionsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1FeaturedTagsSuggestionsGET);
};

const apiV1FiltersGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1FiltersGET);
};

const apiV1FiltersIdDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1FiltersIdDELETE);
};

const apiV1FiltersIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1FiltersIdGET);
};

const apiV1FiltersIdPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1FiltersIdPUT);
};

const apiV1FiltersPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1FiltersPOST);
};

const apiV1FollowRequestsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1FollowRequestsGET);
};

const apiV1FollowRequestsIdAuthorizePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1FollowRequestsIdAuthorizePOST);
};

const apiV1FollowRequestsIdRejectPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1FollowRequestsIdRejectPOST);
};

const apiV1InstanceActivityGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1InstanceActivityGET);
};

const apiV1InstanceGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1InstanceGET);
};

const apiV1InstancePeersGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1InstancePeersGET);
};

const apiV1ListsDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1ListsDELETE);
};

const apiV1ListsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1ListsGET);
};

const apiV1ListsIdAccountsDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1ListsIdAccountsDELETE);
};

const apiV1ListsIdAccountsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1ListsIdAccountsGET);
};

const apiV1ListsIdAccountsPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1ListsIdAccountsPOST);
};

const apiV1ListsIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1ListsIdGET);
};

const apiV1ListsPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1ListsPOST);
};

const apiV1ListsPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1ListsPUT);
};

const apiV1MarkersGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1MarkersGET);
};

const apiV1MarkersPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1MarkersPOST);
};

const apiV1MediaIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1MediaIdGET);
};

const apiV1MediaIdPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1MediaIdPOST);
};

const apiV1MediaPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1MediaPOST);
};

const apiV1MutesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1MutesGET);
};

const apiV1NotificationsClearPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1NotificationsClearPOST);
};

const apiV1NotificationsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1NotificationsGET);
};

const apiV1NotificationsIdDismissPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1NotificationsIdDismissPOST);
};

const apiV1NotificationsIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1NotificationsIdGET);
};

const apiV1PollsIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1PollsIdGET);
};

const apiV1PollsIdPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1PollsIdPOST);
};

const apiV1PreferencesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1PreferencesGET);
};

const apiV1PushSubscriptionDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1PushSubscriptionDELETE);
};

const apiV1PushSubscriptionGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1PushSubscriptionGET);
};

const apiV1PushSubscriptionPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1PushSubscriptionPOST);
};

const apiV1PushSubscriptionPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1PushSubscriptionPUT);
};

const apiV1ReportsPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1ReportsPOST);
};

const apiV1ScheduledStatusesGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1ScheduledStatusesGET);
};

const apiV1ScheduledStatusesIdDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1ScheduledStatusesIdDELETE);
};

const apiV1ScheduledStatusesIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1ScheduledStatusesIdGET);
};

const apiV1ScheduledStatusesIdPUT = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1ScheduledStatusesIdPUT);
};

const apiV1StatusesIdBookmarkPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1StatusesIdBookmarkPOST);
};

const apiV1StatusesIdContextGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1StatusesIdContextGET);
};

const apiV1StatusesIdDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1StatusesIdDELETE);
};

const apiV1StatusesIdFavouritePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1StatusesIdFavouritePOST);
};

const apiV1StatusesIdFavouritedByGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1StatusesIdFavouritedByGET);
};

const apiV1StatusesIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1StatusesIdGET);
};

const apiV1StatusesIdMutePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1StatusesIdMutePOST);
};

const apiV1StatusesIdPinPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1StatusesIdPinPOST);
};

const apiV1StatusesIdReblogPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1StatusesIdReblogPOST);
};

const apiV1StatusesIdRebloggedByGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1StatusesIdRebloggedByGET);
};

const apiV1StatusesIdUnbookmarkPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1StatusesIdUnbookmarkPOST);
};

const apiV1StatusesIdUnfavouritePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1StatusesIdUnfavouritePOST);
};

const apiV1StatusesIdUnmutePOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1StatusesIdUnmutePOST);
};

const apiV1StatusesIdUnpinPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1StatusesIdUnpinPOST);
};

const apiV1StatusesIdUnreblogPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1StatusesIdUnreblogPOST);
};

const apiV1StatusesPOST = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1StatusesPOST);
};

const apiV1SuggestionsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1SuggestionsGET);
};

const apiV1SuggestionsIdDELETE = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1SuggestionsIdDELETE);
};

const apiV1TimelinesHomeGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1TimelinesHomeGET);
};

const apiV1TimelinesListListIdGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1TimelinesListListIdGET);
};

const apiV1TimelinesPublicGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1TimelinesPublicGET);
};

const apiV1TimelinesTagHashtagGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1TimelinesTagHashtagGET);
};

const apiV1TrendsGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV1TrendsGET);
};

const apiV2SearchGET = async (request, response) => {
  await Controller.handleRequest(request, response, service.apiV2SearchGET);
};


module.exports = {
  apiOembedGET,
  apiProofsGET,
  apiV1AdminAccountsGET,
  apiV1AdminAccountsIdActionPOST,
  apiV1AdminAccountsIdApprovePOST,
  apiV1AdminAccountsIdEnablePOST,
  apiV1AdminAccountsIdGET,
  apiV1AdminAccountsIdRejectPOST,
  apiV1AdminAccountsIdUnsilencePOST,
  apiV1AdminAccountsIdUnsuspendPOST,
  apiV1AdminReportsGET,
  apiV1AdminReportsIdAssignToSelfPOST,
  apiV1AdminReportsIdGET,
  apiV1AdminReportsIdReopenPOST,
  apiV1AdminReportsIdResolvePOST,
  apiV1AdminReportsIdUnassignPOST,
  apiV1AnnouncementsGET,
  apiV1AnnouncementsIdDismissPOST,
  apiV1AnnouncementsIdReactionsNameDELETE,
  apiV1AnnouncementsIdReactionsNamePUT,
  apiV1BlocksGET,
  apiV1BookmarksGET,
  apiV1ConversationsGET,
  apiV1ConversationsIdDELETE,
  apiV1ConversationsIdReadPOST,
  apiV1CustomEmojisGET,
  apiV1DirectoryGET,
  apiV1DomainBlocksDELETE,
  apiV1DomainBlocksGET,
  apiV1DomainBlocksPOST,
  apiV1EndorsementsGET,
  apiV1FavouritesGET,
  apiV1FeaturedTagsGET,
  apiV1FeaturedTagsIdDELETE,
  apiV1FeaturedTagsPOST,
  apiV1FeaturedTagsSuggestionsGET,
  apiV1FiltersGET,
  apiV1FiltersIdDELETE,
  apiV1FiltersIdGET,
  apiV1FiltersIdPUT,
  apiV1FiltersPOST,
  apiV1FollowRequestsGET,
  apiV1FollowRequestsIdAuthorizePOST,
  apiV1FollowRequestsIdRejectPOST,
  apiV1InstanceActivityGET,
  apiV1InstanceGET,
  apiV1InstancePeersGET,
  apiV1ListsDELETE,
  apiV1ListsGET,
  apiV1ListsIdAccountsDELETE,
  apiV1ListsIdAccountsGET,
  apiV1ListsIdAccountsPOST,
  apiV1ListsIdGET,
  apiV1ListsPOST,
  apiV1ListsPUT,
  apiV1MarkersGET,
  apiV1MarkersPOST,
  apiV1MediaIdGET,
  apiV1MediaIdPOST,
  apiV1MediaPOST,
  apiV1MutesGET,
  apiV1NotificationsClearPOST,
  apiV1NotificationsGET,
  apiV1NotificationsIdDismissPOST,
  apiV1NotificationsIdGET,
  apiV1PollsIdGET,
  apiV1PollsIdPOST,
  apiV1PreferencesGET,
  apiV1PushSubscriptionDELETE,
  apiV1PushSubscriptionGET,
  apiV1PushSubscriptionPOST,
  apiV1PushSubscriptionPUT,
  apiV1ReportsPOST,
  apiV1ScheduledStatusesGET,
  apiV1ScheduledStatusesIdDELETE,
  apiV1ScheduledStatusesIdGET,
  apiV1ScheduledStatusesIdPUT,
  apiV1StatusesIdBookmarkPOST,
  apiV1StatusesIdContextGET,
  apiV1StatusesIdDELETE,
  apiV1StatusesIdFavouritePOST,
  apiV1StatusesIdFavouritedByGET,
  apiV1StatusesIdGET,
  apiV1StatusesIdMutePOST,
  apiV1StatusesIdPinPOST,
  apiV1StatusesIdReblogPOST,
  apiV1StatusesIdRebloggedByGET,
  apiV1StatusesIdUnbookmarkPOST,
  apiV1StatusesIdUnfavouritePOST,
  apiV1StatusesIdUnmutePOST,
  apiV1StatusesIdUnpinPOST,
  apiV1StatusesIdUnreblogPOST,
  apiV1StatusesPOST,
  apiV1SuggestionsGET,
  apiV1SuggestionsIdDELETE,
  apiV1TimelinesHomeGET,
  apiV1TimelinesListListIdGET,
  apiV1TimelinesPublicGET,
  apiV1TimelinesTagHashtagGET,
  apiV1TrendsGET,
  apiV2SearchGET,
};
