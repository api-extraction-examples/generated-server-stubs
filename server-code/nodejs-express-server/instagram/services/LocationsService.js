/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get information about a location.
* Get information about a location.
*
* locationId String The location ID.
* returns LocationInfoResponse
* */
const locationsLocationIdGET = ({ locationId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        locationId,
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
* Get a list of recent media objects from a given location.
* Get a list of recent media objects from a given location.
*
* locationId String The location ID.
* minUnderscoretimestamp Long Return media after this UNIX timestamp. (optional)
* maxUnderscoretimestamp Long Return media before this UNIX timestamp. (optional)
* minUnderscoreid String Return media before this `min_id`. (optional)
* maxUnderscoreid String Return media after this `max_id`. (optional)
* returns MediaListResponse
* */
const locationsLocationIdMediaRecentGET = ({ locationId, minUnderscoretimestamp, maxUnderscoretimestamp, minUnderscoreid, maxUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        locationId,
        minUnderscoretimestamp,
        maxUnderscoretimestamp,
        minUnderscoreid,
        maxUnderscoreid,
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
* Search for a location by geographic coordinate.
* Search for a location by geographic coordinate.
*
* distance Integer Default is 1000m (distance=1000), max distance is 5000. (optional)
* facebookUnderscoreplacesUnderscoreid String Returns a location mapped off of a Facebook places id. If used, a Foursquare id and `lat`, `lng` are not required. (optional)
* foursquareUnderscoreid String Returns a location mapped off of a foursquare v1 api location id. If used, you are not required to use `lat` and `lng`. Note that this method is deprecated; you should use the new foursquare IDs with V2 of their API.  (optional)
* lat Double Latitude of the center search coordinate. If used, `lng` is required. (optional)
* lng Double Longitude of the center search coordinate. If used, `lat` is required. (optional)
* foursquareUnderscorev2Underscoreid String Returns a location mapped off of a foursquare v2 api location id. If used, you are not required to use `lat` and `lng`.  (optional)
* returns LocationSearchResponse
* */
const locationsSearchGET = ({ distance, facebookUnderscoreplacesUnderscoreid, foursquareUnderscoreid, lat, lng, foursquareUnderscorev2Underscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        distance,
        facebookUnderscoreplacesUnderscoreid,
        foursquareUnderscoreid,
        lat,
        lng,
        foursquareUnderscorev2Underscoreid,
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
  locationsLocationIdGET,
  locationsLocationIdMediaRecentGET,
  locationsSearchGET,
};
