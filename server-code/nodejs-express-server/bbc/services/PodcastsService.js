/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Podcast
* Retrieve data about the podcast with the supplied PID 
*
* xAPIKey String API_KEY
* pid String pid
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* returns PodcastsResponse
* */
const getPodcastByPid = ({ xAPIKey, pid, offset, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xAPIKey,
        pid,
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
* Podcast Episodes
* Retrieve all episodes for a specific podcast 
*
* xAPIKey String API_KEY
* pid String pid
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* returns PodcastEpisodesResponse
* */
const getPodcastEpisodes = ({ xAPIKey, pid, offset, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xAPIKey,
        pid,
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
* All Podcasts
* Retrieve all Podcasts 
*
* xAPIKey String API_KEY
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* sort String Sort order for Podcasts results (optional)
* network String Network Master Brand ID (mid) (optional)
* networkUnderscoreurlUnderscorekey String Network URL key (optional)
* category String Category ID (optional)
* q String Search query String (optional)
* coverage String Local, National or Regional Coverage (optional)
* returns PodcastsResponse
* */
const getPodcasts = ({ xAPIKey, offset, limit, sort, network, networkUnderscoreurlUnderscorekey, category, q, coverage }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xAPIKey,
        offset,
        limit,
        sort,
        network,
        networkUnderscoreurlUnderscorekey,
        category,
        q,
        coverage,
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
* Featured Podcasts
* Retrieve featured podcasts 
*
* xAPIKey String API_KEY
* returns PodcastsFeaturedResponse
* */
const getPodcastsFeatured = ({ xAPIKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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

module.exports = {
  getPodcastByPid,
  getPodcastEpisodes,
  getPodcasts,
  getPodcastsFeatured,
};
