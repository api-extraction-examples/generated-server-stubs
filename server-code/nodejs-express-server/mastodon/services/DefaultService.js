/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* OEmbed as JSON
*
* url String URL of a status (optional)
* maxwidth Integer width of the iframe. Defaults to 400 (optional)
* maxheight Integer height of the iframe. Defaults to null (optional)
* returns Card
* */
const apiOembedGET = ({ url, maxwidth, maxheight }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        url,
        maxwidth,
        maxheight,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* View identity proof
*
* provider String The identity provider to be looked up. Currently only supports keybase (case-sensitive) (optional)
* username String The username on the selected identity provider (optional)
* returns IdentityProof
* */
const apiProofsGET = ({ provider, username }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        provider,
        username,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* View accounts matching certain criteria for filtering, up to 100 at a time. Pagination may be done with the HTTP Link header in the response.
*
* local Boolean Filter for local accounts? (optional)
* remote Boolean Filter for remote accounts? (optional)
* byUnderscoredomain String Filter by the given domain (optional)
* active Boolean Filter for currently active accounts? (optional)
* pending Boolean Filter for currently pending accounts? (optional)
* disabled Boolean Filter for currently disabled accounts? (optional)
* silenced Boolean Filter for currently silenced accounts? (optional)
* suspended Boolean Filter for currently suspended accounts? (optional)
* staff Boolean Filter for staff accounts? (optional)
* username String Username to search for (optional)
* displayUnderscorename String Display name to search for (optional)
* email String Lookup a user with this email (optional)
* ip String Lookup a user with this IP (optional)
* returns List
* */
const apiV1AdminAccountsGET = ({ local, remote, byUnderscoredomain, active, pending, disabled, silenced, suspended, staff, username, displayUnderscorename, email, ip }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        local,
        remote,
        byUnderscoredomain,
        active,
        pending,
        disabled,
        silenced,
        suspended,
        staff,
        username,
        displayUnderscorename,
        email,
        ip,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Perform an action against an account and log this action in the moderation history.
*
* id String ID of the account
* apiV1AdminAccountsIdActionPostRequest ApiV1AdminAccountsIdActionPostRequest  (optional)
* no response value expected for this operation
* */
const apiV1AdminAccountsIdActionPOST = ({ id, apiV1AdminAccountsIdActionPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        apiV1AdminAccountsIdActionPostRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Approve the given local account if it is currently pending approval.
*
* id String ID of the account
* no response value expected for this operation
* */
const apiV1AdminAccountsIdApprovePOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Re-enable a local account whose login is currently disabled.
*
* id String ID of the account
* no response value expected for this operation
* */
const apiV1AdminAccountsIdEnablePOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* View admin-level information about the given account.
*
* id String ID of the account
* returns AdminAccount
* */
const apiV1AdminAccountsIdGET = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Reject the given local account if it is currently pending approval.
*
* id String ID of the account
* no response value expected for this operation
* */
const apiV1AdminAccountsIdRejectPOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Unsilence a currently silenced account.
*
* id String ID of the account
* no response value expected for this operation
* */
const apiV1AdminAccountsIdUnsilencePOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Unsuspend a currently suspended account.
*
* id String ID of the account
* no response value expected for this operation
* */
const apiV1AdminAccountsIdUnsuspendPOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* View all reports. Pagination may be done with HTTP Link header in the response.
*
* resolved Boolean  (optional)
* accountUnderscoreid String  (optional)
* targetUnderscoreaccountUnderscoreid String  (optional)
* returns List
* */
const apiV1AdminReportsGET = ({ resolved, accountUnderscoreid, targetUnderscoreaccountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        resolved,
        accountUnderscoreid,
        targetUnderscoreaccountUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Claim the handling of this report to yourself.
*
* id String ID of the report
* returns AdminReport
* */
const apiV1AdminReportsIdAssignToSelfPOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* View information about the report with the given ID.
*
* id String ID of the report
* returns AdminReport
* */
const apiV1AdminReportsIdGET = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Mark a report as resolved with no further action taken.
*
* id String ID of the report
* returns AdminReport
* */
const apiV1AdminReportsIdReopenPOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Mark a report as resolved with no further action taken.
*
* id String ID of the report
* returns AdminReport
* */
const apiV1AdminReportsIdResolvePOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Unassign a report so that someone else can claim it.
*
* id String ID of the report
* returns AdminReport
* */
const apiV1AdminReportsIdUnassignPOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* See all currently active announcements set by admins.
*
* withUnderscoredismissed Boolean If true, response will include announcements dismissed by the user. Defaults to false. (optional)
* returns List
* */
const apiV1AnnouncementsGET = ({ withUnderscoredismissed }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        withUnderscoredismissed,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Allows a user to mark the announcement as read.
*
* id String Local ID of an announcement in the database.
* returns Object
* */
const apiV1AnnouncementsIdDismissPOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Undo a react emoji to an announcement.
*
* id String Local ID of an announcement in the database.
* name String Unicode emoji, or shortcode of custom emoji
* returns Object
* */
const apiV1AnnouncementsIdReactionsNameDELETE = ({ id, name }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        name,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Allows a user to mark the announcement as read.
*
* id String Local ID of an announcement in the database.
* name String Unicode emoji, or shortcode of custom emoji
* returns Object
* */
const apiV1AnnouncementsIdReactionsNamePUT = ({ id, name }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        name,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get blocked users.
*
* limit Integer  (optional)
* maxUnderscoreid String  (optional)
* sinceUnderscoreid String  (optional)
* returns List
* */
const apiV1BlocksGET = ({ limit, maxUnderscoreid, sinceUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        maxUnderscoreid,
        sinceUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Statuses the user has bookmarked.
*
* limit Integer  (optional)
* maxUnderscoreid String  (optional)
* sinceUnderscoreid String  (optional)
* minUnderscoreid String  (optional)
* returns List
* */
const apiV1BookmarksGET = ({ limit, maxUnderscoreid, sinceUnderscoreid, minUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        maxUnderscoreid,
        sinceUnderscoreid,
        minUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Show conversation.
*
* limit Integer Max number of results to return. Defaults to 20. (optional)
* maxUnderscoreid String Return results older than ID (optional)
* sinceUnderscoreid String Return results newer than ID (optional)
* minUnderscoreid String Return results immediately newer than ID (optional)
* returns List
* */
const apiV1ConversationsGET = ({ limit, maxUnderscoreid, sinceUnderscoreid, minUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        maxUnderscoreid,
        sinceUnderscoreid,
        minUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Remove converstation
*
* id String ID of the conversation in the database
* returns Object
* */
const apiV1ConversationsIdDELETE = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Remove converstation
*
* id String ID of the conversation in the database
* returns Conversation
* */
const apiV1ConversationsIdReadPOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Returns custom emojis that are available on the server.
*
* returns List
* */
const apiV1CustomEmojisGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List accounts visible in the directory.
*
* limit Integer How many accounts to load. Default 40. (optional)
* offset Integer How many accounts to skip before returning results. Default 0. (optional)
* order String the `active` to sort by most recently posted statuses (default) or `new` to sort by most recently created profiles. (optional)
* local Boolean Only return local accounts. (optional)
* returns List
* */
const apiV1DirectoryGET = ({ limit, offset, order, local }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        order,
        local,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Remove a domain block, if it exists in the user's array of blocked domains.
*
* domain String Domain to unblock.
* returns Object
* */
const apiV1DomainBlocksDELETE = ({ domain }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        domain,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* View domains the user has blocked.
*
* limit Integer  (optional)
* maxUnderscoreid String  (optional)
* sinceUnderscoreid String  (optional)
* returns List
* */
const apiV1DomainBlocksGET = ({ limit, maxUnderscoreid, sinceUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        maxUnderscoreid,
        sinceUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* \"Block a domain to: - hide all public posts from it - hide all notifications from it - remove all followers from it - prevent following new users from it (but does not remove existing follows)\" 
*
* apiV1DomainBlocksPostRequest ApiV1DomainBlocksPostRequest  (optional)
* returns Object
* */
const apiV1DomainBlocksPOST = ({ apiV1DomainBlocksPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apiV1DomainBlocksPostRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Accounts that the user is currently featuring on their profile.
*
* limit Integer Maximum number of results to return. Defaults to 40. Paginate using the HTTP Link header. (optional)
* maxUnderscoreid String Internal parameter. Use HTTP Link header from response for pagination (optional)
* sinceUnderscoreid String Internal parameter. Use HTTP Link header from response for pagination. (optional)
* returns List
* */
const apiV1EndorsementsGET = ({ limit, maxUnderscoreid, sinceUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        maxUnderscoreid,
        sinceUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Statuses the user has favourited.
*
* limit String  (optional)
* maxUnderscoreid String  (optional)
* minUnderscoreid String  (optional)
* returns List
* */
const apiV1FavouritesGET = ({ limit, maxUnderscoreid, minUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        maxUnderscoreid,
        minUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* View your featured tags.
*
* returns List
* */
const apiV1FeaturedTagsGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Unfeature a tag
*
* id String The id of the FeaturedTag to be unfeatured.
* returns Object
* */
const apiV1FeaturedTagsIdDELETE = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Create a feature a tag.
*
* apiV1FeaturedTagsPostRequest ApiV1FeaturedTagsPostRequest  (optional)
* returns FeaturedTag
* */
const apiV1FeaturedTagsPOST = ({ apiV1FeaturedTagsPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apiV1FeaturedTagsPostRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Shows your 10 most-used tags, with usage history for the past week.
*
* returns List
* */
const apiV1FeaturedTagsSuggestionsGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* returns List
* */
const apiV1FiltersGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete a filter.
*
* id String The id of the account in the database
* no response value expected for this operation
* */
const apiV1FiltersIdDELETE = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get one filter.
*
* id String The id of the account in the database
* returns Filter
* */
const apiV1FiltersIdGET = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update a filter.
*
* id String The id of the account in the database
* apiV1FiltersPostRequest ApiV1FiltersPostRequest  (optional)
* returns Filter
* */
const apiV1FiltersIdPUT = ({ id, apiV1FiltersPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        apiV1FiltersPostRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* apiV1FiltersPostRequest ApiV1FiltersPostRequest  (optional)
* returns Filter
* */
const apiV1FiltersPOST = ({ apiV1FiltersPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apiV1FiltersPostRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Pending Follows
*
* limit Integer Maximum number of results to return. Defaults to 40. Paginate using the HTTP Link header. (optional)
* returns List
* */
const apiV1FollowRequestsGET = ({ limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Accept Follow
*
* id String The id of the account in the database
* returns Relationship
* */
const apiV1FollowRequestsIdAuthorizePOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Accept Follow
*
* id String The id of the account in the database
* returns Relationship
* */
const apiV1FollowRequestsIdRejectPOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Instance activity over the last 3 months, binned weekly.
*
* returns List
* */
const apiV1InstanceActivityGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Information about the server.
*
* returns Instance
* */
const apiV1InstanceGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Information about the server.
*
* returns List
* */
const apiV1InstancePeersGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete a list
*
* returns Object
* */
const apiV1ListsDELETE = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Fetch all lists that the user owns.
*
* returns List
* */
const apiV1ListsGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Remove accounts from the given list.
*
* id String ID of the list in the database
* accountUnderscoreids List Array of account IDs to add to the list.
* returns Object
* */
const apiV1ListsIdAccountsDELETE = ({ id, accountUnderscoreids }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        accountUnderscoreids,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* View accounts in List
*
* id String ID of the list in the database
* limit Integer Maximum number of results. Defaults to 40. Max 40. Set to 0 in order to get all accounts without pagination. Pagination is done with the HTTP Link header. (optional)
* maxUnderscoreid String Return results older than ID (optional)
* sinceUnderscoreid String Return results newer than ID (optional)
* returns List
* */
const apiV1ListsIdAccountsGET = ({ id, limit, maxUnderscoreid, sinceUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        limit,
        maxUnderscoreid,
        sinceUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Add accounts to the given list. Note that the user must be following these accounts.
*
* id String ID of the list in the database
* apiV1ListsIdAccountsPostRequest ApiV1ListsIdAccountsPostRequest  (optional)
* returns Object
* */
const apiV1ListsIdAccountsPOST = ({ id, apiV1ListsIdAccountsPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        apiV1ListsIdAccountsPostRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Remove converstation
*
* id String ID of the list in the database
* returns List
* */
const apiV1ListsIdGET = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Create a new list.
*
* apiV1ListsPostRequest ApiV1ListsPostRequest  (optional)
* returns List
* */
const apiV1ListsPOST = ({ apiV1ListsPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apiV1ListsPostRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Change the title of a list, or which replies to show.
*
* apiV1ListsPutRequest ApiV1ListsPutRequest  (optional)
* returns List
* */
const apiV1ListsPUT = ({ apiV1ListsPutRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apiV1ListsPutRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get saved timeline position
*
* timeline List Array of markers to fetch. String enum anyOf home, notifications. If not provided, an empty object will be returned.
* returns Object
* */
const apiV1MarkersGET = ({ timeline }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        timeline,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get saved timeline position
*
* body Object  (optional)
* returns Object
* */
const apiV1MarkersPOST = ({ body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        body,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get an attachement.
*
* id String The id of the Attachment entity to be updated.
* returns Attachment
* */
const apiV1MediaIdGET = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Update an Attachment, before it is attached to a status and posted.
*
* id String The id of the Attachment entity to be updated.
* apiV1MediaPostRequest ApiV1MediaPostRequest  (optional)
* returns Attachment
* */
const apiV1MediaIdPOST = ({ id, apiV1MediaPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        apiV1MediaPostRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Creates an attachment to be used with a new status.
*
* apiV1MediaPostRequest ApiV1MediaPostRequest  (optional)
* returns Attachment
* */
const apiV1MediaPOST = ({ apiV1MediaPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apiV1MediaPostRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Accounts the user has muted.
*
* limit String  (optional)
* maxUnderscoreid String  (optional)
* sinceUnderscoreid String  (optional)
* returns List
* */
const apiV1MutesGET = ({ limit, maxUnderscoreid, sinceUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        maxUnderscoreid,
        sinceUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Clear all notifications from the server.
*
* returns Object
* */
const apiV1NotificationsClearPOST = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Notifications concerning the user. This API returns Link headers containing links to the next/previous page. However, the links can also be constructed dynamically using query params and id values.
*
* limit Integer Max number of results to return. Defaults to 20. (optional)
* maxUnderscoreid String Return results older than ID (optional)
* sinceUnderscoreid String Return results newer than ID (optional)
* minUnderscoreid String Return results immediately newer than ID (optional)
* excludeUnderscoretypes List Array of types to exclude (follow, favourite, reblog, mention, poll, follow_request) (optional)
* accountUnderscoreid String Return only notifications received from this account (optional)
* returns List
* */
const apiV1NotificationsGET = ({ limit, maxUnderscoreid, sinceUnderscoreid, minUnderscoreid, excludeUnderscoretypes, accountUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        maxUnderscoreid,
        sinceUnderscoreid,
        minUnderscoreid,
        excludeUnderscoretypes,
        accountUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Clear a single notification from the server.
*
* id String ID of the notification in the database.
* returns Notification
* */
const apiV1NotificationsIdDismissPOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* View information about a notification with a given ID.
*
* id String ID of the notification in the database.
* returns Notification
* */
const apiV1NotificationsIdGET = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* View a poll.
*
* id String ID of the poll in the database.
* returns Poll
* */
const apiV1PollsIdGET = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Vote on a poll.
*
* id String ID of the poll in the database.
* apiV1PollsIdPostRequest ApiV1PollsIdPostRequest  (optional)
* returns Poll
* */
const apiV1PollsIdPOST = ({ id, apiV1PollsIdPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        apiV1PollsIdPostRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Shows your 10 most-used tags, with usage history for the past week.
*
* returns Preferences
* */
const apiV1PreferencesGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Updates the current push subscription. Only the data part can be updated. To change fundamentals, a new subscription must be created instead.
*
* returns Object
* */
const apiV1PushSubscriptionDELETE = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* View the PushSubscription currently associated with this access token.
*
* returns PushSubscription
* */
const apiV1PushSubscriptionGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Add a Web Push API subscription to receive notifications. Each access token can have one push subscription. If you create a new subscription, the old subscription is deleted.
*
* apiV1PushSubscriptionPostRequest ApiV1PushSubscriptionPostRequest  (optional)
* returns PushSubscription
* */
const apiV1PushSubscriptionPOST = ({ apiV1PushSubscriptionPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apiV1PushSubscriptionPostRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Updates the current push subscription. Only the data part can be updated. To change fundamentals, a new subscription must be created instead.
*
* apiV1PushSubscriptionPutRequest ApiV1PushSubscriptionPutRequest  (optional)
* returns PushSubscription
* */
const apiV1PushSubscriptionPUT = ({ apiV1PushSubscriptionPutRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apiV1PushSubscriptionPutRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* File a report.
*
* apiV1ReportsPostRequest ApiV1ReportsPostRequest  (optional)
* returns Report
* */
const apiV1ReportsPOST = ({ apiV1ReportsPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apiV1ReportsPostRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* View scheduled statuses
*
* limit Integer Max number of results to return. Defaults to 20. (optional)
* maxUnderscoreid String Return results older than ID (optional)
* sinceUnderscoreid String Return results newer than ID (optional)
* minUnderscoreid String Return results immediately newer than ID (optional)
* returns List
* */
const apiV1ScheduledStatusesGET = ({ limit, maxUnderscoreid, sinceUnderscoreid, minUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        maxUnderscoreid,
        sinceUnderscoreid,
        minUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Cancel a scheduled status
*
* id String ID of the scheduled status in the database.
* returns Object
* */
const apiV1ScheduledStatusesIdDELETE = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* View a single scheduled status
*
* id String ID of the scheduled status in the database.
* returns ScheduledStatus
* */
const apiV1ScheduledStatusesIdGET = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* View a single scheduled status
*
* id String ID of the scheduled status in the database.
* apiV1ScheduledStatusesIdPutRequest ApiV1ScheduledStatusesIdPutRequest  (optional)
* returns ScheduledStatus
* */
const apiV1ScheduledStatusesIdPUT = ({ id, apiV1ScheduledStatusesIdPutRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        apiV1ScheduledStatusesIdPutRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Privately bookmark a status.
*
* id String Local ID of a status in the database.
* returns Status
* */
const apiV1StatusesIdBookmarkPOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* id String Local ID of a status in the database.
* returns Context
* */
const apiV1StatusesIdContextGET = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* id String Local ID of a status in the database.
* returns Status
* */
const apiV1StatusesIdDELETE = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Add a status to your favourites list.
*
* id String Local ID of a status in the database.
* returns Status
* */
const apiV1StatusesIdFavouritePOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* View who favourited a given status.
*
* id String Local ID of a status in the database.
* returns Account
* */
const apiV1StatusesIdFavouritedByGET = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* id String Local ID of a status in the database.
* returns Status
* */
const apiV1StatusesIdGET = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Do not receive notifications for the thread that this status is part of. Must be a thread in which you are a participant.
*
* id String Local ID of a status in the database.
* returns Status
* */
const apiV1StatusesIdMutePOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Feature one of your own public statuses at the top of your profile.
*
* id String Local ID of a status in the database.
* returns Status
* */
const apiV1StatusesIdPinPOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Reshare a status.
*
* id String Local ID of a status in the database.
* apiV1StatusesIdReblogPostRequest ApiV1StatusesIdReblogPostRequest  (optional)
* returns Status
* */
const apiV1StatusesIdReblogPOST = ({ id, apiV1StatusesIdReblogPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        apiV1StatusesIdReblogPostRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* View who boosted a given status.
*
* id String Local ID of a status in the database.
* returns Account
* */
const apiV1StatusesIdRebloggedByGET = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Remove a status from your private bookmarks.
*
* id String Local ID of a status in the database.
* returns Status
* */
const apiV1StatusesIdUnbookmarkPOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Remove a status from your favourites list.
*
* id String Local ID of a status in the database.
* returns Status
* */
const apiV1StatusesIdUnfavouritePOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Status's conversation unmuted, or was already unmuted
*
* id String Local ID of a status in the database.
* returns Status
* */
const apiV1StatusesIdUnmutePOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Unfeature a status from the top of your profile.
*
* id String Local ID of a status in the database.
* returns Status
* */
const apiV1StatusesIdUnpinPOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Undo a reshare of a status.
*
* id String Local ID of a status in the database.
* returns Status
* */
const apiV1StatusesIdUnreblogPOST = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
*
* idempotencyKey String Prevent duplicate submissions of the same status. Idempotency keys are stored for up to 1 hour, and can be any arbitrary string. Consider using a hash or UUID generated client-side. (optional)
* UnderscoreapiUnderscorev1UnderscorestatusesUnderscorepostUnderscorerequestUnderscoreinner List  (optional)
* returns _api_v1_statuses_post_200_response
* */
const apiV1StatusesPOST = ({ idempotencyKey, UnderscoreapiUnderscorev1UnderscorestatusesUnderscorepostUnderscorerequestUnderscoreinner }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        idempotencyKey,
        UnderscoreapiUnderscorev1UnderscorestatusesUnderscorepostUnderscorerequestUnderscoreinner,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Accounts the user has had past positive interactions with, but is not yet following.
*
* limit Integer Maximum number of results to return. Defaults to 40. (optional)
* returns Account
* */
const apiV1SuggestionsGET = ({ limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Delete user suggestion
*
* id String id of the account in the database to be removed from suggestions
* returns Object
* */
const apiV1SuggestionsIdDELETE = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* View statuses from followed users.
*
* local Boolean Show only local statuses? Defaults to false. (optional)
* limit Integer Max number of results to return. Defaults to 20. (optional)
* maxUnderscoreid String Return results older than ID (optional)
* sinceUnderscoreid String Return results newer than ID (optional)
* minUnderscoreid String Return results immediately newer than ID (optional)
* returns List
* */
const apiV1TimelinesHomeGET = ({ local, limit, maxUnderscoreid, sinceUnderscoreid, minUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        local,
        limit,
        maxUnderscoreid,
        sinceUnderscoreid,
        minUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* View statuses in the given list timeline.
*
* listUnderscoreid String Local ID of the list in the database.
* limit Integer Max number of results to return. Defaults to 20. (optional)
* maxUnderscoreid String Return results older than ID (optional)
* sinceUnderscoreid String Return results newer than ID (optional)
* minUnderscoreid String Return results immediately newer than ID (optional)
* returns List
* */
const apiV1TimelinesListListIdGET = ({ listUnderscoreid, limit, maxUnderscoreid, sinceUnderscoreid, minUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        listUnderscoreid,
        limit,
        maxUnderscoreid,
        sinceUnderscoreid,
        minUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Public timeline
*
* local Boolean Show only local statuses? Defaults to false. (optional)
* remote Boolean Show only local statuses? Defaults to false. (optional)
* onlyUnderscoremedia Boolean Show only statuses with media attached? Defaults to false.. (optional)
* limit Integer Max number of results to return. Defaults to 20. (optional)
* maxUnderscoreid String Return results older than ID (optional)
* sinceUnderscoreid String Return results newer than ID (optional)
* minUnderscoreid String Return results immediately newer than ID (optional)
* returns List
* */
const apiV1TimelinesPublicGET = ({ local, remote, onlyUnderscoremedia, limit, maxUnderscoreid, sinceUnderscoreid, minUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        local,
        remote,
        onlyUnderscoremedia,
        limit,
        maxUnderscoreid,
        sinceUnderscoreid,
        minUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* View public statuses containing the given hashtag.
*
* hashtag String Content of a `#hashtag``, not including `#` symbol..
* local Boolean Show only local statuses? Defaults to false. (optional)
* remote Boolean Show only local statuses? Defaults to false. (optional)
* onlyUnderscoremedia Boolean Show only statuses with media attached? Defaults to false.. (optional)
* limit Integer Max number of results to return. Defaults to 20. (optional)
* maxUnderscoreid String Return results older than ID (optional)
* sinceUnderscoreid String Return results newer than ID (optional)
* minUnderscoreid String Return results immediately newer than ID (optional)
* returns List
* */
const apiV1TimelinesTagHashtagGET = ({ hashtag, local, remote, onlyUnderscoremedia, limit, maxUnderscoreid, sinceUnderscoreid, minUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        hashtag,
        local,
        remote,
        onlyUnderscoremedia,
        limit,
        maxUnderscoreid,
        sinceUnderscoreid,
        minUnderscoreid,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Tags that are being used more frequently within the past week.
*
* limit Integer Max number of results to return. Defaults to 10. (optional)
* returns List
* */
const apiV1TrendsGET = ({ limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Search results
*
* q String What to search for
* limit Integer Maximum number of results. Defaults to 40. (optional)
* resolve String Attempt WebFinger lookup. (optional)
* following Boolean Only who the user is following. Defaults to false. (optional)
* accountUnderscoreid String If provided, statuses returned will be authored only by this account (optional)
* maxUnderscoreid String Return results older than this id (optional)
* minUnderscoreid String Return results immediately newer than this id (optional)
* type String Enum(accounts, hashtags, statuses) (optional)
* excludeUnderscoreunreviewed Boolean Filter out unreviewed tags? Defaults to false. Use true when trying to find trending tags. (optional)
* offset Integer Offset in search results. Used for pagination. Defaults to 0. (optional)
* returns _api_v2_search_get_200_response
* */
const apiV2SearchGET = ({ q, limit, resolve, following, accountUnderscoreid, maxUnderscoreid, minUnderscoreid, type, excludeUnderscoreunreviewed, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        q,
        limit,
        resolve,
        following,
        accountUnderscoreid,
        maxUnderscoreid,
        minUnderscoreid,
        type,
        excludeUnderscoreunreviewed,
        offset,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

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
