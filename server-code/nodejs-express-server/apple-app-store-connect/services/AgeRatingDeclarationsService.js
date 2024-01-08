/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* id String the id of the requested resource
* ageRatingDeclarationUpdateRequest AgeRatingDeclarationUpdateRequest AgeRatingDeclaration representation
* returns AgeRatingDeclarationResponse
* */
const ageRatingDeclarationsUpdate_instance = ({ id, ageRatingDeclarationUpdateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
        ageRatingDeclarationUpdateRequest,
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
  ageRatingDeclarationsUpdate_instance,
};
