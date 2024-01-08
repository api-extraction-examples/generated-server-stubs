/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Gets the specified audio segment for an audio item.
*
* itemId String The item id.
* segmentId String The segment id.
* returns File
* */
const getHlsAudioSegmentLegacyAac = ({ itemId, segmentId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        segmentId,
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
* Gets the specified audio segment for an audio item.
*
* itemId String The item id.
* segmentId String The segment id.
* returns File
* */
const getHlsAudioSegmentLegacyMp3 = ({ itemId, segmentId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        segmentId,
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
* Gets a hls video playlist.
*
* itemId String The video id.
* playlistId String The playlist id.
* returns File
* */
const getHlsPlaylistLegacy = ({ itemId, playlistId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        playlistId,
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
* Gets a hls video segment.
*
* itemId String The item id.
* playlistId String The playlist id.
* segmentId String The segment id.
* segmentContainer String The segment container.
* returns File
* */
const getHlsVideoSegmentLegacy = ({ itemId, playlistId, segmentId, segmentContainer }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        playlistId,
        segmentId,
        segmentContainer,
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
* Stops an active encoding.
*
* deviceId String The device id of the client requesting. Used to stop encoding processes when needed. (optional)
* playSessionId String The play session id. (optional)
* no response value expected for this operation
* */
const stopEncodingProcess = ({ deviceId, playSessionId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        deviceId,
        playSessionId,
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
  getHlsAudioSegmentLegacyAac,
  getHlsAudioSegmentLegacyMp3,
  getHlsPlaylistLegacy,
  getHlsVideoSegmentLegacy,
  stopEncodingProcess,
};
