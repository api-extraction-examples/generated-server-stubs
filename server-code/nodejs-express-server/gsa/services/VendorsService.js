/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* This endpoint returns a list of vendors filtered by a NAICS code
* <p>This endpoint returns a list of vendors filtered by a NAICS code. The NAICS code maps to an OASIS pool and is used to retrieve vendors in that pool only.</p> <p>OASIS pools are groupings of NAICS codes that have the same small business size standard. Because contracts solicited to OASIS vendors can only be issued to one pool, much of the data is presented as part of a pool grouping. Using the NAICS code is a shortcut, so that you don't have to explicitly map the NAICS code to a pool in OASIS yourself.</p> <p>Vendors can also be filtered by a particular setaside. Valid values for the setasides are two-character codes which include:</p> <ul> <li>A6 (8(a))</li> <li>XX (Hubzone)</li> <li>QF (service disabled veteran owned)</li> <li>A2 (women owned)</li> <li>A5 (veteran owned)</li> <li>27 (small disadvantaged business).</li> </ul>
*
* naics String a six digit NAICS code (required)
* setasides List a comma delimited list of two character setaside codes to filter by.  Ex. setasides=A6,A5  will filter by 8a and veteran owned business. (optional)
* vehicle String Choices are either oasis or oasissb. Will filter vendors by their presence in either the OASIS unrestricted vehicle or the OASIS Small Business vehicle. (optional)
* returns Object
* */
const list_Vendors_GET = ({ naics, setasides, vehicle }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        naics,
        setasides,
        vehicle,
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
  list_Vendors_GET,
};
