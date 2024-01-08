/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Notify SyncPlay group that member is buffering.
*
* bufferRequestDto BufferRequestDto The player status.
* no response value expected for this operation
* */
const syncPlayBuffering = ({ bufferRequestDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        bufferRequestDto,
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
* Create a new SyncPlay group.
*
* newGroupRequestDto NewGroupRequestDto The settings of the new group.
* no response value expected for this operation
* */
const syncPlayCreateGroup = ({ newGroupRequestDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        newGroupRequestDto,
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
* Gets all SyncPlay groups.
*
* returns List
* */
const syncPlayGetGroups = () => new Promise(
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
* Join an existing SyncPlay group.
*
* joinGroupRequestDto JoinGroupRequestDto The group to join.
* no response value expected for this operation
* */
const syncPlayJoinGroup = ({ joinGroupRequestDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        joinGroupRequestDto,
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
* Leave the joined SyncPlay group.
*
* no response value expected for this operation
* */
const syncPlayLeaveGroup = () => new Promise(
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
* Request to move an item in the playlist in SyncPlay group.
*
* movePlaylistItemRequestDto MovePlaylistItemRequestDto The new position for the item.
* no response value expected for this operation
* */
const syncPlayMovePlaylistItem = ({ movePlaylistItemRequestDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        movePlaylistItemRequestDto,
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
* Request next item in SyncPlay group.
*
* nextItemRequestDto NextItemRequestDto The current item information.
* no response value expected for this operation
* */
const syncPlayNextItem = ({ nextItemRequestDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        nextItemRequestDto,
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
* Request pause in SyncPlay group.
*
* no response value expected for this operation
* */
const syncPlayPause = () => new Promise(
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
* Update session ping.
*
* pingRequestDto PingRequestDto The new ping.
* no response value expected for this operation
* */
const syncPlayPing = ({ pingRequestDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pingRequestDto,
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
* Request previous item in SyncPlay group.
*
* previousItemRequestDto PreviousItemRequestDto The current item information.
* no response value expected for this operation
* */
const syncPlayPreviousItem = ({ previousItemRequestDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        previousItemRequestDto,
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
* Request to queue items to the playlist of a SyncPlay group.
*
* queueRequestDto QueueRequestDto The items to add.
* no response value expected for this operation
* */
const syncPlayQueue = ({ queueRequestDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        queueRequestDto,
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
* Notify SyncPlay group that member is ready for playback.
*
* readyRequestDto ReadyRequestDto The player status.
* no response value expected for this operation
* */
const syncPlayReady = ({ readyRequestDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        readyRequestDto,
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
* Request to remove items from the playlist in SyncPlay group.
*
* removeFromPlaylistRequestDto RemoveFromPlaylistRequestDto The items to remove.
* no response value expected for this operation
* */
const syncPlayRemoveFromPlaylist = ({ removeFromPlaylistRequestDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        removeFromPlaylistRequestDto,
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
* Request seek in SyncPlay group.
*
* seekRequestDto SeekRequestDto The new playback position.
* no response value expected for this operation
* */
const syncPlaySeek = ({ seekRequestDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        seekRequestDto,
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
* Request SyncPlay group to ignore member during group-wait.
*
* ignoreWaitRequestDto IgnoreWaitRequestDto The settings to set.
* no response value expected for this operation
* */
const syncPlaySetIgnoreWait = ({ ignoreWaitRequestDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        ignoreWaitRequestDto,
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
* Request to set new playlist in SyncPlay group.
*
* playRequestDto PlayRequestDto The new playlist to play in the group.
* no response value expected for this operation
* */
const syncPlaySetNewQueue = ({ playRequestDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        playRequestDto,
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
* Request to change playlist item in SyncPlay group.
*
* setPlaylistItemRequestDto SetPlaylistItemRequestDto The new item to play.
* no response value expected for this operation
* */
const syncPlaySetPlaylistItem = ({ setPlaylistItemRequestDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        setPlaylistItemRequestDto,
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
* Request to set repeat mode in SyncPlay group.
*
* setRepeatModeRequestDto SetRepeatModeRequestDto The new repeat mode.
* no response value expected for this operation
* */
const syncPlaySetRepeatMode = ({ setRepeatModeRequestDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        setRepeatModeRequestDto,
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
* Request to set shuffle mode in SyncPlay group.
*
* setShuffleModeRequestDto SetShuffleModeRequestDto The new shuffle mode.
* no response value expected for this operation
* */
const syncPlaySetShuffleMode = ({ setShuffleModeRequestDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        setShuffleModeRequestDto,
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
* Request stop in SyncPlay group.
*
* no response value expected for this operation
* */
const syncPlayStop = () => new Promise(
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
* Request unpause in SyncPlay group.
*
* no response value expected for this operation
* */
const syncPlayUnpause = () => new Promise(
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
  syncPlayBuffering,
  syncPlayCreateGroup,
  syncPlayGetGroups,
  syncPlayJoinGroup,
  syncPlayLeaveGroup,
  syncPlayMovePlaylistItem,
  syncPlayNextItem,
  syncPlayPause,
  syncPlayPing,
  syncPlayPreviousItem,
  syncPlayQueue,
  syncPlayReady,
  syncPlayRemoveFromPlaylist,
  syncPlaySeek,
  syncPlaySetIgnoreWait,
  syncPlaySetNewQueue,
  syncPlaySetPlaylistItem,
  syncPlaySetRepeatMode,
  syncPlaySetShuffleMode,
  syncPlayStop,
  syncPlayUnpause,
};
