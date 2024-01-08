/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Broadcasts
* All broadcasts 
*
* xAPIKey String API_KEY
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* serviceUnderscoreid String Filter by Service ID. E.g. bbc_radio_fourfm (optional)
* date String Filter by date. E.g. 2016-06-17 (optional)
* sort String Sort by provided query. E.g. 'start_at' sorts in ascending order, and '-start_at' sorts in descending order (optional)
* returns BroadcastsResponse
* */
const broadcastsGET = ({ xAPIKey, offset, limit, serviceUnderscoreid, date, sort }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xAPIKey,
        offset,
        limit,
        serviceUnderscoreid,
        date,
        sort,
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
* Latest Broadcasts
* Broadcasts for the current day 
*
* xAPIKey String API_KEY
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* serviceUnderscoreid String Filter by Service ID. E.g. bbc_radio_fourfm (optional)
* onUnderscoreair String Filter what is on air. E.g. 'now' returns current programme being broadcasted. (optional)
* next String Filter what will be on air next in minutes. E.g. '240' returns programmes broadcasted in the next four hurs (optional)
* previous String Filter what was on air previously in minutes. E.g. '240' returns programmes broadcasted in the previous four hurs (optional)
* sort String Sort by provided query. E.g. 'start_at' sorts in ascending order, and '-start_at' sorts in descending order (optional)
* returns BroadcastsResponse
* */
const broadcastsLatestGET = ({ xAPIKey, offset, limit, serviceUnderscoreid, onUnderscoreair, next, previous, sort }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xAPIKey,
        offset,
        limit,
        serviceUnderscoreid,
        onUnderscoreair,
        next,
        previous,
        sort,
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
* Broadcasts by PID
* Find broadcast by PID 
*
* xAPIKey String API_KEY
* pid String pid
* returns BroadcastsResponse
* */
const getBroadcastByPid = ({ xAPIKey, pid }) => new Promise(
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

module.exports = {
  broadcastsGET,
  broadcastsLatestGET,
  getBroadcastByPid,
};
