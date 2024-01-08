/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Homepage Experience
* Homepage Experience 
*
* xAPIKey String API_KEY
* returns ExperienceResponse
* */
const getExperienceHomepage = ({ xAPIKey }) => new Promise(
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
  getExperienceHomepage,
};
