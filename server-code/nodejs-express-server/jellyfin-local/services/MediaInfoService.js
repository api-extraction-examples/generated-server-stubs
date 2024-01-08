/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Closes a media source.
*
* liveStreamId String The livestream id.
* no response value expected for this operation
* */
const closeLiveStream = ({ liveStreamId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        liveStreamId,
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
* Tests the network with a request with the size of the bitrate.
*
* size Integer The bitrate. Defaults to 102400. (optional)
* returns File
* */
const getBitrateTestBytes = ({ size }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        size,
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
* Gets live playback media info for an item.
*
* itemId UUID The item id.
* userId UUID The user id.
* returns PlaybackInfoResponse
* */
const getPlaybackInfo = ({ itemId, userId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
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
* Gets live playback media info for an item.
* For backwards compatibility parameters can be sent via Query or Body, with Query having higher precedence.
*
* itemId UUID The item id.
* userId UUID The user id. (optional)
* maxStreamingBitrate Integer The maximum streaming bitrate. (optional)
* startTimeTicks Long The start time in ticks. (optional)
* audioStreamIndex Integer The audio stream index. (optional)
* subtitleStreamIndex Integer The subtitle stream index. (optional)
* maxAudioChannels Integer The maximum number of audio channels. (optional)
* mediaSourceId String The media source id. (optional)
* liveStreamId String The livestream id. (optional)
* autoOpenLiveStream Boolean Whether to auto open the livestream. (optional)
* enableDirectPlay Boolean Whether to enable direct play. Default: true. (optional)
* enableDirectStream Boolean Whether to enable direct stream. Default: true. (optional)
* enableTranscoding Boolean Whether to enable transcoding. Default: true. (optional)
* allowVideoStreamCopy Boolean Whether to allow to copy the video stream. Default: true. (optional)
* allowAudioStreamCopy Boolean Whether to allow to copy the audio stream. Default: true. (optional)
* playbackInfoDto PlaybackInfoDto The playback info. (optional)
* returns PlaybackInfoResponse
* */
const getPostedPlaybackInfo = ({ itemId, userId, maxStreamingBitrate, startTimeTicks, audioStreamIndex, subtitleStreamIndex, maxAudioChannels, mediaSourceId, liveStreamId, autoOpenLiveStream, enableDirectPlay, enableDirectStream, enableTranscoding, allowVideoStreamCopy, allowAudioStreamCopy, playbackInfoDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        userId,
        maxStreamingBitrate,
        startTimeTicks,
        audioStreamIndex,
        subtitleStreamIndex,
        maxAudioChannels,
        mediaSourceId,
        liveStreamId,
        autoOpenLiveStream,
        enableDirectPlay,
        enableDirectStream,
        enableTranscoding,
        allowVideoStreamCopy,
        allowAudioStreamCopy,
        playbackInfoDto,
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
* Opens a media source.
*
* openToken String The open token. (optional)
* userId UUID The user id. (optional)
* playSessionId String The play session id. (optional)
* maxStreamingBitrate Integer The maximum streaming bitrate. (optional)
* startTimeTicks Long The start time in ticks. (optional)
* audioStreamIndex Integer The audio stream index. (optional)
* subtitleStreamIndex Integer The subtitle stream index. (optional)
* maxAudioChannels Integer The maximum number of audio channels. (optional)
* itemId UUID The item id. (optional)
* enableDirectPlay Boolean Whether to enable direct play. Default: true. (optional)
* enableDirectStream Boolean Whether to enable direct stream. Default: true. (optional)
* openLiveStreamDto OpenLiveStreamDto The open live stream dto. (optional)
* returns LiveStreamResponse
* */
const openLiveStream = ({ openToken, userId, playSessionId, maxStreamingBitrate, startTimeTicks, audioStreamIndex, subtitleStreamIndex, maxAudioChannels, itemId, enableDirectPlay, enableDirectStream, openLiveStreamDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        openToken,
        userId,
        playSessionId,
        maxStreamingBitrate,
        startTimeTicks,
        audioStreamIndex,
        subtitleStreamIndex,
        maxAudioChannels,
        itemId,
        enableDirectPlay,
        enableDirectStream,
        openLiveStreamDto,
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
  closeLiveStream,
  getBitrateTestBytes,
  getPlaybackInfo,
  getPostedPlaybackInfo,
  openLiveStream,
};
