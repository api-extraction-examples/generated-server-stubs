/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Remove a comment.
* Remove a comment either on the authenticated user's media object or authored by the authenticated user. 
*
* mediaId String The ID of the media resource.
* commentId String The ID of the comment entry.
* returns StatusResponse
* */
const mediaMediaIdCommentsCommentIdDELETE = ({ mediaId, commentId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        mediaId,
        commentId,
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
* Get a list of recent comments on a media object.
* Get a list of recent comments on a media object.
*
* mediaId String The ID of the media resource.
* returns CommentsResponse
* */
const mediaMediaIdCommentsGET = ({ mediaId }) => new Promise(
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
* Create a comment on a media object.
* Create a comment on a media object with the following rules:    * The total length of the comment cannot exceed 300 characters.   * The comment cannot contain more than 4 hashtags.   * The comment cannot contain more than 1 URL.   * The comment cannot consist of all capital letters. 
*
* mediaId String The ID of the media resource.
* text String Text to post as a comment on the media object as specified in `media-id`.
* returns StatusResponse
* */
const mediaMediaIdCommentsPOST = ({ mediaId, text }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        mediaId,
        text,
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
  mediaMediaIdCommentsCommentIdDELETE,
  mediaMediaIdCommentsGET,
  mediaMediaIdCommentsPOST,
};
