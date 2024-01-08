/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* This request returns dealers for given parameters
*
* dealerId String The dealer id is dealer’s business key, also known as GS Id. e.g. GS0000857
* fields String Specifies which fields should be included in the result. If this filter is not used, per default all fields are returned. e.g. fields=dealerId,address(street,city) (optional)
* returns Dealer
* */
const dealerGET = ({ dealerId, fields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dealerId,
        fields,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* This request returns dealers (dealer, garage, retailer, etc.) for given parameters
*
* dealerIds List Array of dealer ids. The dealer id is dealer’s business key, also known as GS Id. e.g. GS0000857,GS0017621  (optional)
* latitude BigDecimal The latitude geo coordinate. (optional)
* longitude BigDecimal The longitude geo coordinate. (optional)
* radiusValue Integer The radius value of the search area. The center of the search area is defined by geo coordinates. (latitude, longitude properties) If radiusValue and radiusUnit parameters are missing, then the default radius is 10 km. (optional)
* radiusUnit String The radius unit of the search area. The center of the search area is defined by geo coordinates. (latitude, longitude properties) If radiusValue and radiusUnit parameters are missing, then the default radius is 10 km. (optional)
* countryIsoCode String The country of the dealer address defined as ISO two letter ID (e.g. DE, CH, CN, etc.) (optional)
* city String The city of the dealer address. (optional)
* name String A name of the dealer, the name filter will be applied to all Dealer names (e.g. legalName, nameAddition). You can also search for parts of Dealer names, e.g. the search term 'Niederlassung' will also match 'Niederlassung Stuttgart'. (optional)
* brand String Filter by brand, valid values are:   * MB: Mercedes-Benz   * SMT: Smart (optional)
* productGroup String Filter by a product group (optional)
* activity String Filter by activity, valid actitvity values are:   * PARTS: Spare Parts Sales   * SALES: Sales of new vehicles   * SERVICE: Maintaining and repair   * USED-VEHICLES-TRADE: Sales of used vehicles (optional)
* fields String Specifies which fields should be included in the result. If this filter is not used, per default all fields are returned. e.g. fields=dealers(dealerId,address(street,city)) (optional)
* page Integer The index of the page to be returned. If this parameter is omitted, the first page will be returned.  (optional)
* pageSize Integer The index of the page to be returned. If this parameter is omitted, the first page will be returned.  (optional)
* returns HalifiedDealers
* */
const dealersGET = ({ dealerIds, latitude, longitude, radiusValue, radiusUnit, countryIsoCode, city, name, brand, productGroup, activity, fields, page, pageSize }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dealerIds,
        latitude,
        longitude,
        radiusValue,
        radiusUnit,
        countryIsoCode,
        city,
        name,
        brand,
        productGroup,
        activity,
        fields,
        page,
        pageSize,
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
  dealerGET,
  dealersGET,
};
