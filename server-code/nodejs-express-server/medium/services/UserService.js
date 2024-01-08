/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get User ID
* Returns the unique `user_id` for the given `username`.  **Note:** You can find the `username` from the user's/author's profile page URL.  - **username**.medium.com - medium.com/@**username** 
*
* username String It's a unique string chosen by every single Medium user.
* returns _user_id_for__username__get_200_response
* */
const userIdForUsernameGET = ({ username }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Get User's Articles
* Returns the list of articles (`article_ids`) written by the user. 
*
* userUnderscoreid String Unique hash id assigned to every single Medium user.
* returns _user__user_id__articles_get_200_response
* */
const userUserIdArticlesGET = ({ userUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoreid,
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
* Get User Followers
* Returns the list of `user_ids` of the user's followers.  **Note:** The length of this followers' list might be different from what you get in  the \"Get User Info\" Endpoint. It's because, this list doesn't include Medium Users who  left the platform. If you really need the exact followers' count, use this endpoint to get the followers'  list and take its length as the exact followers' count 
*
* userUnderscoreid String Unique hash id assigned to every single Medium user.
* count Integer To limit the number of results. (count &lt; 1500) (optional)
* returns _user__user_id__followers_get_200_response
* */
const userUserIdFollowersGET = ({ userUnderscoreid, count }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoreid,
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
* Get User Following
* Returns the list of `user_ids` of the user's followings.  **Note:** Currently, this list does not contain the `publication_ids` of the publications that the user is following. 
*
* userUnderscoreid String Unique hash id assigned to every single Medium user.
* count Integer To limit the number of results. (count &lt; 1500) (optional)
* returns _user__user_id__following_get_200_response
* */
const userUserIdFollowingGET = ({ userUnderscoreid, count }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoreid,
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
* Get User Info
* Returns user related information like *Full name, Bio, Followers count, Following count, Twitter username, Profile-image URL, User ID, etc...*   It takes `user_id` as the path parameter.  **Note:** If you don't know the `user_id`, then you can get it from the endpoint\\ '/user/id_for/{`username`}'. 
*
* userUnderscoreid String It's a unique hash id assigned to every single Medium user.
* returns _user__user_id__get_200_response
* */
const userUserIdGET = ({ userUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoreid,
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
* Get User's Interests
* Returns a list of tags that the given user follows. 
*
* userUnderscoreid String Unique hash id assigned to every single Medium user.
* returns _user__user_id__interests_get_200_response
* */
const userUserIdInterestsGET = ({ userUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoreid,
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
* Get User's Lists
* Returns an array of `list_ids` created by the user.  **Note:** You can check whether the use has created lists or not beforehand. Check the  `has_list` attribute in the \"Article Info\" endpoint. 
*
* userUnderscoreid String Unique hash id assigned to every single Medium user.
* returns _user__user_id__lists_get_200_response
* */
const userUserIdListsGET = ({ userUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoreid,
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
* Get User's Publications
* Returns a list of `publication_ids` where the user is the editor and/or creator. 
*
* userUnderscoreid String Unique hash id assigned to every single Medium user.
* returns _user__user_id__publications_get_200_response
* */
const userUserIdPublicationsGET = ({ userUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoreid,
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
* Get User's Top Articles
* Returns a list of `article_ids` of the top 10 articles on the user's profile, for a given `user_id`. 
*
* userUnderscoreid String Unique hash id assigned to every single Medium user.
* returns _user__user_id__articles_get_200_response
* */
const userUserIdTopArticlesGET = ({ userUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoreid,
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
  userIdForUsernameGET,
  userUserIdArticlesGET,
  userUserIdFollowersGET,
  userUserIdFollowingGET,
  userUserIdGET,
  userUserIdInterestsGET,
  userUserIdListsGET,
  userUserIdPublicationsGET,
  userUserIdTopArticlesGET,
};
