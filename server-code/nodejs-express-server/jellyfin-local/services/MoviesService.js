/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Gets movie recommendations.
*
* userId UUID Optional. Filter by user id, and attach user data. (optional)
* parentId UUID Specify this to localize the search to a specific item or folder. Omit to use the root. (optional)
* fields List Optional. The fields to return. (optional)
* categoryLimit Integer The max number of categories to return. (optional)
* itemLimit Integer The max number of items to return per category. (optional)
* returns List
* */
const getMovieRecommendations = ({ userId, parentId, fields, categoryLimit, itemLimit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        parentId,
        fields,
        categoryLimit,
        itemLimit,
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
  getMovieRecommendations,
};
