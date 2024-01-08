/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get information about a media object.
* Get information about a media object. The returned type key will allow you to differentiate between image and video media.  **Note:** if you authenticate with an OAuth Token, you will receive the user_has_liked key which quickly tells you whether the current user has liked this media item. 
*
* mediaId String The ID of the media resource.
* returns MediaEntryResponse
* */
const mediaMediaIdGET = ({ mediaId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        mediaId,
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
* Get a list of currently popular media.
* Get a list of what media is most popular at the moment. Can return mix of `image` and `video` types.  **Warning:** [Deprecated](http://instagram.com/developer/changelog/) for Apps created **on or after** Nov 17, 2015 
*
* returns MediaSearchResponse
* */
const mediaPopularGET = () => new Promise(
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
* Search for media in a given area.
* Search for media in a given area. The default time span is set to 5 days. The time span must not exceed 7 days. Defaults time stamps cover the last 5 days. Can return mix of `image` and `video` types. 
*
* lat Double Latitude of the center search coordinate. If used, `lng` is required.
* lng Double Longitude of the center search coordinate. If used, `lat` is required.
* minUnderscoretimestamp Long A unix timestamp. All media returned will be taken later than this timestamp. (optional)
* maxUnderscoretimestamp Long A unix timestamp. All media returned will be taken earlier than this timestamp. (optional)
* distance Integer Default is 1km (distance=1000), max distance is 5km. (optional)
* returns MediaSearchResponse
* */
const mediaSearchGET = ({ lat, lng, minUnderscoretimestamp, maxUnderscoretimestamp, distance }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        lat,
        lng,
        minUnderscoretimestamp,
        maxUnderscoretimestamp,
        distance,
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
* Get information about a media object.
* This endpoint returns the same response as `GET /media/{media-id}`.  A media object's shortcode can be found in its shortlink URL. An example shortlink is `http://instagram.com/p/D/`, its corresponding shortcode is `D`. 
*
* shortcode String The short code of the media resource.
* returns MediaEntryResponse
* */
const mediaShortcodeShortcodeGET = ({ shortcode }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        shortcode,
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
  mediaMediaIdGET,
  mediaPopularGET,
  mediaSearchGET,
  mediaShortcodeShortcodeGET,
};
