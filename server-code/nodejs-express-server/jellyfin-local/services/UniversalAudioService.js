/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Gets an audio stream.
*
* itemId UUID The item id.
* container List Optional. The audio container. (optional)
* mediaSourceId String The media version id, if playing an alternate version. (optional)
* deviceId String The device id of the client requesting. Used to stop encoding processes when needed. (optional)
* userId UUID Optional. The user id. (optional)
* audioCodec String Optional. The audio codec to transcode to. (optional)
* maxAudioChannels Integer Optional. The maximum number of audio channels. (optional)
* transcodingAudioChannels Integer Optional. The number of how many audio channels to transcode to. (optional)
* maxStreamingBitrate Integer Optional. The maximum streaming bitrate. (optional)
* audioBitRate Integer Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
* startTimeTicks Long Optional. Specify a starting offset, in ticks. 1 tick = 10000 ms. (optional)
* transcodingContainer String Optional. The container to transcode to. (optional)
* transcodingProtocol String Optional. The transcoding protocol. (optional)
* maxAudioSampleRate Integer Optional. The maximum audio sample rate. (optional)
* maxAudioBitDepth Integer Optional. The maximum audio bit depth. (optional)
* enableRemoteMedia Boolean Optional. Whether to enable remote media. (optional)
* breakOnNonKeyFrames Boolean Optional. Whether to break on non key frames. (optional)
* enableRedirection Boolean Whether to enable redirection. Defaults to true. (optional)
* returns File
* */
const getUniversalAudioStream = ({ itemId, container, mediaSourceId, deviceId, userId, audioCodec, maxAudioChannels, transcodingAudioChannels, maxStreamingBitrate, audioBitRate, startTimeTicks, transcodingContainer, transcodingProtocol, maxAudioSampleRate, maxAudioBitDepth, enableRemoteMedia, breakOnNonKeyFrames, enableRedirection }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        container,
        mediaSourceId,
        deviceId,
        userId,
        audioCodec,
        maxAudioChannels,
        transcodingAudioChannels,
        maxStreamingBitrate,
        audioBitRate,
        startTimeTicks,
        transcodingContainer,
        transcodingProtocol,
        maxAudioSampleRate,
        maxAudioBitDepth,
        enableRemoteMedia,
        breakOnNonKeyFrames,
        enableRedirection,
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
* Gets an audio stream.
*
* itemId UUID The item id.
* container List Optional. The audio container. (optional)
* mediaSourceId String The media version id, if playing an alternate version. (optional)
* deviceId String The device id of the client requesting. Used to stop encoding processes when needed. (optional)
* userId UUID Optional. The user id. (optional)
* audioCodec String Optional. The audio codec to transcode to. (optional)
* maxAudioChannels Integer Optional. The maximum number of audio channels. (optional)
* transcodingAudioChannels Integer Optional. The number of how many audio channels to transcode to. (optional)
* maxStreamingBitrate Integer Optional. The maximum streaming bitrate. (optional)
* audioBitRate Integer Optional. Specify an audio bitrate to encode to, e.g. 128000. If omitted this will be left to encoder defaults. (optional)
* startTimeTicks Long Optional. Specify a starting offset, in ticks. 1 tick = 10000 ms. (optional)
* transcodingContainer String Optional. The container to transcode to. (optional)
* transcodingProtocol String Optional. The transcoding protocol. (optional)
* maxAudioSampleRate Integer Optional. The maximum audio sample rate. (optional)
* maxAudioBitDepth Integer Optional. The maximum audio bit depth. (optional)
* enableRemoteMedia Boolean Optional. Whether to enable remote media. (optional)
* breakOnNonKeyFrames Boolean Optional. Whether to break on non key frames. (optional)
* enableRedirection Boolean Whether to enable redirection. Defaults to true. (optional)
* returns File
* */
const headUniversalAudioStream = ({ itemId, container, mediaSourceId, deviceId, userId, audioCodec, maxAudioChannels, transcodingAudioChannels, maxStreamingBitrate, audioBitRate, startTimeTicks, transcodingContainer, transcodingProtocol, maxAudioSampleRate, maxAudioBitDepth, enableRemoteMedia, breakOnNonKeyFrames, enableRedirection }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        container,
        mediaSourceId,
        deviceId,
        userId,
        audioCodec,
        maxAudioChannels,
        transcodingAudioChannels,
        maxStreamingBitrate,
        audioBitRate,
        startTimeTicks,
        transcodingContainer,
        transcodingProtocol,
        maxAudioSampleRate,
        maxAudioBitDepth,
        enableRemoteMedia,
        breakOnNonKeyFrames,
        enableRedirection,
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
  getUniversalAudioStream,
  headUniversalAudioStream,
};
