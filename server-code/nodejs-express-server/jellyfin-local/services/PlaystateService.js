/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Marks an item as played for user.
*
* userId UUID User id.
* itemId UUID Item id.
* datePlayed Date Optional. The date the item was played. (optional)
* returns UserItemDataDto
* */
const markPlayedItem = ({ userId, itemId, datePlayed }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        itemId,
        datePlayed,
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
* Marks an item as unplayed for user.
*
* userId UUID User id.
* itemId UUID Item id.
* returns UserItemDataDto
* */
const markUnplayedItem = ({ userId, itemId }) => new Promise(
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
* Reports a user's playback progress.
*
* userId UUID User id.
* itemId UUID Item id.
* mediaSourceId String The id of the MediaSource. (optional)
* positionTicks Long Optional. The current position, in ticks. 1 tick = 10000 ms. (optional)
* audioStreamIndex Integer The audio stream index. (optional)
* subtitleStreamIndex Integer The subtitle stream index. (optional)
* volumeLevel Integer Scale of 0-100. (optional)
* playMethod PlayMethod The play method. (optional)
* liveStreamId String The live stream id. (optional)
* playSessionId String The play session id. (optional)
* repeatMode RepeatMode The repeat mode. (optional)
* isPaused Boolean Indicates if the player is paused. (optional)
* isMuted Boolean Indicates if the player is muted. (optional)
* no response value expected for this operation
* */
const onPlaybackProgress = ({ userId, itemId, mediaSourceId, positionTicks, audioStreamIndex, subtitleStreamIndex, volumeLevel, playMethod, liveStreamId, playSessionId, repeatMode, isPaused, isMuted }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        itemId,
        mediaSourceId,
        positionTicks,
        audioStreamIndex,
        subtitleStreamIndex,
        volumeLevel,
        playMethod,
        liveStreamId,
        playSessionId,
        repeatMode,
        isPaused,
        isMuted,
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
* Reports that a user has begun playing an item.
*
* userId UUID User id.
* itemId UUID Item id.
* mediaSourceId String The id of the MediaSource. (optional)
* audioStreamIndex Integer The audio stream index. (optional)
* subtitleStreamIndex Integer The subtitle stream index. (optional)
* playMethod PlayMethod The play method. (optional)
* liveStreamId String The live stream id. (optional)
* playSessionId String The play session id. (optional)
* canSeek Boolean Indicates if the client can seek. (optional)
* no response value expected for this operation
* */
const onPlaybackStart = ({ userId, itemId, mediaSourceId, audioStreamIndex, subtitleStreamIndex, playMethod, liveStreamId, playSessionId, canSeek }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        itemId,
        mediaSourceId,
        audioStreamIndex,
        subtitleStreamIndex,
        playMethod,
        liveStreamId,
        playSessionId,
        canSeek,
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
* Reports that a user has stopped playing an item.
*
* userId UUID User id.
* itemId UUID Item id.
* mediaSourceId String The id of the MediaSource. (optional)
* nextMediaType String The next media type that will play. (optional)
* positionTicks Long Optional. The position, in ticks, where playback stopped. 1 tick = 10000 ms. (optional)
* liveStreamId String The live stream id. (optional)
* playSessionId String The play session id. (optional)
* no response value expected for this operation
* */
const onPlaybackStopped = ({ userId, itemId, mediaSourceId, nextMediaType, positionTicks, liveStreamId, playSessionId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        itemId,
        mediaSourceId,
        nextMediaType,
        positionTicks,
        liveStreamId,
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
/**
* Pings a playback session.
*
* playSessionId String Playback session id. (optional)
* no response value expected for this operation
* */
const pingPlaybackSession = ({ playSessionId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
/**
* Reports playback progress within a session.
*
* playbackProgressInfo PlaybackProgressInfo The playback progress info. (optional)
* no response value expected for this operation
* */
const reportPlaybackProgress = ({ playbackProgressInfo }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        playbackProgressInfo,
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
* Reports playback has started within a session.
*
* playbackStartInfo PlaybackStartInfo The playback start info. (optional)
* no response value expected for this operation
* */
const reportPlaybackStart = ({ playbackStartInfo }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        playbackStartInfo,
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
* Reports playback has stopped within a session.
*
* playbackStopInfo PlaybackStopInfo The playback stop info. (optional)
* no response value expected for this operation
* */
const reportPlaybackStopped = ({ playbackStopInfo }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        playbackStopInfo,
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
  markPlayedItem,
  markUnplayedItem,
  onPlaybackProgress,
  onPlaybackStart,
  onPlaybackStopped,
  pingPlaybackSession,
  reportPlaybackProgress,
  reportPlaybackStart,
  reportPlaybackStopped,
};
