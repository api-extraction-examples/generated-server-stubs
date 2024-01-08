/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete an item's image.
*
* itemId UUID Item id.
* imageType ImageType Image type.
* imageIndex Integer The image index. (optional)
* no response value expected for this operation
* */
const deleteItemImage = ({ itemId, imageType, imageIndex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        imageType,
        imageIndex,
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
* Delete an item's image.
*
* itemId UUID Item id.
* imageType ImageType Image type.
* imageIndex Integer The image index.
* no response value expected for this operation
* */
const deleteItemImageByIndex = ({ itemId, imageType, imageIndex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        imageType,
        imageIndex,
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
* Delete the user's image.
*
* userId UUID User Id.
* imageType ImageType (Unused) Image type.
* index Integer (Unused) Image index. (optional)
* no response value expected for this operation
* */
const deleteUserImage = ({ userId, imageType, index }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        imageType,
        index,
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
* Delete the user's image.
*
* userId UUID User Id.
* imageType ImageType (Unused) Image type.
* index Integer (Unused) Image index.
* no response value expected for this operation
* */
const deleteUserImageByIndex = ({ userId, imageType, index }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        imageType,
        index,
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
* Get artist image by name.
*
* name String Artist name.
* imageType ImageType Image type.
* imageIndex Integer Image index.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* returns File
* */
const getArtistImage = ({ name, imageType, imageIndex, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        imageType,
        imageIndex,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
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
* Get genre image by name.
*
* name String Genre name.
* imageType ImageType Image type.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* imageIndex Integer Image index. (optional)
* returns File
* */
const getGenreImage = ({ name, imageType, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer, imageIndex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        imageType,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
        imageIndex,
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
* Get genre image by name.
*
* name String Genre name.
* imageType ImageType Image type.
* imageIndex Integer Image index.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* returns File
* */
const getGenreImageByIndex = ({ name, imageType, imageIndex, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        imageType,
        imageIndex,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
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
* Gets the item's image.
*
* itemId UUID Item id.
* imageType ImageType Image type.
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* format ImageFormat Optional. The MediaBrowser.Model.Drawing.ImageFormat of the returned image. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* imageIndex Integer Image index. (optional)
* returns File
* */
const getItemImage = ({ itemId, imageType, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, format, addPlayedIndicator, percentPlayed, unplayedCount, blur, backgroundColor, foregroundLayer, imageIndex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        imageType,
        maxWidth,
        maxHeight,
        width,
        height,
        quality,
        tag,
        cropWhitespace,
        format,
        addPlayedIndicator,
        percentPlayed,
        unplayedCount,
        blur,
        backgroundColor,
        foregroundLayer,
        imageIndex,
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
* Gets the item's image.
*
* itemId UUID Item id.
* imageType ImageType Image type.
* maxWidth Integer The maximum image width to return.
* maxHeight Integer The maximum image height to return.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers.
* format ImageFormat Determines the output format of the image - original,gif,jpg,png.
* percentPlayed Double Optional. Percent to render for the percent played overlay.
* unplayedCount Integer Optional. Unplayed count overlay to render.
* imageIndex Integer Image index.
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* returns File
* */
const getItemImage2 = ({ itemId, imageType, maxWidth, maxHeight, tag, format, percentPlayed, unplayedCount, imageIndex, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        imageType,
        maxWidth,
        maxHeight,
        tag,
        format,
        percentPlayed,
        unplayedCount,
        imageIndex,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
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
* Gets the item's image.
*
* itemId UUID Item id.
* imageType ImageType Image type.
* imageIndex Integer Image index.
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* format ImageFormat Optional. The MediaBrowser.Model.Drawing.ImageFormat of the returned image. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* returns File
* */
const getItemImageByIndex = ({ itemId, imageType, imageIndex, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, format, addPlayedIndicator, percentPlayed, unplayedCount, blur, backgroundColor, foregroundLayer }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        imageType,
        imageIndex,
        maxWidth,
        maxHeight,
        width,
        height,
        quality,
        tag,
        cropWhitespace,
        format,
        addPlayedIndicator,
        percentPlayed,
        unplayedCount,
        blur,
        backgroundColor,
        foregroundLayer,
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
* Get item image infos.
*
* itemId UUID Item id.
* returns List
* */
const getItemImageInfos = ({ itemId }) => new Promise(
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
* Get music genre image by name.
*
* name String Music genre name.
* imageType ImageType Image type.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* imageIndex Integer Image index. (optional)
* returns File
* */
const getMusicGenreImage = ({ name, imageType, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer, imageIndex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        imageType,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
        imageIndex,
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
* Get music genre image by name.
*
* name String Music genre name.
* imageType ImageType Image type.
* imageIndex Integer Image index.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* returns File
* */
const getMusicGenreImageByIndex = ({ name, imageType, imageIndex, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        imageType,
        imageIndex,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
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
* Get person image by name.
*
* name String Person name.
* imageType ImageType Image type.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* imageIndex Integer Image index. (optional)
* returns File
* */
const getPersonImage = ({ name, imageType, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer, imageIndex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        imageType,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
        imageIndex,
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
* Get person image by name.
*
* name String Person name.
* imageType ImageType Image type.
* imageIndex Integer Image index.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* returns File
* */
const getPersonImageByIndex = ({ name, imageType, imageIndex, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        imageType,
        imageIndex,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
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
* Get studio image by name.
*
* name String Studio name.
* imageType ImageType Image type.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* imageIndex Integer Image index. (optional)
* returns File
* */
const getStudioImage = ({ name, imageType, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer, imageIndex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        imageType,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
        imageIndex,
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
* Get studio image by name.
*
* name String Studio name.
* imageType ImageType Image type.
* imageIndex Integer Image index.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* returns File
* */
const getStudioImageByIndex = ({ name, imageType, imageIndex, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        imageType,
        imageIndex,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
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
* Get user profile image.
*
* userId UUID User id.
* imageType ImageType Image type.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* imageIndex Integer Image index. (optional)
* returns File
* */
const getUserImage = ({ userId, imageType, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer, imageIndex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        imageType,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
        imageIndex,
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
* Get user profile image.
*
* userId UUID User id.
* imageType ImageType Image type.
* imageIndex Integer Image index.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* returns File
* */
const getUserImageByIndex = ({ userId, imageType, imageIndex, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        imageType,
        imageIndex,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
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
* Get artist image by name.
*
* name String Artist name.
* imageType ImageType Image type.
* imageIndex Integer Image index.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* returns File
* */
const headArtistImage = ({ name, imageType, imageIndex, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        imageType,
        imageIndex,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
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
* Get genre image by name.
*
* name String Genre name.
* imageType ImageType Image type.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* imageIndex Integer Image index. (optional)
* returns File
* */
const headGenreImage = ({ name, imageType, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer, imageIndex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        imageType,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
        imageIndex,
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
* Get genre image by name.
*
* name String Genre name.
* imageType ImageType Image type.
* imageIndex Integer Image index.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* returns File
* */
const headGenreImageByIndex = ({ name, imageType, imageIndex, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        imageType,
        imageIndex,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
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
* Gets the item's image.
*
* itemId UUID Item id.
* imageType ImageType Image type.
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* format ImageFormat Optional. The MediaBrowser.Model.Drawing.ImageFormat of the returned image. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* imageIndex Integer Image index. (optional)
* returns File
* */
const headItemImage = ({ itemId, imageType, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, format, addPlayedIndicator, percentPlayed, unplayedCount, blur, backgroundColor, foregroundLayer, imageIndex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        imageType,
        maxWidth,
        maxHeight,
        width,
        height,
        quality,
        tag,
        cropWhitespace,
        format,
        addPlayedIndicator,
        percentPlayed,
        unplayedCount,
        blur,
        backgroundColor,
        foregroundLayer,
        imageIndex,
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
* Gets the item's image.
*
* itemId UUID Item id.
* imageType ImageType Image type.
* maxWidth Integer The maximum image width to return.
* maxHeight Integer The maximum image height to return.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers.
* format ImageFormat Determines the output format of the image - original,gif,jpg,png.
* percentPlayed Double Optional. Percent to render for the percent played overlay.
* unplayedCount Integer Optional. Unplayed count overlay to render.
* imageIndex Integer Image index.
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* returns File
* */
const headItemImage2 = ({ itemId, imageType, maxWidth, maxHeight, tag, format, percentPlayed, unplayedCount, imageIndex, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        imageType,
        maxWidth,
        maxHeight,
        tag,
        format,
        percentPlayed,
        unplayedCount,
        imageIndex,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
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
* Gets the item's image.
*
* itemId UUID Item id.
* imageType ImageType Image type.
* imageIndex Integer Image index.
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* format ImageFormat Optional. The MediaBrowser.Model.Drawing.ImageFormat of the returned image. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* returns File
* */
const headItemImageByIndex = ({ itemId, imageType, imageIndex, maxWidth, maxHeight, width, height, quality, tag, cropWhitespace, format, addPlayedIndicator, percentPlayed, unplayedCount, blur, backgroundColor, foregroundLayer }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        imageType,
        imageIndex,
        maxWidth,
        maxHeight,
        width,
        height,
        quality,
        tag,
        cropWhitespace,
        format,
        addPlayedIndicator,
        percentPlayed,
        unplayedCount,
        blur,
        backgroundColor,
        foregroundLayer,
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
* Get music genre image by name.
*
* name String Music genre name.
* imageType ImageType Image type.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* imageIndex Integer Image index. (optional)
* returns File
* */
const headMusicGenreImage = ({ name, imageType, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer, imageIndex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        imageType,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
        imageIndex,
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
* Get music genre image by name.
*
* name String Music genre name.
* imageType ImageType Image type.
* imageIndex Integer Image index.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* returns File
* */
const headMusicGenreImageByIndex = ({ name, imageType, imageIndex, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        imageType,
        imageIndex,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
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
* Get person image by name.
*
* name String Person name.
* imageType ImageType Image type.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* imageIndex Integer Image index. (optional)
* returns File
* */
const headPersonImage = ({ name, imageType, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer, imageIndex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        imageType,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
        imageIndex,
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
* Get person image by name.
*
* name String Person name.
* imageType ImageType Image type.
* imageIndex Integer Image index.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* returns File
* */
const headPersonImageByIndex = ({ name, imageType, imageIndex, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        imageType,
        imageIndex,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
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
* Get studio image by name.
*
* name String Studio name.
* imageType ImageType Image type.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* imageIndex Integer Image index. (optional)
* returns File
* */
const headStudioImage = ({ name, imageType, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer, imageIndex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        imageType,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
        imageIndex,
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
* Get studio image by name.
*
* name String Studio name.
* imageType ImageType Image type.
* imageIndex Integer Image index.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* returns File
* */
const headStudioImageByIndex = ({ name, imageType, imageIndex, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        name,
        imageType,
        imageIndex,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
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
* Get user profile image.
*
* userId UUID User id.
* imageType ImageType Image type.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* imageIndex Integer Image index. (optional)
* returns File
* */
const headUserImage = ({ userId, imageType, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer, imageIndex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        imageType,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
        imageIndex,
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
* Get user profile image.
*
* userId UUID User id.
* imageType ImageType Image type.
* imageIndex Integer Image index.
* tag String Optional. Supply the cache tag from the item object to receive strong caching headers. (optional)
* format ImageFormat Determines the output format of the image - original,gif,jpg,png. (optional)
* maxWidth Integer The maximum image width to return. (optional)
* maxHeight Integer The maximum image height to return. (optional)
* percentPlayed Double Optional. Percent to render for the percent played overlay. (optional)
* unplayedCount Integer Optional. Unplayed count overlay to render. (optional)
* width Integer The fixed image width to return. (optional)
* height Integer The fixed image height to return. (optional)
* quality Integer Optional. Quality setting, from 0-100. Defaults to 90 and should suffice in most cases. (optional)
* cropWhitespace Boolean Optional. Specify if whitespace should be cropped out of the image. True/False. If unspecified, whitespace will be cropped from logos and clear art. (optional)
* addPlayedIndicator Boolean Optional. Add a played indicator. (optional)
* blur Integer Optional. Blur image. (optional)
* backgroundColor String Optional. Apply a background color for transparent images. (optional)
* foregroundLayer String Optional. Apply a foreground layer on top of the image. (optional)
* returns File
* */
const headUserImageByIndex = ({ userId, imageType, imageIndex, tag, format, maxWidth, maxHeight, percentPlayed, unplayedCount, width, height, quality, cropWhitespace, addPlayedIndicator, blur, backgroundColor, foregroundLayer }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        imageType,
        imageIndex,
        tag,
        format,
        maxWidth,
        maxHeight,
        percentPlayed,
        unplayedCount,
        width,
        height,
        quality,
        cropWhitespace,
        addPlayedIndicator,
        blur,
        backgroundColor,
        foregroundLayer,
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
* Sets the user image.
*
* userId UUID User Id.
* imageType ImageType (Unused) Image type.
* index Integer (Unused) Image index. (optional)
* no response value expected for this operation
* */
const postUserImage = ({ userId, imageType, index }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        imageType,
        index,
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
* Sets the user image.
*
* userId UUID User Id.
* imageType ImageType (Unused) Image type.
* index Integer (Unused) Image index.
* no response value expected for this operation
* */
const postUserImageByIndex = ({ userId, imageType, index }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        imageType,
        index,
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
* Set item image.
*
* itemId UUID Item id.
* imageType ImageType Image type.
* no response value expected for this operation
* */
const setItemImage = ({ itemId, imageType }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        imageType,
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
* Set item image.
*
* itemId UUID Item id.
* imageType ImageType Image type.
* imageIndex Integer (Unused) Image index.
* no response value expected for this operation
* */
const setItemImageByIndex = ({ itemId, imageType, imageIndex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        imageType,
        imageIndex,
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
* Updates the index for an item image.
*
* itemId UUID Item id.
* imageType ImageType Image type.
* imageIndex Integer Old image index.
* newIndex Integer New image index. (optional)
* no response value expected for this operation
* */
const updateItemImageIndex = ({ itemId, imageType, imageIndex, newIndex }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        imageType,
        imageIndex,
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

module.exports = {
  deleteItemImage,
  deleteItemImageByIndex,
  deleteUserImage,
  deleteUserImageByIndex,
  getArtistImage,
  getGenreImage,
  getGenreImageByIndex,
  getItemImage,
  getItemImage2,
  getItemImageByIndex,
  getItemImageInfos,
  getMusicGenreImage,
  getMusicGenreImageByIndex,
  getPersonImage,
  getPersonImageByIndex,
  getStudioImage,
  getStudioImageByIndex,
  getUserImage,
  getUserImageByIndex,
  headArtistImage,
  headGenreImage,
  headGenreImageByIndex,
  headItemImage,
  headItemImage2,
  headItemImageByIndex,
  headMusicGenreImage,
  headMusicGenreImageByIndex,
  headPersonImage,
  headPersonImageByIndex,
  headStudioImage,
  headStudioImageByIndex,
  headUserImage,
  headUserImageByIndex,
  postUserImage,
  postUserImageByIndex,
  setItemImage,
  setItemImageByIndex,
  updateItemImageIndex,
};
