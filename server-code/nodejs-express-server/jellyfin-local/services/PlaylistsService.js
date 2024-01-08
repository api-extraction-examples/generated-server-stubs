/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Adds items to a playlist.
*
* playlistId UUID The playlist id.
* ids List Item id, comma delimited. (optional)
* userId UUID The userId. (optional)
* no response value expected for this operation
* */
const addToPlaylist = ({ playlistId, ids, userId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        playlistId,
        ids,
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
* Creates a new playlist.
* For backwards compatibility parameters can be sent via Query or Body, with Query having higher precedence.
*
* name String The playlist name. (optional)
* ids List The item ids. (optional)
* userId UUID The user id. (optional)
* mediaType String The media type. (optional)
* createPlaylistDto CreatePlaylistDto The create playlist payload. (optional)
* returns PlaylistCreationResult
* */
const createPlaylist = ({ name, ids, userId, mediaType, createPlaylistDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        ids,
        userId,
        mediaType,
        createPlaylistDto,
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
* Gets the original items of a playlist.
*
* playlistId UUID The playlist id.
* userId UUID User id.
* startIndex Integer Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* enableImages Boolean Optional. Include image information in output. (optional)
* enableUserData Boolean Optional. Include user data. (optional)
* imageTypeLimit Integer Optional. The max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* returns BaseItemDtoQueryResult
* */
const getPlaylistItems = ({ playlistId, userId, startIndex, limit, fields, enableImages, enableUserData, imageTypeLimit, enableImageTypes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        playlistId,
        userId,
        startIndex,
        limit,
        fields,
        enableImages,
        enableUserData,
        imageTypeLimit,
        enableImageTypes,
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
* Moves a playlist item.
*
* playlistId String The playlist id.
* itemId String The item id.
* newIndex Integer The new index.
* no response value expected for this operation
* */
const moveItem = ({ playlistId, itemId, newIndex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        playlistId,
        itemId,
        newIndex,
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
* Removes items from a playlist.
*
* playlistId String The playlist id.
* entryIds List The item ids, comma delimited. (optional)
* no response value expected for this operation
* */
const removeFromPlaylist = ({ playlistId, entryIds }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        playlistId,
        entryIds,
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
  addToPlaylist,
  createPlaylist,
  getPlaylistItems,
  moveItem,
  removeFromPlaylist,
};
