import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_price_point_response import AppPricePointResponse  # noqa: E501
from openapi_server.models.app_price_points_response import AppPricePointsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.territory_response import TerritoryResponse  # noqa: E501
from openapi_server import util


def app_price_points_get_collection(filter_price_tier=None, filter_territory=None, fields_app_price_points=None, limit=None, include=None, fields_territories=None):  # noqa: E501
    """app_price_points_get_collection

     # noqa: E501

    :param filter_price_tier: filter by id(s) of related &#39;priceTier&#39;
    :type filter_price_tier: List[str]
    :param filter_territory: filter by id(s) of related &#39;territory&#39;
    :type filter_territory: List[str]
    :param fields_app_price_points: the fields to include for returned resources of type appPricePoints
    :type fields_app_price_points: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_territories: the fields to include for returned resources of type territories
    :type fields_territories: List[str]

    :rtype: Union[AppPricePointsResponse, Tuple[AppPricePointsResponse, int], Tuple[AppPricePointsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_price_points_get_instance(id, fields_app_price_points=None, include=None, fields_territories=None):  # noqa: E501
    """app_price_points_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_price_points: the fields to include for returned resources of type appPricePoints
    :type fields_app_price_points: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_territories: the fields to include for returned resources of type territories
    :type fields_territories: List[str]

    :rtype: Union[AppPricePointResponse, Tuple[AppPricePointResponse, int], Tuple[AppPricePointResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_price_points_territory_get_to_one_related(id, fields_territories=None):  # noqa: E501
    """app_price_points_territory_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_territories: the fields to include for returned resources of type territories
    :type fields_territories: List[str]

    :rtype: Union[TerritoryResponse, Tuple[TerritoryResponse, int], Tuple[TerritoryResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
