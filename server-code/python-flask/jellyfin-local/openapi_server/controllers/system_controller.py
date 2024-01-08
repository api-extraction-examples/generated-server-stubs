import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.end_point_info import EndPointInfo  # noqa: E501
from openapi_server.models.log_file import LogFile  # noqa: E501
from openapi_server.models.public_system_info import PublicSystemInfo  # noqa: E501
from openapi_server.models.system_info import SystemInfo  # noqa: E501
from openapi_server.models.wake_on_lan_info import WakeOnLanInfo  # noqa: E501
from openapi_server import util


def get_endpoint_info():  # noqa: E501
    """Gets information about the request endpoint.

     # noqa: E501


    :rtype: Union[EndPointInfo, Tuple[EndPointInfo, int], Tuple[EndPointInfo, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_log_file(name):  # noqa: E501
    """Gets a log file.

     # noqa: E501

    :param name: The name of the log file to get.
    :type name: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_ping_system():  # noqa: E501
    """Pings the system.

     # noqa: E501


    :rtype: Union[str, Tuple[str, int], Tuple[str, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_public_system_info():  # noqa: E501
    """Gets public information about the server.

     # noqa: E501


    :rtype: Union[PublicSystemInfo, Tuple[PublicSystemInfo, int], Tuple[PublicSystemInfo, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_server_logs():  # noqa: E501
    """Gets a list of available server log files.

     # noqa: E501


    :rtype: Union[List[LogFile], Tuple[List[LogFile], int], Tuple[List[LogFile], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_system_info():  # noqa: E501
    """Gets information about the server.

     # noqa: E501


    :rtype: Union[SystemInfo, Tuple[SystemInfo, int], Tuple[SystemInfo, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_wake_on_lan_info():  # noqa: E501
    """Gets wake on lan information.

     # noqa: E501


    :rtype: Union[List[WakeOnLanInfo], Tuple[List[WakeOnLanInfo], int], Tuple[List[WakeOnLanInfo], int, Dict[str, str]]
    """
    return 'do some magic!'


def post_ping_system():  # noqa: E501
    """Pings the system.

     # noqa: E501


    :rtype: Union[str, Tuple[str, int], Tuple[str, int, Dict[str, str]]
    """
    return 'do some magic!'


def restart_application():  # noqa: E501
    """Restarts the application.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def shutdown_application():  # noqa: E501
    """Shuts down the application.

     # noqa: E501


    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
