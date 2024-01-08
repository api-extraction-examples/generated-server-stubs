import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.in_app_purchase_response import InAppPurchaseResponse  # noqa: E501
from openapi_server import util


def in_app_purchases_get_instance(id, fields_in_app_purchases=None, include=None, limit_apps=None):  # noqa: E501
    """in_app_purchases_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_in_app_purchases: the fields to include for returned resources of type inAppPurchases
    :type fields_in_app_purchases: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param limit_apps: maximum number of related apps returned (when they are included)
    :type limit_apps: int

    :rtype: Union[InAppPurchaseResponse, Tuple[InAppPurchaseResponse, int], Tuple[InAppPurchaseResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
