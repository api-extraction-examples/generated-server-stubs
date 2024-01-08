import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_pre_order_create_request import AppPreOrderCreateRequest  # noqa: E501
from openapi_server.models.app_pre_order_response import AppPreOrderResponse  # noqa: E501
from openapi_server.models.app_pre_order_update_request import AppPreOrderUpdateRequest  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def app_pre_orders_create_instance(app_pre_order_create_request):  # noqa: E501
    """app_pre_orders_create_instance

     # noqa: E501

    :param app_pre_order_create_request: AppPreOrder representation
    :type app_pre_order_create_request: dict | bytes

    :rtype: Union[AppPreOrderResponse, Tuple[AppPreOrderResponse, int], Tuple[AppPreOrderResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_pre_order_create_request = AppPreOrderCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def app_pre_orders_delete_instance(id):  # noqa: E501
    """app_pre_orders_delete_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_pre_orders_get_instance(id, fields_app_pre_orders=None, include=None):  # noqa: E501
    """app_pre_orders_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_pre_orders: the fields to include for returned resources of type appPreOrders
    :type fields_app_pre_orders: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]

    :rtype: Union[AppPreOrderResponse, Tuple[AppPreOrderResponse, int], Tuple[AppPreOrderResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_pre_orders_update_instance(id, app_pre_order_update_request):  # noqa: E501
    """app_pre_orders_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param app_pre_order_update_request: AppPreOrder representation
    :type app_pre_order_update_request: dict | bytes

    :rtype: Union[AppPreOrderResponse, Tuple[AppPreOrderResponse, int], Tuple[AppPreOrderResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        app_pre_order_update_request = AppPreOrderUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
