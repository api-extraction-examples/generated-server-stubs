/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Deletes an external subtitle file.
*
* itemId UUID The item id.
* index Integer The index of the subtitle file.
* no response value expected for this operation
* */
const deleteSubtitle = ({ itemId, index }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
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
* Downloads a remote subtitle.
*
* itemId UUID The item id.
* subtitleId String The subtitle id.
* no response value expected for this operation
* */
const downloadRemoteSubtitles = ({ itemId, subtitleId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        subtitleId,
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
* Gets a fallback font file.
*
* name String The name of the fallback font file to get.
* returns File
* */
const getFallbackFont = ({ name }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Gets a list of available fallback font files.
*
* returns List
* */
const getFallbackFontList = () => new Promise(
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
* Gets the remote subtitles.
*
* id String The item id.
* returns File
* */
const getRemoteSubtitles = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
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
* Gets subtitles in a specified format.
*
* itemId UUID The item id.
* mediaSourceId String The media source id.
* index Integer The subtitle stream index.
* format String The format of the returned subtitle.
* endPositionTicks Long Optional. The end position of the subtitle in ticks. (optional)
* copyTimestamps Boolean Optional. Whether to copy the timestamps. (optional)
* addVttTimeMap Boolean Optional. Whether to add a VTT time map. (optional)
* startPositionTicks Long Optional. The start position of the subtitle in ticks. (optional)
* returns File
* */
const getSubtitle = ({ itemId, mediaSourceId, index, format, endPositionTicks, copyTimestamps, addVttTimeMap, startPositionTicks }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        mediaSourceId,
        index,
        format,
        endPositionTicks,
        copyTimestamps,
        addVttTimeMap,
        startPositionTicks,
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
* Gets an HLS subtitle playlist.
*
* itemId UUID The item id.
* index Integer The subtitle stream index.
* mediaSourceId String The media source id.
* segmentLength Integer The subtitle segment length.
* returns File
* */
const getSubtitlePlaylist = ({ itemId, index, mediaSourceId, segmentLength }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        index,
        mediaSourceId,
        segmentLength,
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
* Gets subtitles in a specified format.
*
* itemId UUID The item id.
* mediaSourceId String The media source id.
* index Integer The subtitle stream index.
* startPositionTicks Long Optional. The start position of the subtitle in ticks.
* format String The format of the returned subtitle.
* endPositionTicks Long Optional. The end position of the subtitle in ticks. (optional)
* copyTimestamps Boolean Optional. Whether to copy the timestamps. (optional)
* addVttTimeMap Boolean Optional. Whether to add a VTT time map. (optional)
* returns File
* */
const getSubtitleWithTicks = ({ itemId, mediaSourceId, index, startPositionTicks, format, endPositionTicks, copyTimestamps, addVttTimeMap }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        mediaSourceId,
        index,
        startPositionTicks,
        format,
        endPositionTicks,
        copyTimestamps,
        addVttTimeMap,
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
* Search remote subtitles.
*
* itemId UUID The item id.
* language String The language of the subtitles.
* isPerfectMatch Boolean Optional. Only show subtitles which are a perfect match. (optional)
* returns List
* */
const searchRemoteSubtitles = ({ itemId, language, isPerfectMatch }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        language,
        isPerfectMatch,
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
* Upload an external subtitle file.
*
* itemId UUID The item the subtitle belongs to.
* uploadSubtitleDto UploadSubtitleDto The request body.
* no response value expected for this operation
* */
const uploadSubtitle = ({ itemId, uploadSubtitleDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        uploadSubtitleDto,
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
  deleteSubtitle,
  downloadRemoteSubtitles,
  getFallbackFont,
  getFallbackFontList,
  getRemoteSubtitles,
  getSubtitle,
  getSubtitlePlaylist,
  getSubtitleWithTicks,
  searchRemoteSubtitles,
  uploadSubtitle,
};
