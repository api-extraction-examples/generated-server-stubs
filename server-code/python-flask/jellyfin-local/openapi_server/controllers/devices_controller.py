import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.device_info import DeviceInfo  # noqa: E501
from openapi_server.models.device_info_query_result import DeviceInfoQueryResult  # noqa: E501
from openapi_server.models.device_options import DeviceOptions  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server import util


def delete_device(id):  # noqa: E501
    """Deletes a device.

     # noqa: E501

    :param id: Device Id.
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_device_info(id):  # noqa: E501
    """Get info for a device.

     # noqa: E501

    :param id: Device Id.
    :type id: str

    :rtype: Union[DeviceInfo, Tuple[DeviceInfo, int], Tuple[DeviceInfo, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_device_options(id):  # noqa: E501
    """Get options for a device.

     # noqa: E501

    :param id: Device Id.
    :type id: str

    :rtype: Union[DeviceOptions, Tuple[DeviceOptions, int], Tuple[DeviceOptions, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_devices(supports_sync=None, user_id=None):  # noqa: E501
    """Get Devices.

     # noqa: E501

    :param supports_sync: Gets or sets a value indicating whether [supports synchronize].
    :type supports_sync: bool
    :param user_id: Gets or sets the user identifier.
    :type user_id: str
    :type user_id: str

    :rtype: Union[DeviceInfoQueryResult, Tuple[DeviceInfoQueryResult, int], Tuple[DeviceInfoQueryResult, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_device_options(id, device_options):  # noqa: E501
    """Update device options.

     # noqa: E501

    :param id: Device Id.
    :type id: str
    :param device_options: Device Options.
    :type device_options: dict | bytes

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        device_options = DeviceOptions.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
