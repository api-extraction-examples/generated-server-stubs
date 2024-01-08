/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Gets suggestions.
*
* userId UUID The user id.
* mediaType List The media types. (optional)
* type List The type. (optional)
* startIndex Integer Optional. The start index. (optional)
* limit Integer Optional. The limit. (optional)
* enableTotalRecordCount Boolean Whether to enable the total record count. (optional)
* returns BaseItemDtoQueryResult
* */
const getSuggestions = ({ userId, mediaType, type, startIndex, limit, enableTotalRecordCount }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userId,
        mediaType,
        type,
        startIndex,
        limit,
        enableTotalRecordCount,
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
  getSuggestions,
};
