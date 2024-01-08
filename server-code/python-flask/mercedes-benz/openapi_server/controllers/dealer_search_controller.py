import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.dealer import Dealer  # noqa: E501
from openapi_server.models.halified_dealers import HalifiedDealers  # noqa: E501
from openapi_server import util


def dealer_get(dealer_id, fields=None):  # noqa: E501
    """dealer_get

    This request returns dealers for given parameters # noqa: E501

    :param dealer_id: The dealer id is dealer’s business key, also known as GS Id. e.g. GS0000857
    :type dealer_id: str
    :param fields: Specifies which fields should be included in the result. If this filter is not used, per default all fields are returned. e.g. fields&#x3D;dealerId,address(street,city)
    :type fields: str

    :rtype: Union[Dealer, Tuple[Dealer, int], Tuple[Dealer, int, Dict[str, str]]
    """
    return 'do some magic!'


def dealers_get(dealer_ids=None, latitude=None, longitude=None, radius_value=None, radius_unit=None, country_iso_code=None, city=None, name=None, brand=None, product_group=None, activity=None, fields=None, page=None, page_size=None):  # noqa: E501
    """dealers_get

    This request returns dealers (dealer, garage, retailer, etc.) for given parameters # noqa: E501

    :param dealer_ids: Array of dealer ids. The dealer id is dealer’s business key, also known as GS Id. e.g. GS0000857,GS0017621 
    :type dealer_ids: List[str]
    :param latitude: The latitude geo coordinate.
    :type latitude: 
    :param longitude: The longitude geo coordinate.
    :type longitude: 
    :param radius_value: The radius value of the search area. The center of the search area is defined by geo coordinates. (latitude, longitude properties) If radiusValue and radiusUnit parameters are missing, then the default radius is 10 km.
    :type radius_value: int
    :param radius_unit: The radius unit of the search area. The center of the search area is defined by geo coordinates. (latitude, longitude properties) If radiusValue and radiusUnit parameters are missing, then the default radius is 10 km.
    :type radius_unit: str
    :param country_iso_code: The country of the dealer address defined as ISO two letter ID (e.g. DE, CH, CN, etc.)
    :type country_iso_code: str
    :param city: The city of the dealer address.
    :type city: str
    :param name: A name of the dealer, the name filter will be applied to all Dealer names (e.g. legalName, nameAddition). You can also search for parts of Dealer names, e.g. the search term &#39;Niederlassung&#39; will also match &#39;Niederlassung Stuttgart&#39;.
    :type name: str
    :param brand: Filter by brand, valid values are:   * MB: Mercedes-Benz   * SMT: Smart
    :type brand: str
    :param product_group: Filter by a product group
    :type product_group: str
    :param activity: Filter by activity, valid actitvity values are:   * PARTS: Spare Parts Sales   * SALES: Sales of new vehicles   * SERVICE: Maintaining and repair   * USED-VEHICLES-TRADE: Sales of used vehicles
    :type activity: str
    :param fields: Specifies which fields should be included in the result. If this filter is not used, per default all fields are returned. e.g. fields&#x3D;dealers(dealerId,address(street,city))
    :type fields: str
    :param page: The index of the page to be returned. If this parameter is omitted, the first page will be returned. 
    :type page: int
    :param page_size: The index of the page to be returned. If this parameter is omitted, the first page will be returned. 
    :type page_size: int

    :rtype: Union[HalifiedDealers, Tuple[HalifiedDealers, int], Tuple[HalifiedDealers, int, Dict[str, str]]
    """
    return 'do some magic!'
