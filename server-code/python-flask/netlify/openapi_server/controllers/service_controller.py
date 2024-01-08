import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.service import Service  # noqa: E501
from openapi_server import util


def get_services(search=None):  # noqa: E501
    """get_services

     # noqa: E501

    :param search: 
    :type search: str

    :rtype: Union[List[Service], Tuple[List[Service], int], Tuple[List[Service], int, Dict[str, str]]
    """
    return 'do some magic!'


def show_service(addon_name):  # noqa: E501
    """show_service

     # noqa: E501

    :param addon_name: 
    :type addon_name: str

    :rtype: Union[Service, Tuple[Service, int], Tuple[Service, int, Dict[str, str]]
    """
    return 'do some magic!'


def show_service_manifest(addon_name):  # noqa: E501
    """show_service_manifest

     # noqa: E501

    :param addon_name: 
    :type addon_name: str

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'
