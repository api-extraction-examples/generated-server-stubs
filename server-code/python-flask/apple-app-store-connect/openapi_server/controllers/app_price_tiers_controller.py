import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_price_points_response import AppPricePointsResponse  # noqa: E501
from openapi_server.models.app_price_tier_response import AppPriceTierResponse  # noqa: E501
from openapi_server.models.app_price_tiers_response import AppPriceTiersResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def app_price_tiers_get_collection(filter_id=None, fields_app_price_tiers=None, limit=None, include=None, fields_app_price_points=None, limit_price_points=None):  # noqa: E501
    """app_price_tiers_get_collection

     # noqa: E501

    :param filter_id: filter by id(s)
    :type filter_id: List[str]
    :param fields_app_price_tiers: the fields to include for returned resources of type appPriceTiers
    :type fields_app_price_tiers: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_app_price_points: the fields to include for returned resources of type appPricePoints
    :type fields_app_price_points: List[str]
    :param limit_price_points: maximum number of related pricePoints returned (when they are included)
    :type limit_price_points: int

    :rtype: Union[AppPriceTiersResponse, Tuple[AppPriceTiersResponse, int], Tuple[AppPriceTiersResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_price_tiers_get_instance(id, fields_app_price_tiers=None, include=None, fields_app_price_points=None, limit_price_points=None):  # noqa: E501
    """app_price_tiers_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_price_tiers: the fields to include for returned resources of type appPriceTiers
    :type fields_app_price_tiers: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param fields_app_price_points: the fields to include for returned resources of type appPricePoints
    :type fields_app_price_points: List[str]
    :param limit_price_points: maximum number of related pricePoints returned (when they are included)
    :type limit_price_points: int

    :rtype: Union[AppPriceTierResponse, Tuple[AppPriceTierResponse, int], Tuple[AppPriceTierResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_price_tiers_price_points_get_to_many_related(id, fields_app_price_points=None, limit=None):  # noqa: E501
    """app_price_tiers_price_points_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_price_points: the fields to include for returned resources of type appPricePoints
    :type fields_app_price_points: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[AppPricePointsResponse, Tuple[AppPricePointsResponse, int], Tuple[AppPricePointsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
