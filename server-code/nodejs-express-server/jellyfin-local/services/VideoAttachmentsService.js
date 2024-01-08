/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get video attachment.
*
* videoId UUID Video ID.
* mediaSourceId String Media Source ID.
* index Integer Attachment Index.
* returns File
* */
const getAttachment = ({ videoId, mediaSourceId, index }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        videoId,
        mediaSourceId,
        index,
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
  getAttachment,
};
