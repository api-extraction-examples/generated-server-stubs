/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Music Export Preferences
* Remove export preferences (e.g. 3rd party vendors, partner id's) for a given BBC Music user. 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* returns MusicExportSuccess
* */
const deleteMusicPreferencesExport = ({ authorization, xAuthenticationProvider, xAPIKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
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
* Music Export Vendor Preferences
* Remove Vendor specific export preferences (e.g. 3rd party vendors, partner id's) for a given BBC Music user. 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* vendor String Supported 3rd Party Vendor
* no response value expected for this operation
* */
const deleteMusicPreferencesExportVendor = ({ authorization, xAuthenticationProvider, xAPIKey, vendor }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        vendor,
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
* Music Exports
* Returns status of all previous third party export actions for a given BBC Music user. 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* returns MusicExportJob
* */
const getMusicExport = ({ authorization, xAuthenticationProvider, xAPIKey, offset, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        offset,
        limit,
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
* Music Export Jobs
* All items associated to a users export request 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* over16 Boolean Boolean age check
* vendor String Specify Vendor Jobs (optional)
* returns MusicExportJob
* */
const getMusicExportJobs = ({ authorization, xAuthenticationProvider, xAPIKey, over16, vendor }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        over16,
        vendor,
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
* Music Export Tracks
* Retrieves vendor and status specific tracks 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* over16 Boolean Boolean age check
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* vendor String Specify Vendor Tracks (optional)
* status String Specify Track status (optional)
* returns MusicExportJob
* */
const getMusicExportTracks = ({ authorization, xAuthenticationProvider, xAPIKey, over16, offset, limit, vendor, status }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        over16,
        offset,
        limit,
        vendor,
        status,
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
* Music Export Preferences
* Returns export preferences (e.g. 3rd party vendors, partner id's) for a given BBC Music user. 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* returns MusicExportPreferencesResponse
* */
const getMusicPreferencesExport = ({ authorization, xAuthenticationProvider, xAPIKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
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
* Music Export Vendor Preferences
* Returns vendor specific export preferences for a given BBC Music user. 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* vendor String Supported 3rd Party Vendor
* returns MusicExportPreferencesResponse
* */
const getMusicPreferencesExportVendor = ({ authorization, xAuthenticationProvider, xAPIKey, vendor }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        vendor,
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
* Music Export Jobs
* Create Export Job for a user 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* over16 Boolean Boolean age check
* body List 
* vendor String Specify Vendor Jobs (optional)
* returns MusicExportSuccess
* */
const postMusicExportJob = ({ authorization, xAuthenticationProvider, xAPIKey, over16, body, vendor }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        over16,
        body,
        vendor,
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
* Music Export Preferences
* Create export preferences (e.g. 3rd party vendors, partner id's) for a given BBC Music user. 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* body MusicExportPreferences 
* returns MusicExportSuccess
* */
const postMusicPreferencesExport = ({ authorization, xAuthenticationProvider, xAPIKey, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        body,
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
* Music Export Vendor Preferences
* Create Vendor specific export preferences (e.g. 3rd party vendors, partner id's) for a given BBC Music user. 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* vendor String Supported 3rd Party Vendor
* body MusicExportPreferences 
* no response value expected for this operation
* */
const postMusicPreferencesExportVendor = ({ authorization, xAuthenticationProvider, xAPIKey, vendor, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        vendor,
        body,
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
* Music Export Vendor Preferences
* Update vendor specific export preferences for a given BBC Music user. 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* vendor String Supported 3rd Party Vendor
* body MusicExportPreferences 
* no response value expected for this operation
* */
const putMusicPreferencesExportVendor = ({ authorization, xAuthenticationProvider, xAPIKey, vendor, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        vendor,
        body,
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
  deleteMusicPreferencesExport,
  deleteMusicPreferencesExportVendor,
  getMusicExport,
  getMusicExportJobs,
  getMusicExportTracks,
  getMusicPreferencesExport,
  getMusicPreferencesExportVendor,
  postMusicExportJob,
  postMusicPreferencesExport,
  postMusicPreferencesExportVendor,
  putMusicPreferencesExportVendor,
};
