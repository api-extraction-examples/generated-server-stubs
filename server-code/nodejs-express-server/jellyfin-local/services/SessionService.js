/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Adds an additional user to a session.
*
* sessionId String The session id.
* userId UUID The user id.
* no response value expected for this operation
* */
const addUserToSession = ({ sessionId, userId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sessionId,
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
* Instructs a session to browse to an item or view.
*
* sessionId String The session Id.
* itemType String The type of item to browse to.
* itemId String The Id of the item.
* itemName String The name of the item.
* no response value expected for this operation
* */
const displayContent = ({ sessionId, itemType, itemId, itemName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sessionId,
        itemType,
        itemId,
        itemName,
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
* Get all auth providers.
*
* returns List
* */
const getAuthProviders = () => new Promise(
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
* Get all password reset providers.
*
* returns List
* */
const getPasswordResetProviders = () => new Promise(
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
* Gets a list of sessions.
*
* controllableByUserId UUID Filter by sessions that a given user is allowed to remote control. (optional)
* deviceId String Filter by device Id. (optional)
* activeWithinSeconds Integer Optional. Filter by sessions that were active in the last n seconds. (optional)
* returns List
* */
const getSessions = ({ controllableByUserId, deviceId, activeWithinSeconds }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        controllableByUserId,
        deviceId,
        activeWithinSeconds,
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
* Instructs a session to play an item.
*
* sessionId String The session id.
* playCommand PlayCommand The type of play command to issue (PlayNow, PlayNext, PlayLast). Clients who have not yet implemented play next and play last may play now.
* itemIds List The ids of the items to play, comma delimited.
* startPositionTicks Long The starting position of the first item. (optional)
* no response value expected for this operation
* */
const play = ({ sessionId, playCommand, itemIds, startPositionTicks }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sessionId,
        playCommand,
        itemIds,
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
* Updates capabilities for a device.
*
* id String The session id. (optional)
* playableMediaTypes List A list of playable media types, comma delimited. Audio, Video, Book, Photo. (optional)
* supportedCommands List A list of supported remote control commands, comma delimited. (optional)
* supportsMediaControl Boolean Determines whether media can be played remotely.. (optional)
* supportsSync Boolean Determines whether sync is supported. (optional)
* supportsPersistentIdentifier Boolean Determines whether the device supports a unique identifier. (optional)
* no response value expected for this operation
* */
const postCapabilities = ({ id, playableMediaTypes, supportedCommands, supportsMediaControl, supportsSync, supportsPersistentIdentifier }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        playableMediaTypes,
        supportedCommands,
        supportsMediaControl,
        supportsSync,
        supportsPersistentIdentifier,
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
* Updates capabilities for a device.
*
* clientCapabilitiesDto ClientCapabilitiesDto The MediaBrowser.Model.Session.ClientCapabilities.
* id String The session id. (optional)
* no response value expected for this operation
* */
const postFullCapabilities = ({ clientCapabilitiesDto, id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        clientCapabilitiesDto,
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
* Removes an additional user from a session.
*
* sessionId String The session id.
* userId UUID The user id.
* no response value expected for this operation
* */
const removeUserFromSession = ({ sessionId, userId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sessionId,
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
* Reports that a session has ended.
*
* no response value expected for this operation
* */
const reportSessionEnded = () => new Promise(
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
* Reports that a session is viewing an item.
*
* itemId String The item id.
* sessionId String The session id. (optional)
* no response value expected for this operation
* */
const reportViewing = ({ itemId, sessionId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        itemId,
        sessionId,
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
* Issues a full general command to a client.
*
* sessionId String The session id.
* generalCommand GeneralCommand The MediaBrowser.Model.Session.GeneralCommand.
* no response value expected for this operation
* */
const sendFullGeneralCommand = ({ sessionId, generalCommand }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sessionId,
        generalCommand,
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
* Issues a general command to a client.
*
* sessionId String The session id.
* command GeneralCommandType The command to send.
* no response value expected for this operation
* */
const sendGeneralCommand = ({ sessionId, command }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sessionId,
        command,
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
* Issues a command to a client to display a message to the user.
*
* sessionId String The session id.
* text String The message test.
* header String The message header. (optional)
* timeoutMs Long The message timeout. If omitted the user will have to confirm viewing the message. (optional)
* no response value expected for this operation
* */
const sendMessageCommand = ({ sessionId, text, header, timeoutMs }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sessionId,
        text,
        header,
        timeoutMs,
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
* Issues a playstate command to a client.
*
* sessionId String The session id.
* command PlaystateCommand The MediaBrowser.Model.Session.PlaystateCommand.
* seekPositionTicks Long The optional position ticks. (optional)
* controllingUserId String The optional controlling user id. (optional)
* no response value expected for this operation
* */
const sendPlaystateCommand = ({ sessionId, command, seekPositionTicks, controllingUserId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sessionId,
        command,
        seekPositionTicks,
        controllingUserId,
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
* Issues a system command to a client.
*
* sessionId String The session id.
* command GeneralCommandType The command to send.
* no response value expected for this operation
* */
const sendSystemCommand = ({ sessionId, command }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        sessionId,
        command,
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
  addUserToSession,
  displayContent,
  getAuthProviders,
  getPasswordResetProviders,
  getSessions,
  play,
  postCapabilities,
  postFullCapabilities,
  removeUserFromSession,
  reportSessionEnded,
  reportViewing,
  sendFullGeneralCommand,
  sendGeneralCommand,
  sendMessageCommand,
  sendPlaystateCommand,
  sendSystemCommand,
};
