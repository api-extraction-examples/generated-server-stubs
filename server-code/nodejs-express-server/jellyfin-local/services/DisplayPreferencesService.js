/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get Display Preferences.
*
* displayPreferencesId String Display preferences id.
* userId UUID User id.
* client String Client.
* returns DisplayPreferencesDto
* */
const getDisplayPreferences = ({ displayPreferencesId, userId, client }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        displayPreferencesId,
        userId,
        client,
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
* Update Display Preferences.
*
* displayPreferencesId String Display preferences id.
* userId UUID User Id.
* client String Client.
* displayPreferencesDto DisplayPreferencesDto New Display Preferences object.
* no response value expected for this operation
* */
const updateDisplayPreferences = ({ displayPreferencesId, userId, client, displayPreferencesDto }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        displayPreferencesId,
        userId,
        client,
        displayPreferencesDto,
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
  getDisplayPreferences,
  updateDisplayPreferences,
};
