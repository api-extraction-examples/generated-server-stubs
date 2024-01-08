import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def get_site_file_by_path_name(site_id, file_path):  # noqa: E501
    """get_site_file_by_path_name

     # noqa: E501

    :param site_id: 
    :type site_id: str
    :param file_path: 
    :type file_path: str

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_site_files(site_id):  # noqa: E501
    """list_site_files

     # noqa: E501

    :param site_id: 
    :type site_id: str

    :rtype: Union[List[file], Tuple[List[file], int], Tuple[List[file], int, Dict[str, str]]
    """
    return 'do some magic!'


def upload_deploy_file(deploy_id, path, file_body, size=None):  # noqa: E501
    """upload_deploy_file

     # noqa: E501

    :param deploy_id: 
    :type deploy_id: str
    :param path: 
    :type path: str
    :param file_body: 
    :type file_body: str
    :param size: 
    :type size: int

    :rtype: Union[file, Tuple[file, int], Tuple[file, int, Dict[str, str]]
    """
    return 'do some magic!'
