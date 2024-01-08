/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Remove a like on this media by the current user.
* Remove a like on this media by the currently authenticated user.
*
* mediaId String The ID of the media resource.
* returns StatusResponse
* */
const mediaMediaIdLikesDELETE = ({ mediaId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        mediaId,
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
* Get a list of users who have liked this media.
* Get a list of users who have liked this media.
*
* mediaId String The ID of the media resource.
* returns UsersInfoResponse
* */
const mediaMediaIdLikesGET = ({ mediaId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        mediaId,
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
* Set a like on this media by the current user.
* Set a like on this media by the currently authenticated user.
*
* mediaId String The ID of the media resource.
* returns StatusResponse
* */
const mediaMediaIdLikesPOST = ({ mediaId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        mediaId,
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
  mediaMediaIdLikesDELETE,
  mediaMediaIdLikesGET,
  mediaMediaIdLikesPOST,
};
