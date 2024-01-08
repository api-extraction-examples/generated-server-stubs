/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Block the given account. Clients should filter statuses from this account if received (e.g. due to a boost in the Home timeline).
*
* id String The id of the account in the database
* returns Relationship
* */
const apiV1AccountsIdBlockPOST = ({ id }) => new Promise(
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
* Tags featured by this account.
*
* id String The id of the account in the database
* returns List
* */
const apiV1AccountsIdFeaturedTagsGET = ({ id }) => new Promise(
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
* Follow the given account. Can also be used to update whether to show reblogs or enable notifications.
*
* id String The id of the account in the database
* apiV1AccountsIdFollowPostRequest ApiV1AccountsIdFollowPostRequest  (optional)
* returns Relationship
* */
const apiV1AccountsIdFollowPOST = ({ id, apiV1AccountsIdFollowPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        apiV1AccountsIdFollowPostRequest,
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
* Accounts which follow the given account, if network is not hidden by the account owner.
*
* id String The id of the account in the database
* maxUnderscoreid String Internal parameter. Use HTTP `Link` header for pagination. (optional)
* sinceUnderscoreid String Internal parameter. Use HTTP `Link` header for pagination. (optional)
* limit Integer Maximum number of results to return. Defaults to 40. (optional)
* returns List
* */
const apiV1AccountsIdFollowersGET = ({ id, maxUnderscoreid, sinceUnderscoreid, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        maxUnderscoreid,
        sinceUnderscoreid,
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
* Accounts which the given account is following, if network is not hidden by the account owner.
*
* id String The id of the account in the database
* maxUnderscoreid String Internal parameter. Use HTTP `Link` header for pagination. (optional)
* sinceUnderscoreid String Internal parameter. Use HTTP `Link` header for pagination. (optional)
* limit Integer Maximum number of results to return. Defaults to 40. (optional)
* returns List
* */
const apiV1AccountsIdFollowingGET = ({ id, maxUnderscoreid, sinceUnderscoreid, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        maxUnderscoreid,
        sinceUnderscoreid,
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
*
* id String The id of the account in the database
* returns Account
* */
const apiV1AccountsIdGET = ({ id }) => new Promise(
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
* Array of IdentityProof
*
* id String The id of the account in the database
* returns List
* */
const apiV1AccountsIdIdentityProofsGET = ({ id }) => new Promise(
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
* User lists that you have added this account to.
*
* id String The id of the account in the database
* returns List
* */
const apiV1AccountsIdListsGET = ({ id }) => new Promise(
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
* Mute the given account. Clients should filter statuses and notifications from this account, if received (e.g. due to a boost in the Home timeline).
*
* id String The id of the account in the database
* apiV1AccountsIdMutePostRequest ApiV1AccountsIdMutePostRequest  (optional)
* returns Relationship
* */
const apiV1AccountsIdMutePOST = ({ id, apiV1AccountsIdMutePostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        apiV1AccountsIdMutePostRequest,
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
* Sets a private note on a user.
*
* id String The id of the account in the database
* apiV1AccountsIdNotePostRequest ApiV1AccountsIdNotePostRequest  (optional)
* returns Relationship
* */
const apiV1AccountsIdNotePOST = ({ id, apiV1AccountsIdNotePostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        apiV1AccountsIdNotePostRequest,
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
* Add the given account to the user's featured profiles. (Featured profiles are currently shown on the user's own public profile.)
*
* id String The id of the account in the database
* returns Relationship
* */
const apiV1AccountsIdPinPOST = ({ id }) => new Promise(
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
* Statuses posted to the given account.
*
* id String The id of the account in the database
* returns List
* */
const apiV1AccountsIdStatusesGET = ({ id }) => new Promise(
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
* Block the given account. Clients should filter statuses from this account if received (e.g. due to a boost in the Home timeline).
*
* id String The id of the account in the database
* returns Relationship
* */
const apiV1AccountsIdUnblockPOST = ({ id }) => new Promise(
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
* Unfollow the given account.
*
* id String The id of the account in the database
* returns Relationship
* */
const apiV1AccountsIdUnfollowPOST = ({ id }) => new Promise(
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
* Unmute the given account.
*
* id String The id of the account in the database
* returns Relationship
* */
const apiV1AccountsIdUnmutePOST = ({ id }) => new Promise(
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
* Remove the given account from the user's featured profiles.
*
* id String The id of the account in the database
* returns Relationship
* */
const apiV1AccountsIdUnpinPOST = ({ id }) => new Promise(
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
* Creates a user and account records. Returns an account access token for the app that initiated the request. The app should save this token for later, and should wait for the user to confirm their account by clicking a link in their email inbox.
*
* apiV1AccountsPostRequest ApiV1AccountsPostRequest  (optional)
* no response value expected for this operation
* */
const apiV1AccountsPOST = ({ apiV1AccountsPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apiV1AccountsPostRequest,
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
* Sets a private note on a user.
*
* id List Array of account IDs to check
* returns List
* */
const apiV1AccountsRelationshipsGET = ({ id }) => new Promise(
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
* Search for matching accounts by username or display name.
*
* q String What to search for
* limit Integer Maximum number of results. Defaults to 40. (optional)
* resolve String Attempt WebFinger lookup. Defaults to false. Use this when `q` is an exact address. (optional)
* following Boolean Only who the user is following. Defaults to false. (optional)
* returns List
* */
const apiV1AccountsSearchGET = ({ q, limit, resolve, following }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        q,
        limit,
        resolve,
        following,
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
* Update the user's display and preferences.
*
* apiV1AccountsUpdateCredentialsPatchRequest ApiV1AccountsUpdateCredentialsPatchRequest  (optional)
* returns Account
* */
const apiV1AccountsUpdateCredentialsPATCH = ({ apiV1AccountsUpdateCredentialsPatchRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apiV1AccountsUpdateCredentialsPatchRequest,
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
* Test to make sure that the user token works.
*
* returns Account
* */
const apiV1AccountsVerifyCredentialsGET = () => new Promise(
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

module.exports = {
  apiV1AccountsIdBlockPOST,
  apiV1AccountsIdFeaturedTagsGET,
  apiV1AccountsIdFollowPOST,
  apiV1AccountsIdFollowersGET,
  apiV1AccountsIdFollowingGET,
  apiV1AccountsIdGET,
  apiV1AccountsIdIdentityProofsGET,
  apiV1AccountsIdListsGET,
  apiV1AccountsIdMutePOST,
  apiV1AccountsIdNotePOST,
  apiV1AccountsIdPinPOST,
  apiV1AccountsIdStatusesGET,
  apiV1AccountsIdUnblockPOST,
  apiV1AccountsIdUnfollowPOST,
  apiV1AccountsIdUnmutePOST,
  apiV1AccountsIdUnpinPOST,
  apiV1AccountsPOST,
  apiV1AccountsRelationshipsGET,
  apiV1AccountsSearchGET,
  apiV1AccountsUpdateCredentialsPATCH,
  apiV1AccountsVerifyCredentialsGET,
};
