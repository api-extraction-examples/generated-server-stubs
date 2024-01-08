/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List the users who have requested this user's permission to follow.
* List the users who have requested this user's permission to follow.
*
* returns UsersInfoResponse
* */
const usersSelfRequestedByGET = () => new Promise(
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
* Get the list of users this user is followed by.
* Get the list of users this user is followed by. To get users followed by the owner of the access token, you can use **self** instead of the `user-id`. 
*
* userId String The ID of a user, or **self** to retrieve information about authenticated user.
* returns UsersPagingResponse
* */
const usersUserIdFollowedByGET = ({ userId }) => new Promise(
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
* Get the list of users this user follows.
* Get the list of users this user follows. To get follows of the owner of the access token, you can use **self** instead of the `user-id`. 
*
* userId String The ID of a user, or **self** to retrieve information about authenticated user.
* returns UsersPagingResponse
* */
const usersUserIdFollowsGET = ({ userId }) => new Promise(
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
* Get information about a relationship to another user.
* Get information about a relationship to another user.
*
* userId String The ID of a user to get information about.
* returns RelationshipResponse
* */
const usersUserIdRelationshipGET = ({ userId }) => new Promise(
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
* Modify the relationship between the current user and the target user.
* Modify the relationship between the current user and the target user.
*
* userId String The ID of the target user.
* action String Type of action to apply for relationship with the user.
* returns RelationshipPostResponse
* */
const usersUserIdRelationshipPOST = ({ userId, action }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        action,
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
  usersSelfRequestedByGET,
  usersUserIdFollowedByGET,
  usersUserIdFollowsGET,
  usersUserIdRelationshipGET,
  usersUserIdRelationshipPOST,
};
