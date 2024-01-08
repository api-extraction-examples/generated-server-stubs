/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Popular Episodes & Clips
* Retrieve Popular Episodes & Clips 
*
* xAPIKey String API_KEY
* type String Programme type required. Accepts comma separated values (optional)
* distinct String Filter by deduplication rule. E.g. 'tleo' returns programmes with distinct top level episode objects (optional)
* network String Filter by network master brand ID (mid). Accepts comma separated values (optional)
* networkUnderscoreurlUnderscorekey String Filter by network URL key. Accepts comma separated values (optional)
* category String Filter by category. Accepts comma separated values (optional)
* format String Filter by format. Accepts comma separated values (optional)
* group String Filter by group. Accepts comma separated values (optional)
* mediaUnderscoretype String Filter by programme media type. Accepts comma separated values (optional)
* container String Filter by container. Accepts any pid e.g. brand,series,episode (optional)
* mediaUnderscoreset List Filter by media set name. Accepts comma separated combinations of the following: pc,mobile-download,android-download-high,apple-ios-download-high,mobile-cellular-main,mobile-phone-main,iptv-all (optional)
* q String Search query String (optional)
* returns PopularResponse
* */
const getPopularEpisodesClips = ({ xAPIKey, type, distinct, network, networkUnderscoreurlUnderscorekey, category, format, group, mediaUnderscoretype, container, mediaUnderscoreset, q }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xAPIKey,
        type,
        distinct,
        network,
        networkUnderscoreurlUnderscorekey,
        category,
        format,
        group,
        mediaUnderscoretype,
        container,
        mediaUnderscoreset,
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
* Radio programmes
* Provides a paginated list of programmes by PID (brand, series, episode and clip). Accepts various filters and sorting methods.  N.B.  Swagger schemas cannot currently handle multiple combinations of object in an array i.e. a mix of Episode and Clip Summaries so we are defining results as an array of Programme Summary here.  This will be resolved in V3 with full support for  anyOf https://www.openapis.org/blog/2017/01/24/a-new-year-a-new-specification 
*
* xAPIKey String API_KEY
* kind String Filter by provided query. E.g. 'tleo' returns top level objects, ie. brands, orphaned series, and orphaned episodes (optional)
* network String Filter by network master brand ID (mid). Accepts comma separated values (optional)
* networkUnderscoreurlUnderscorekey String Filter by network URL key. Accepts comma separated values (optional)
* category String Filter by category id. Accepts comma separated values. See /category endpoint below for the type of response provided (optional)
* sort String Sort by provided query. E.g. 'title' sorts in ascending order, and -title sorts in descending order (optional)
* container String Filter by container. Accepts any brand or series pid (optional)
* type String Filter by programme type. Accepts comma separated values (optional)
* returns ProgrammesResponse
* */
const getRadioProgrammes = ({ xAPIKey, kind, network, networkUnderscoreurlUnderscorekey, category, sort, container, type }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xAPIKey,
        kind,
        network,
        networkUnderscoreurlUnderscorekey,
        category,
        sort,
        container,
        type,
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
* Available radio programme by Pid
* Find programmes by PID (brand, series, episode and clip)  N.B.  Swagger schemas cannot currently handle multiple combinations of object in an array i.e. a mix of Episode and Clip Summaries so we are defining results as an array of Programme Summary here.  This will be resolved in V3 with full support for  anyOf https://www.openapis.org/blog/2017/01/24/a-new-year-a-new-specification 
*
* xAPIKey String API_KEY
* pid String pid
* returns ProgrammesResponse
* */
const getRadioProgrammesByPid = ({ xAPIKey, pid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xAPIKey,
        pid,
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
* Recommended Programmes
* Recommended Programmes from the Audience Platforms' Recomendations Service 
*
* authorization String Bearer OAUTH_TOKEN
* xAPIKey String API_KEY
* rights String Only return available results for the web/mobile.
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* returns ProgrammesResponse
* */
const getRecommendations = ({ authorization, xAPIKey, rights, offset, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAPIKey,
        rights,
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

module.exports = {
  getPopularEpisodesClips,
  getRadioProgrammes,
  getRadioProgrammesByPid,
  getRecommendations,
};
