/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Deletes a user's saved personal rating for an item.
*
* userId UUID User id.
* itemId UUID Item id.
* returns UserItemDataDto
* */
const deleteUserItemRating = ({ userId, itemId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        itemId,
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
* Gets intros to play before the main media item plays.
*
* userId UUID User id.
* itemId UUID Item id.
* returns BaseItemDtoQueryResult
* */
const getIntros = ({ userId, itemId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        itemId,
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
* Gets an item from a user's library.
*
* userId UUID User id.
* itemId UUID Item id.
* returns BaseItemDto
* */
const getItem = ({ userId, itemId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        itemId,
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
* Gets latest media.
*
* userId UUID User id.
* parentId UUID Specify this to localize the search to a specific item or folder. Omit to use the root. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* includeItemTypes List Optional. If specified, results will be filtered based on item type. This allows multiple, comma delimited. (optional)
* isPlayed Boolean Filter by items that are played, or not. (optional)
* enableImages Boolean Optional. include image information in output. (optional)
* imageTypeLimit Integer Optional. the max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* enableUserData Boolean Optional. include user data. (optional)
* limit Integer Return item limit. (optional)
* groupItems Boolean Whether or not to group items into a parent container. (optional)
* returns List
* */
const getLatestMedia = ({ userId, parentId, fields, includeItemTypes, isPlayed, enableImages, imageTypeLimit, enableImageTypes, enableUserData, limit, groupItems }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        parentId,
        fields,
        includeItemTypes,
        isPlayed,
        enableImages,
        imageTypeLimit,
        enableImageTypes,
        enableUserData,
        limit,
        groupItems,
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
* Gets local trailers for an item.
*
* userId UUID User id.
* itemId UUID Item id.
* returns List
* */
const getLocalTrailers = ({ userId, itemId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        itemId,
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
* Gets the root folder from a user's library.
*
* userId UUID User id.
* returns BaseItemDto
* */
const getRootFolder = ({ userId }) => new Promise(
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
* Gets special features for an item.
*
* userId UUID User id.
* itemId UUID Item id.
* returns List
* */
const getSpecialFeatures = ({ userId, itemId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        itemId,
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
* Marks an item as a favorite.
*
* userId UUID User id.
* itemId UUID Item id.
* returns UserItemDataDto
* */
const markFavoriteItem = ({ userId, itemId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        itemId,
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
* Unmarks item as a favorite.
*
* userId UUID User id.
* itemId UUID Item id.
* returns UserItemDataDto
* */
const unmarkFavoriteItem = ({ userId, itemId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        itemId,
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
* Updates a user's rating for an item.
*
* userId UUID User id.
* itemId UUID Item id.
* likes Boolean Whether this M:Jellyfin.Api.Controllers.UserLibraryController.UpdateUserItemRating(System.Guid,System.Guid,System.Nullable{System.Boolean}) is likes. (optional)
* returns UserItemDataDto
* */
const updateUserItemRating = ({ userId, itemId, likes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        itemId,
        likes,
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
  deleteUserItemRating,
  getIntros,
  getItem,
  getLatestMedia,
  getLocalTrailers,
  getRootFolder,
  getSpecialFeatures,
  markFavoriteItem,
  unmarkFavoriteItem,
  updateUserItemRating,
};
