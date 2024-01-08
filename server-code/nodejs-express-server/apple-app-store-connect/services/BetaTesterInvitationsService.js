/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
*
* betaTesterInvitationCreateRequest BetaTesterInvitationCreateRequest BetaTesterInvitation representation
* returns BetaTesterInvitationResponse
* */
const betaTesterInvitationsCreate_instance = ({ betaTesterInvitationCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        betaTesterInvitationCreateRequest,
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
  betaTesterInvitationsCreate_instance,
};
