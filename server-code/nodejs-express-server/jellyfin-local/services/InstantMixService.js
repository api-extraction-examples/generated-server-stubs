/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Creates an instant playlist based on a given song.
*
* id UUID The item id.
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* enableImages Boolean Optional. Include image information in output. (optional)
* enableUserData Boolean Optional. Include user data. (optional)
* imageTypeLimit Integer Optional. The max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* returns BaseItemDtoQueryResult
* */
const getInstantMixFromAlbum = ({ id, userId, limit, fields, enableImages, enableUserData, imageTypeLimit, enableImageTypes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        userId,
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
* Creates an instant playlist based on a given song.
*
* id UUID The item id.
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* enableImages Boolean Optional. Include image information in output. (optional)
* enableUserData Boolean Optional. Include user data. (optional)
* imageTypeLimit Integer Optional. The max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* returns BaseItemDtoQueryResult
* */
const getInstantMixFromArtists = ({ id, userId, limit, fields, enableImages, enableUserData, imageTypeLimit, enableImageTypes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        userId,
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
* Creates an instant playlist based on a given song.
*
* id UUID The item id.
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* enableImages Boolean Optional. Include image information in output. (optional)
* enableUserData Boolean Optional. Include user data. (optional)
* imageTypeLimit Integer Optional. The max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* returns BaseItemDtoQueryResult
* */
const getInstantMixFromItem = ({ id, userId, limit, fields, enableImages, enableUserData, imageTypeLimit, enableImageTypes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        userId,
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
* Creates an instant playlist based on a given song.
*
* name String The genre name.
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* enableImages Boolean Optional. Include image information in output. (optional)
* enableUserData Boolean Optional. Include user data. (optional)
* imageTypeLimit Integer Optional. The max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* returns BaseItemDtoQueryResult
* */
const getInstantMixFromMusicGenre = ({ name, userId, limit, fields, enableImages, enableUserData, imageTypeLimit, enableImageTypes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        userId,
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
* Creates an instant playlist based on a given song.
*
* id UUID The item id.
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* enableImages Boolean Optional. Include image information in output. (optional)
* enableUserData Boolean Optional. Include user data. (optional)
* imageTypeLimit Integer Optional. The max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* returns BaseItemDtoQueryResult
* */
const getInstantMixFromMusicGenres = ({ id, userId, limit, fields, enableImages, enableUserData, imageTypeLimit, enableImageTypes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        userId,
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
* Creates an instant playlist based on a given song.
*
* id UUID The item id.
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* enableImages Boolean Optional. Include image information in output. (optional)
* enableUserData Boolean Optional. Include user data. (optional)
* imageTypeLimit Integer Optional. The max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* returns BaseItemDtoQueryResult
* */
const getInstantMixFromPlaylist = ({ id, userId, limit, fields, enableImages, enableUserData, imageTypeLimit, enableImageTypes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        userId,
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
* Creates an instant playlist based on a given song.
*
* id UUID The item id.
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* fields List Optional. Specify additional fields of information to return in the output. (optional)
* enableImages Boolean Optional. Include image information in output. (optional)
* enableUserData Boolean Optional. Include user data. (optional)
* imageTypeLimit Integer Optional. The max number of images to return, per image type. (optional)
* enableImageTypes List Optional. The image types to include in the output. (optional)
* returns BaseItemDtoQueryResult
* */
const getInstantMixFromSong = ({ id, userId, limit, fields, enableImages, enableUserData, imageTypeLimit, enableImageTypes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        userId,
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

module.exports = {
  getInstantMixFromAlbum,
  getInstantMixFromArtists,
  getInstantMixFromItem,
  getInstantMixFromMusicGenre,
  getInstantMixFromMusicGenres,
  getInstantMixFromPlaylist,
  getInstantMixFromSong,
};
