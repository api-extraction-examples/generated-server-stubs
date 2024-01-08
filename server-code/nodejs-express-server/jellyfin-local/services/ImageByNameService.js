/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get General Image.
*
* name String The name of the image.
* type String Image Type (primary, backdrop, logo, etc).
* returns File
* */
const getGeneralImage = ({ name, type }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        type,
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
* Get all general images.
*
* returns List
* */
const getGeneralImages = () => new Promise(
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
* Get media info image.
*
* theme String The theme to get the image from.
* name String The name of the image.
* returns File
* */
const getMediaInfoImage = ({ theme, name }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        theme,
        name,
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
* Get all media info images.
*
* returns List
* */
const getMediaInfoImages = () => new Promise(
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
* Get rating image.
*
* theme String The theme to get the image from.
* name String The name of the image.
* returns File
* */
const getRatingImage = ({ theme, name }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        theme,
        name,
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
* Get all general images.
*
* returns List
* */
const getRatingImages = () => new Promise(
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
  getGeneralImage,
  getGeneralImages,
  getMediaInfoImage,
  getMediaInfoImages,
  getRatingImage,
  getRatingImages,
};
