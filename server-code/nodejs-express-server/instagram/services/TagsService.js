/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Search for tags by name.
* Search for tags by name.
*
* q String A valid tag name without a leading \\#. (eg. snowy, nofilter)
* returns TagSearchResponse
* */
const tagsSearchGET = ({ q }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        q,
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
* Get information about a tag object.
* Get information about a tag object.
*
* tagName String The tag name.
* returns TagInfoResponse
* */
const tagsTagNameGET = ({ tagName }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        tagName,
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
* Get a list of recently tagged media.
* Get a list of recently tagged media. Use the `max_tag_id` and `min_tag_id` parameters in the pagination response to paginate through these objects. 
*
* tagName String The tag name.
* count Integer Count of tagged media to return. (optional)
* minUnderscoretagUnderscoreid String Return media before this `min_tag_id`. (optional)
* maxUnderscoretagUnderscoreid String Return media after this `max_tag_id`. (optional)
* returns TagMediaListResponse
* */
const tagsTagNameMediaRecentGET = ({ tagName, count, minUnderscoretagUnderscoreid, maxUnderscoretagUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        tagName,
        count,
        minUnderscoretagUnderscoreid,
        maxUnderscoretagUnderscoreid,
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
  tagsSearchGET,
  tagsTagNameGET,
  tagsTagNameMediaRecentGET,
};
