/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Downloads a remote image for an item.
*
* itemId UUID Item Id.
* type ImageType The image type.
* imageUrl String The image url. (optional)
* no response value expected for this operation
* */
const downloadRemoteImage = ({ itemId, type, imageUrl }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        type,
        imageUrl,
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
* Gets a remote image.
*
* imageUrl URI The image url.
* returns File
* */
const getRemoteImage = ({ imageUrl }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        imageUrl,
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
* Gets available remote image providers for an item.
*
* itemId UUID Item Id.
* returns List
* */
const getRemoteImageProviders = ({ itemId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Gets available remote images for an item.
*
* itemId UUID Item Id.
* type ImageType The image type. (optional)
* startIndex Integer Optional. The record index to start at. All items with a lower index will be dropped from the results. (optional)
* limit Integer Optional. The maximum number of records to return. (optional)
* providerName String Optional. The image provider to use. (optional)
* includeAllLanguages Boolean Optional. Include all languages. (optional)
* returns RemoteImageResult
* */
const getRemoteImages = ({ itemId, type, startIndex, limit, providerName, includeAllLanguages }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        type,
        startIndex,
        limit,
        providerName,
        includeAllLanguages,
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
  downloadRemoteImage,
  getRemoteImage,
  getRemoteImageProviders,
  getRemoteImages,
};
