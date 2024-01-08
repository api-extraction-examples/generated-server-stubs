/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Search for a user by name.
* Search for a user by name.
*
* q String A query string.
* count Integer Number of users to return. (optional)
* returns UsersInfoResponse
* */
const usersSearchGET = ({ q, count }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        q,
        count,
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
* See the authenticated user's feed.
* See the authenticated user's feed.  **Warning:** [Deprecated](http://instagram.com/developer/changelog/) for Apps created **on or after** Nov 17, 2015 
*
* count Integer Count of media to return. (optional)
* minUnderscoreid String Return media later than this `min_id`. (optional)
* maxUnderscoreid String Return media earlier than this `max_id`. (optional)
* returns MediaListResponse
* */
const usersSelfFeedGET = ({ count, minUnderscoreid, maxUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        count,
        minUnderscoreid,
        maxUnderscoreid,
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
* See the list of media liked by the authenticated user.
* See the list of media liked by the authenticated user. Private media is returned as long as the authenticated user has permission to view that media. Liked media lists are only available for the currently authenticated user. 
*
* count Integer Count of media to return. (optional)
* maxUnderscorelikeUnderscoreid String Return media liked before this id. (optional)
* returns MediaListResponse
* */
const usersSelfMediaLikedGET = ({ count, maxUnderscorelikeUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        count,
        maxUnderscorelikeUnderscoreid,
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
* Get basic information about a user.
* Get basic information about a user. To get information about the owner of the access token, you can use **self** instead of the `user-id`.  Security scope `public_content` is required to read information about other users. 
*
* userId String The ID of a user to get information about, or **self** to retrieve information about authenticated user.
* returns UserResponse
* */
const usersUserIdGET = ({ userId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
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
* Get the most recent media published by a user.
* Get the most recent media published by a user. To get the most recent media published by the owner of the access token, you can use **self** instead of the `user-id`.  Security scope `public_content` is required to read information about other users. 
*
* userId String The ID of a user to get recent media of, or **self** to retrieve media of authenticated user.
* count Integer Count of media to return. (optional)
* maxUnderscoretimestamp Long Return media before this UNIX timestamp. (optional)
* minUnderscoretimestamp Long Return media after this UNIX timestamp. (optional)
* minUnderscoreid String Return media later than this `min_id`. (optional)
* maxUnderscoreid String Return media earlier than this `max_id`. (optional)
* returns MediaListResponse
* */
const usersUserIdMediaRecentGET = ({ userId, count, maxUnderscoretimestamp, minUnderscoretimestamp, minUnderscoreid, maxUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        count,
        maxUnderscoretimestamp,
        minUnderscoretimestamp,
        minUnderscoreid,
        maxUnderscoreid,
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
  usersSearchGET,
  usersSelfFeedGET,
  usersSelfMediaLikedGET,
  usersUserIdGET,
  usersUserIdMediaRecentGET,
};
