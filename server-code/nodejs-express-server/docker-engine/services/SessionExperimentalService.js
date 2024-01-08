/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Initialize interactive session
* Start a new interactive session with a server. Session allows server to call back to the client for advanced capabilities.  > **Note**: This endpoint is *experimental* and only available if the daemon is started with experimental > features enabled. The specifications for this endpoint may still change in a future version of the API.  ### Hijacking  This endpoint hijacks the HTTP connection to HTTP2 transport that allows the client to expose gPRC services on that connection.  For example, the client sends this request to upgrade the connection:  ``` POST /session HTTP/1.1 Upgrade: h2c Connection: Upgrade ```  The Docker daemon will respond with a `101 UPGRADED` response follow with the raw stream:  ``` HTTP/1.1 101 UPGRADED Connection: Upgrade Upgrade: h2c ``` 
*
* no response value expected for this operation
* */
const session = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
  session,
};
