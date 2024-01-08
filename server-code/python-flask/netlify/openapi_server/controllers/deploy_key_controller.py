import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.deploy_key import DeployKey  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server import util


def create_deploy_key():  # noqa: E501
    """create_deploy_key

     # noqa: E501


    :rtype: Union[DeployKey, Tuple[DeployKey, int], Tuple[DeployKey, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_deploy_key(key_id):  # noqa: E501
    """delete_deploy_key

     # noqa: E501

    :param key_id: 
    :type key_id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_deploy_key(key_id):  # noqa: E501
    """get_deploy_key

     # noqa: E501

    :param key_id: 
    :type key_id: str

    :rtype: Union[DeployKey, Tuple[DeployKey, int], Tuple[DeployKey, int, Dict[str, str]]
    """
    return 'do some magic!'


def list_deploy_keys():  # noqa: E501
    """list_deploy_keys

     # noqa: E501


    :rtype: Union[List[DeployKey], Tuple[List[DeployKey], int], Tuple[List[DeployKey], int, Dict[str, str]]
    """
    return 'do some magic!'
