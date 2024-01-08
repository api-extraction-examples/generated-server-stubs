/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get recent media from a custom geo-id.
* Get recent media from a geography subscription that you created.  **Note:** You can only access Geographies that were explicitly created by your OAuth client. Check the Geography Subscriptions section of the [real-time updates page](https://instagram.com/developer/realtime/). When you create a subscription to some geography that you define, you will be returned a unique `geo-id` that can be used in this query. To backfill photos from the location covered by this geography, use the [media search endpoint](https://instagram.com/developer/endpoints/media/).  **Warning:** [Deprecated](http://instagram.com/developer/changelog/) for Apps created **on or after** Nov 17, 2015 
*
* geoId String The geography ID.
* count Integer Max number of media to return. (optional)
* minUnderscoreid String Return media before this `min_id`. (optional)
* returns MediaListResponse
* */
const geographiesGeoIdMediaRecentGET = ({ geoId, count, minUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        geoId,
        count,
        minUnderscoreid,
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
  geographiesGeoIdMediaRecentGET,
};
