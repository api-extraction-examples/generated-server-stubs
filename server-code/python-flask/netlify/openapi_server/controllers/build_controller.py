import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.build import Build  # noqa: E501
from openapi_server.models.build_setup import BuildSetup  # noqa: E501
from openapi_server.models.build_status import BuildStatus  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def create_site_build(site_id, build=None):  # noqa: E501
    """create_site_build

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param build: 
    :type build: dict | bytes

    :rtype: Union[Build, Tuple[Build, int], Tuple[Build, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        build = BuildSetup.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def get_account_build_status(account_id):  # noqa: E501
    """get_account_build_status

     # noqa: E501

    :param account_id: 
    :type account_id: str

    :rtype: Union[List[BuildStatus], Tuple[List[BuildStatus], int], Tuple[List[BuildStatus], int, Dict[str, str]]
    """
    return 'do some magic!'


def get_site_build(build_id):  # noqa: E501
    """get_site_build

     # noqa: E501

    :param build_id: 
    :type build_id: str

    :rtype: Union[Build, Tuple[Build, int], Tuple[Build, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_site_builds(site_id, page=None, per_page=None):  # noqa: E501
    """list_site_builds

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param page: 
    :type page: int
    :param per_page: 
    :type per_page: int

    :rtype: Union[List[Build], Tuple[List[Build], int], Tuple[List[Build], int, Dict[str, str]]
    """
    return 'do some magic!'


def notify_build_start(build_id):  # noqa: E501
    """notify_build_start

     # noqa: E501

    :param build_id: 
    :type build_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'
