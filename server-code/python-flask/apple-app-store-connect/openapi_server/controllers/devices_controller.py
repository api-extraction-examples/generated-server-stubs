import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.device_create_request import DeviceCreateRequest  # noqa: E501
from openapi_server.models.device_response import DeviceResponse  # noqa: E501
from openapi_server.models.device_update_request import DeviceUpdateRequest  # noqa: E501
from openapi_server.models.devices_response import DevicesResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def devices_create_instance(device_create_request):  # noqa: E501
    """devices_create_instance

     # noqa: E501

    :param device_create_request: Device representation
    :type device_create_request: dict | bytes

    :rtype: Union[DeviceResponse, Tuple[DeviceResponse, int], Tuple[DeviceResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        device_create_request = DeviceCreateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def devices_get_collection(filter_name=None, filter_platform=None, filter_status=None, filter_udid=None, filter_id=None, sort=None, fields_devices=None, limit=None):  # noqa: E501
    """devices_get_collection

     # noqa: E501

    :param filter_name: filter by attribute &#39;name&#39;
    :type filter_name: List[str]
    :param filter_platform: filter by attribute &#39;platform&#39;
    :type filter_platform: List[str]
    :param filter_status: filter by attribute &#39;status&#39;
    :type filter_status: List[str]
    :param filter_udid: filter by attribute &#39;udid&#39;
    :type filter_udid: List[str]
    :param filter_id: filter by id(s)
    :type filter_id: List[str]
    :param sort: comma-separated list of sort expressions; resources will be sorted as specified
    :type sort: List[str]
    :param fields_devices: the fields to include for returned resources of type devices
    :type fields_devices: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[DevicesResponse, Tuple[DevicesResponse, int], Tuple[DevicesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def devices_get_instance(id, fields_devices=None):  # noqa: E501
    """devices_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_devices: the fields to include for returned resources of type devices
    :type fields_devices: List[str]

    :rtype: Union[DeviceResponse, Tuple[DeviceResponse, int], Tuple[DeviceResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def devices_update_instance(id, device_update_request):  # noqa: E501
    """devices_update_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param device_update_request: Device representation
    :type device_update_request: dict | bytes

    :rtype: Union[DeviceResponse, Tuple[DeviceResponse, int], Tuple[DeviceResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        device_update_request = DeviceUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
