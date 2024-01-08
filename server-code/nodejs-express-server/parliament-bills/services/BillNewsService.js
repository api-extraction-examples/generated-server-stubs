/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Returns a list of news articles for a Bill.
*
* billId Integer 
* skip Integer  (optional)
* take Integer  (optional)
* returns NewsArticlesSummarySearchResult
* */
const getNewsArticles = ({ billId, skip, take }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        billId,
        skip,
        take,
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
  getNewsArticles,
};
