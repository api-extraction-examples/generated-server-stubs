import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.health_info import HealthInfo  # noqa: E501
from openapi_server.models.version_info import VersionInfo  # noqa: E501
from openapi_server import util


def get_health():  # noqa: E501
    """Get instance status

    Get the status of Airflow&#39;s metadatabase and scheduler. It includes info about metadatabase and last heartbeat of scheduler.  # noqa: E501


    :rtype: Union[HealthInfo, Tuple[HealthInfo, int], Tuple[HealthInfo, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_version():  # noqa: E501
    """Get version information

     # noqa: E501


    :rtype: Union[VersionInfo, Tuple[VersionInfo, int], Tuple[VersionInfo, int, Dict[str, str]]
    """
    return 'do some magic!'
