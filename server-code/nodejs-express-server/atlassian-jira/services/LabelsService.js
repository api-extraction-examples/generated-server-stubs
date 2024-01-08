/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get all labels
* Returns a [paginated](#pagination) list of labels.
*
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* returns PageBeanString
* */
const getAllLabels = ({ startAt, maxResults }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startAt,
        maxResults,
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
  getAllLabels,
};
